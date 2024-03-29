package com.bk.gfg.string;

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 *
 * Write the code that will take a string and make this conversion given a number of rows:
 *
 * string convert(string s, int numRows);
 *
 *
 * Example 1:
 *
 * Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"
 * Example 2:
 *
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * Explanation:
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 * Example 3:
 *
 * Input: s = "A", numRows = 1
 * Output: "A"
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 1000
 * s consists of English letters (lower-case and upper-case), ',' and '.'.
 * 1 <= numRows <= 1000
 */
public class ZigZagConversions {

    public static void main(String[] args) {
        ZigZagConversions obj = new ZigZagConversions();
        System.out.println(obj.convert("PAYPALISHIRING",4));
    }
    public String convert(String s, int numRows) {
        if(numRows<2){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        int interval=(numRows-1)*2;
        for(int r=0;r<numRows;r++){
            for (int i = r; i < s.length(); i += interval) {
                sb.append(s.charAt(i));
                if (r > 0 && r < numRows -1 && i + interval - r * 2 < s.length()) {
                    sb.append(s.charAt(i + interval -r * 2));
                }
            }
        }
        return sb.toString();
    }
}
