import java.util.Scanner;
public class SortArray{
	public static void mergeSort(int[] arr, int L, int R){
		if (L < R){
			int M = (L+R)/2;
			mergeSort(arr,L,M);
			mergeSort(arr,M+1,R);
			merge(arr,L,M,R);
		}
	}
	
	public static void merge(int[] arr, int L, int M,int R){
		int[] arrC = new int[R+1];
		int i = L;
		int j = M+1;
		for (int k = L; k <= R; k++){
			if (i>M) {arrC[k] = arr[j]; j++;}
			else if (j>R) {arrC[k] = arr[i]; i++;}
			else{
				if (arr[i] > arr[j]){
					arrC[k] = arr[j];
					j++;
				} else{
					arrC[k] = arr[i];
					i++;	
				}
			}
		}
		for (int k = L; k<=R; k++){arr[k] = arrC[k];}
	}
	public static void main (String args[]){
		// Take the array input:
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the length of array: ");
		int len = keyboard.nextInt();
		int[] arr = new int[len];
		System.out.print("Enter the elements of your array: ");
		for (int i=0; i < len; i++){
			arr[i] = keyboard.nextInt();
		}
		
		// Sort array:
		mergeSort(arr,0, len-1);
		
		//Compute sum and print: 
		int sum = 0;
		String result ="";
		for (int i = 0; i < len; i++){
			result += arr[i] + " ";
			sum += arr[i];
		}
		System.out.println("The sorted array:" + result);
		System.out.println("The sum and averge value of array is:" + sum + " " + sum/len);
		
	}
}
