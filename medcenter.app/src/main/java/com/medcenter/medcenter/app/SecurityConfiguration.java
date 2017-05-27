package com.medcenter.medcenter.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;
import org.springframework.security.core.context.SecurityContextHolder;

import medcenter.backend.LoginService;
import medcenter.utils.BcryptUtils;

@Configuration
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfiguration extends GlobalMethodSecurityConfiguration {

	@Autowired
	LoginService service;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(this.service).passwordEncoder(new BcryptUtils());
		// @formatter:off
		// auth.inMemoryAuthentication().withUser("admin").password("p").roles("ADMIN",
		// "USER").and().withUser("user")
		// .password("p").roles("USER");
		// @formatter:on
	}

	@Bean
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return authenticationManager();
	}

	static {
		// Use a custom SecurityContextHolderStrategy
		SecurityContextHolder.setStrategyName(VaadinSessionSecurityContextHolderStrategy.class.getName());
	}
}