public class LoginPresenter {
    private LoginView view;

    public LoginPresenter(LoginView view) {
        this.view = view;
    }

    public void onLogin(String username, String password) {
        // проверка логина и пароля
        // ...

        view.showChatListScreen();
    }

    public void onRegister() {
        view.showRegistrationScreen();
    }
}