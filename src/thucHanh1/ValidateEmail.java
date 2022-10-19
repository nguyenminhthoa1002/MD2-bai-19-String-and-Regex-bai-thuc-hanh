package thucHanh1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
    public static void main(String[] args) {
        String emailPattern = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        System.out.println("Enter Email: ");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);
        System.out.println("Email " + email+ " is " + matcher.matches());
    }
}
