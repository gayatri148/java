import java.util.*; 
public class StringBufferMethods { 
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter a string: "); 
        StringBuffer sb=new StringBuffer(sc.nextLine()); 
        System.out.println("Buffer initially = "+sb); 
        System.out.println("Length = "+sb.length()); 
        System.out.println("Capacity = "+sb.capacity()); 
        if(sb.length()>0) { 
            System.out.print("Enter index for charAt(): "); int i=sc.nextInt(); 
            if(i>=0&&i<sb.length()) System.out.println("Character = "+sb.charAt(i)); 
            System.out.print("Enter index for setCharAt(): "); int j=sc.nextInt(); 
            if(j>=0&&j<sb.length()) { 
                System.out.print("Enter new character: "); 
                sb.setCharAt(j,sc.next().charAt(0)); 
                System.out.println("After setCharAt(): "+sb); 
            } 
        } 
        System.out.print("Enter length for setLength(): "); int len=sc.nextInt(); 
        if(len>=0){sb.setLength(len);System.out.println("After setLength(): "+sb);} 
        System.out.print("Enter number to append: "); int num=sc.nextInt(); 
        sb.append(num); System.out.println("After append(): "+sb); 
        sc.nextLine(); 
        System.out.print("Enter text to insert: "); String text=sc.nextLine(); 
        System.out.print("Enter insert index: "); int pos=sc.nextInt(); 
        if(pos>=0&&pos<=sb.length()){sb.insert(pos,text);System.out.println("After insert(): "+sb);} 
        System.out.print("Enter delete start and end indices: "); 
        int start=sc.nextInt(),end=sc.nextInt(); 
        if(start>=0&&start<=end&&end<=sb.length()){sb.delete(start,end);System.out.println("After delete(): "+sb);} 
        if(sb.length()>0) { 
            System.out.print("Enter index for deleteCharAt(): "); int d=sc.nextInt(); 
            if(d>=0&&d<sb.length()){sb.deleteCharAt(d);System.out.println("After deleteCharAt(): "+sb);} 
        } 
        System.out.println("After reverse(): "+sb.reverse()); 
        sc.nextLine(); 
        System.out.print("Enter replacement text: "); String replacement=sc.nextLine(); 
        sb.replace(0,sb.length(),replacement); 
        System.out.println("After replace(): "+sb); 
        sc.close(); 
    } 
} 