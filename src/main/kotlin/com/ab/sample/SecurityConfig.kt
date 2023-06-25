package com.ab.sample

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.Customizer.withDefaults
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.web.SecurityFilterChain


@Configuration
class SecurityConfig {
    // Method to configure the security filter chain to allow all requests to index.html
    // and require authentication for all other requests.
    @Bean
    fun securityFilterChain(http: HttpSecurity): SecurityFilterChain {
        http
            .authorizeHttpRequests { authz ->
                authz
                    .requestMatchers("/index.html").permitAll()
                    .anyRequest().authenticated()
            }
            .httpBasic(withDefaults())

        return http.build()
    }
}
