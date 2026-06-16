import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class fizzBuzz_412 {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            ans.add(
                i % 15 == 0 ? "FizzBuzz" :
                i % 5 == 0  ? "Buzz" :
                i % 3 == 0  ? "Fizz" :
                String.valueOf(i)
            );
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        fizzBuzz_412 obj = new fizzBuzz_412();
        List<String> result = obj.fizzBuzz(n);

        for (String s : result) {
            System.out.println(s);
        }

        sc.close();
    }
}