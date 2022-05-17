public class Total_run{
    static void mymethod(int one,int two,int three,int four,int five,int six){
         int total_run=0;
         total_run=one+two*2+three*3+four*4+five*5+six*6;
         System.out.println(total_run);
    }

    public static void main(String[] args){
        mymethod(1,1,1,1,1,1);
    }
}