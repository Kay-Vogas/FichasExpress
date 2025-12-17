package com.fichaexpress.back_end.services;

import com.fichaexpress.back_end.entities.User;
import com.fichaexpress.back_end.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder ;

    public User cadastrarUser(User user){
            String senhaPura =  user.getPassword();
            String senhaCodificada = passwordEncoder.encode(senhaPura);
            user.setPassword(senhaCodificada);
            return userRepository.save(user);
    }

    public Boolean loginUser(User user){

        Optional<User> usuarioNoBanco = userRepository.findByEmail(user.getEmail());

        if(usuarioNoBanco.isEmpty()){
            return false;
        }

        User usuarioEncontradoBanco = usuarioNoBanco.get();
        String senhaPura =  user.getPassword();
        String hashSalvoNoBanco = usuarioEncontradoBanco.getPassword();

        Boolean confirmacaoSenha = passwordEncoder.matches(senhaPura,hashSalvoNoBanco);

        return confirmacaoSenha;
    }

}
