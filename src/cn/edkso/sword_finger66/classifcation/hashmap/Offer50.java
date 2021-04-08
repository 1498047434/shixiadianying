package cn.edkso.sword_finger66.classifcation.hashmap;

import java.util.HashMap;

public class Offer50 {
    /**
     *
     *
     *HashMap
     */
    public char firstUniqChar(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == null){
                map.put(s.charAt(i),1);
            }else{
                map.put(s.charAt(i),map.get(s.charAt(i)) + 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1){
                return s.charAt(i);
            }
        }

        return ' ';
    }

    //数组 map,字母一共26个 数组长度为26，  数组的下标右 c - 'a' 来确定
    public char firstUniqChar1(String s) {

        int[] map = new int[26];
        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i) - 'a'] ++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (map[s.charAt(i) - 'a'] == 1){
                return s.charAt(i);
            }
        }
        return ' ';
    }

    //数组 map,字母一共26个 数组长度为26，  数组的下标右 c - 'a' 来确定 ,把s转化成chars 来循环
    public char firstUniqChar2(String s) {

        int[] map = new int[26];
        for (char c : s.toCharArray()) {
            map[c - 'a'] ++;
        }
        for (char c : s.toCharArray()) {
            if (map[c - 'a'] == 1){
                return c;
            }
        }
        return ' ';
    }
}
