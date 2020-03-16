/*
 * package sree.demo;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter; import
 * org.springframework.security.core.userdetails.User; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.provisioning.InMemoryUserDetailsManager;
 * 
 * @Configuration public class SpringSecurityConfig extends
 * WebSecurityConfigurerAdapter {
 * 
 * @Bean public UserDetailsService userDetailsService() {
 * 
 * User.UserBuilder users = User.withDefaultPasswordEncoder();
 * InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
 * manager.createUser(users.username("user").password("password").roles("USER").
 * build());
 * manager.createUser(users.username("admin").password("password").roles("USER",
 * "ADMIN").build()); return manager;
 * 
 * }
 * 
 * }
 */