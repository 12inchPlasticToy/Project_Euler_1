
import java.util.ArrayList;

public class Main {

    static String longNum = "73167176531330624919225119674426574742355349194934" +
            "96983520312774506326239578318016984801869478851843" +
            "85861560789112949495459501737958331952853208805511" +
            "12540698747158523863050715693290963295227443043557" +
            "66896648950445244523161731856403098711121722383113" +
            "62229893423380308135336276614282806444486645238749" +
            "30358907296290491560440772390713810515859307960866" +
            "70172427121883998797908792274921901699720888093776" +
            "65727333001053367881220235421809751254540594752243" +
            "52584907711670556013604839586446706324415722155397" +
            "53697817977846174064955149290862569321978468622482" +
            "83972241375657056057490261407972968652414535100474" +
            "82166370484403199890008895243450658541227588666881" +
            "16427171479924442928230863465674813919123162824586" +
            "17866458359124566529476545682848912883142607690042" +
            "24219022671055626321111109370544217506941658960408" +
            "07198403850962455444362981230987879927244284909188" +
            "84580156166097919133875499200524063689912560717606" +
            "05886116467109405077541002256983155200055935729725" +
            "71636269561882670428252483600823257530420752963450";

    static String gridString = "08 02 22 97 38 15 00 40 00 75 04 05 07 78 52 12 50 77 91 08 " +
            "49 49 99 40 17 81 18 57 60 87 17 40 98 43 69 48 04 56 62 00 " +
            "81 49 31 73 55 79 14 29 93 71 40 67 53 88 30 03 49 13 36 65 " +
            "52 70 95 23 04 60 11 42 69 24 68 56 01 32 56 71 37 02 36 91 " +
            "22 31 16 71 51 67 63 89 41 92 36 54 22 40 40 28 66 33 13 80 " +
            "24 47 32 60 99 03 45 02 44 75 33 53 78 36 84 20 35 17 12 50 " +
            "32 98 81 28 64 23 67 10 26 38 40 67 59 54 70 66 18 38 64 70 " +
            "67 26 20 68 02 62 12 20 95 63 94 39 63 08 40 91 66 49 94 21 " +
            "24 55 58 05 66 73 99 26 97 17 78 78 96 83 14 88 34 89 63 72 " +
            "21 36 23 09 75 00 76 44 20 45 35 14 00 61 33 97 34 31 33 95 " +
            "78 17 53 28 22 75 31 67 15 94 03 80 04 62 16 14 09 53 56 92 " +
            "16 39 05 42 96 35 31 47 55 58 88 24 00 17 54 24 36 29 85 57 " +
            "86 56 00 48 35 71 89 07 05 44 44 37 44 60 21 58 51 54 17 58 " +
            "19 80 81 68 05 94 47 69 28 73 92 13 86 52 17 77 04 89 55 40 " +
            "04 52 08 83 97 35 99 16 07 97 57 32 16 26 26 79 33 27 98 66 " +
            "88 36 68 87 57 62 20 72 03 46 33 67 46 55 12 32 63 93 53 69 " +
            "04 42 16 73 38 25 39 11 24 94 72 18 08 46 29 32 40 62 76 36 " +
            "20 69 36 41 72 30 23 88 34 62 99 69 82 67 59 85 74 04 36 16 " +
            "20 73 35 29 78 31 90 01 74 31 49 71 48 86 81 16 23 57 05 54 " +
            "01 70 54 71 83 51 54 69 16 92 33 48 61 43 52 01 89 19 67 48";

    public static void main(String[] args) {
	// write your code here
        //multiplesThreeFive();
        //fibonnacciEvenSum();
        //largestPrimeFactor();
        //findPalidromes();
        //smallestMultiple(20);
        //arithmeticSuiteDiff(100);
        //printNthPrime(10001);
        //adjacentDigits(13, longNum);
        //tripletSum(1000);
        //sumPrimes(2000000);
        gridBuilding(gridString);
    }


    /**
     * Sum of all multiples of 3 and 5 from 1 until 1000
     */
    static void multiplesThreeFive(){
        int sum = 0;
        for(int i = 1; i < 1000; i++){
            if( i%3 == 0 || i%5 == 0){
                sum += i;
            }
        }
        System.out.println("The sum of all multiples of 3 and 5 below 1000 is:");
        System.out.println(sum);
    }

