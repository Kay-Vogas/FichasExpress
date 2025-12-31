package com.fichaexpress.back_end.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
<<<<<<< HEAD
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
=======
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
>>>>>>> 1c428e8bad15076a0c45ffc2ca9bdd5e33e5f24d

@Configuration
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncorder (){
        return new BCryptPasswordEncoder();
    }

<<<<<<< HEAD
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                // 1. Desabilita CSRF (necessário para H2 Console e Postman)
                .csrf(csrf -> csrf.disable())

                // 2. Configura a sessão como Stateless (boa prática para API REST)
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))

                // 3. Gerencia as permissões de acesso
                .authorizeHttpRequests(authorize -> authorize
                        // Libera o cadastro de usuários
                        .requestMatchers(HttpMethod.POST, "/user/cadastro").permitAll()

                        // Libera o login (se tiver)
                        .requestMatchers(HttpMethod.POST, "/auth/login").permitAll()

                        // LIBERA O H2 CONSOLE (IMPORTANTE: Note os dois asteriscos)
                        .requestMatchers("/h2-console/**").permitAll()

                        // Qualquer outra rota precisa de autenticação
                        .anyRequest().authenticated()
                )

                // 4. LIBERA OS FRAMES PARA O H2 FUNCIONAR
                // Sem isso, o H2 abre uma tela branca ou dá erro de conexão
                .headers(headers -> headers.frameOptions(frame -> frame.disable()))

                .build();
    }

=======
>>>>>>> 1c428e8bad15076a0c45ffc2ca9bdd5e33e5f24d
}
