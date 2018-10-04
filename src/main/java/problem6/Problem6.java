package problem6;

public class Problem6 {


    public boolean isPalindrome(int i){

        int reversed = reverseOrder(i);

        if(i == reversed){
            return true;
        }
        else{
            return false;
        }
    }

    public int reverseOrder(int i) {

        int reversed = 0;

        while (i > 0) {
            int remainder = i % 10; //remainder of i divided by ten
            reversed = reversed * 10 + remainder;
            i = i / 10;
        }
        return reversed;
    }
}
