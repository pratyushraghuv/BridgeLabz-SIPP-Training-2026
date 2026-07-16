import java.util.Scanner;

class reverseInteger_7 {
    public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10)
                return 0;

            int d = x % 10;
            rev = (rev * 10) + d;
            x /= 10;
        }

        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        reverseInteger_7 obj = new reverseInteger_7();
        System.out.println(obj.reverse(x));

        sc.close();
    }
}