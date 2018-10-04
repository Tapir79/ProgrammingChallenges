package problem13;

public class Problem13StringPalindrome {

    public static void main(String[] args){

        String kissa = "saippuakauppias";
        String assik = "";

        for(int i=kissa.length()-1; i>=0; i--){
            assik=assik+kissa.charAt(i);
        }

        if(kissa.equals(assik)){
            System.out.println("Palindrome");
        }
    }


}
