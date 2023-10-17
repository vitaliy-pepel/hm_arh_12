import java.util.List;

public class ChatPresenter {
    private ChatView view;

    public ChatPresenter(ChatView view) {
        this.view = view;
    }

    public void loadMessages(Chat chat) {
        List<Message> messages = chat.getMessages();
        // загрузка сообщений чата
        // ...

        view.showMessages(messages);
    }

    public void sendMessage(Chat chat, String content) {
        String sender = "current_user"; // замените на имя текущего пользователя
        Message message = new Message(sender, content);
        chat.addMessage(message);

        view.showMessageSent();
    }
}