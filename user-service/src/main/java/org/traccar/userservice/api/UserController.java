package org.traccar.userservice.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping("/create")
    public String createUser(@RequestBody String user) {
        return "User created: " + user;
    }

    @PostMapping("/login")
    public String loginUser(@RequestBody String credentials) {
        return "Login successful for: " + credentials;
    }
}
