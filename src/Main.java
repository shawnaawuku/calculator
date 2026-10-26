import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);

        //gotta create an object
        Calculator cal=new Calculator();

        //square
        System.out.println("enter the length of the square");
        double squareLength=scanner.nextDouble();

        System.out.println("Answer= "+ cal.calculatearea(squareLength));


        //rectangle
        System.out.println("enter the width of the rectangle");
        double  rectangleWidth=scanner.nextDouble();
        System.out.println("enter the length of the rectangle");
        double rectangleLength=scanner.nextDouble();

        System.out.println("Answer= "+ cal.calcualtearea(rectangleWidth,rectangleLength));


        //circle
        System.out.println("enter the radius");
        double radiusCircle=scanner.nextDouble();

        System.out.println("Answer= " + cal.calcualtearea(Math.PI,radiusCircle*radiusCircle));


        scanner.close();
    }
}
