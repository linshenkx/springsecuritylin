package com.linShen.demo.security;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @version V1.0
 * @author: lin_shen
 * @date: 2018/5/6
 * @Description: TODO
 */

public class MyPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence rawPassword) {
        return rawPassword.toString();
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return encodedPassword.equals(rawPassword.toString());
    }
}
