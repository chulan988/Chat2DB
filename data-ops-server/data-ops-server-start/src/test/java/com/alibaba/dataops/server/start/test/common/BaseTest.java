package com.alibaba.dataops.server.start.test.common;

import com.alibaba.dataops.server.start.test.TestApplication;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 基础测试类
 *
 * @author Jiaju Zhuang
 **/
@SpringBootTest(classes = {TestApplication.class}, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Slf4j
public abstract class BaseTest {

}