class access_modifier{
    public int a=10;
    private int b=20;
    protected int c=30;
    int d=40;
    void show(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    void summ(){
        System.out.println(a+b);
    }

    public static void main(String args[]){
        access_modifier acc=new access_modifier();
        acc.show();
        access_modifier ssum=new access_modifier();
        ssum.summ();
    }
}