public class student {
    int id;
    String name;

    student(int id,String name){
        this.id=id;
        this.name=name;
    }
    void show_student_details(){
        System.out.println("Id="+id+"Name="+name);
    }

    static void main(String[] args) {
        student s1=new student(1,"Utkarsh");
    }
}
