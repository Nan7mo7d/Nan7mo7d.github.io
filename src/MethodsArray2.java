import java.util.Scanner;

/**
 * Created by NAN7 on 1/9/2022.
 */
public class MethodsArray2 {
     static Scanner in=new Scanner(System.in);

    public static void main(String[] args) {

        int Array[] = new int[5];
        System.out.println("Enter array numbers..");
        inputArrayElements(Array);
        printArray(Array);
    }
        public static void inputArrayElements(int[] x) {
        for (int i = 0; i < x.length; i++) {
            x[i] = in.nextInt();
        }
        }

        public static void printArray(int[] y){
        for (int i = 0; i <y.length ; i++) {
            System.out.print(y[i] + "\t");
        }
        }
    }

