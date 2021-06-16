import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTests {

    @Test
    public void shouldReturn1ForOneOne() {
        assertEquals("1", FizzBuzz.fizzBuzz(1, 1));
    }

    @Test
    public void shouldReturn12ForOneTwo() {
        assertEquals("12", FizzBuzz.fizzBuzz(1, 2));
    }

    @Test
    public void shouldReturn12FizzForOneThree() {
        assertEquals("12Fizz", FizzBuzz.fizzBuzz(1, 3));
    }

    @Test
    public void shouldReturn12Fizz4BuzzForOneFive() {
        assertEquals("12Fizz4Buzz", FizzBuzz.fizzBuzz(1, 5));
    }

    @Test
    public void shouldReturn12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzzForOneFifteen() {
        assertEquals("12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz", FizzBuzz.fizzBuzz(1, 15));
    }
}