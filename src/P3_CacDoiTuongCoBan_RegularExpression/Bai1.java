package P3_CacDoiTuongCoBan_RegularExpression;

import java.util.Scanner;

// 1. Viết chương trình in ra số lần kí tự "a" xuất hiện trong một chuỗi.
public class Bai1 {
    public static void numbersOfTime_a_Appears(String s) {
        int count = 0;
        int indexFirst = s.indexOf("a");
        if(indexFirst != -1) {
            for(int i = indexFirst; i < s.length(); i++) {
                if(s.charAt(i) == 'a') count++;
            }
        }
        System.out.println("So lan ki tu a xuat hien trong chuoi: " + count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();
        numbersOfTime_a_Appears(s);
    }
}
