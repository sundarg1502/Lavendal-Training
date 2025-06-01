package Assignment7;

public class Student {
    int rno;
    String name;

    Student(int rno,String name){
        this.rno = rno;
        this.name = name;
    }
    Student(int rno){
        this.rno = rno;
        this.name = "Unknown";
    }

    public void display(){
        System.out.println("Roll Number : "+rno+" Name : "+name );
    }
    public static void main(String[] args){
        Student s1 = new Student(101,"AAAA");
        Student s2 = new Student(101);

        s1.display();
        s2.display();
    }
}
