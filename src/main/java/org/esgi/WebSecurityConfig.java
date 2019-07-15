package org.esgi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    // Configuration de la partie HTTP
    // Les règles de sécurisation y sont définies
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        // toutes les requêtes doivent être authentifiées
        http.authorizeRequests().anyRequest().authenticated()

                // Permettre  aux utilisateurs de s'authentifier via une page d'authentification
                .and().formLogin()

                // Permettre aux utilisateurs de s'authentifier via HTTP Basic Authentification
                .and().httpBasic();
    }

    // Configuration de la source d'identité
    @Bean
    @Override
    public UserDetailsService userDetailsService() {
        // Ici une gestion en "mémoire" des utisateurs
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();

        // Création d'un utilisateur en "dur"
        manager.createUser(
                User.withDefaultPasswordEncoder().username("user").password("password").roles("USER").build());


        return manager;
    }

}