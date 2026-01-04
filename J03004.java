import java.util.Scanner;
public class J03004 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine()); // Phòng lỗi Scanner Buffer
        while (t-- > 0){
           String str = sc.nextLine();
           String[] arr = str.trim().split("\\s+"); // Loại bỏ triệt để khoảng trắng để không bị tràn index
           String res = "";
           for (String s: arr){
                res += s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase() + " ";
           }
           System.out.println(res.trim());
        }
        sc.close();
    }
}
