package com.nploi.tipjs_course.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecutiryConfig {

    // @Bean
    // public SecurityFilterChain securityFilterChain(HttpSecurity http) throws
    // Exception {
    // http
    // .authorizeRequests()
    // .antMatchers("/api/admin/vip").hasRole("VIP")
    // .antMatchers("/api/admin/normal").hasAnyRole("VIP", "USER")
    // .anyRequest().authenticated()
    // .and()
    // .httpBasic();

    // return http.build();
    // }

    @Bean
    UserDetailsService userDetailsService() {
        UserDetails user = User.withUsername("user").password("{noop}123").roles("user").build();
        UserDetails vip = User.withUsername("vip").password("{noop}vip123").roles("VIP").build();
        return new InMemoryUserDetailsManager(user, vip);
    }
}
