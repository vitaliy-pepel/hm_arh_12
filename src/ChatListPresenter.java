import java.util.ArrayList;
import java.util.List;

public class ChatListPresenter {
    private ChatListView view;

    public ChatListPresenter(ChatListView view) {
        this.view = view;
    }

    public void loadChats() {
        List<Chat> chats = new ArrayList<>();
        // загрузка списка чатов
        // ...

        view.showChats(chats);
    }

    public void onChatSelected(Chat chat) {
        view.showChatScreen(chat);
    }
}
