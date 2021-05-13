import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FizzBuzzTest {


    @Test
    public void shouldReturnFizzWhenNumberIsMultipleOf3(){

        int number = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String converterdNumber = fizzBuzz.converter(number);
        assertThat(converterdNumber, is("fizz"));
    }

    @Test
    public void shouldReturnFizzWhenNumberIsMultipleOf5(){

        int number = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String converterdNumber = fizzBuzz.converter(number);
        assertThat(converterdNumber, is("buzz"));
    }

    @Test
    public void shouldReturnZeroWhenNumberIsNegative(){
        int  number = -1;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String converterdNumber = fizzBuzz.converter(number);
        assertThat(converterdNumber, is("zero"));

    }

    @Test
    public void shouldReturnFizzWhenNumberIsMultipleOf3or5(){

        int number = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String converterdNumber = fizzBuzz.converter(number);
        assertThat(converterdNumber, is("fizzbuzz"));
    }

}
