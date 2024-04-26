package home.sweethome.atf.controller;

import home.sweethome.atf.entity.User;
import home.sweethome.atf.service.UserService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ApiController {
  private final UserService userService;

  @GetMapping("/users")
  public ResponseEntity<List<User>> getUsers() {
    return ResponseEntity.ok(userService.getUsers());
  }

  @PostMapping("/new-user")
  public ResponseEntity<HttpStatus> saveNewUser(@RequestBody User newUser) {
    userService.saveNewUser(newUser);
    return ResponseEntity.status(HttpStatus.CREATED).body(HttpStatus.CREATED);
  }

  @PostMapping("/register")
  public ResponseEntity<HttpStatus> userRegistration(@RequestBody User registerUser) {
    userService.register(registerUser);
    return ResponseEntity.status(HttpStatus.CREATED).body(HttpStatus.CREATED);
  }
}