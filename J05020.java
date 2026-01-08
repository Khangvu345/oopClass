import java.util.*;
public class J05020 {
    public static class SV{
        private String maSV, hoTen, lop, email;
        public SV(String maSV, String hoTen, String lop, String email){
            this.maSV = maSV;
            this.hoTen = hoTen;
            this.lop = lop;
            this.email = email;
        }   
        @Override
        public String toString(){
            return String.format("%s %s %s %s", maSV, hoTen, lop, email);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SV> ds = new ArrayList<>();
        while(t-- > 0){
            String maSV = sc.nextLine();
            String hoTen = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            SV sv = new SV(maSV, hoTen, lop, email);
            ds.add(sv);
        }
        // Lỗi sai kinh điển khi so sánh String không được so sánh != và == 
        Collections.sort(ds, (a,b) -> {
            if (!a.lop.equals(b.lop)) return a.lop.compareTo(b.lop);
            return a.maSV.compareTo(b.maSV);
        });
        for (SV sv: ds){
            System.out.println(sv);
        } 
    }
}
