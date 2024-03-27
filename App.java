public class App {
    public static void main(String[] args) throws Exception {
        ChatServer server = new ChatServer();
        ChatClient client1 = new ChatClient("Alberto");
        ChatClient client2 = new ChatClient("Giulio");
    }
}
