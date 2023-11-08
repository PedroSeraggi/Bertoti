public class Main {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);

        chatRoom.sendMessage("Olá a todos!");
    }
}
