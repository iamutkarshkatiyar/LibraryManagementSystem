public class Student {
    int id;
    String name;

    Student(int id, String name){
        this.id=id;
        this.name=name;
    }
    void show_student_details(){
        System.out.println("Id="+id+"Name="+name);
    }

    static void main(String[] args) {
        Student s1=new Student(1,"Utkarsh");
    }
}
