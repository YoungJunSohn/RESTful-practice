package com.example.restfulapi.web.user;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/users")
public class UserController {
    public final UsersService usersService;

    @GetMapping
    public List<User> retrieveAll(){
        return usersService.findAll();
    }

    @GetMapping(path = "/{id}")
    public User retrieveOne(@PathVariable Integer id){
        return usersService.findOne(id);
    }

    @PostMapping(path = "/save")
    public void entry(@RequestBody User user){
        User savedUser = usersService.save(user);
        ServletUriComponentsBuilder.fromCurrentRequest()
                .path(id)
    }
}
