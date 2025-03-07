class Demo {
    String name;

    Demo(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name);
    }
}

public class fifth {
    public static void main(String[] args) {
        Demo f1 = new Demo("BMW");
        Demo f2 = f1;
        f2.display();
        f2.name = "Toyota";
        f1.display();
        Demo f3 = new Demo("Benz");
        Demo f4 = f3;
        f3.display();
        f4.display();
    }
}
