package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

        String aux = String.valueOf(number);
        char firstChar = aux.charAt(0);
        String replaced = aux.replaceAll(""+firstChar, "");

        if ((number % 3 == 0 || String.valueOf(number).contains("3"))
                && (number % 5 == 0 || String.valueOf(number).contains("5"))
                && (((number > 10) && replaced.length() == 0))){
            return "fizz buzz deluxe";
        } else if ((number % 3 == 0 || String.valueOf(number).contains("3"))
                && (number % 5 == 0 || String.valueOf(number).contains("5"))){
            return "fizz buzz";
        } else if ((number > 10) && replaced.length() == 0) {
            return "deluxe";
        } else if (number % 3 == 0 || String.valueOf(number).contains("3") ) {
            return "fizz";
        } else if (number % 5 == 0 || String.valueOf(number).contains("5") ) {
            return "buzz";
        } else {
            return Integer.toString(number);
        }
    }


    public static void main(String[] args) {
        String aux = String.valueOf(30);
        char firstChar = aux.charAt(0);
        String replaced = aux.replaceAll(""+firstChar, "");
        System.out.println(replaced.length());
    }
}

