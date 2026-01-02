import java.util.Scanner;
public class J02013 {
    public static void bubbleSort(int[]n){
        for (int i = 0; i < n.length - 1; i++){ // Duyệt qua mảng từ đầu đến cuối trừ phần tử cuối cùng
            boolean isSwap = false;
            for (int j = 0; j < n.length - i - 1; j++){ // Duyệt qua mảng từ đầu đến cuối trừ phần tử cuối cùng và từ vị trí hiện tại đến cận trên có thể xảy ra hoán đổi
                if (n[j] > n[j+1]){
                    int temp = n[j];
                    n[j] = n[j+1];
                    n[j+1] = temp;
                    isSwap = true;
                }
            } 
            if (!isSwap) break; // Nếu không có hoán đổi nào xảy ra trong lần duyệt, thoát khỏi vòng lặp
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
