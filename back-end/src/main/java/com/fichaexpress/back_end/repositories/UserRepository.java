package com.fichaexpress.back_end.repositories;

import com.fichaexpress.back_end.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

<<<<<<< HEAD
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {

    Optional<User> findByEmail(String email);
=======
public interface UserRepository extends JpaRepository<User,Integer> {

>>>>>>> 1c428e8bad15076a0c45ffc2ca9bdd5e33e5f24d
}
