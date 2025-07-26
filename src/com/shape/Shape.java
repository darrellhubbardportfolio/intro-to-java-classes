public class Shape {
    protected String name;
    // create a constructor
    public Shape (String name) {
        this.name = name;
    }
    // get the parameter
    public void perimeter (int width, int length) {
        int p = (width * 2) + (length * 2);
        System.out.printf("perimeter: %s%n", p);
    }
    // get area
    public void area (int width, int length) {
        int a = width * length;
        System.out.printf("area: %s%n", a);
    }
}