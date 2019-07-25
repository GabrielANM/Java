package org.com.generation.artemis.user;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.com.generation.artemis.exception.ResourceNotFoundException;
import org.com.generation.artemis.user.User;
import org.com.generation.artemis.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;
import javax.persistence.Entity;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @ApiOperation(value = "Lista todos os usuários", notes = "Lista todos os usuários", response = User.class)
    @ApiResponses({
            @ApiResponse(code = 200, message = "Consulta de todos os usuários com sucesso!!")
    })
    // READ
    @GetMapping("/users")
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @ApiOperation(value = "Lista um usuário especifico", notes = "Lista um usuário especifico", response = User.class)
    @ApiResponses({
            @ApiResponse(code = 200, message = "Este usuário existe")
    })
    @GetMapping("/users/{id_user}")
    public Optional<User> findById(@PathVariable Long id_user) {
        return userRepository.findById(id_user);
    }

    @ApiOperation(value = "Insere um novo usuário", notes = "Insere um novo usuário", response = User.class )
    @ApiResponses({
            @ApiResponse(code = 201, message = "Inclusão com sucesso de um novo usuário")
    })
    // CREATE
    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public User save (@RequestBody User user) {
        return userRepository.save(user);
    }


    @ApiOperation(value = "Atualiza um usuário existente", notes = "Atualizar um usuário existente", response = User.class)
    @ApiResponses({
            @ApiResponse(code = 204, message = "Atualização com sucesso de um usuário")
    })
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

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ApiOperation(value = "Exclui um usuário existente", notes = "Exclui um usuário existente", response = User.class)
    @ApiResponses({
            @ApiResponse(code = 204, message = "Exclusão com sucesso de um usuário")
    })
    @DeleteMapping("/users/{id_user}")
    public void delete (@PathVariable Long id_user) {
        userRepository.deleteById(id_user);
    }


}

