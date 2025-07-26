import com.shape.Circle;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // create an instance of a circle
        Circle circle = new Circle("circle", 15.0);
        // get the circumference aka the perimeter of a circle
        circle.Circumference();
    }
}
