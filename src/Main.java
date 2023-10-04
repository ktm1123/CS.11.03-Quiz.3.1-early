/*
*   Name:
*   Section:
*
*   Academic Honesty Pledge:
*   "I have neither given nor received any unauthorized aid on this piece of work."
*
*   Signed ______  Date _______
* */

public class Main {
    public class Main {
        public static int calculateGrade (int score) {
            if (score >= 95) {
                return 'A';
            } else if (score >= 85 && score <= 94) {
                return 'B';
            } else if (score >= 75 && score <= 84) {
                return 'C';
            } else if (score >= 64 && score <= 74) {
                return 'D';
            } else if (score >= 55 && score <= 64) {
                return 'E';
            } else {
                return 'F';
            }
        }
    }

    // Question 1 - calculateGrade

public static String fizzBuzz(int x){
    if (x%2 == 0 && x%7 == 0){
        return "fizzbuzz";
    }
    else if (x%7 == 0 && x%2 != 0){
        return "buzz";
    }
    else if (x%2 == 0 && x%7 != 0){
        return "fizz";
    }
    return "unlucky";
}

    // Question 2 - fizzBuzz

public static String backFront(String str){
        if (str < 2) {
            return str;
        }
        String lastTwo = str.substring(str.length()-2);
        return lastTwo + str + lastTwo;
    }

    // Question 3 - frontBack

public static boolean twoAsOne(int a, int b, int c){
    if (a*b==c || a*c == b || c*b ==a ){
        return true;
    }
    return false;
}

    // Question 4 - twoAsOne

public static String endDown(String str){
    if (str.length() >= 3){
        String x = str.substring(0,str.length()-3);
        String y = str.substring(str.length()-3).toLowerCase();
        return x + y;
    }
    return str.toLowerCase();
}

    // Question 5 - endUp

}
