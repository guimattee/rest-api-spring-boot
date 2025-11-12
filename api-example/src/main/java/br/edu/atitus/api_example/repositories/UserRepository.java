package br.edu.atitus.api_example.repositories;

import br.edu.atitus.api_example.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<UserEntity, UUID> {

    //select * from tb_user where email = {}
    boolean existsByEmail(String email);

    //select * from tb_user where email = {} and name = {}
    boolean existsByEmailAndName(String email, String name);

    Optional<UserEntity> findByEmail(String email);
}
