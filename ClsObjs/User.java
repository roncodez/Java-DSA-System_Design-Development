package ClsObjs;

public class User {
    private String username;

    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public void login() {
        System.out.println(username + " logged in!");
    }

    public void showDashboard() {
        System.out.println(username + "\'s dashboard");
    }
}

// just as the AdminUser class was created and inherited the User class, multiple other classes
// such as SellerUser and RegularUser can also be created.