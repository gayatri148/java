import java.util.*; 
public class StringMethods { 
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter a sentence: "); String s=sc.nextLine(); 
        System.out.print("Enter word to replace: "); String old=sc.nextLine(); 
        System.out.print("Enter replacement word: "); String rep=sc.nextLine(); 
        String clean=s.trim(); 
        System.out.println("\\nAfter trim(): "+clean); 
        System.out.println("After replace(): "+clean.replace(old,rep)); 
        System.out.println("Uppercase: "+clean.toUpperCase()); 
        System.out.println("Lowercase: "+clean.toLowerCase()); 
        if(!clean.isEmpty()) { 
            System.out.println("First character: "+clean.charAt(0)); 
            System.out.println("Character array: "+Arrays.toString(clean.toCharArray())); 
        } 
        System.out.println("Comparison with replacement word: "+clean.compareTo(rep)); 
        System.out.print("Enter text to search: "); String key=sc.nextLine(); 
        System.out.println("First index: "+clean.indexOf(key)); 
        System.out.println("Last index: "+clean.lastIndexOf(key)); 
        System.out.println("Substring: "+clean.substring(0,Math.min(5,clean.length()))); 
        System.out.println("Concatenation: "+clean.concat(" "+rep)); 
        sc.close(); 
    }