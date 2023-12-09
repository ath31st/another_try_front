package home.sweethome.atf.service;

import java.util.List;
import java.util.stream.IntStream;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GraphService {
  public List<Integer> generateGraph() {
    return IntStream.generate(() -> (int) (Math.random() * 50))
        .limit(12)
        .boxed()
        .toList();
  }
}
