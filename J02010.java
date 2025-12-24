import java.util.Scanner;

public class J02010 {
    public static void interchangeSort(int[] a){
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.print("Buoc " + (i + 1) + ": ");
            for (int k = 0; k < a.length; k++) {
                System.out.print(a[k] + " ");
            }
            System.out.println();
        }
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        interchangeSort(a);
        sc.close();
    }
}
/*  Khác với selection sort ở chỗ ta đổi vị trí tại vòng lặp i, 
trong khi interchange sort ta đổi vị trí tại vòng lặp j */