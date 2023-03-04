package com.junit;
import java.util.regex.Pattern;

public class UserRegistration {
    public static final String  SEPERATE_EMAIL_ID="^[A-Za-z]{3,}[.+-]?[A-Za-z0-9]*[@]{1}[a-z0-9]{1,}[.]{1}[a-z]{2,}[.]?[a-z]*$";

    public Boolean checkEmailSeperate(String checkEmailSeperate) {
        return (Pattern.matches(SEPERATE_EMAIL_ID,checkEmailSeperate));
        }
    }

