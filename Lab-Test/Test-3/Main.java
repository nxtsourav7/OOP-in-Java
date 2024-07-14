public class Main {
    public static void main(String[] args) {
        Square s = new Square();
        Tringle c = new Tringle();
        
        s.AreaSqure(5);
        // s.AreaTringle(10, 30); Exception in thread
        c.AreaTringle(10, 20);
    }
}
