public class longestCommonPrefix {
    public static String max(String[] strs){
        if(strs.length == 0){
            return "";
        }
        String str = strs[0];    //将第一个字符串作为基准
        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(str) != 0){    //不断将后面的字符串与其比较，符合度大于等于1时，返回值为0，否则为-1，比如"1234".indexOf("123") 和 "123".indexOf("123")
                str=str.substring(0, str.length() - 1);   //若不匹配，基准减去一位  得到的str就是最短的共同部分
            }
        }
        return str;
    }
    public static void main(String[] args) {
        String[] strs = {"123","1245","1234"};
        System.out.println(max(strs));
        System.out.println("124".indexOf("123"));
    }
}