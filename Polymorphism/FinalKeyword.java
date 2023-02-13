public class FinalKeyword {
    public static void main(String[] args) {

    }
}
/*
 * It will Give you error because you can't Override a method
 * which is final
 * It can help us sometime and somewhere to enhance the performance
 * because now complier do not have to worry about Overriding.
 */

class Shapes {
    // final void area() {
    // System.out.println("I am in Shapes Class");
    // }

    void area() {
        System.out.println("I am in Shapes Class");
    }
}

class Circle extends Shapes {
    @Override // This is Called Annotation
    void area() {
        System.out.println("Area : PI * r * r");
    }
}

class Triangle extends Shapes {
    void area() {
        System.out.println("Area : 0.5 * height * base");
    }
}
