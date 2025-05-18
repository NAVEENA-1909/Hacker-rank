import java.util.*;
class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
    static Comparator<Student> sort = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            if(o1.cgpa > o2.cgpa)
                return -1;
            if(o1.cgpa < o2.cgpa)
                return 1;
            if(o1.fname.compareTo(o2.fname) > 0)
                return 1;
            if(o1.fname.compareTo(o2.fname) < 0)
                return -1;
            if(o1.id > o2.id)
                return -1;
            if(o1.id < o2.id)
                return 1;
            return 0;
        }
    };
}

//Complete the code
public class Solution
{
   public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();

        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);
            testCases--;
        }


        Collections.sort(studentList, Student.sort);
        for(Student st: studentList){
            System.out.println(st.getFname());
            //System.out.println(st.getId() +" " + st.getFname() + " " + st.getCgpa());
        }
    }
}
