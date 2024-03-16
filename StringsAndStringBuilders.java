public class StringsAndStringBuilders {
    public static void main(String[] args) {
//        String str;
//        String str1 = "I like rain!";
//        String str2 = new String("but I get cold easily :(");
//        System.out.println(str1);

//        String str = sc.next(); // until whitespace
//        String str2 = sc.nextLine(); // until '\n'

//        String a = "Hello!";
//        String b = "My name is Khan.";
//        String intro = a + " " + b;

//        String str = "Hello folks!";
//        System.out.println(str.length());
//        System.out.println(str.charAt(0));
//        System.out.println(str.substring(1,5)); // [st, en)
//        System.out.println(str.split(","));
//        System.out.println(str.contains("abc"));

        String s = "    abc, def           ";
        System.out.println(s.trim());

        String str1 = "Hello";
        String str2 = "hello";
        System.out.println(str1.equals(str2)); // compares for same value
        System.out.println(str1.equalsIgnoreCase(str2)); // compares ignoring case differences
        System.out.println(str1.compareTo(str2));
        /*
        evaluates the lexicographical order of two strings, returning a negative number,
        zero, or a positive number if the first string is less than, equal to, or greater
        than the second string, respectively. This method is case-sensitive and useful in sorting.
         */

        System.out.println(Integer.parseInt("12345")); // string to int
        System.out.println(Integer.toString(12345)); // int to string

        /*
        In Java, when you create a string using double quotes, it goes into the String Pool,
        a memory area in the Java heap for storing unique string literals. If you create a
        string with the `new` keyword, it's placed in the heap outside the String Pool,
        ensuring a distinct memory location even for identical strings. The String Pool
        helps save memory by reusing strings. For example, `String s1 = "hello";` and `
        String s2 = "hello";` will point to the same memory location in the Pool,
        whereas `String s3 = new String("hello");` will not, even though `s2.equals(s3)`
        is true.
        In Java, `equals()` checks if two strings have the same sequence of characters,
        regardless of where they're stored (String Pool or heap). So, it focuses on value equality.
        `equalsIgnoreCase()` is similar to `equals()` but ignores case differences, also
        focusing on value equality but in a case-insensitive manner. `compareTo()`, however,
        compares two strings lexicographically (based on the Unicode value of each character
        in the strings) and is sensitive to character case. It can indicate the ordering of
        strings, not just equality, which is useful for sorting.
         */

        // Strings in Java are immutable, the reference is mutable but instance is immutable
        /*
        In Java, string immutability means once a string instance is created,
        its content cannot be changed. If you try to modify it, a new string instance is
        created instead. The variable (reference) holding the string can be pointed to a
        different string, but the original string object itself never changes. For example,
        if you do `String str = "hello";` and then `str = str + " world";`, `str` originally
        points to "hello" in memory. After modification, `str` points to a new string "hello world",
        but the original "hello" string remains unchanged in memory.
         */

        StringBuilder str = new StringBuilder("abcdefg");
        /*
        StringBuilder in Java is a mutable sequence of characters, allowing you to change the
        string content without creating a new object for each modification. Unlike String, which
        is immutable, StringBuilder can be modified (append, insert, delete) efficiently, making
        it ideal for scenarios where you're manipulating strings frequently.
         */
    }
}
