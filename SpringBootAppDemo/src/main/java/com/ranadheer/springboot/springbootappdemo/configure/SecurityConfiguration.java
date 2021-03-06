package com.ranadheer.springboot.springbootappdemo.configure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {


    @Autowired
    private UserDetailsService userDetailsService;

    // AUTHENTICATION
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        // provides user details using username
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder);
    }
    
    // AUTHORIZATION
  @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .authorizeRequests()
                .antMatchers("/**").authenticated()
                .antMatchers("/articles/user").hasRole("USER")
                .and()
                .formLogin()
                .loginPage("/showLoginPage")
                .loginProcessingUrl("/authenticateTheUser")
                .defaultSuccessUrl("/articles/")
                .permitAll()
                .and()
                .logout().permitAll()
                .and()
                .csrf().disable()
                .cors()
                .and()
                .sessionManagement()
                .and()
                .exceptionHandling()
                .accessDeniedPage("/access-denied");
    }

}
