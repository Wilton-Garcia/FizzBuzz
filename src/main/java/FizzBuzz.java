public class FizzBuzz {






    public String converter(int number){
        String convertedNumber = "";
        if(isMultipleOf3(number)){
            convertedNumber += "fizz";
        }
        if(isMultipleOf5(number)){
            convertedNumber += "buzz";
        }
        if(number < 0 ){
            convertedNumber = "zero";
        }
        if("".equals(convertedNumber)){
            return String.valueOf(number);
        }
        return convertedNumber;
    }

    public boolean isMultipleOf3(int number){
        return number % 3 == 0;
    }
    public boolean isMultipleOf5(int number){
        return number % 5 == 0;
    }



















    /*

    public String converter(int number){
        return "fizz";
    }



    public String converter(int number){
        if(number % 5 == 0){
            return "buzz";
        }
        return "fizz";
    }



    public String converter(int number){
        String convertedNumber = "";
        if(number % 3 == 0){
            convertedNumber += "fizz";
        }
        if(number % 5 == 0){
            convertedNumber += "buzz";
        }
        if("".equals(convertedNumber)){
            return String.valueOf(number);
        }
        return convertedNumber;
    }



    public String converter(int number){
        String convertedNumber = "";
        if(isMultipleOf3(number)){
            convertedNumber += "fizz";
        }
        if(isMultipleOf5(number)){
            convertedNumber += "buzz";
        }
        if("".equals(convertedNumber)){
            return String.valueOf(number);
        }
        return convertedNumber;
    }

    public boolean isMultipleOf3(int number){
        return number % 3 == 0;
    }
    public boolean isMultipleOf5(int number){
        return number % 5 == 0;
    }
 */
}
