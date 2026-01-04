import java.util.Scanner;
public class J03021_DthCucGach {
    public static String transferByLogic(String str){
        String res = "";
        str = str.toUpperCase();
        for (char c: str.toCharArray()){ // Nhớ chỉ có thể lặp qua 1 mảng chứ không phải String
            switch (c){
                case 'A': case 'B': case 'C': res += "2"; break;
                case 'D': case 'E': case 'F': res += "3"; break;
                case 'G': case 'H': case 'I': res += "4"; break;
                case 'J': case 'K': case 'L': res += "5"; break;
                case 'M': case 'N': case 'O': res += "6"; break;
                case 'P': case 'Q': case 'R': case 'S': res += "7"; break;
                case 'T': case 'U': case 'V': res += "8"; break;
                case 'W': case 'X': case 'Y': case 'Z': res += "9"; break;
                default: break;
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            String str = sc.next();
            String res = transferByLogic(str);
            String temp_res = new StringBuilder(res).reverse().toString(); /* Phương thức đảo chuỗi chỉ có ở StringBuilder
            . Vì vậy khi đảo xong cần so sánh bằng method equals thì lại phải chuyển về String thông thường */
            if (res.equals(temp_res)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
