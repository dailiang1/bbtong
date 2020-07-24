package com.bbtong.Swagger2;
 
import com.bbtong.BbtongApplication;
import io.github.swagger2markup.GroupBy;
import io.github.swagger2markup.Language;
import io.github.swagger2markup.Swagger2MarkupConfig;
import io.github.swagger2markup.Swagger2MarkupConverter;
import io.github.swagger2markup.builder.Swagger2MarkupConfigBuilder;
import io.github.swagger2markup.markup.builder.MarkupLanguage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
 
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.http.MediaType;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import java.io.BufferedWriter;

import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
 
import java.nio.file.Paths;
 
 
 
@RunWith(SpringJUnit4ClassRunner.class)//指定运行器。也可以不标注，会使用默认运行器。
@SpringBootTest(classes = BbtongApplication.class)// 指定spring-boot的启动类
@AutoConfigureMockMvc
 
public class Swagger2MarkupTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void generateAsciiDocs() throws Exception {
        //    输出Ascii格式
        Swagger2MarkupConfig config = new Swagger2MarkupConfigBuilder()
                .withMarkupLanguage(MarkupLanguage.ASCIIDOC) //设置生成格式
                .withOutputLanguage(Language.ZH)  //设置语言中文还是其他语言
                .withPathsGroupedBy(GroupBy.TAGS)
                .withGeneratedExamples()
                .withoutInlineSchema()
                .build();

        Swagger2MarkupConverter.from(new URL("http://localhost:8888/v2/api-docs"))
                .withConfig(config)
                .build()
                .toFile(Paths.get("src/main/resources/docs/asciidoc"));
    }
 
 
}