package thucHanh2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAccount {
    public static void main(String[] args) {
        String emailPattern = "^[_a-z0-9]{6,}$";
        System.out.println("Enter Account: ");
        Scanner scanner = new Scanner(System.in);
        String account = scanner.nextLine();
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(account);
        System.out.println("Email " + account+ " is " + matcher.matches());
    }
}
