package dio.web.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.web.api.model.User;
import dio.web.api.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository repository;
    public List<User> getUser(){
        return repository.findAll();
    }
    @GetMapping("/{username}")
    public User getOne(@PathVariable("username") String username){
        return repository.findByUsername(username);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }
    @PostMapping()
    public void postUser(User usuario){
        repository.save(usuario);
    }
}
