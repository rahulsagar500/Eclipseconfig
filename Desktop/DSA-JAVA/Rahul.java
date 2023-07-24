import java.util.Scanner;

public class Rahul {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int marks[]=new int[5];
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the value 1: ");
        // marks[0]=sc.nextInt();
        // System.out.println(marks[0]);
        for(int i=0;i<marks.length;i++){
            System.out.printf("Enter the marks of person %d",i+1);
            marks[i]=sc.nextInt();
        }
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }
    
}
