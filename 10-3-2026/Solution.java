public class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber --;
            result.append((char) (columnNumber % 26 + 'A'));
            columnNumber /= 26;
        }
        return result.reverse().toString();
    }
    public static void main(String[] args) {
        Solution obj = new Solution();
        
        int columnNumber1 = 28;
        int columnNumber2 = 701;

        System.out.println(columnNumber1 + " -> " + obj.convertToTitle(columnNumber1));
        System.out.println(columnNumber2 + " -> " + obj.convertToTitle(columnNumber2));

    }
    
}
