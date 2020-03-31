package com.baiyi.opscloud;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

/**
 * @Author baiyi
 * @Date 2020/1/6 8:05 下午
 * @Version 1.0
 */
@SpringBootTest(classes = ManageApplication.class)
@AutoConfigureMockMvc
@ActiveProfiles(profiles = "dev")
public class BaseUnit {
}
