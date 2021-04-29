package hu.nive.ujratervezes.kepesitovizsga.addigits;

public class AddDigits {
    public int addDigits(String input) {
        if (input == null || input.isEmpty()) {
            return -1;
        }
        int szum = 0;
        for (int i = 0; i < input.length(); i++) {
            String temp = input.substring(i, i + 1);
            if (Character.isDigit(temp.toCharArray()[0])) {
                szum += Integer.parseInt(temp);
            }
        }
        return szum;
    }
}
