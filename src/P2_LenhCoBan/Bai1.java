package P2_LenhCoBan;

public class Bai1 {
    public static void sumFor10EvenNumberFirst() {
        int sum = 0;
        int count = 10;
        int i = 0;
        while(count > 0) {
            sum += i;
            i += 2;
            count--;
        }
        System.out.println("Tong 10 so chan dau tien: " + sum);
    }

    public static void main(String[] args) {
        sumFor10EvenNumberFirst();
    }
}
