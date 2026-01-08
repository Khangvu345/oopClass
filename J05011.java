import java.util.*;
public class J05011 {
    public static class Gamer{
        private String ma, hoTen, gioVao, gioRa;
        private int tongThoiGian;
        public Gamer(String ma, String hoTen, String gioVao, String gioRa){
            this.ma = ma;
            this.hoTen = hoTen;
            this.tongThoiGian = toMinute(gioRa) - toMinute(gioVao);
        }
        // Hàm helper giúp chuyển đổi bước trung gian lặp lại.
        public int toMinute(String s){
            String[] parts = s.split(":");
            return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
        }
        @Override
        // Cách chuyển đổi đúng định dạng dd:mm; Không in ra 60 phut ma la 1:00.
        public String toString(){
            int h = tongThoiGian / 60;
            int m = tongThoiGian % 60;
            return String.format("%s %s %d gio %d phut", this.ma, this.hoTen, h, m);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Gamer> ds = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            Gamer g = new Gamer(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds.add(g);
        }
        Collections.sort(ds, (a,b) -> {
            return Integer.compare(b.tongThoiGian, a.tongThoiGian);
        });
        for (Gamer g: ds){
            System.out.println(g);
        }
    }

}
    

