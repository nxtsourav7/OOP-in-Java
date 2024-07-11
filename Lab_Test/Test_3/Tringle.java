package Lab_Test.Test_3;

public class Tringle extends Geometry {
    @Override
    public void AreaTringle(int x, int y) {
        System.out.println("Area of a Circle is " + 0.5 * x * y);
    }
    void AreaSqure(int x) {
        throw new UnsupportedOperationException("Unimplemented method 'AreaSqure'");
    }
}
