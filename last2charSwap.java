
public class last2charSwap {
    public String swap2char(String str){

        if(str == ""){
            return "";
        }
        if(str.length() == 1){
            return str;
        }

        int length = str.length();

        String strWithoutLast2 = str.substring(0, length-2);
        
        char lastchar = str.charAt(length - 1);
        char secLastChar = str.charAt(length - 2);

        return strWithoutLast2 + lastchar + secLastChar;
    }

    public int[] hi(int[] a){
        return a;
    }

    public static void main(String args[]){

        last2charSwap ls = new last2charSwap();

        System.out.println(ls.swap2char("ABCD"));
    }
}
