package coupling;

public class User {

    public String name;

    public String getName() {
        if (name != null) {
            return name;
        } else {
            return "not initiaized";
        }
    }

    public void setName(String s) {
        if (s == null) {
            System.out.println("You can't initialized name to a null");
        }
    }

}
