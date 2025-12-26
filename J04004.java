import java.util.Scanner;
public class J04004 {
    public static class TongPhanSo{
        private long tu;
        private long mau;

        public TongPhanSo(long tu, long mau){
            this.tu = tu;
            this.mau = mau;
        }

        public static long UCLN(long tu, long mau){
            while (mau != 0){
                long temp = mau;
                mau = tu % mau;
                tu = temp;
            }
            return tu;
        }

        public void tong(TongPhanSo other){
            long tu = this.tu * other.mau + other.tu * this.mau;
            long mau = this.mau * other.mau;
            this.tu = tu;
            this.mau = mau;
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
        long tu1 = sc.nextLong();
        long mau1 = sc.nextLong();
        long tu2 = sc.nextLong();
        long mau2 = sc.nextLong();
        TongPhanSo ps = new TongPhanSo(tu1, mau1);
        ps.tong(new TongPhanSo(tu2, mau2));
        ps.toiGian();
        System.out.println(ps);
        sc.close();
    }
}
