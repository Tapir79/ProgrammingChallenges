package problem12;

public class Problem12PrimeNumbers {

    public static void main(String[] args) {

        int[] primes = {2,3,5,7,11,29,4,8};
        for(int i:primes){
            System.out.println("Number:"+i);
            System.out.println(isPrime(i));
        }
    }

    private static boolean isPrime(int number) {

        //if number is 0 or 1 return false. They are not primes
        if (number <= 1) {
            System.out.println("Is 1 or 0. Not a prime");
            return false;
        }

        // number can be divided by it's half but not above
        int divisibles = number / 2;

        // start the loop from 2. 2 is the first possible prime
        for (int i = 2; i <= divisibles; i++) {
            if(number%i==0){
                System.out.println("is not a prime. Is divisble by "+i);
                return false;
            }
        }

        System.out.println("Was not divisble by any other number.");
        return true;

    }
}
