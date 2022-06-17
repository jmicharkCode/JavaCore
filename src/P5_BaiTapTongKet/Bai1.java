package P5_BaiTapTongKet;

public class Bai1 {
    public static void inHinhF() {
        for(int i = 1; i <= 9; i++) {
            int temp = i;
            if(temp == 9) {
                System.out.println("* * * * * * * * *");
                break;
            }
            else {
                for (int j = 1; j <= temp; j++) {
                    if (j == 1 || j == temp) {
                        System.out.print("* "); // tranh truong hop = 2 k co cach
                    } else System.out.print("  "); // 2 dau cach do mot cai thay cho *
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        inHinhF();
    }
}
