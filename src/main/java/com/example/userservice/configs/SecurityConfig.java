package com.example.userservice.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SecurityConfig {
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeHttpRequests((requests) -> {
//                    try{
//                        requests.anyRequest().permitAll();
//                    } catch (Exception e) {
//                        throw new RuntimeException(e);
//                    }
//                        }
//                )
//                .httpBasic(withDefaults());
//        return http.build();
//@Bean
//public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//    http
//            .csrf(csrf -> csrf.disable())  // ✅ Correct way to disable CSRF in Spring Security 6.1+
//            .authorizeHttpRequests(auth -> auth
//                    .anyRequest().permitAll()  // ✅ Allow all requests
//            )
//            .httpBasic(withDefaults());  // Keep basic auth if needed
//
//    return http.build();
//}


}
