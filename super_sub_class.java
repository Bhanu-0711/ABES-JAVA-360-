class Super{
    String name;
    int age;
    void displaysuper(){
        System.out.println("Name "+name);
        System.out.println("Age "+age);
    }
}
class Sub extends Super{
    int rollno;
    void displaysub(){
        System.out.println("Roll No. "+rollno);
    }
}

public class super_sub_class{
    public static void main(String args[]){
        Sub s=new Sub();
        s.name="Bhanu";
        s.age=21;
        s.rollno=101;
        s.displaysub();
        s.displaysuper();
    }
}