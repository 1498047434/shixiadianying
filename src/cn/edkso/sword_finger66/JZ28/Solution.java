package cn.edkso.sword_finger66.JZ28;

import java.util.HashMap;
public class Solution {

    /**
     * 方法一：哈希法
     * @param array
     * @return
     */
    public int MoreThanHalfNum_Solution(int [] array) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            Integer count = map.get(array[i]);
            if (map.get(array[i]) == null){
                if ( 2 > array.length){
                    return array[i];
                }
                map.put(array[i], 1);
            }else{
                if ((count + 1)*2 > array.length){
                    return array[i];
                }
                map.put(array[i],++count);
            }
        }
        return 0;
    }
}
