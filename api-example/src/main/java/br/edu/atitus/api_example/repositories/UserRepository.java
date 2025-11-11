package br.edu.atitus.api_example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.atitus.api_example.entities.UserEntity;

import java.util.UUID;

public interface UserRepository extends JpaRepository<UserEntity, UUID> {


}
