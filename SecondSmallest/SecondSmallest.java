//This problem was given in class

public class SecondSmallest{

	public static void main(String[] args){

		//The array that needs to be searched
		int[] arr = {20, 1134, 13, 10};
		
		int secondMin = find2ndMin(arr);

		System.out.println("Second smallest value: " + secondMin);

	}

	private static int find2ndMin(int[] arr){

		//Dull values
		int min = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;
		
		//Finding the minimum
		for(int i=0; i<arr.length; i++){

			if(min>arr[i])
				min = arr[i];

		}


		//Finding the second minimum

		for(int i =0; i<arr.length; i++){

			if(Math.abs(arr[i]-min) != 0)
			secondMin = Math.min(secondMin,arr[i]);

		}

		/*
		
		It is done by searching the minimum in the array 
		whose difference between the initial minimum and it different than 0

		*/
		
		return secondMin;
		
	}
}