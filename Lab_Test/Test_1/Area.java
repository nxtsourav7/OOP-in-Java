package Lab_Test.Test_1;

public class Area {
    int length, width;
    Area(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public void result() {
        System.out.println("Area : " + length * width);
    }
}
