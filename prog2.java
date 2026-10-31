import java.util.*; 
  
class Address { 
    String name, street, city, state, pincode; 
    Address(String n, String st, String c, String s, String p) { 
        name=n; street=st; city=c; state=s; pincode=p; 
    } 
    public String toString() { 
        return name + "\\n" + street + "\\n" + city + " " + state + " " + pincode; 
    } 
} 
public class AddressCollection { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        LinkedList<Address> list = new LinkedList<>(); 
        System.out.print("Enter number of addresses: "); 
        int n = Integer.parseInt(sc.nextLine()); 
  
        for (int i=1; i<=n; i++) { 
            System.out.println("\\nEnter details for Address " + i); 
            System.out.print("Enter Name: "); String name = sc.nextLine(); 
            System.out.print("Enter Street: "); String street = sc.nextLine(); 
            System.out.print("Enter City: "); String city = sc.nextLine(); 
            System.out.print("Enter State: "); String state = sc.nextLine(); 
            System.out.print("Enter Pincode: "); String pin = sc.nextLine(); 
            list.add(new Address(name, street, city, state, pin)); 
        } 
        System.out.println("\\n----- Address Details -----"); 
        for (Address a : list) System.out.println(a + "\\n"); 
        sc.close(); 
    } 
} 