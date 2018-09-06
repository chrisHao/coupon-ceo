package com.chris.coupon.ceo.config.config;

import cn.hutool.crypto.digest.DigestUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
 * Date:2018/8/6 14:41
 **/
@Configuration
public class PasswordEncoder {
    @Bean
    public static MD5PasswordEncoder passwordEncoder() {
        return new MD5PasswordEncoder();
    }
}

class MD5PasswordEncoder implements org.springframework.security.crypto.password.PasswordEncoder {
    @Override
    public String encode(CharSequence charSequence) {
        return DigestUtil.md5Hex(charSequence.toString());
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return DigestUtil.md5Hex(charSequence.toString()).equalsIgnoreCase(s);
    }
}
