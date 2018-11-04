package org.excelProject.service;

import org.excelProject.dao.TestPojoMapper;
import org.excelProject.pojo.TestPojo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class TestServiceTest {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    TestPojoMapper mapper;
    @Test
    public void test1() {
        TestPojo pojo = new TestPojo();
        pojo.setName("李文浩");
        pojo.setNo("123");
        mapper.insert(pojo);
       logger.info(pojo.getId().toString());
    }
}