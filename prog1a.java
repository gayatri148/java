import java.util.*; 
class Student implements Comparable<Student> { 
    int roll; String name; double marks; 
    Student(int r,String n,double m){roll=r;name=n;marks=m;} 
    public int compareTo(Student s){return roll-s.roll;} 
    public String toString(){return "Roll No: "+roll+", Name: "+name+", Marks: "+marks;} 
} 
public class StudentCollection { 
    public static void main(String[] args) { 
        ArrayList<Student> list=new ArrayList<>(); 
        list.add(new Student(103,"Rahul",82.5)); 
        list.add(new Student(101,"Ananya",91.0)); 
        list.add(new Student(104,"Kiran",75.5)); 
        list.add(new Student(102,"Bhavya",88.0)); 
        System.out.println("===== STUDENT RECORDS ====="); 
        for(Student s:list) System.out.println(s); 
        Collections.sort(list); 
        System.out.println("\\n===== SORTED BY ROLL NUMBER ====="); 
        for(Student s:list) System.out.println(s); 
        list.sort((a,b)->a.name.compareToIgnoreCase(b.name)); 
        System.out.println("\\n===== SORTED BY NAME ====="); 
        for(Student s:list) System.out.println(s); 
        System.out.println("\\n===== ITERATOR ====="); 
        Iterator<Student> it=list.iterator(); 
        while(it.hasNext()) System.out.println(it.next()); 
        Map<Integer,Student> map=new TreeMap<>(); 
        for(Student s:list) map.put(s.roll,s); 
        System.out.println("\\n===== STUDENT MAP ====="); 
        for(int r:map.keySet()) System.out.println("Roll No: "+r+" -> "+map.get(r)); 
        System.out.println("\\n===== SEARCH STUDENT ====="); 
        int key=102; 
        if(map.containsKey(key)) System.out.println("Student found: "+map.get(key)); 
        else System.out.println("Student not found!"); 
        System.out.println("\\n===== RANDOMACCESS ====="); 
        if(list instanceof RandomAccess) { 
            System.out.println("ArrayList supports RandomAccess."); 
            System.out.println("Student at index 0: "+list.get(0)); 
            System.out.println("Student at index 2: "+list.get(2)); 
        } 
        list.sort((a,b)->Double.compare(b.marks,a.marks)); 
        System.out.println("\\n===== SORTED BY MARKS (DESCENDING) ====="); 
        for(Student s:list) System.out.println(s); 
    } 
} 