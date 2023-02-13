
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        A obj = new A(69, "Rahul");

        obj.setNum(99);
        int val = obj.getNum();

        int[] arr = new int[10];
        Arrays.toString(arr);
        Arrays.binarySearch(arr, val, val, val);
        System.out.println(val);

    }
}

class A {
    private int num;
    String name;
    int[] arr;

    A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
