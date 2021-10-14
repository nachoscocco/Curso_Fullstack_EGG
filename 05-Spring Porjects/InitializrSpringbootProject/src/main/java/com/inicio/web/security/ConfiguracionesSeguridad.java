/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inicio.web.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 *
 * @author iscocco
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class ConfiguracionesSeguridad extends WebSecurityConfigurerAdapter{
protected void configure(HttpSecurity http) throws Exception {


http
    .authorizeRequests()
    .antMatchers("/css/*", "/js/*","/img/*", "/**").permitAll()
    .and().formLogin()
    .loginPage("/login") // Que formulario esta mi login
    .loginProcessingUrl("/logincheck")
    .usernameParameter("username") // Como viajan los
    .passwordParameter("password")// Como viajan los
    .defaultSuccessUrl("/inicio") // A que URL viaja
    .permitAll()
    .and().logout() // Aca configuro la salida
    .logoutUrl("/logout")
    .logoutSuccessUrl("/")
    .permitAll().and().csrf().disable();
    }
}
