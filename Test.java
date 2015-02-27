package Soft;

/**
 * Created by Oles on 1/26/2015.
 */
public class Test {
    private static Service service = new Service();
    public static void main(String[] args) {
        start();
    }
    private static void start(){
        service.createRectangleAndAddToArrayList(new Soft.Rectangle(5, 5, 10, 10));
        service.createCircleAndAddToArrayList(new Soft.Circle(7, 7, 4, 3));
        service.createRectangleAndAddToArrayList(new Soft.Rectangle(7, 5, 11, 10));
        service.createCircleAndAddToArrayList(new Soft.Circle(7,7,4,7));
        service.output();
        System.out.println();
        service.sort();
        service.output();
        System.out.println();
        service.outputLasThree();
        service.writeToFile();
        service.readFromTheFile();
        service.outputStringBuilder();
    }
}
