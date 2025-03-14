package BeecrowdExercises;

import java.util.Scanner;

public class Bee1010 {

    public static void main(String[] args){
        Scanner tc = new Scanner(System.in);

            int cont = 0;
            double calc = 0;

            while (cont < 2){
                int code = tc.nextInt();
                int uni = tc.nextInt();
                double price = tc.nextDouble();

                calc = calc + uni * price;
                cont++;
            }

        System.out.printf("VALOR A PAGAR: R$ %.2f%n",calc);

            tc.close();
    }
}
