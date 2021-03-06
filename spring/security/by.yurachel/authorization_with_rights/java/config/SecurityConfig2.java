package config;

import model.Permission;
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
public class SecurityConfig2 extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()// Механизм защиты от csrf угрозы.
                .authorizeRequests()
                .antMatchers("/").permitAll() // На какие паттерны.урлы,кто имет доступ.
                .antMatchers(HttpMethod.GET, "/api.**").hasAuthority(Permission.DEVELOPERS_READ.getPermission())
                .antMatchers(HttpMethod.POST, "/api.**").hasAuthority(Permission.DEVELOPERS_WRITE.getPermission())
                .antMatchers(HttpMethod.GET, "/api.**").hasAuthority(Permission.DEVELOPERS_WRITE.getPermission())
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
                        .authorities(Role3.ADMIN.getAuthorities())
                        .build(),
                User.builder()
                        .username("user")
                        .password(passwordEncoder().encode("user"))
                        .authorities(Role3.USER.getAuthorities())
                        .build()

        );
    }

    @Bean
    protected PasswordEncoder passwordEncoder() {     // Шифрование пароля.
        return new BCryptPasswordEncoder(12);
    }
}
