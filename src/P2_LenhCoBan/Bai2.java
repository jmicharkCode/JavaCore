package P2_LenhCoBan;

import java.util.Scanner;

public class Bai2 {
    public static boolean checkPrimeNumber(int n) {
        if(n <= 1) return false;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void sumFor_N_FirstInteger(int n) {
        int sum = 0;
        if(n <= 1) System.out.println("Tong n so nguyen to dau tien: 0" );
        else {
            while (n > 1) {
                if (checkPrimeNumber(n)) {
                    sum += n;
                }
                n--;
            }
            System.out.println("Tong n so nguyen to dau tien: " + sum);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = Integer.parseInt(sc.nextLine());
        sumFor_N_FirstInteger(n);
    }
}
