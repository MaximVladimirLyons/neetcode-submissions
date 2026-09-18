class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder modified = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                modified.append(Character.toLowerCase(c));
            }
        }

        StringBuilder reversed = new StringBuilder(modified);
        reversed.reverse();
        System.out.println(modified);
        System.out.println(reversed);

        for (int i = 0; i < modified.length(); i++) {
            if (modified.charAt(i) != reversed.charAt(i)) return false;
        }

        return true;
    }
}
