package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {



        if ((number % 3 == 0 || String.valueOf(number).contains("3"))
                && (number % 5 == 0 || String.valueOf(number).contains("5"))
                && (){
            return "fizz buzz deluxe";
        } else if ((number % 3 == 0 || String.valueOf(number).contains("3"))
                && (number % 5 == 0 || String.valueOf(number).contains("5"))){
            return "fizz buzz";
        } else if (isDeluxe(number)) {
            return "deluxe";
        } else if () {
            return "fizz";
        } else if () {
            return "buzz";
        } else {
            return Integer.toString(number);
        }
    }


    public boolean isDeluxe(Integer number){
        String aux = String.valueOf(number);
        char firstChar = aux.charAt(0);
        String replaced = aux.replaceAll(""+firstChar, "");

        if (((number > 10) && replaced.length() == 0)))
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


