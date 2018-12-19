package cn.ok.ccm.web;

import cn.ok.ccm.entity.Property;
import cn.ok.ccm.entity.PropertyKeys;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;


/**
 * cn.ok.ccm.web
 *
 * @author Kyou on 2018/12/19 21:25
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PropControllerTest {

    // 模拟MVC对象，通过MockMvcBuilders.webAppContextSetup(this.wac).build()初始化。
    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext wac;

    @Before // 在测试开始前初始化工作
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void prop_01_save() throws Exception {

        Property property = new Property();
        property.setEnv("env");
        property.setName("name");
        property.setValue("value");

        mockMvc.perform(post("/prop/save")
                .contentType(MediaType.APPLICATION_JSON).content(new Gson().toJson(property)))
                .andExpect(MockMvcResultMatchers.status().isOk());

    }

    @Test
    public void prop_02_del() throws Exception {
        PropertyKeys propertyKeys = new PropertyKeys();
        propertyKeys.setEnv("env");
        propertyKeys.setName("name");

        mockMvc.perform(delete("/prop/del")
                .contentType(MediaType.APPLICATION_JSON).content(new Gson().toJson(propertyKeys)))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}