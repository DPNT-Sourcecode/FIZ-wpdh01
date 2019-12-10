package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {



        if (isFizz(number) && isBuzz(number) && isDeluxe(number)){
            if (number%2 != 0)
                return "fizz buzz fake deluxe";
            return "fizz buzz deluxe";
        } else if (isFizz(number) && isBuzz(number)) {
            return "fizz buzz";
        } else if (isFizz(number) && isDeluxe(number)) {
            if (number%2 != 0)
                return "fizz fake delux";
            return "fizz deluxe";
        } else if (isBuzz(number) && isDeluxe(number)){
            return "buzz deluxe";
        } else if (isDeluxe(number)) {
            if (number%2 != 0)
                return "fake deluxe";
            return "deluxe";
        } else if (isFizz(number)) {
            return "fizz";
        } else if (isBuzz(number)) {
            return "buzz";
        } else {
            return Integer.toString(number);
        }
    }



    public boolean isDeluxe(Integer number){
        String aux = String.valueOf(number);
        char firstChar = aux.charAt(0);
        String replaced = aux.replaceAll(""+firstChar, "");

        if (((number > 10) && replaced.length() == 0))
            return true;
        return false;
    }

    public boolean isFizz(Integer number){
        if (number % 3 == 0 || String.valueOf(number).contains("3"))
            return true;
        return false;
    }

    public boolean isBuzz(Integer number){
        if (number % 5 == 0 || String.valueOf(number).contains("5"))
            return true;
        return false;
    }
}




