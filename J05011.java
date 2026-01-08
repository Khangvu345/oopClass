import java.util.*;
public class J05011 {
    public static class Gamer{
        private String ma, hoTen, gioVao, gioRa, ketQua;
        private int gioVaoP, gioRaP, time;
        public Gamer(String ma, String hoTen, String gioVao, String gioRa){
            this.ma = ma;
            this.hoTen = hoTen;
            this.gioVao = gioVao;
            this.gioRa = gioRa;
            this.gioVaoP = this.toMinute();
            this.gioRaP = this.toMinuteRa();
            this.time = this.times();
            this.ketQua = this.gioChoi();

        }

        public int toMinute(){
            String[] parts = this.gioVao.split(":");
            int minutes = Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
            return this.gioVaoP = minutes;
        }

        public int toMinuteRa(){
            String[] parts = this.gioRa.split(":");
            int minutes = Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
            return this.gioRaP = minutes;
        }

        public int times(){
            int time = this.gioRaP - this.gioVaoP;
            return this.time = time;
        }

        public String gioChoi(){
            StringBuilder result = new StringBuilder();
            if (time > 60) {
                result.append(time / 60);
                result.append(" " + "gio" + " ");
                result.append(time % 60);
                result.append(" " + "phut");
            }
            else result.append(time + " " + "phut");
            return this.ketQua = result.toString();
        }
        @Override
        public String toString(){
            return String.format("%s %s %s", this.ma, this.hoTen, this.ketQua);
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
            return Integer.compare(b.times(), a.times());
        });
        for (Gamer g: ds){
            System.out.println(g);
        }
    }

}
    

