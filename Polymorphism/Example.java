public class Example {
    public static void main(String[] args) {

        Numbers obj = new Numbers();

        int sumOfInteger = obj.sum(1, 5);
        System.out.println(sumOfInteger);

        double sumOfDouble = obj.sum(1.50, 3.45);
        System.out.println(sumOfDouble);
    }
}

class Numbers {
    int sum(int a, int b) {
        return a + b;
    }

    double sum(double a, double b) {
        return a + b;
    }
}
