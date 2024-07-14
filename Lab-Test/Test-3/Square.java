public class Square extends Geometry {
    @Override
    public void AreaSqure(int x) {
        System.out.println("Area of a Square is " + x * x);
    }
    void AreaTringle(int x, int y) {
        throw new UnsupportedOperationException("Unimplemented method 'AreaTringle'");
    }
}
