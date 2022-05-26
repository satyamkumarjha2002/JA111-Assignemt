package question3;

public class Main {
	public int[] findAndReturnPrimeNumbers(int[] inputArray) {
		int length = 0;
		int index = 0;

		for (int i = 0; i < inputArray.length; ++i) {
			int count = 0;
			for (int j = 2; j < inputArray[i]; ++j) {
				if (inputArray[i] % j == 0) {
					++count;
				}
			}
			if (count == 0) {
				++length;
			}
		}
		int[] primeArray = new int[length];
		for (int i = 0; i < inputArray.length; ++i) {
			int count = 0;
			for (int j = 2; j < inputArray[i]; ++j) {
				if (inputArray[i] % j == 0) {
					++count;
				}
			}
			if (count == 0) {
				primeArray[index] = inputArray[i];
				++index;
			}
		}
		return primeArray;
	}

	public static void main(String[] args) {
		Main objMain = new Main();
		int[] arr = { 10, 12, 5, 50, 11, 14, 15 };
		int[] primearray = objMain.findAndReturnPrimeNumbers(arr);
		if (primearray.length > 0) {
			for (int num : primearray) {
				System.out.println(num);
			}
		} else {
			System.out.println("Prime number not found in the supplied Array");
		}
	}
}
