package second_example;

import java.util.List;

public interface Observer {
    public void handleEvent(List<String> products);
}
