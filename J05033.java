import java.util.*;
public class J05033 {
    public static class ThoiGian{
        private int gio, phut, giay;
        public ThoiGian(int gio, int phut, int giay){
            this.gio = gio;
            this.phut = phut;
            this.giay = giay;
        }
        //Chú ý cách viết định dạng với hàm format
        @Override
        public String toString(){
            return String.format("%d %d %d", this.gio, this.phut, this.giay);
        }
    }
    public static void main(String[] args){
        ArrayList<ThoiGian> ds = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            String[] thoiGian = sc.nextLine().split(" ");
            ThoiGian tg = new ThoiGian(Integer.parseInt(thoiGian[0]), Integer.parseInt(thoiGian[1]), Integer.parseInt(thoiGian[2]));
            ds.add(tg);
        }
        sc.close();
        // cách sắp xếp đa điều kiện
        Collections.sort(ds, (d1,d2) -> {
            if (d1.gio != d2.gio){
                return d1.gio - d2.gio; // So sánh thủ công không cần hàm compare
            }
            if (d1.phut != d2.phut){
                return d1.phut - d2.phut;
            }
            return d1.giay - d2.giay;
        });
        for (ThoiGian tg : ds) {
            System.out.println(tg);
        }
    }
    
}
