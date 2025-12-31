package com.fichaexpress.back_end.services;

import com.fichaexpress.back_end.entities.User;
import com.fichaexpress.back_end.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import java.util.Optional;

=======
>>>>>>> 1c428e8bad15076a0c45ffc2ca9bdd5e33e5f24d
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder ;

<<<<<<< HEAD
    public User cadastrarUser(User user){
=======
    public User CadastrarUser(User user){
>>>>>>> 1c428e8bad15076a0c45ffc2ca9bdd5e33e5f24d
            String senhaPura =  user.getPassword();
            String senhaCodificada = passwordEncoder.encode(senhaPura);
            user.setPassword(senhaCodificada);
            return userRepository.save(user);
    }

<<<<<<< HEAD
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
=======
>>>>>>> 1c428e8bad15076a0c45ffc2ca9bdd5e33e5f24d

}
