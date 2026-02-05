class Method{
    int add(int a,int b){
        test.add(a,b,30);
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String args[]){
        Method test=new Method();
        System.out.println(test.add(10,20));
    }
}