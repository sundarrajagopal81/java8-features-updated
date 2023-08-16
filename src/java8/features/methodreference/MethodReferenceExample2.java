package src.java8.features.methodreference;

@FunctionalInterface
interface IUser {
    User getUser(String name);
}

public class MethodReferenceExample2 {
    public static void main(String[] args) {
        IUser iUser = User::new;
        User user = iUser.getUser("Sundar Test");
        System.out.println(user.getName());
    }
}

class User {
    private String name;

    public User(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
