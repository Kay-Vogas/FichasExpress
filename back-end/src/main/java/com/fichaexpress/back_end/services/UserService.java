package com.fichaexpress.back_end.services;

import com.fichaexpress.back_end.entities.User;
import com.fichaexpress.back_end.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder ;

    public User CadastrarUser(User user){
            String senhaPura =  user.getPassword();
            String senhaCodificada = passwordEncoder.encode(senhaPura);
            user.setPassword(senhaCodificada);
            return userRepository.save(user);
    }


}
