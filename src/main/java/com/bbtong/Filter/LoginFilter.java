package com.bbtong.Filter;

import com.alibaba.fastjson.JSON;
import com.bbtong.Base.NewUser;
import com.bbtong.Base.SessionUser;
import com.bbtong.Util.UserResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@CrossOrigin(allowCredentials = "true")
@Component
public class LoginFilter implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        response.setHeader("Access-Control-Allow-Origin", "*"); //解决跨域访问报错 
        response.setHeader("Access-Control-Allow-Methods", "POST, PUT, GET, OPTIONS, DELETE");
//        response.setHeader("Access-Control-Max-Age", "3600"); //设置过期时间 
//        response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, client_id, uuid, Authorization");
//        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // 支持HTTP 1.1. 
//        response.setHeader("Pragma", "no-cache"); // 支持HTTP 1.0. response.setHeader("Expires", "0"); 


        HttpSession session = request.getSession();
        //这个是自己定义的用户实体类
        SessionUser sessionUser = new SessionUser();
        if (request.getSession().getAttribute("adminId") == null) {
            Cookie loginCookie = getLoginCookie(request, "adminName");
            if (loginCookie != null) {
                //根据,将数据分割
                String[] user = loginCookie.getValue().split("#");
                //用实体类来接受数据
                Integer adminId = Integer.valueOf(user[0]);//第一个存的是管理员的id
                Integer adminRoleId = Integer.valueOf(user[1]);//第二个存的his管理员权限的id，也需要转换成int类型
                if (adminId != null && adminId != null) {
                    //将管理员的adminId存到session中
                    session.setAttribute("adminId", adminId);
                    //将管理员的权限id存到seesion中
                    session.setAttribute("adminRoleId", adminRoleId);
                    //设置session过期的时间 这为12个小时过期
                    session.setMaxInactiveInterval(60 * 60 * 12);
                    return true;
                }
            }
        } else {
            return true;
        }
        //在session中取出用户数据
        if (request.getSession().getAttribute("userId") == null) {
            Cookie loginCookie = getLoginCookie(request, "userName");
            if (loginCookie != null) {
                //根据,将数据分割
                String[] user = loginCookie.getValue().split("#");
                //用实体类来接受数据
                sessionUser.setUserId(Integer.valueOf(user[0]));//根据登陆的存的cookie的顺序来获取参数(第一个是int类型所以需要转换成int类型)
                sessionUser.setTypeId(Integer.valueOf(user[1]));//第二个存的是用户保险公司的id，也需要转换成int类型
                sessionUser.setUserPhone(user[2]);//第三个存的是用户的电话号码
                if (sessionUser != null) {
                    //将用户的userId存到session中
                    session.setAttribute("userId", sessionUser.getUserId());
                    //将用户的手机号码存到seesion中
                    session.setAttribute("userPhone", sessionUser.getUserPhone());
                    //将用户的保险公司id存到session中
                    session.setAttribute("typeId", sessionUser.getTypeId());
                    //设置session过期的时间 这为12个小时过期
                    session.setMaxInactiveInterval(60 * 60 * 12);
                } else {
                    Cookie cookie = new Cookie(loginCookie.getName(), null);
                    cookie.setMaxAge(0);
                    response.addCookie(cookie);
                    setReturn(response, 0, "请重新登陆");
                    return false;
                }
            } else {
                setReturn(response, 0, "请重新登陆");
                return false;
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }

    /**
     * 自定义判断cookie的方法
     *
     * @param request  传入的req
     * @param userName 传入cookie
     * @return
     */
    private Cookie getLoginCookie(HttpServletRequest request, String userName) {
        Cookie strRet = null;
        if (request.getCookies() != null) {
            Cookie[] cookies = request.getCookies();
            for (int i = 0; i < cookies.length; i++) {
                Cookie cookie = cookies[i];
                String cm = cookie.getName();
                if (cm.equals(userName)) {
                    strRet = cookie;
                    break;
                }
            }
        }
        return strRet;
    }

    private static void setReturn(HttpServletResponse response, int code, String msg) throws IOException {
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        httpResponse.setHeader("Access-Control-Allow-Credentials", "true");
//        httpResponse.setHeader("Access-Control-Allow-Origin", HttpContextUtil.getOrigin());
        httpResponse.setCharacterEncoding("UTF-8");
        httpResponse.setStatus(400);
        response.setContentType("application/json;charset=utf-8");
        UserResult build = UserResult.build(code, msg);
        String json = JSON.toJSONString(build);
        httpResponse.getWriter().print(json);
    }

}
