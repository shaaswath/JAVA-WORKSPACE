import java.util.*;

public class RomanToInt {
    public static int romanToInt(String s) {
        // Map Roman numerals to their integer values
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        // Process each character from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanMap.get(s.charAt(i));

            // If current value is less than previous, subtract it; else add it
            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }

            prevValue = currentValue;
        }

        return total;
    }

    // Example usage
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String roman1=sc.next();// 9

        System.out.println(roman1 + " -> " + romanToInt(roman1));
        /*System.out.println(roman2 + " -> " + romanToInt(roman2));
        System.out.println(roman3 + " -> " + romanToInt(roman3));*/
    }
}
