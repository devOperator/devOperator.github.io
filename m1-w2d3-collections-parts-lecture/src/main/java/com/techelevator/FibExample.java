
public class FibExample {

	public static void main(String[] args) {
	
		long startTime = System.nanoTime();
		
		Fibonacci(50);
		//FibExercise(50);
		long endTime = System.nanoTime();
		
		long duration = (endTime - startTime);
		
		System.out.println("Duration: " + duration);

	}

	private static void FibExercise(int highValue) {
		int[] fibSeq = new int[highValue];
		fibSeq[0] = 0;
		fibSeq[1] = 1;
		int lastValue = 0;
		for (int i = 2 ; i < highValue; i++) {
			lastValue = fibSeq[i - 1] + fibSeq[i - 2];
			fibSeq[i] = lastValue;
		}
		
//		for (int i : fibSeq) {
////			if (i < highValue) {
////System.out.print(i + " ");
////			} else {
////				break;
////			}
//		}
	}
	
	private static int Fibonacci(int number)
	{
	    if (number <= 1) return number;

	    return Fibonacci(number - 2) + Fibonacci(number - 1);
	}

	
}
