package com.linShen.browser.UserDetails;

import com.linShen.browser.securityCompoent.MyPasswordEncoder;
import io.lettuce.core.dynamic.support.ReflectionUtils;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.apache.el.util.ReflectionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.DelegatingPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Component;


/**
 * @version V1.0
 * @author: lin_shen
 * @date: 2018/5/6
 * @Description: TODO
 */
@Component
public class MyUserDetailsService implements UserDetailsService {
    private Logger logger=LoggerFactory.getLogger(getClass());
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        logger.info("登录用户名: "+username);

        //根据用户名查找用户
        User user= (User) User
                .withDefaultPasswordEncoder()
                .username(username)
                .password("123456")
                .authorities(AuthorityUtils.commaSeparatedStringToAuthorityList("admin"))
                .build();
        System.out.println(ReflectionToStringBuilder.toString(user,ToStringStyle.MULTI_LINE_STYLE));
        return user;
//        return new User(username,"123456",AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
    }
}
