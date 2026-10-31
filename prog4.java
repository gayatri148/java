import java.util.*; 
  
public class StringBufferDemo { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a string: "); 
        StringBuffer sb = new StringBuffer(sc.nextLine()); 
        System.out.println("\\n--- Initial StringBuffer Details ---"); 
        System.out.println("Buffer initially = " + sb); 
        System.out.println("Buffer length = " + sb.length()); 
        System.out.println("Buffer capacity = " + sb.capacity()); 
  
        System.out.print("\\nEnter an index to find the character: "); 
        int i = sc.nextInt(); 
        if (i >= 0 && i < sb.length()) 
            System.out.println("Character at index " + i + " = " + sb.charAt(i)); 
  
        System.out.print("\\nEnter an index to change the character: "); 
        int j = sc.nextInt(); 
        if (j >= 0 && j < sb.length()) { 
            System.out.print("Enter a new character: "); 
            sb.setCharAt(j, sc.next().charAt(0)); 
            System.out.println("Buffer after setCharAt() = " + sb); 
        } 
  
        System.out.print("\\nEnter the new length of the buffer: "); 
        int len = sc.nextInt(); 
        if (len >= 0) { 
            sb.setLength(len); 
            System.out.println("Buffer after setLength() = " + sb); 
        } 
  
        System.out.print("\\nEnter an integer value to append: "); 
        int num = sc.nextInt(); 
        System.out.println("Result of append() = " + new StringBuffer("Number = ").append(num).append("!")); 
  
        sc.nextLine(); 
        System.out.print("\\nEnter a string for insert operation: "); 
        StringBuffer b = new StringBuffer(sc.nextLine()); 
        System.out.print("Enter the text to insert: "); String text = sc.nextLine(); 
        System.out.print("Enter the index at which to insert: "); int pos = sc.nextInt(); 
        if (pos >= 0 && pos <= b.length()) { 
            b.insert(pos, text); 
            System.out.println("Result of insert() = " + b); 
        } 
  
        System.out.println("\\nResult of reverse() = " + sb.reverse()); 
        System.out.print("\\nEnter starting index for delete(): "); int start = sc.nextInt(); 
        System.out.print("Enter ending index for delete(): "); int end = sc.nextInt(); 
        if (start >= 0 && start <= end && end <= b.length()) { 
            b.delete(start, end); 
            System.out.println("After delete() = " + b); 
        } 
        System.out.print("\\nEnter index for deleteCharAt(): "); int d = sc.nextInt(); 
        if (d >= 0 && d < b.length()) { 
            b.deleteCharAt(d); 
            System.out.println("After deleteCharAt() = " + b); 
        } 
        sc.nextLine(); 
        System.out.print("\\nEnter text to replace the buffer: "); 
        String replacement = sc.nextLine(); 
        b.replace(0, b.length(), replacement); 
        System.out.println("After replace() = " + b); 
        sc.close(); 
    } 
} 