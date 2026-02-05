interface A{
    void ShowA();
}

interface B{
    void ShowB();
}

class C implements A,B{
    public void ShowA(){
        System.out.println("Display from A");
    }
    public void ShowB(){
        System.out.println("Display from B");
    }
}

public class Hybrid_Inter1{
    public static void main(String args[]){
        C c=new C();
        c.ShowA();
        c.ShowB();
    }
}