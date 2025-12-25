import java.util.Scanner;
public class J02013 {
    public static void bubbleSort(int[]n){
        for (int i = 0; i < n.length - 1; i++){
            boolean isSwap = false;
            for (int j = 0; j < n.length - i - 1; j++){
                if (n[j] > n[j+1]){
                    int temp = n[j];
                    n[j] = n[j+1];
                    n[j+1] = temp;
                    isSwap = true;
                }
            } 
            if (!isSwap) break;
            System.out.print("Buoc " + (i + 1) + ": ");
            for (int j = 0; j < n.length; j++) {
                System.out.print(n[j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        bubbleSort(a);
        sc.close();
    }
}
