import java.util.Scanner;

/**
 * Created by NAN7 on 1/9/2022.
 */
public class Array2 {
    public static void main(String[] args) {
        int x[]=new int [5];
        Scanner in=new Scanner(System.in);
        System.out.println("Enter array numbers..");

        for (int i = 0; i <x.length ; i++) {
            x[i]=in.nextInt();
            //input
        }
        for (int i = 0; i <x.length ; i++) {
            System.out.print(x[i]+"\t");
            //output

        }
    }
}