    /**
     * Sum of all even numbers of the Fibonacci sequence up to 4m
     */
    static void fibonnacciEvenSum(){
        /*
        fibonnacci sequence: 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
        fib 1 : 0 + 1 = 1 -- a + b = c
        fib 2 : 1 + 1 = 2 -- b + c = d
        fib 3 : 1 + 2 = 3 -- c + d = e
         */

        long sum = 0;
        long a = 0;
        long b = 1;
        long fib = 0;

        int ceiling = 4000000;
        for(int i = 0; fib < ceiling; i++){ //  i = 2, 4, 6, 8, 10...
            fib = a + b;
            a = b;
            b = fib;
            if(fib % 2 == 0){
                sum += fib;
            }
        }
        System.out.println();
        System.out.println("Sum of evens in Fib. seq. until 4m:");
        System.out.println(sum);
    }

    /**
     * Find the largest prime factor of 600.851.475.143
     */
    static void largestPrimeFactor(){
        double largeNum = 6.00851475143; // 600.851.475.143 * e-11

        double step = 0.00000000001; //10^-11

        ArrayList<Double> primeFactors = listPrimeFactors(largeNum);
        Double largestPFactor = primeFactors.get(primeFactors.size()-1);

        System.out.println("Largest prime factor:");
        System.out.println(largestPFactor);
        largeNum /= step;
        System.out.println("Verification: ");
        System.out.println("" + largeNum + " / " + largestPFactor + " = " + (int) (largeNum/largestPFactor) );
    }

    /**
     * Return a list of prime factors for the given number
     * @param number
     * @return
     */
    static ArrayList<Double> listPrimeFactors(double number){
        double candidate = number;
        while (candidate%1 != 0) candidate *= 10;

        ArrayList<Double> primeFactors = new ArrayList<>();
        primeFactors.add( (double) 2);

        for(double i = 2; i < Math.sqrt(candidate); i++){
            boolean prime = true;
            for(double d : primeFactors){
                if (i%d==0) {
                    prime = false;
                    break;
                }
            }

            if(prime && candidate%i==0){
                primeFactors.add(i);
            }
        }

        return primeFactors;
    }

    /**
     * Prints maximum palindromic products for all factors in range 100-999
     *
     */
    static void findPalidromes(){
        boolean isPalindrome = true;
        int maxPalindrome = 0;
        String result = "";
        for(int i = 100; i < 1000; i++){
            for(int j = i; j < 1000; j++){
                if( maxPalindrome < (i * j)){
                    isPalindrome = true;
                    String product = "" + (i * j);
                    for(int ch = 0; ch < product.length()/2 && isPalindrome; ch++){
                        if(product.charAt(ch) != product.charAt(product.length()-1-ch)) {
                            isPalindrome = false;
                        }
                    }
                }

                if(isPalindrome){
                    if(maxPalindrome < (i*j)){
                        maxPalindrome = i*j;
                        result = String.format("%d x %d = %d \n", i, j, maxPalindrome);
                    }
                }
            }
        }
        System.out.print(result);

    }

    /**
     * Find the smallest number divisible by all numbers from 1 to 20
     */
    static void smallestMultiple(int range){
        int smallest = range;
        boolean found = false;
        while(!found){
            smallest++;
            found = true;
            for(int i = 1; i<=range; i++){
                if(smallest%i != 0){
                    found = false;
                    i = range + 1;
                }
            }
        }
        System.out.println("The smallest number evenly divisible by numbers from 1 to "+range+" is: " + smallest);
        System.out.println("Verification:");
        float result;
        for(int i = 1; i <= range; i++){
            result = (float) smallest / i;
            System.out.printf("%d / %d = %.5f\n", smallest, i, result);
        }

    }

    /**
     * Find the difference between the sum of the all squares from 1 to 100,
     * and the square of the arithmetic suite from 1 to 100
     */
    static void arithmeticSuiteDiff(int number){
        int gaussSuite = ((number + 1) * number/2);
        int sumSquare = gaussSuite*gaussSuite;

        int squareSum = 0;
        for(int i = 1; i <= number; i++) {
            squareSum += i*i;
        }

        int result = sumSquare - squareSum;

        System.out.printf("Sum of all squares (1 + 4 + 9...) from 1 to %d: %d\n", number, squareSum);
        System.out.printf("Gaussian suite (1 + 2 + 3...) from 1 to %d: %d\n", number, gaussSuite);
        System.out.printf("Square of gaussian suite: %d\n", sumSquare);
        System.out.printf("Difference: %d - %d = %d \n", sumSquare, squareSum, result);
    }

