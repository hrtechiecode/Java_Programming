package String;

class Inbuilt_fun {
        public static void main(String[] args) {
            String s1 = " Java Programming ";
            String s2 = "java programming";
            String s3 = "123,456,789";
            String s4 = "apple";
            String s5 = "apple";
            String s6 = "";

            // 1. length()
            System.out.println("Length: " + s1.length());

            // 2. charAt()
            System.out.println("Character at index 5: " + s1.charAt(5));

            // 3. equals()
            System.out.println("Equals (case-sensitive): " + s1.equals(s2));

            // 4. equalsIgnoreCase()
            System.out.println("Equals (ignore case): " + s1.trim().equalsIgnoreCase(s2));

            // 5. compareTo()
            System.out.println("CompareTo (s4 vs s5): " + s4.compareTo(s5));

            // 6. substring()
            System.out.println("Substring (5 to 11): " + s1.substring(5, 12));

            // 7. indexOf()
            System.out.println("Index of 'a': " + s1.indexOf('a'));

            // 8. lastIndexOf()
            System.out.println("Last Index of 'a': " + s1.lastIndexOf('a'));

            // 9. contains()
            System.out.println("Contains 'Pro': " + s1.contains("Pro"));

            // 10. toUpperCase()
            System.out.println("To Uppercase: " + s1.toUpperCase());

            // 11. toLowerCase()
            System.out.println("To Lowercase: " + s1.toLowerCase());

            // 12. trim()
            System.out.println("Trimmed: '" + s1.trim() + "'");

            // 13. replace()
            System.out.println("Replace 'a' with '*': " + s1.replace('a', '*'));

            // 14. replaceAll() with regex
            System.out.println("Remove all digits: " + s3.replaceAll("\\d", ""));

            // 15. split()
            String[] parts = s3.split(",");
            System.out.print("Split values: ");
            for (String part : parts) {
                System.out.print(part + " ");
            }
            System.out.println();

            // 16. join()
            String joined = String.join("-", parts);
            System.out.println("Joined with '-': " + joined);

            // 17. valueOf()
            int num = 123;
            System.out.println("String value of int: " + String.valueOf(num));

            // 18. toCharArray()
            char[] chars = s4.toCharArray();
            System.out.print("Characters in 'apple': ");
            for (char c : chars) {
                System.out.print(c + " ");
            }
            System.out.println();

            // 19. startsWith()
            System.out.println("Starts with ' Ja': " + s1.startsWith(" Ja"));

            // 20. endsWith()
            System.out.println("Ends with 'ing ': " + s1.endsWith("ing "));

            // 21. isEmpty()
            System.out.println("Is s6 empty: " + s6.isEmpty());

            // 22. isBlank() - Java 11+
            System.out.println("Is '   ' blank: " + "   ".isBlank());
        }
    }
