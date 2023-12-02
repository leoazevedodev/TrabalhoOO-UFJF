package com.trabalhoOO.rest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.trabalhoOO.rest.Models.Usuario;
import com.trabalhoOO.rest.Repo.UserRepo;

@RestController
public class ApiController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping(value = "/")
    public String getPage()
    {
        return "Hello World!";
    }

    @GetMapping(value = "/users")
    public List<Usuario> getUsers()
    {
        return userRepo.findAll();
    }

    //Tratamento de exceções tanto na em saveUser quanto em deleteUser e trocar o retorno para booleano
    @PostMapping(value = "/save")
    public boolean saveUser(Usuario user) {
        try {
            userRepo.save(user);
            return true;
        } catch (Exception e) { //Implementar eventuais falhas
            return false;
        }
    }

    @PutMapping(value = "/update/{id}")
    public String updateUser(@PathVariable long id, @RequestBody Usuario user)
    {
        Usuario updateUser = userRepo.findById(id).get();

        // updateUser.setFirstName(user.getFirstName());
        // updateUser.setLastName(user.getLastName());
        // updateUser.setAge(user.getAge());
        // updateUser.setOcupation(user.getOcupation());
        // userRepo.save(updateUser);

        return "Usuário Atualizado !";
    }

    @DeleteMapping(value = "/delete/{id}")
    public boolean deleteUser(long id) {
        try {
            userRepo.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
