package P3_CacDoiTuongCoBan_RegularExpression;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Bai2 {
    private static final String EMAIL_REGEX =   "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public static boolean isEmail(String emailAddress) {
        return Pattern.compile(EMAIL_REGEX)
                .matcher(emailAddress)
                .matches();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap email: ");
        String emailAddress = sc.nextLine();
        if(isEmail(emailAddress)) System.out.println("Email dung dinh dang!");
        else System.out.println("Email khong dung dinh dang");
    }
}
