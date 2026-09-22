class Solution {
    public boolean validPalindrome(String s) {
        int n=s.length();
        int i=0;
        int j=n-1;
        while(i<j) {
            if(s.charAt(i)==s.charAt(j)) {
                i++;
                j--;
            }
            else if(s.charAt(i)!=s.charAt(j)) {
                if(s.charAt(i+1)==s.charAt(j)) {
                    i++;
                    j--;
                }
                else if(s.charAt(i)==s.charAt(j-1)) {
                    i++;
                    j--;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
}