package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    Student students[] = new Student[100];

    public  boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return s1.getGroup()==s2.getGroup();
    }

    void studentsByGroup() {
        // TODO:
        int n = students.length;
        for(int i=0;i<n;i++)
        {
            if(this.students[i].getGroup().equals("INT 22041"))
            {
                System.out.println(this.students[i].getInfo());
            }
            else if(this.students[i].getGroup().equals("INT 22042"))
            {
                System.out.println(this.students[i].getInfo());
            }
        }
    }

    void removeStudent(String id) {
        // TODO:
        int vitri = 0 , n = students.length;
        for(int i=0;i<n;i++)
        {
            if(this.students[i].getId().equals(id))
            {
                vitri = i;
                break;
            }
        }
        for(int i = vitri ; i<n-1;i++)
        {
            this.students[i] = this.students[i+1];
        }
        this.students[n-1] = null;
        n--;
    }

    public static void main(String[] args) {
        // TODO:
        Student hocSinh1 = new Student();

	Student hocSinh2 = new Student("do" , "555" , "do@vnu.edu.vn");

	Student hocSinh3 = new Student(hocSinh2);

     StudentManagement st = new StudentManagement();

    st.students[0]= new Student();
     st.students[0].setName("dung");
     st.students[0].setId("111");
     st.students[0].setGroup("INT 22041");
     st.students[0].setEmail("dung@vnu.edu.vn");

    st.students[1] = new Student();
     st.students[1].setName("do dung");
     st.students[1].setId("222");
     st.students[1].setGroup("INT 22041");
     st.students[1].setEmail("dung@vnu.edu.vn");

     st.students[2] = new Student();
     st.students[2].setName("xuan dung");
     st.students[2].setId("333");
     st.students[2].setGroup("INT 22042");
     st.students[2].setEmail("dung@vnu.edu.vn");

     System.out.println(st.sameGroup(hocSinh1,hocSinh2) + "\n"+ st.sameGroup(hocSinh2,hocSinh3));
     st.removeStudent("333");
     System.out.println("danh sach luc sau : " + "\n");
     st.studentsByGroup();

    }

}
