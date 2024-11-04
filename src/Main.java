//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        System.out.println("-----------Shape--------------");
        Shape s1 = new Shape(); // case 1 empty constructor.
        System.out.println(s1.toString());
        System.out.println("______________________________");
        Shape s2 = new Shape("Blue",false); // case 2 second and last constructor.
        System.out.println(s2.toString());
        System.out.println("______________________________");
        Shape s3 = new Shape(); // case 3 testing setters and getters.
        s3.setColor("Yellow");
        s3.setFilled(false);
        System.out.println("Color of Shape is "+s3.getColor()+" Is filled"+s3.isFilled()+".");

        System.out.println("-----------Circle--------------");
        Circle c1 = new Circle(); // case 1 empty constructor.
        System.out.println(c1.toString());
        System.out.println("The area of the Circle is "+c1.getArea()+", And the Perimeter is "+c1.getPerimeter()+".");
        System.out.println("______________________________");
        Circle c2 = new Circle("Cyan",true, 7.5); // case 2 second and last constructor.
        System.out.println(c2.toString());
        System.out.println("The area of the Circle is "+c2.getArea()+", And the Perimeter is "+c2.getPerimeter()+".");
        Circle c3 = new Circle(); // case 3 testing setters and getters.
        c3.setRadius(12.5);
        System.out.println("Radius of Circle is "+c3.getRadius()+".");

        System.out.println("-----------Rectangle-----------");
        Rectangle r1 = new Rectangle(); // case 1 empty constructor
        System.out.println(r1.toString());
        System.out.println("The area of the Rectangle is "+r1.getArea()+" , And the Perimeter is "+r1.getPerimeter()+".");
        System.out.println("______________________________");
        Rectangle r2 = new Rectangle(25.5, 30.5); // case 2 second constructor.
        System.out.println(r2.toString());
        System.out.println("The area of the Rectangle is "+r2.getArea()+" , And the Perimeter is "+r2.getPerimeter()+".");
        System.out.println("______________________________");
        Rectangle r3 = new Rectangle("Purple", false,55.5,75.5); // case 3 third and last constructor.
        System.out.println(r3.toString());
        System.out.println("The area of the Rectangle is "+r3.getArea()+" , And the Perimeter is "+r3.getPerimeter()+".");
        Rectangle r4 = new Rectangle(); // case 4 testing setters and getters.
        r3.setLength(34.5);
        r3.setWidth(21.6);
        System.out.println("Length of Rectangle is "+r3.getLength()+" and the Width is"+r3.getWidth()+".");

        System.out.println("-----------Square--------------");
        Square sq1 = new Square();  // case 1 empty constructor.
        System.out.println(sq1.toString());
        System.out.println("______________________________");
        Square sq2 = new Square(25.2); // case 2 second constructor.
        System.out.println(sq2.toString());
        System.out.println("______________________________");
        Square sq3 = new Square("Red", true, 35.7); // case 3 third and last constructor.
        System.out.println(sq3.toString());
        System.out.println("______________________________");
        Square sq4 = new Square(); // case 4 testing setters and getters.
        sq4.setSide(34.88);
        System.out.println("Side of Square is "+sq4.getSide()+".");
    }
}