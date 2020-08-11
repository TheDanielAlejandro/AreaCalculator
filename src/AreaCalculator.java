public class AreaCalculator {

    public static double area(double radius){
        if(radius >= 0){
            double result = Math.PI * (radius * radius);
            System.out.println("The area of the Cirle with radius: " + radius + ", is: " + result);
            return result;
        }else{
            return -1;
        }
    }

    public static double area(double firstSideRectangle, double secondSideRectangle){
        if(firstSideRectangle >=0 && secondSideRectangle >= 0){
            double result = firstSideRectangle * secondSideRectangle;
            System.out.println("The area of the Rectangle with sides: " + firstSideRectangle + ", " + secondSideRectangle + " is: " + result);
            return (result);
        }else{
            return -1;
        }
    }
}
