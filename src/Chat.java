import java.util.ArrayList;
import java.util.List;

public class Chat {
    private String name;
    private List<Message> messages;

    public Chat(String name) {
        this.name = name;
        this.messages = new ArrayList<>();
    }

    public void addMessage(Message message) {
        messages.add(message);
    }
    // геттеры и сеттеры
    public List<Message> getMessages() {

        return null;
    }

}