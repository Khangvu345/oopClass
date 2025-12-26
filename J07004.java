import java.util.Scanner;
import java.io.File;

public class J07004 {
    public static void main(String[] args ){
        File file = new File("DATA.in");
        int[] arr = new int[1001];
        try (Scanner sc = new Scanner(file)) 
        {
            while (sc.hasNextInt()) {
                int n = sc.nextInt();
                if (n <= 1000) {
                    arr[n]++;
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    System.out.println(i + " " + arr[i]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}