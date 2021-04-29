package com.example.Everbridge;



import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.LdapShaPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.Authentication;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	 public static Authentication getAuthentication() {
	        return SecurityContextHolder.getContext().getAuthentication();
	    }
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		auth.ldapAuthentication()
		.userDnPatterns("uid={0},ou=people")
		.groupSearchBase("ou=groups")
		.contextSource()
		.url("ldap://localhost:8389/dc=springframework,dc=org")
		.and()
		.passwordCompare()
		.passwordEncoder(new LdapShaPasswordEncoder())
		.passwordAttribute("userPassword");
	}
	
    @Override
    protected void configure(HttpSecurity http) throws Exception {
                 http
                .authorizeRequests()
                .antMatchers("/", "/home", "/js/**", "/css/**","/externalCss/**","/images/**").permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .formLogin()
                .loginPage("/details")
                .permitAll();
    }

   
}