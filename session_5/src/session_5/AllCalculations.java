package session_5;

public class AllCalculations extends Factorial implements StaticCal {

		@Override
		public void add(int a,int b) {
			// TODO Auto-generated method stub
			int sum = a+b;
			System.out.println("Sum = "+sum);
		}

		@Override
		public int sub(int a, int b) {
			// TODO Auto-generated method stub
			return (a-b);
		}

		@Override
		public void avg(int a, int b) {
			// TODO Auto-generated method stub
			int avg =(a+b)/2;
			System.out.println("Average ="+avg);
			
		}

	}
