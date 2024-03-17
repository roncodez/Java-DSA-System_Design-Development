package ClsObjs;

public class AdminUser extends User{

    AdminUser(String username, String email) {
        super(username, email);
    }

    public void manageProducts() {
        System.out.println("Admin is managing products!");
    }

    @Override // Method overriding - this keyword makes sure something is overridden to solve the problem
    // in case of debugging - spelling mistake in overriden function in child class
    public void showDashboard() {
        super.showDashboard(); // this can still be used to call the function in the parent class
        System.out.println("Admin user personalized dashboard");
    }

    public static void main(String[] args) {
        AdminUser au = new AdminUser("ronit02", "ronit02@gmail.com");
        au.login();
    }
}
