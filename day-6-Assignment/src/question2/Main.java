package question2;

public class Main {

	public static void main(String[] args) {
		int[][] array= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
				};
		
		for(int i=0;i<array[0].length;++i) {
			int sum=0;
			for(int j=0;j<array.length;++j) {
				if(array[j][i]%2==0) {
					sum=sum+array[j][i];
				}
				
			}
			System.out.println(sum);
		}
	}


}
