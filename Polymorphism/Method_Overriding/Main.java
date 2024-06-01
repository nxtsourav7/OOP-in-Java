package Polymorphism.Method_Overriding;

public class Main {
    public static void main(String[] args) {
        BRAC br1 = new BRAC();
        BangladeshBank db1 = new DBBL();
        // IFIC if1 = new BangladeshBank();
        IFIC if1 = new IFIC();

        System.out.println("Rate of Interest => ");
        System.out.println("BRAC : " + br1.Rate_of_Inerest() + "%");
        System.out.println("DBBL : " + db1.Rate_of_Inerest() + "%");
        System.out.println("IFIC : " + if1.Rate_of_Inerest() + "%");
    }
}
