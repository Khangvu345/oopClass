package homeworkOop.oopSession3;
public class CalculateRectangle {
    private int x;
    private int y;
    public CalculateRectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int tinhChuVi(){
        return (x + y) * 2;
    }
    public int tinhDienTich(){
        return x * y;
    }
}