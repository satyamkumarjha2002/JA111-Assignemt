public class PrintPrimeFactorial{
    static void mymethod(int num){
        if(num>=2&&num<=100){
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
        }else{
            System.out.println("Invailed Number");
        }
    }
    public static void main(String[] args){
        mymethod(12);
    }
}