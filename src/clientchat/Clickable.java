package clientchat;

public interface Clickable {
    void sendMessage(String string);

    void disconnect();
    void login(String login, String password);
}
