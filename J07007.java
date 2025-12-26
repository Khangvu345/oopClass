import java.io.*;
import java.util.*;
public class J07007 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        File file = new File("VANBAN.in");
        try (Scanner sc = new Scanner(file))
        {
            while (sc.hasNext()){
                set.add(sc.next().toLowerCase());
            }            
            sc.close();
            for (String s: set){
                System.out.println(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
