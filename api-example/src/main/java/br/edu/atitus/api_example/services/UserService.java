package br.edu.atitus.api_example.services;

import br.edu.atitus.api_example.entities.UserEntity;

public class UserService {

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
        return user;
    }
}
