package home.sweethome.atf.util;

import home.sweethome.atf.entity.User;
import home.sweethome.atf.service.UserService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CommandLineRunnerImpl implements CommandLineRunner {
  private final UserService userService;

  @Override
  public void run(String... args) {
    insertUsers();
  }

  private void insertUsers() {
    List<User> users = List.of(
        new User("lom", "Pavel", "Lomov", "12345", "lom@mail.ru"),
        new User("kenny", "Ken", "Komma", "1234", "ken@mail.ru"),
        new User("omm", "Lorry", "Physics", "123", "omm@mail.ru")
    );
    userService.addUsers(users);
  }
}
