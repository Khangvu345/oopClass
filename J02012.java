import java.util.Scanner;
public class J02012 {
    public static void insertionSort(int[] a){
        for(int i = 0; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >=0 && a[j] > key) {
                a[j+1] = a[j]; // Để trống chỗ để cài đặt giá trị nhỏ hơn
                j--; // Di chuyển con trỏ j về trái 
            }
            a[j + 1] = key; // Cài đặt giá trị nhỏ hơn vào vị trí đúng sau khi con trỏ j đã về được vị trí gần đúng nhất, thêm 1 để đạt được vị trí cần đặt key
            System.out.print("Buoc " + (i) + ": ");
            for (int k = 0; k <= i; k++) {
                System.out.print(a[k] + " ");
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
        insertionSort(a);
        sc.close();
    }
}
