package home.sweethome.atf.service;

import home.sweethome.atf.ecxeption.UserServiceException;
import home.sweethome.atf.entity.User;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Getter
@Service
@RequiredArgsConstructor
public class UserService {

  private final List<User> users = new ArrayList<>();

  {
    users.add(new User("lom", "Pavel", "Lomov", "12345", "lom@mail.ru"));
    users.add(new User("kenny", "Ken", "Komma", "1234", "ken@mail.ru"));
    users.add(new User("omm", "Lorry", "Physics", "123", "omm@mail.ru"));
  }

  public void saveNewUser(User user) {
    users.add(user);
  }

  public User getUser(String username) {
    return users.stream().filter(u -> u.getUsername().equals(username)).findFirst().orElse(new User());
  }

  public void register(User userData) {
    User user = getUser(userData.getUsername());
    if (user != null) {
      throw new UserServiceException("User with credentials: " + user.getUsername()
          + " already exists");
    }

    users.add(userData);
  }

}
