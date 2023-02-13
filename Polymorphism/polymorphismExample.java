public class polymorphismExample {
    public static void main(String[] args) {

        // Check 1:
        /*
         * Shapes shape = new Shapes();
         * Circle circle = new Circle();
         * Square square = new Square();
         * 
         * shape.area();
         * circle.area();
         * square.area();
         */

        // check 2:
        // Shapes sq = new Square();
        // sq.area();

        // check 3:
        // Shapes s = new Shapes();
        // s.area();

        // Circle c1 = new Circle();
        // c1.area();

        /*
         * below initialization will give error because parent class
         * didn't know about their child classes but child class know about their
         * parent.
         * hence 1. will give error
         * 2. will not give an error
         */
        // 1.
        // Circle c2 = new Shapes(); // -->Error
        // 2.
        // Shapes c = new Circle();
        // c.area();

        // Shapes c = new Circle();
        // c.area();

        // How Overriding Works
        Shapes sh = new Shapes();
        System.out.println(sh);

    }
}

class Shapes {

    void area() {
        System.out.println("I am in Shapes Class");
    }
}

class Circle extends Shapes {

    /*
     * This Area method will run when Object of Child class (Circle)
     * created. Hence it is overriding the parent method
     */

    @Override // This is Called Annotation
    /*
     * Tip :-
     * If you want to Check that the method is overridden or not
     * then just change the name of method . if it is giving error which means
     * yes your method is overridden ,(By common sense) just because if method
     * is not overridden then what is the use of override annotation
     */
    void area() {
        System.out.println("Area : PI * r * r");
    }
}

class Triangle extends Shapes {
    void area() {
        System.out.println("Area : 0.5 * height * base");
    }
}

class Square extends Shapes {
    void area() {
        System.out.println("Area : side *side");
    }
}