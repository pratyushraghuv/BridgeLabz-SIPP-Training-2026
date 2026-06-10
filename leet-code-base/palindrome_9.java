import java.util.Scanner;

class palindrome_9 {
    public boolean isPalindrome(int x) {
        int s = 0, d, m;
        m = x;

        while (m > 0) {
            d = m % 10;
            m = m / 10;
            s = s * 10 + d;
        }

        return x == s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        palindrome_9 obj = new palindrome_9();

        if (obj.isPalindrome(num))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}