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
        public static calculateGrade (int score) {
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

public static String fizzbuzz(int x){
    if (x%2 == 0 && x%7 != 0){
        return "fizz";
    }
    else if (x%7 == 0 && x%2 != 0){
        return "buzz";
    }
    else if (x%7 == 0 && x%2 == 0){
        return "fizzbuzz";
    }
    else {
        return "unlucky";
    }

}

    // Question 2 - fizzBuzz

public static String backFront(String str){
    if (str.length() >=2){
        String last2 = str.substring(str.length()-2);
        return last2 + str + last2;
    }
    return str;
}

    // Question 3 - frontBack

public static boolean twoAsOne(int a, int b, int c){
    if (a*b==c || a*c == b || c*b ==a ){
        return true;
    }
    return false;
}

    // Question 4 - twoAsOne

    // Question 5 - endUp

}
