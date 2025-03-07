// object reference 
class fourth {
    int y = 5; // instance variable
    static int x = 10; // static variable just for info , not use like this

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        fourth f1 = new fourth();
        fourth f2 = f1;
        fourth f3 = new fourth();
        fourth f4 = f3;
        f1 = f3;
        System.out.println("Before->f4.y=" + f4.y + "\t f4.x=" + f4.x); // y 5 x 5
        f3.y = 1;
        f3.x = 20;
        System.out.println("After->f3.y=" + f3.y + "\t f3.x=" + f3.x); // y 1 x 1
        System.out.println("After->f4.y=" + f4.y + "\t f4.x=" + f4.x); // y 1 x 1
        System.out.println("f1.y=" + f1.y + "\t f1.x=" + f1.x); // y 5 x 1
        System.out.println("f2.y=" + f2.y + "\t f2.x=" + f2.x); // y 5 x 1

    }
}