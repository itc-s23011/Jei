class PrimmeNumbers {
	public static void main(String[] args) {
		int min = Integer.parseInt(args[0]);
		int max = Integer.parseInt(args[1]);
		if (max < min) {
			int tmp = max;
			max = min;
			min = tmp;
		}

		PrimeNumbers primeNumbers = new PrimeNumbers();
		primeNumbers.initializePrimeNumbers(max);
		int[] part = primeNumbers.getPart(min, max);

		for(int prime : part){
			System.out.printf("%d, ", )
		}
	}
}

class PrimeNumbers {
	boolean[] isPrimeNumbers;
	
	void initializePrimeNumbers(int max) {


