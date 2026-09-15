public class LeetCode {

    static void main() {
        System.out.println((isPalindrome("abac")));
    }

    public static boolean isPalindrome(String s) {
        StringBuilder standard = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if (Character.isLetter(s.charAt(i))){
                standard.append(Character.toLowerCase(s.charAt(i)));
            }
            if (Character.isDigit(s.charAt(i))){
                standard.append(s.charAt(i));
            }
        }

        if(standard.length() % 2 == 0)
            return false;

        int left = 0;
        int right = standard.length();

        while(left <= right){
            if(standard.charAt(left) != standard.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
