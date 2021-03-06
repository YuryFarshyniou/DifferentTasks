package config;

import model.Role3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()// Механизм защиты от csrf угрозы.
                .authorizeRequests()
                .antMatchers("/").permitAll() // На какие паттерны.урлы,кто имет доступ.
                .antMatchers(HttpMethod.GET, "/api.**").hasAnyRole(Role3.ADMIN.name(), Role3.USER.name())
                .antMatchers(HttpMethod.POST, "/api.**").hasRole(Role3.ADMIN.name())
                .antMatchers(HttpMethod.GET, "/api.**").hasRole(Role3.ADMIN.name())
                .anyRequest()  // Каждый запрос
                .authenticated()  // Должен быть аутентифицирован.
                .and() // С помощью Base64.
                .httpBasic();


    }

    @Bean
    @Override
    protected UserDetailsService userDetailsService() {
        return new InMemoryUserDetailsManager(       // Для данных,хранящихся в оперативной памяти.Для ДБ и других источников другие классы.
                User.builder()
                        .username("admin")
                        .password(passwordEncoder().encode("admin")) // Шифрование пароля.
                        .roles(Role3.ADMIN.name())
                        .build(),
                User.builder()
                        .username("user")
                        .password(passwordEncoder().encode("user"))
                        .roles(Role3.USER.name())
                        .build()

        );
    }

    @Bean
    protected PasswordEncoder passwordEncoder() {     // Шифрование пароля.
        return new BCryptPasswordEncoder(12);
    }
}
