import java.util.Scanner;

class subProSum_1281 {
    public int subtractProductAndSum(int n) {
        int product = 1, sum = 0, d;

        while (n > 0) {
            d = n % 10;
            n = n / 10;
            product = product * d;
            sum = sum + d;
        }

        return product - sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        subProSum_1281 obj = new subProSum_1281();
        System.out.println(obj.subtractProductAndSum(n));

        sc.close();
    }
}