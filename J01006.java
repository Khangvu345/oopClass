import java.util.Scanner;
public class J01006{
    public static int fibo(int i){ //đi từ trên xuống dễ TLE
        if (i <= 1){
            return i;
        }else {
            return fibo(i-1) + fibo(i-2);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0){
            int i = sc.nextInt();
            System.out.println(fibo(i));
        }
        sc.close();
    }
}
