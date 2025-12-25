import java.util.Scanner;
import java.io.File;
public class J07001 {
    public static void main(String[] args){
        File file = new File("DATA.in"); 
        try {
            Scanner sc = new Scanner(file); /* Không truyền trực tiếp String vào Scanner 
            vì có thể gây hiểu nhầm đó là 1 chuỗi*/
            while (sc.hasNextLine()){ // Sử dụng hasNextLine để đọc file xem có tồn tại dòng nào không
                System.out.println(sc.nextLine()); // Sử dụng nextLine để đọc file
            }
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
