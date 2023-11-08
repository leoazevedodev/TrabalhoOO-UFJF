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

    @PostMapping(value = "/save")
    public String saveUser(@RequestBody Usuario user)
    {
        userRepo.save(user);
        return "Usuário Salvo !";
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
    public String deleteUser(@PathVariable long id)
    {
        userRepo.deleteById(id);
        return "Usuário Deletado !";
    }
}
