import java.util.Scanner;

public class J04002_KhaiBaoLopHCN {
    public static class HCN {
        private int a;
        private int b;
        private String color;

        public HCN() {
            this.a = 1;
            this.b = 1;
        }
        // kiểm tra xem a và b có hợp lệ không ở constructor và cả main
        public HCN(int a, int b, String color) throws IllegalArgumentException {
            if (a <= 0 || b <= 0) {
                throw new IllegalArgumentException("INVALID");
            }
            this.a = a;
            this.b = b;
            this.color = color;
        }

        public int getA() {
            return this.a;
        }

        public int getB() {
            return this.b;
        }

        public String getColor() {
            return this.color;
        }

        public void setA(int a) {
            this.a = a;
        }

        public void setB(int b) {
            this.b = b;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getChuVi() {
            return 2 * (this.a + this.b);
        }

        public int getDienTich() {
            return this.a * this.b;
        }

        @Override
        public String toString() {
            return String.format("%d %d %s", this.getChuVi(), this.getDienTich(),
                    this.getColor().substring(0, 1).toUpperCase() + this.getColor().substring(1).toLowerCase());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String color = sc.next();
        try {
            HCN hcn = new HCN(a, b, color);
            System.out.println(hcn);
        } catch (IllegalArgumentException e) {
            System.out.println("INVALID");
        }
        sc.close();
    }
}
