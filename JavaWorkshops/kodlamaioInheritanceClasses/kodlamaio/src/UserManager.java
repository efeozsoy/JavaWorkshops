public class UserManager {

    public void signUp(User user) {
        System.out.println(user.getFirstName() + " taken.");
        System.out.println(user.getLastName() + " taken.");
        addDatabase(user);

    }

    public void signIn(User user) {
        if (validateCredentials(user, user.getEmail(), user.getPassword())){
            System.out.println("Login confirmed");
        }else{
            System.out.println("Access Denied. 401 Unauthorized");
        }
    }

    public boolean validateCredentials(User user, String email, String password) {
        String[] dataBase = getDatabase(user, user.getEmail());
        return dataBase[2].equals(email) && dataBase[3].equals(password);
    }

    public void addDatabase(User user){
        System.out.println(user.getFirstName() +user.getLastName() + user.getEmail() + user.getPassword()
                + "has been written to database");
    }

    public String[] getDatabase(User user, String email){
        if(user.getEmail().equals(email)){
            System.out.println(user.getId() + " data request sent.");
            return new String[]{user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword()};
        }
        return new String[]{"Bad Request"};
    }
}
