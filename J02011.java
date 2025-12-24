import java.util.Scanner;

public class J02011 {
    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) { // Chỉ cần n-1 bước
            int minIndex = i; // biến đánh dấu, mặc định là số đầu tiên
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j; // tìm được số nhỏ hơn số ban đầu
                }
            }
            // Hoán đổi phần tử nhỏ nhất với phần tử tại vị trí i
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
            System.out.print("Buoc " + (i + 1) + ": ");
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[j] + " ");
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
        selectionSort(a);
        sc.close();
    }
}
