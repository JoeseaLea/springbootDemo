package com.joesea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * <p>@author : Joesea Lea</p>
 * <p>@date : 2019/2/28</p>
 * <p>@description : </p>
 */
@SpringBootApplication
@ServletComponentScan
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