    /**
     * Print the nth prime number
     * @param nthPrime the nth prime in the list of primes
     */
    static int findPrime(int nthPrime){
        int nth = 1;
        ArrayList<Integer> primes = new ArrayList<>(nthPrime);
        primes.add(2);
        boolean nthPrimeFound = false;
        boolean isPrime;

        for(int p = 3; !nthPrimeFound; p += 2){
            isPrime = true;
            boolean isFactor = true;

            for(int i = 0; isFactor && isPrime; i++){
                int ithPrime = primes.get(i);

                isPrime = !(p % ithPrime == 0);
                isFactor = (p > (ithPrime * ithPrime));
            }
            if (isPrime){
                primes.add(p);
                nth++;
                System.out.printf("Prime #%d = %d\n", nth, p);
                //System.out.printf("%d IS PRIME!!! the %dth one\n", p, nth);
                //System.out.println();
                if (nth == nthPrime) nthPrimeFound = true;
            }
        }
        return primes.get(nthPrime-1);
    }

    private static void printNthPrime(int i) {
        System.out.printf("The %dth prime is %d", i, findPrime(i));
    }

    static void adjacentDigits(int amount, String number) {
        if (amount > number.length()) {
            System.out.print("The number does not have enough digits.");
            return;
        }

        int offset = number.length() - amount;
        // length: 10
        // amount: 3
        // offset: 10 - 3 = 7
        long maxProduct = 0;
        char[] currentDigits = new char[amount];
        char[] maxFactors = new char[amount];


        for (int i = 0; i <= offset; i++) {
            number.getChars(i, i + amount, currentDigits, 0);
            long currentProduct = 1;
            for (char c : currentDigits) {
                if (c == '0') break;
                currentProduct *= (c - '0');
                //currentProduct *= (c != '0' ? (c - '0') : 1);
            }

            if (currentProduct > maxProduct) {
                maxProduct = currentProduct;
                for (int i1 = 0; i1 < amount; i1++) {
                    maxFactors[i1] = currentDigits[i1];
                }
            }
        }
        for (char c : maxFactors) System.out.printf("%s ", c);
        System.out.printf(" = %s", maxProduct);
    }

    static int pythagoras(int a, int b){
       return a*a + b*b;
    }

    static void tripletSum(int sum){
        // a + b + c = 1000
        // a + b = 1000 - c
        // a = 1000 - c - b

        int a = 0, b = 0, c = 0;
        String factors = "";
        for (a = 1; a < sum - 3; a++ ){
            for (b = a + 1; b < sum - a; b++){
                for(c = b + 1; c < sum - b; c++)
                    if (c * c == pythagoras(a, b) && a + b + c == sum) {
                        factors = String.format("a = %d, b = %d, c = %d", a, b, c);
                        System.out.println(factors);
                        System.out.printf("%d + %d + %d = %d\n", a, b, c, a + b + c);
                        System.out.printf("%d^2 %d^2 = %d^2\n", a, b, c);
                        System.out.printf("%d + %d = %d\n", a*a, b*b, pythagoras(a,b));
                        System.out.printf("%d x %d x %d = %d\n", a, b, c, a * b * c);
                        break;
                    }
            }
        }
    }

    static String[] primes(int last){

        boolean[] sieve = new boolean[last];
        sieve[0] = false;
        sieve[1] = false;
        for(int i = 2; i < last; i++){
            sieve[i] = true;
        }

        int p = 2;
        while(p*p <= last){
            int j = p*p;
            while(j < last){
                sieve[j] = false;
                j += p;
            }
            p++;
            while(p < last && !sieve[p]) p++;

        }

        int boundary = 0;
        for(boolean b : sieve) boundary += (b ? 1 : 0);
        String[] primeArray = new String[boundary];
        int index = 0;
        for(int i = 0; i < last; i++){
            if(sieve[i]) {
                //System.out.printf("i = %d index = %d\n", i, index);
                primeArray[index] = "" + i;
                index++;
            }
        }

        return primeArray;
    }

    static void sumPrimes(int ceiling){
        String[] primes = primes(ceiling);
        BigIntCalc calc = new BigIntCalc();
        String sum = "";
        for(String s: primes){
            //System.out.print(s + " ");
            sum = calc.addition(sum, s);
        }
        //System.out.println();
        System.out.println(sum);

    }

    static void gridBuilding(String string){
        // Create the grid of numbers from the given string

        String[] gridString = string.split(" ");
        String[][] grid = new String[20][20];

        int index = 0;
        for(int i = 0; i < 20; i++){
            for(int j = 0; j < 20; j++){
                grid[j][i] = gridString[index];
                index++;
            }
        }

        /*
        for(int i = 0; i < 20; i++){
            for(int j = 0; j < 20; j++){
                System.out.print(grid[j][i] + " ");
            }
            System.out.println();
        }*/

        for(int i = 0; i < 20; i++){
            String[] factors = new String[4];
            for(int j = 0; j < 20; j++){
                grid[j][i] = gridString[index];
            }
        }


    }


}
