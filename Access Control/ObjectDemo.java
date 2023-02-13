public class ObjectDemo {
    public static void main(String[] args) {

        // ObjectDemoExample obj = new ObjectDemoExample(69);
        // ObjectDemoExample obj2 = obj;
        // System.out.println(obj2.hashCode());
        // System.out.println(obj.hashCode());

        Subclass sub = new Subclass(0);
        System.out.println(sub instanceof ObjectDemoExample);

    }
}

class ObjectDemoExample {
    int num;

    ObjectDemoExample(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}

class Subclass extends ObjectDemoExample {

    Subclass(int num) {
        super(num);
    }
}
