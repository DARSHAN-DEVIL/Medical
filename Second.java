public class Second {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        String op = args[1];
        int b = Integer.parseInt(args[2]);
        int z=0;
        if(op.equals("+"))
        {   z=a+b;
        System.out.println(z);
        }
        else {
            System.out.println("opeartor not recognized");
        }
        double c= Double.parseDouble(args[3]);
        String str=args[4];
        double d=Double.parseDouble(args[5]);
        double temp=0;
        if(str.equals("-")){
            temp=c-d;
            System.out.println(temp);

        }
        else {
            System.out.println("opeartor not recognized");
        }
    }
}
