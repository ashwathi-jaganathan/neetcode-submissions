class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s.replace(" ","");
        int n=s.length();
        int j=n-1;
        int i=0;
        while(i<j) {
            if(!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }

            if(!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
