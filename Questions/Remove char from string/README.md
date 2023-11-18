# Goal: To remove any character from a string

Our input consists of a character and a string. The code will need to search for the character in the string and delete it. Does the code need to index each occurrence of the character in the string? The character "o" occurs 2 times in "Hello, world!" Should we delete all of them? We can use the ```replace``` method in the following manner.

```java
public static String eraseFrom(String str, String c) {
        return str.replace(c, "");
    }
```



