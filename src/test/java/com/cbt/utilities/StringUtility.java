package com.cbt.utilities;

public class StringUtility {
    public static String verifyEquals(String expected, String actual){

        if (actual.equals(expected)){
            return "PASS";
        }else {
            return "FAIL";
        }
    }

}
