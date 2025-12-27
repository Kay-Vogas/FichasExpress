package com.fichaexpress.back_end.repositories;

import com.fichaexpress.back_end.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}
