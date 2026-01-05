import java.util.*;
public class J03038 {
    public static int check(String str){
        //Thay vì dùng kiểu dữ liệu cho cấu trúc set là String thì ta dùng Character. Tránh ép kiểu lần nữa trong vòng for
        Set <Character> set = new HashSet<>();
        char[] arr = str.toCharArray();
        for (char c: arr){
            set.add(c);
        }
        return set.size();

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(check(str));
        sc.close();
    }
}
