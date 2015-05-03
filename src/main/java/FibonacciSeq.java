/**
 * Created by Alex on 5/3/2015.
 */
public class FibonacciSeq {
    int num1 = 0;
    int num2 = 0;
    static int n = 0; //n times

    //prints fibonacciSeq 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
     private int recursivelyGetFibNum(int number) {
         if (number == 0) {
            return 0;
         } else if (number == 1 || number == 2) {
            return 1;
        } else {
            return recursivelyGetFibNum(number -1) + recursivelyGetFibNum(number - 2);
        }
    }

    public static void main(String[] args) {
        n = 10;
        int counter = 0;

        FibonacciSeq fibonacciSeq = new FibonacciSeq();

        while (counter <= n) {
            System.out.println(fibonacciSeq.recursivelyGetFibNum(counter));
            counter++;
        }
    }


}
