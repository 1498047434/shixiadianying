package cn.edkso.sword_finger66.classifcation.hashmap;

import java.util.*;

public class Offer48 {

    //"abcabcbb"
    public int lengthOfLongestSubstring(String s) {
        int maxLonges = 0;
        int longes = 0;

        int l = 0;
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            flag = true;

            if (i == l){
                longes++;
            }else{
                for (int j = l; j < i; j++) {
                    if (s.charAt(j) == s.charAt(i)){
                        maxLonges = Math.max(longes,maxLonges);
                        longes = i- j;
                        l = j +1;
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    longes++;
                }
            }
        }
        return Math.max(longes,maxLonges);
    }


    //用map + 双指针
    public int lengthOfLongestSubstring1(String s) {
        Map<Character,Integer> map = new HashMap<>();
        /**
         *      p w w k e w
         * map: p w k e
         *      1 2 4 5
         *        3
         *        6
         */
        int maxLonges = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) != null){
                start = Math.max(map.get(s.charAt(i)),start);//abba
                map.put(s.charAt(i), i+1);
            }else{
                map.put(s.charAt(i), i+1);
            }
            end ++;

            maxLonges = Math.max(maxLonges,end - start);
        }
        return maxLonges;
    }

    public static void main(String[] args) {
        System.out.println(
                new Offer48().lengthOfLongestSubstring1("abcabcbb")
        );
        System.out.println(
                new Offer48().lengthOfLongestSubstring1("abba")
        );
        System.out.println(
                new Offer48().lengthOfLongestSubstring("bbbbb")
        );
        System.out.println(
                new Offer48().lengthOfLongestSubstring("pwwkew")
        );
        System.out.println(
                new Offer48().lengthOfLongestSubstring("aab")
        );
        System.out.println(
                new Offer48().lengthOfLongestSubstring("dvdf")
        );
    }
}
