import java.util.*; 
  
class Student implements Comparable<Student> { 
    int rollNo; String name; double marks; 
    Student(int r, String n, double m) { rollNo=r; name=n; marks=m; } 
    public int compareTo(Student s) { return rollNo - s.rollNo; } 
    public String toString() { 
        return "Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks; 
    } 
} 
class NameComparator implements Comparator<Student> { 
    public int compare(Student a, Student b) { 
        return a.name.compareToIgnoreCase(b.name); 
    } 
} 
public class StudentCollection { 
    public static void main(String[] args) { 
        ArrayList<Student> students = new ArrayList<>(); 
        students.add(new Student(103, "Rahul", 82.5)); 
        students.add(new Student(101, "Ananya", 91.0)); 
        students.add(new Student(104, "Kiran", 75.5)); 
        students.add(new Student(102, "Bhavya", 88.0)); 
  
        System.out.println("===== STUDENT RECORDS ====="); 
        for (Student s : students) System.out.println(s); 
  
        Collections.sort(students); 
        System.out.println("\\n===== SORTED BY ROLL NUMBER ====="); 
        for (Student s : students) System.out.println(s); 
  
        Collections.sort(students, new NameComparator()); 
        System.out.println("\\n===== SORTED BY NAME ====="); 
        for (Student s : students) System.out.println(s); 
  
        System.out.println("\\n===== ITERATOR ====="); 
        Iterator<Student> it = students.iterator(); 
        while (it.hasNext()) System.out.println(it.next()); 
  
        Map<Integer, Student> map = new TreeMap<>(); 
        for (Student s : students) map.put(s.rollNo, s); 
        System.out.println("\\n===== STUDENT MAP ====="); 
        for (int r : map.keySet()) 
            System.out.println("Roll No: " + r + " -> " + map.get(r)); 
  
        int searchRoll = 102; 
        System.out.println("\\n===== SEARCH STUDENT ====="); 
        if (map.containsKey(searchRoll)) 
            System.out.println("Student found: " + map.get(searchRoll)); 
        else System.out.println("Student not found!"); 
  
        System.out.println("\\n===== RANDOMACCESS ====="); 
        if (students instanceof RandomAccess) { 
            System.out.println("ArrayList supports RandomAccess."); 
            System.out.println("Student at index 0: " + students.get(0)); 
            System.out.println("Student at index 2: " + students.get(2)); 
        } 
    } 
}