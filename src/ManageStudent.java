import java.util.Scanner;

/**
 * Created by NAN7 on 1/9/2022.
 */
public class ManageStudent {
    public static void main(String[] args) {

        Student[] team=new Student[3];

//        Student S1=new Student(1,"fatima");
//        Student S2=new Student(2,"hanan");
//        Student S3=new Student(3,"najwa");
//
//        team[0]=S1;
//        team[1]=S2;
//        team[2]=S3;

        Scanner in=new Scanner(System.in);
        System.out.println("Enter id & name: ");

        for (int i = 0; i <team.length ; i++) {
            Student x=new Student(in.nextInt(),in.next());
            team[i]=x;
        }

        for (int i = 0; i <team.length ; i++) {
            System.out.println(team[i].toString());
        }
        }

    }

