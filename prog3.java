import java.util.*; 
  
public class StrCharExtract { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter first string: "); String s1 = sc.nextLine(); 
        System.out.print("Enter second string: "); String s2 = sc.nextLine(); 
        System.out.print("Enter third string: "); String s3 = sc.nextLine(); 
  
        System.out.println("\\n--- Character Extraction Result ---"); 
        System.out.print("Enter index to find character in s1: "); 
        int i = sc.nextInt(); 
        if (i >= 0 && i < s1.length()) 
            System.out.println("Character at position " + i + " in s1 is " + s1.charAt(i)); 
        else System.out.println("Invalid index!"); 
  
        System.out.println("\\n--- String Modification ---"); 
        System.out.print("Enter starting position for substring in s3: "); 
        int a = sc.nextInt(); 
        System.out.print("Enter ending position for substring in s3: "); 
        int b = sc.nextInt(); 
        if (a >= 0 && a <= b && b <= s3.length()) 
            System.out.println("Substring of s3 = " + s3.substring(a, b)); 
        System.out.println("\\nConcatenate Strings s1 and s3:"); 
        System.out.println(s1.concat(s3)); 
  
        System.out.print("\\nEnter character to replace in s3: "); 
        char oldC = sc.next().charAt(0); 
        System.out.print("Enter new character: "); 
        char newC = sc.next().charAt(0); 
        System.out.println("After replacement: " + s3.replace(oldC, newC)); 
  
        System.out.print("\\nEnter starting position for getChars() in s3: "); 
        int x = sc.nextInt(); 
        System.out.print("Enter ending position for getChars() in s3: "); 
        int y = sc.nextInt(); 
        if (x >= 0 && x <= y && y <= s3.length()) { 
            char[] ch = new char[y-x]; 
            s3.getChars(x, y, ch, 0); 
            System.out.println("Extracted characters are:"); 
            System.out.println(ch); 
        } 
  
        System.out.println("\\nCharacter array of s1 is:"); 
        for (char c : s1.toCharArray()) System.out.println(c); 
  
        System.out.println("\\n--- String Comparison ---"); 
        System.out.println("s1 and s2 = " + s1.compareTo(s2)); 
        System.out.println("s2 and s3 = " + s2.compareTo(s3)); 
        System.out.println("s3 and s2 = " + s3.compareTo(s2)); 
  
        System.out.print("\\nEnter a character to search in s3: "); 
        char search = sc.next().charAt(0); 
        System.out.println("First index of " + search + " in s3 is " + s3.indexOf(search)); 
        System.out.println("Last index of " + search + " in s3 is " + s3.lastIndexOf(search)); 
        sc.close(); 
    } 
} 