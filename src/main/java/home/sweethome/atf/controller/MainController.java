package home.sweethome.atf.controller;

import home.sweethome.atf.entity.User;
import home.sweethome.atf.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class MainController {

  private final UserService userService;

  @GetMapping("/")
  public String mainPage(Model model) {
    model.addAttribute("message", "Welcome to main page!");
    return "index";
  }

  @GetMapping("/users")
  public String getUsers(Model model) {
    model.addAttribute("users", userService.getUsers());
    model.addAttribute("message", "List users");
    return "user-list";
  }

  @GetMapping("/new-user")
  public String saveNewUser(Model model) {
    User user = new User();
    model.addAttribute("message", "Adding new user");
    model.addAttribute("user", user);
    return "new-user";
  }

  @PostMapping("/new-user")
  public String saveNewUser(@ModelAttribute("user") User user) {
    userService.saveNewUser(user);
    return "redirect:/users";
  }

  @GetMapping("/register")
  public String register(Model model) {
    model.addAttribute("userData", new User());
    return "register";
  }

  @PostMapping("/register")
  public String userRegistration(User userData, BindingResult bindingResult, Model model) {
    if (bindingResult.hasErrors()) {
      model.addAttribute("registrationForm", userData);
      return "register";
    }
    try {
      userService.register(userData);
    } catch (RuntimeException e) {
      bindingResult.rejectValue("email", "userData.email", "An account already exists for this email.");
      model.addAttribute("registrationForm", userData);
      return "register";
    }
    return "redirect:/";
  }
}
