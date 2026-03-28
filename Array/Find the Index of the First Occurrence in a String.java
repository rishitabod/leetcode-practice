class Solution {
    public int strStr(String haystack, String needle) {

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            int j = 0;
            while (j < needle.length() &&
                   haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
          
            if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {

        Solution obj = new Solution();
        String haystack = "sadbutsad";
        String needle = "sad";
        int result = obj.strStr(haystack, needle);
        System.out.println("Index: " + result);
    }
}
