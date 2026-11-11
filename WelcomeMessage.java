public class WelcomeMessage {
    public static void main(String[] args) {
        String name = "Alice";
        String city = "Melbourne";

        StringBuffer message = new StringBuffer();
        message.append("Welcome, ").append(name).append("! We hope you're enjoying your time in ").append(city).append(".");

        System.out.println(message);
    }
}
