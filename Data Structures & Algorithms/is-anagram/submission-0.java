class Solution {
    public boolean isAnagram(String s, String t) {
        char[] char1=s.toCharArray();
        Arrays.sort(char1);
        String str1=new String(char1);
        char[] char2=t.toCharArray();
        Arrays.sort(char2);
        String str2=new String(char2);
        if(str1.equals(str2)) {
            return true;
        }
        return false;
    }
}
