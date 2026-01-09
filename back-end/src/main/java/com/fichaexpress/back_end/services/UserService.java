package com.fichaexpress.back_end.services;

import com.fichaexpress.back_end.entities.User;
import com.fichaexpress.back_end.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder ;

    @Transactional
    public User cadastrarUser(User user){
            String senhaPura =  user.getPassword();
            String senhaCodificada = passwordEncoder.encode(senhaPura);
            user.setPassword(senhaCodificada);
            return userRepository.save(user);
    }


    @Transactional
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

    @Transactional
    public void deletarUser(Long id){
        userRepository.deleteById(id);
    }
}
