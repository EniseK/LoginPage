import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {

    List<String> emails = new ArrayList<>();
    List<String> passwords = new ArrayList<>();

    //gather name-last name from the user following the rules.
    public void signup() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter your full name: ");
        String fullName = inp.nextLine();
//if the email is faulty, it needs to be entered again. Therefore, it is best to use a do-while loop.
        String email;
        boolean isValid;
        boolean isExist;

        do {
            System.out.println("Please enter your email address: ");
           email = inp.nextLine().trim();
            isValid = validateEmail(email);
            isExist = this.emails.contains(email);
            if (isExist) {
                System.out.println("The email address you have entered is already registered to our system. Please try to log-in.");
                isValid = false;
            }

        } while (!isValid);

//password creation.
String password;
boolean isValidPassword;

do {
    System.out.println("Please enter a password: ");
    password=inp.nextLine().trim();

    isValidPassword = validatePassword(password);
}while (!isValidPassword);

User user =new User(fullName, email, password);

this.emails.add(user.email);
this.passwords.add(user.password);

        System.out.println("Congratulations! You have successfully signed up.");
        System.out.println("You can log-in with your email address and password.");

    }

    private boolean validateEmail(String email) {
        return true;
    }

    private boolean validatePassword(String password) {
        return true;
    }

    public void login() {
    }


}
