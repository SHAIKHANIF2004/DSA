package Strings;

import java.util.HashSet;
import java.util.Scanner;

class lengthOfLongestSubstringwithoutrepeat {

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }

        HashSet<Character> set = new HashSet<>();
        int maxLen = 0;
        int i = 0, j = 0;

        while (j < s.length()) {
            char currChar = s.charAt(j);

            if (!set.contains(currChar)) {
                set.add(currChar);
                maxLen = Math.max(maxLen, j - i + 1);
                j++;
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return maxLen;
    }

    // ✅ Main method added
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        lengthOfLongestSubstringwithoutrepeat sol = new lengthOfLongestSubstringwithoutrepeat();
        int result = sol.lengthOfLongestSubstring(s);

        System.out.println("Length of longest substring without repeating characters: " + result);
        sc.close();
    }
}
