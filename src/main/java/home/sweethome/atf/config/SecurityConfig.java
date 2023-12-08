package home.sweethome.atf.config;

import static org.springframework.security.config.Customizer.withDefaults;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {

  @Bean
  public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
    httpSecurity

        .authorizeHttpRequests(authorize -> authorize.anyRequest().authenticated())
        .httpBasic(withDefaults())
        .formLogin(withDefaults())
        .securityMatcher("/register", "/css/**")
        .securityMatcher("/", "/users", "/new-user");

    return httpSecurity.build();
  }

  @Bean
  public BCryptPasswordEncoder bCryptPasswordEncoder() {
    return new BCryptPasswordEncoder();
  }
}
