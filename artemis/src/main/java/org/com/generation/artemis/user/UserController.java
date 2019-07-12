package org.com.generation.artemis.user;

import org.com.generation.artemis.exception.ResourceNotFoundException;
import org.com.generation.artemis.user.User;
import org.com.generation.artemis.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;
import javax.persistence.Entity;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // READ
    @GetMapping("/users")
    public List<User> findAll() {
        return userRepository.findAll();
    }

    // CREATE

    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public User save (@RequestBody User user) {
        return userRepository.save(user);
    }

    @PutMapping("/users/{id_user}")
    public User update (@PathVariable Long id_user, @RequestBody User user) throws ResourceNotFoundException {
        return userRepository.findById(id_user).map(u -> {
            u.setNome(user.getNome());
            u.setEmail(user.getEmail());
            u.setLogin(user.getLogin());
            u.setSenha(user.getSenha());

            return userRepository.save(u);
        }) .orElseThrow(() -> new ResourceNotFoundException("Não existe pergunta cadastrada com o id_user" + id_user));
    }

    @DeleteMapping("/users/{id_user}")
    public void delete (@PathVariable Long id_user) {
        userRepository.deleteById(id_user);
    }


}

