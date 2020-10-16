package coupling;

public class Application {

    public static void main(String... args) {
        User user = new User();
        user.setName(null);

        System.out.println("Name is " + user.getName());
    }
}
