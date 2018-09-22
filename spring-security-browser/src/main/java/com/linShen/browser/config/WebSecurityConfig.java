package com.linShen.browser.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.DelegatingPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @version V1.0
 * @author: lin_shen
 * @date: 2018/5/6
 * @Description: TODO
 */
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                    .formLogin()
                    .and()
                    .authorizeRequests()
//                    .antMatchers("/login/**","/index").permitAll()
//                    .antMatchers("/user/**").hasRole("USER")
                    .anyRequest().authenticated();

    }
    @Bean
    public  static PasswordEncoder passwordEncoder( ){
        DelegatingPasswordEncoder delegatingPasswordEncoder =
                (DelegatingPasswordEncoder) PasswordEncoderFactories.createDelegatingPasswordEncoder();
        delegatingPasswordEncoder.setDefaultPasswordEncoderForMatches(NoOpPasswordEncoder.getInstance());
        return  delegatingPasswordEncoder;
    }
//    @Override
//    public void configure(AuthenticationManagerBuilder auth) throws Exception {
//        super.configure(auth);
//        auth.inMemoryAuthentication()
//                .passwordEncoder(new MyPasswordEncoder())
//                .withUser("user1").password("123456").roles("USER")
//                .and()
//                .withUser("user2").password("123456").roles("USER")
//                .and()
//                .withUser("admin").password("123456").roles("ADMIN");
//    }

}
