import java.util.Scanner;

class stepsToReduceNumberZero_1342 {
    public int numberOfSteps(int num) {
        int count = 0;

        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
                count++;
            } else {
                num -= 1;
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        stepsToReduceNumberZero_1342 obj = new stepsToReduceNumberZero_1342();
        System.out.println(obj.numberOfSteps(num));

        sc.close();
    }
}