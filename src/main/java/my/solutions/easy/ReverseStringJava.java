package my.solutions.easy;

/*
    Write a function that takes a string as input and returns the string reversed.

    Example:
    Given s = "hello", return "olleh".
*/

public class ReverseStringJava {
    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}