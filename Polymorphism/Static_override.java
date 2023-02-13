public class Static_override {
    public static void main(String[] args) {

        // Box box1 = new Box();
        // box1.greeting();

        // Box box2 = new boxWeight();
        // box2.greeting();

        Box.greeting();
        boxWeight.greeting();

    }
}

class Box {
    double l, w, h;

    Box() {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    static void greeting() {
        System.out.println("Hey! I am in Box Class .");
    }
}

class boxWeight extends Box {
    double weight;

    public boxWeight() {
        this.weight = -1;
    }

    // @Override
    static void greeting() {
        System.out.println("Hey! I am in BoxWeight Class .");
    }
}
