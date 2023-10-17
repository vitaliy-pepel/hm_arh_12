import java.util.List;

public interface ChatView {
    void showMessages(List<Message> messages);
    void showMessageSent();
}
