package com.bbtong.Controller;


import com.bbtong.Service.AdministratorService;
import com.bbtong.Util.ResultPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 管理员的方法
 */

@CrossOrigin(allowCredentials = "true")
@RequestMapping(value = "/admin")
public class AdministratorController {

    /**
     * 创建service层的实体
     */
    @Autowired
    private AdministratorService administratorService;

    /**
     * 获取所有用户的方法，根据userId 来进行排序
     *
     * @return
     */
    @GetMapping(value = "/getalluser", produces = "application/json")
    public @ResponseBody
    ResultPage getAllUser() {
        //创建ResultPage的实体来接受数据
        ResultPage resultPage = new ResultPage();

        return resultPage;
    }

}
