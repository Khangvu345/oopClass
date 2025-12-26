import java.util.Scanner;
public class J04003_PhanSo {
    public static class PhanSo {
        private long tu;
        private long mau;
        public PhanSo(){
            this.tu = 0;
            this.mau = 1;
        }
        public PhanSo(long tu, long mau){
            this.tu = tu;
            this.mau = mau;
        }
        public long getTu(){
            return this.tu;
        }
        public long getMau(){
            return this.mau;
        }
        public static long UCLN(long tu, long mau){
            while (mau != 0){
                long temp = mau;
                mau = tu % mau;
                tu = temp;
            }
            return tu;
        }
        public void toiGian(){
            long ucln = UCLN(this.tu, this.mau);
            this.tu /= ucln;
            this.mau /= ucln;
        }
        @Override
        public String toString(){
            return this.tu + "/" + this.mau;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long tu = sc.nextLong();
        long mau = sc.nextLong();
        PhanSo ps = new PhanSo(tu, mau);
        ps.toiGian(); // gọi phương thức tối giản
        System.out.println(ps);
        sc.close();
    }
}