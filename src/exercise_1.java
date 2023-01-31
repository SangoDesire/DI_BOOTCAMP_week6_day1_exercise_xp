import java.util.Scanner;

public class exercise_1 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please! enter the first angle ");
    double angle = scanner.nextDouble();

    System.out.println("Please! enter the second angle ");
    double angle2= scanner.nextDouble();
    System.out.println("Please! enter the third angle ");
    double angle3 = scanner.nextDouble();

    if ((angle + angle2 + angle3 ) == 180){
            System.out.println("it's a valid triangle");
        }else{
            System.out.println("it's not a valid triangle");
        }
  }
}



