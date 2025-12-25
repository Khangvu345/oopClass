import java.io.File;
import java.util.Scanner;
import java.math.BigInteger;
public class J07003 {
    /*Để thao tác với BigInteger và cần thao tác các số như chuỗi thì giải quyết như sau: */
    public static void main(String[] args){
        File file = new File("DATA.in");
        try (Scanner sc = new Scanner(file))
        {
            while (sc.hasNextLine()) {
                String s = sc.nextLine();
                while (s.length() > 1) // Thực hiện theo yêu cầu đề bài nếu độ dài = 1 thì dừng 
                    { 
                        BigInteger nuaDau = new BigInteger(s.substring(0, s.length() / 2));
                        BigInteger nuaCuoi = new BigInteger(s.substring(s.length() / 2));
                        s = nuaDau.add(nuaCuoi).toString();
                        System.out.println(s);
                    
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
    }
}
}
