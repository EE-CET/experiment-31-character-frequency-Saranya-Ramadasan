import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextLine()) return;
        
        String s = sc.nextLine();
        
        if (!sc.hasNextLine()) {
            sc.close();
            return;
        }
        
        String inputCharLine = sc.nextLine();
        if (inputCharLine.isEmpty()) {
            sc.close();
            return;
        }
        
        char target = inputCharLine.charAt(0);
        int frequency = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target) {
                frequency++;
            }
        }
        
        System.out.println(frequency);
        sc.close();
    }
}
