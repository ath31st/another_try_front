package home.sweethome.atf.service;

import home.sweethome.atf.entity.User;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

  private final List<User> users = new ArrayList<>();

  {
    users.add(new User("lom", "Pavel", "Lomov", "12345", "lom@mail.ru"));
    users.add(new User("kenny", "Ken", "Komma", "1234", "ken@mail.ru"));
    users.add(new User("omm", "Lorry", "Physics", "123", "omm@mail.ru"));
  }

  public String saveNewUser(User user) {
    users.add(user);
    return "User " + user.getUsername() + " successfully added!";
  }

  public User getUser(String username) {
    return users.stream().filter(u -> u.getUsername().equals(username)).findFirst().orElse(new User());
  }

  public List<User> getUsers() {
    return users;
  }

  public void register(User userData) throws RuntimeException {
    User user = getUser(userData.getUsername());
    if (user != null) throw new RuntimeException();

    users.add(userData);
  }

}
