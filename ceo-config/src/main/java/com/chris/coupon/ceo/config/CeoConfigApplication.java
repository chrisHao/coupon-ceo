package com.chris.coupon.ceo.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Copyright(c)2018-2025,chris All rights reserved.
 * <p>
 * Redistribution and use in source and binary forms,with or without
 * modification,are permitted provided that the following conditions are met:
 * <p>
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
 * notice,this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * Neither the name of the pig4cloud.com developer nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * Author:haoka(haokang207@126.com)
 * Date:2018/8/6 10:17
 **/
@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
@EnableEurekaClient
public class CeoConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(CeoConfigApplication.class, args);
    }
}
