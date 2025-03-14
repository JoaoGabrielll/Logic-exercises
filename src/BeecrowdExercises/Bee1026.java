package BeecrowdExercises;

import java.util.Scanner;

public class Bee1026 {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        while(tc.hasNext()) {
            long n1 = tc.nextLong();
            if (!tc.hasNextLong()) break;
            long n2 = tc.nextLong();

            long sum = n1 ^ n2;
            System.out.println(sum);
            break;
        }
        tc.close();
    }
}
