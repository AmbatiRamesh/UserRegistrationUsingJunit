package com.junit;
import java.util.regex.Pattern;

public class UserRegistration {
        public static final String  EMAIL_ID="^[A-Za-z]{3,}[.]?[A-Za-z]{2,}[@]{1}[a-z]{2,}[.]{1}[a-z]{2,}$";
        public boolean checkEmailId(String emailId) {
            return (Pattern.matches(EMAIL_ID, emailId));
        }
    }

