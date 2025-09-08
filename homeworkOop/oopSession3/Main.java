package homeworkOop.oopSession3;

public class Main {
    private static boolean checkPositiveInteger(String s) {
        if ( s == null || s.isEmpty() ) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            } // so sánh bằng unicode 
        }
        return true;
    }
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Cần nhập đầy đủ 2 tham số chiều dài và chiều rộng");
            return;
        }
        if (!checkPositiveInteger(args[0]) || !checkPositiveInteger( args[1])) {
            System.out.println("Chiều dài và chiều rộng phải là số nguyên dương");
            return;
        }
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        CalculateRectangle hcn = new CalculateRectangle(x, y);
        System.out.println("Chu vi hình chữ nhật: " + hcn.tinhChuVi());
        System.out.println("Diện tích hình chữ nhật: " + hcn.tinhDienTich());
    }
}
