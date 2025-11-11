package br.edu.atitus.api_example.services;

import br.edu.atitus.api_example.entities.UserEntity;
import br.edu.atitus.api_example.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        super();
        this.repository = repository;
    }

    public UserEntity save(UserEntity user) throws Exception {
        if (user == null)
            throw new Exception("Objeto nulo");
        if (user.getName() == null || user.getName().isEmpty())
            throw new Exception("Nome nulo");
        if (user.getEmail() == null || user.getEmail().isEmpty())
            throw new Exception("Email nulo");
        if (user.getPassword() == null || user.getPassword().isEmpty() || user.getPassword().length() < 8)
            throw new Exception("Senha inválida");

        //TODO criar hash da senha

        //TODO validar permissao cadastro comum

        //TODO enviar para a camada repository
        repository.save(user);
        return user;
    }
}
