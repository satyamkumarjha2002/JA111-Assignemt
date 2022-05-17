public class Sum_1_to_N{
    static void mymethod(int num){
        int sum=0;
        for(int i=1;i<=num;i++){
             sum=sum+i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        mymethod(10);
    }
}