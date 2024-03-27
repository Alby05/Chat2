public class App {
    public static void main(String[] args) throws Exception {
        ChatServer server = new ChatServer();
        ChatClient client1 = new ChatClient("Francesco");
        ChatClient client2 = new ChatClient("Luca");
        ChatClient client3 = new ChatClient("Mattia");
        ChatClient client4 = new ChatClient("Anna");
    }
}
