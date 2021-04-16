//Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.
//
//        Example:
//        Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"

public class Kata {
    public static void main(String[] args) {
        String text = createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
        System.out.println(text);
    }

    public static String createPhoneNumber(int[] numbers) {
        StringBuilder stringBuilder = new StringBuilder().append("(");

        for(int i = 0; i < numbers.length; i++){

            switch (i){
                case 2:
                    stringBuilder.append(numbers[i]).append(")").append(" ");
                    break;
                case 5:
                    stringBuilder.append(numbers[i]).append("-");
                    break;
                default:
                    stringBuilder.append(numbers[i]);
            }
        }
        return stringBuilder.toString();
    }
}
