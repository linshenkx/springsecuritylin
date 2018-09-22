package com.linShen.demo.config;

import com.linShen.demo.security.MyPasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

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

//    @Override
//    public void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .passwordEncoder(new MyPasswordEncoder())
//                .withUser("user1").password("123456").roles("USER")
//                .and()
//                .withUser("user2").password("123456").roles("USER")
//                .and()
//                .withUser("admin").password("123456").roles("ADMIN");
//    }

}
