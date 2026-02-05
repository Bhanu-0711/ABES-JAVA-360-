class Recursion{
    static int factorialrecurssion(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*factorialrecurssion(n-1);
    }

    static int factorialiteration(int n){
        int result=1;
        for(int i=1;i<=n;i++){
            result=result*i;
        }
        return result;
    }
    public static void main(String args[]){
        int n=5;
        System.out.println("Factorial of the number "+n+" recursive is "+factorialrecurssion(n));
        //System.out.println(factorialrecurssion(n));
        System.out.println("Factorial of the number "+n+" iterative is "+factorialiteration(n));
        //System.out.println(factorialiteration(n));

    }
}