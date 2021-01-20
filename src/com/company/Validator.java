package com.company;

public class Validator {

    public static boolean checkEmail(String email) { // ascasca@asca.sac.cs
        int etPos = email.indexOf("@");
        if (etPos == -1) return false;

        int etPos2 = email.lastIndexOf("@");
        if (etPos != etPos2) return false;

        if (!Character.isLetter(email.charAt(0))
                && !Character.isDigit(email.charAt(0))) return false;

        String username = email.substring(0, etPos);
        if (username.length() < 6) return false;
        if (!containsOnlyDigitsLettersAndDots(username)) return false;

        String domain = email.substring(etPos + 1);
        if (!correctDomain(domain)) return false;

        return true;
    }

    public static boolean checkDate(String date) {

        // some awesome code goes here

        return true;
    }

    private static boolean correctDomain(String domain) {
        if (domain == null) return false;
        if (domain.length() < 4) return false;
        if (domain.indexOf(".") == -1) return false;
        if (!containsOnlyDigitsLettersAndDots(domain)) return  false;
        for (int i = 0; i < domain.length() - 1; i++) {
            if (domain.charAt(i) == '.') {
                if (i == 0) return false;
                if (domain.charAt(i + 1) == '.') return false;
            }
        }

        if (domain.charAt(domain.length() - 1) == '.') return false;
        return true;
    }

    private static boolean containsOnlyDigitsLettersAndDots(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i)) &&
                    !Character.isLetter(input.charAt(i)) &&
                    input.charAt(i) != '.') {
                return false;
            }
        }

        return true;
    }
}
