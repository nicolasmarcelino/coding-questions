class Solution {
    public static String eraseFrom(String str, String c) {
        return str.replace(c, "");
    }
    public static void main(String[] args) {
        System.out.print(eraseFrom("Hello, world!", "o")); // output: "Hell, wrld!"
    }
}

