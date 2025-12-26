import java.util.Scanner;
public class J04001 {
    public static class Point{
        private double x;
        private double y;
        public Point(){
            this.x = 0;
            this.y = 0;
        }; // Mặc định khi khởi tạo object thì sẽ có giá trị tọa độ là (0,0)
        public Point(double x, double y){
            this.x = x;
            this.y = y;
        }
        public double getX(){
            return this.x;
        }
        public double getY(){
            return this.y;
        }
        public double distance(Point other){
            return Math.sqrt(Math.pow(this.x - other.getX(), 2) + Math.pow(this.y - other.getY(), 2));
        }
        @Override
        public String toString(){ 
            return x + " " + y;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);
            System.out.printf("%.4f\n", p1.distance(p2));
        }
        sc.close();
    }
}
