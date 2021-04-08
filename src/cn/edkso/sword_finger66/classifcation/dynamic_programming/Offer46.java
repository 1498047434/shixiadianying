package cn.edkso.sword_finger66.classifcation.dynamic_programming;

public class Offer46 {


    public int translateNum(int num) {
        return dynamic(String.valueOf(num));
    }

    public int dynamic(String str){

        if (str.length() == 1){
            return 1;
        }
        if (str.length() == 2 && (str.compareTo("25")>0 || str.compareTo("10") < 0)){
            return 1;
        }
        if (str.length() == 2){
            return 2;
        }

        String cur = str.substring(str.length()-2,str.length());
        if (cur.compareTo("25") > 0 || cur.compareTo("10") < 0){
            return dynamic(str.substring(0,str.length()-1));
        }else{
            return dynamic(str.substring(0,str.length()-2)) + dynamic(str.substring(0,str.length()-1));
        }
    }

    public static void main(String[] args) {
        int res = new Offer46().translateNum(506);
        System.out.println(res);
    }
}
