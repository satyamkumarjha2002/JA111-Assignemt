package question4;

public class Main {
public int findFact(int num) {
	int fact=1;
	for(int i=1;i<=num;++i) {
		
		fact=fact*i;
	}
	return fact;
}
	public static void main(String[] args) {
		Main mai = new Main();
		byte len = (byte) args.length;
		switch (len) {
		case 1:
			int num=Integer.parseInt(args[0]);//for converting string to Number;
            System.out.println(mai.findFact(num));
			break;
		case 2:
             int diff=0;
             diff=Math.abs(Integer.parseInt(args[0])-Integer.parseInt(args[1]));//Converting string to array and finding difference;
             System.out.println(mai.findFact(diff));
			break;

		default:
			System.out.println("Error");
			break;
		}

	}

}
