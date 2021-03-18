package com.develogical.app;

public class QueryProcessor {
    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("hoare")) {
            return "Sir Charles Antony Richard Hoare FRS FREng (born 11 January 1934)[4] is a British computer scientist.";
        }
        if (query.toLowerCase().contains("test")) {
            return "returns >>test<<.";
        }

        return "";
    }
}