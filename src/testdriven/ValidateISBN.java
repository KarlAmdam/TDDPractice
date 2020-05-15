package testdriven;

public class ValidateISBN {

    public boolean checkISBN(String isbn) {
        if (isbn.length() != 10) {
            throw new NumberFormatException("ISBN numbers must be 10 digits long");
        } else {
            int total = 0;

            for(int i = 0; i < 10; ++i) {
                total += isbn.charAt(i) * (10 - i);
            }

            return total % 11 == 0;
        }
    }
}