package com.junit;
import java.util.regex.Pattern;

public class UserRegistration {
    public static final String VALIDATE_NAME="^[A-z]+[a-z]{2,}$";
    public boolean checkFirstName(String firstName) {
        return (Pattern.matches(VALIDATE_NAME, firstName));
    }
    public static final String VALIDATE_NAME1="^[A-z]+[a-z]{2,}$";
    public boolean checkLastName(String lastName) {
        return (Pattern.matches(VALIDATE_NAME1, lastName));
    }
    public static final String  EMAIL_ID="^[A-Za-z]{3,}[.]?[A-Za-z]{2,}[@]{1}[a-z]{2,}[.]{1}[a-z]{2,}$";
    public boolean checkEmailId(String emailId) {
        return (Pattern.matches(EMAIL_ID, emailId));
    }
    public static final String PHONE_NUMBER="^[0-9]+\s[0-9]{10}$";
    public Boolean checkPhoneNumber(String phoneNumber) {
        return (Pattern.matches(PHONE_NUMBER,phoneNumber));
    }
    public static final String PASSWORD_RULE1="^[a-z]{8,}$";
    public Boolean password(String password) {
        return (Pattern.matches(PASSWORD_RULE1,password));
    }
    public static final String PASSWORD_RULE2="^[A-z]+[a-z]{2,}$";
    public Boolean password2(String password2) {
        return (Pattern.matches(PASSWORD_RULE2,password2));
    }
    public static final String PASSWORD_RULE3="^[A-Z]+[a-z0-9]{7,}$";
    public Boolean password3(String password3) {
        return (Pattern.matches(PASSWORD_RULE3,password3));
    }
    public static final String PASSWORD_RULE4="^[A-Z]+[a-z0-9]{7,}[!@#$%&*]+$";
    public Boolean password4(String password4) {
        return (Pattern.matches(PASSWORD_RULE4,password4));
    }
    public static final String  SEPERATE_EMAIL_ID="^[A-Za-z]{3,}[.+-]?[A-Za-z0-9]*[@]{1}[a-z0-9]{1,}[.]{1}[a-z]{2,}[.]?[a-z]*$";
    public Boolean checkEmailSeperate(String checkEmailSeperate) {
        return (Pattern.matches(SEPERATE_EMAIL_ID,checkEmailSeperate));
        }
}

