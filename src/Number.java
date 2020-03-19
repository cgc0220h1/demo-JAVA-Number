import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        String result = null;
        int hundreds = 0;
        int tens = 0;
        int ones = 0;

        if (number >= 0) {
            if (number < 10) {
                switch (number) {
                    case 0:
                        result = "zero";
                        break;
                    case 1:
                        result = "one";
                        break;
                    case 2:
                        result = "two";
                        break;
                    case 3:
                        result = "three";
                        break;
                    case 4:
                        result = "four";
                        break;
                    case 5:
                        result = "five";
                        break;
                    case 6:
                        result = "six";
                        break;
                    case 7:
                        result = "seven";
                        break;
                    case 8:
                        result = "eight";
                        break;
                    case 9:
                        result = "nine";
                        break;
                    case 10:
                        result = "ten";
                        break;
                    default:
                        result = "out of ability";
                }
            } else if (number <= 20) {
                switch (number) {
                    case 11:
                        result = "eleven";
                        break;
                    case 12:
                        result = "twelve";
                        break;
                    case 13:
                        result = "thirteen";
                        break;
                    case 14:
                        result = "fourteen";
                        break;
                    case 15:
                        result = "fifteen";
                        break;
                    case 16:
                        result = "sixteen";
                        break;
                    case 17:
                        result = "seventeen";
                        break;
                    case 18:
                        result = "eighteen";
                        break;
                    case 19:
                        result = "nineteen";
                        break;
                    case 20:
                        result = "twenty";
                        break;
                    default:
                        result = "out of ability";
                }
            } else if (number < 100) {
                tens = number / 10;
                ones = number % 10;
                switch (tens) {
                    case 2:
                        result = "twenty";
                        break;
                    case 3:
                        result = "thirty";
                        break;
                    case 4:
                        result = "forty";
                        break;
                    case 5:
                        result = "fifty";
                        break;
                    case 6:
                        result = "sixty";
                        break;
                    case 7:
                        result = "seventy";
                        break;
                    case 8:
                        result = "eighty";
                        break;
                    case 9:
                        result = "ninety";
                        break;
                    default:
                        result = "out of ability";
                }

                result += " ";

                switch (ones) {
                    case 0:
                        break;
                    case 1:
                        result += "one";
                        break;
                    case 2:
                        result += "two";
                        break;
                    case 3:
                        result += "three";
                        break;
                    case 4:
                        result += "four";
                        break;
                    case 5:
                        result += "five";
                        break;
                    case 6:
                        result += "six";
                        break;
                    case 7:
                        result += "seven";
                        break;
                    case 8:
                        result += "eight";
                        break;
                    case 9:
                        result += "nine";
                        break;
                    default:
                        result = "out of ability";
                }
            } else if (number < 1000) {
                hundreds = number / 100;
                tens = (number % 100) / 10;
                ones = (number % 100) % 10;
                switch (hundreds) {
                    case 1:
                        result = "one";
                        break;
                    case 2:
                        result = "two";
                        break;
                    case 3:
                        result = "three";
                        break;
                    case 4:
                        result = "four";
                        break;
                    case 5:
                        result = "five";
                        break;
                    case 6:
                        result = "six";
                        break;
                    case 7:
                        result = "seven";
                        break;
                    case 8:
                        result = "eight";
                        break;
                    case 9:
                        result = "nine";
                        break;
                    default:
                        result = "out of ability";
                }

                result +=" " + "hundred" + " " + "and" + " ";

                switch (tens) {
                    case 0:
                        break;
                    case 1:
                        result += "eleven" + " " + "and" + " ";
                        break;
                    case 2:
                        result += "twenty";
                        break;
                    case 3:
                        result += "thirty";
                        break;
                    case 4:
                        result += "forty";
                        break;
                    case 5:
                        result += "fifty";
                        break;
                    case 6:
                        result += "sixty";
                        break;
                    case 7:
                        result += "seventy";
                        break;
                    case 8:
                        result += "eighty";
                        break;
                    case 9:
                        result += "ninety";
                        break;
                    default:
                        result = "out of ability";
                }

                result += " ";

                switch (ones) {
                    case 0:
                        break;
                    case 1:
                        result += "one";
                        break;
                    case 2:
                        result += "two";
                        break;
                    case 3:
                        result += "three";
                        break;
                    case 4:
                        result += "four";
                        break;
                    case 5:
                        result += "five";
                        break;
                    case 6:
                        result += "six";
                        break;
                    case 7:
                        result += "seven";
                        break;
                    case 8:
                        result += "eight";
                        break;
                    case 9:
                        result += "nine";
                        break;
                    default:
                        result = "out of ability";
                }
            }
        } else {
            result = "out of ability";
        }
        System.out.printf("The number %d is read: %s", number, result);
    }
}
