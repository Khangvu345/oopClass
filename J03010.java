import java.util.*;
public class J03010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        HashMap<String, Integer> map = new HashMap<>();
        // Sử dụng linkedhashset để giữ nguyên thứ tự sau đó in ra
        LinkedHashSet<String> ds = new LinkedHashSet<>();
        while(t-- > 0){
            String s = sc.nextLine().trim().toLowerCase();
            String[] parts = s.split("\\s+");
            
            StringBuilder email = new StringBuilder();
            email.append(parts[parts.length - 1]);

            for (int i = 0; i < parts.length - 1; i++){
                email.append(parts[i].charAt(0));
            }
            String baseEmail = email.toString();
            if (!map.containsKey(baseEmail)){
                map.put(baseEmail, 1);
                ds.add(baseEmail + "@ptit.edu.vn");
            }
            else{
                map.put(baseEmail, map.get(baseEmail) + 1);
                ds.add(baseEmail + map.get(baseEmail) + "@ptit.edu.vn");
            }
        }
        sc.close();
       
        for (String s: ds){
            System.out.println(s);
        }
    }
}
