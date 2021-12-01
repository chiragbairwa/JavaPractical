import java.util.Scanner;

class j6{
    public static void main(String []str){
        Scanner sc = new Scanner(System.in);

        double marks[] = new double[5];
        double total = 0.0;
        
        for(int i=1; i<5; i++){
            System.out.println("Enter marks of subject :"+ i);
            marks[i] = sc.nextDouble();
            total += marks[i];
        }
        System.out.println("Average = " + total/5);
    }
}