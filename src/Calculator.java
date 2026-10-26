public class Calculator {
    private double length;
    private double width;
    private double radius;


    //square
    public double calculatearea(double length){
        return length*length;
        
    }

    //rectangle
    public double calcualtearea(double length,double width){
        return length*width;
    }

    //circle
    //area of a circle=Math.PI r*r
    public double calcualtearea(double radius){
        return Math.PI*radius*radius;
    }
}
