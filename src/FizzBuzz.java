public class FizzBuzz {
    public static String fizzBuzz(int min, int max) {
        StringBuilder result = new StringBuilder();
        for (int i = min; i <= max; i++) {
            if (i % 15 == 0)
                result.append("FizzBuzz");
            else if (i % 3 == 0)
                result.append("Fizz");
            else if (i % 5 == 0)
                result.append("Buzz");
            else
                result.append(i);
        }
        return result.toString();
    }
}
