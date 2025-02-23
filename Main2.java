class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        while (i < j) {
            char ch = s[i];
            s[i] = s[j];
            s[j] = ch;
            i++;
            j--;
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        System.out.println("Before reversing: " + new String(s));

        solution.reverseString(s);

        System.out.println("After reversing: " + new String(s));
    }
}
