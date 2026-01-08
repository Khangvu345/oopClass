import java.util.*;
public class J05010 {
    public static class MatHang{
        private String tenMH, nhomHang;
        private float giaMua, giaBan;
        private int ma;
        private static int stt = 0;
        public MatHang(String tenMH, String nhomHang, float giaMua, float giaBan){
            stt++;
            this.ma = stt;
            this.tenMH = tenMH;
            this.nhomHang = nhomHang;
            this.giaMua = giaMua;
            this.giaBan = giaBan;
        }
        public float LoiNhuan(){
            return giaBan - giaMua;
        }
        @Override
        public String toString(){
            return String.format("%d %s %s %.2f", this.ma, this.tenMH, this.nhomHang, this.LoiNhuan());
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<MatHang> ds = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            MatHang mh = new MatHang(sc.nextLine(), sc.nextLine(),Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
            ds.add(mh);
        }
        Collections.sort(ds, (a, b) -> {
            return Float.compare(b.LoiNhuan(), a.LoiNhuan());
        });
        for (MatHang mh: ds){
            System.out.println(mh);
        }
    }
}
