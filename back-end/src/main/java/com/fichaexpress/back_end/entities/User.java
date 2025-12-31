package com.fichaexpress.back_end.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

<<<<<<< HEAD
import java.util.List;

=======
>>>>>>> 1c428e8bad15076a0c45ffc2ca9bdd5e33e5f24d
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
<<<<<<< HEAD
@Table(name = "tb_users")
=======
>>>>>>> 1c428e8bad15076a0c45ffc2ca9bdd5e33e5f24d
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String player;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password ;


<<<<<<< HEAD


=======
>>>>>>> 1c428e8bad15076a0c45ffc2ca9bdd5e33e5f24d
}
