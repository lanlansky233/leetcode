package task2;

import java.util.*;

public class Solution
{
    public static void main(String[] args)
    {
        String string = "abcabc3";
        int result = solution(string);
        System.out.println(result);
    }

    private static int solution(String s)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0, maxL = 0;
        for (int i = 0; i < s.length(); i++) {
            int index = map.getOrDefault(s.charAt(i), -1);
            l = Math.max(l, index + 1);
            maxL = Math.max(maxL, i - l + 1);
            map.put(s.charAt(i), i);
        }
        return maxL;

    }


}
