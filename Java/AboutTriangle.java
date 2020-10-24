import java.util.Scanner;

public class AboutTriangle{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("***********************************************************");
        System.out.println("*\tProgram Determines The Type of The Triangle\t  *");
        System.out.println("***********************************************************");

        System.out.print("Input value of the side 1 : ");
        int side1 = scan.nextInt();
        System.out.print("Input value of the side 2 : ");
        int side2 = scan.nextInt();
        System.out.print("Input value of the side 3 : ");
        int side3 = scan.nextInt();

        System.out.print("***********************************************************");
        if(side1==side2 && side1==side3){
            if(side2==side3){
                System.out.print("\n* The type of the triangle is Equilateral\t\t  *");
            }
            else{
                System.out.print("\n* The type of the triangle is Isosceles\t\t\t  *");
            }
        }
        else if(side1<side2 || side2<side1){
            if (side2==side3 || side3==side1){
                System.out.print("\n* The type of the triangle is Isosceles\t\t\t  *");
            }
            else{
                System.out.print("\n* The type of the triangle is Arbitrary\t\t\t  *");
            }
        }
        else if(side1<side3 || side3<side1){
            if(side1==side2 || side2==side3){
                System.out.print("\n* The type of the triangle is Isosceles\t\t\t  *");
            }
            else{
                System.out.print("\n* The type of the triangle is Arbitrary\t\t\t  *");
            }
        }
        else if(side2<side3 || side3<side2){
            if(side1==2 || side1==side3){
                System.out.print("\n* The type of the triangle is Isosceles\t\t\t  *");
            }
            else{
                System.out.print("\n* The type of the triangle is Arbitrary\t\t\t  *");
            }
        }
        System.out.println("\n***********************************************************");
    }
}