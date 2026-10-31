import java.util.*; 
class Employee { 
    int id; String name; double salary; 
    Employee(int i,String n,double s){id=i;name=n;salary=s;} 
    public String toString(){return "ID: "+id+", Name: "+name+", Salary: "+salary;} 
} 
public class EmployeeCollection { 
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in); 
        ArrayList<Employee> list=new ArrayList<>();  
        System.out.print("Enter number of employees: "); 
        int n=Integer.parseInt(sc.nextLine()); 
        for(int i=1;i<=n;i++) { 
            System.out.println("Employee "+i); 
            System.out.print("Enter ID: "); int id=Integer.parseInt(sc.nextLine()); 
            System.out.print("Enter Name: "); String name=sc.nextLine(); 
            System.out.print("Enter Salary: "); double sal=Double.parseDouble(sc.nextLine()); 
            list.add(new Employee(id,name,sal)); 
        } 
        System.out.println("\\nEmployee Details:"); 
        for(Employee e:list) System.out.println(e); 
        System.out.print("\\nEnter employee ID to search: "); 
        int key=Integer.parseInt(sc.nextLine()); boolean found=false; 
        for(Employee e:list) if(e.id==key) { 
            System.out.println("Employee found: "+e); found=true; break; 
        } 
        if(!found) System.out.println("Employee not found"); 
        sc.close(); 
    } 
} 