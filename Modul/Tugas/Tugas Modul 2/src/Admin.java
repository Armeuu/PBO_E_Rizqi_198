public class Admin {
    private String username = "Admin198";
    private String password = "Password198";

    public boolean login(String inputUsername, String inputPassword) {
        return inputUsername.equals(username) && inputPassword.equals(password);
    }
}
