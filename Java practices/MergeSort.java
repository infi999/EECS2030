package test;

public class MergeSort {
	
	
private static void sort(int[]array){
	int[]buffer = new int[array.length];
	split(array, 0, array.length, buffer);
}	







private static void split(int[] array, int indexS, int indexE, int[] buffer) {
	// TODO Auto-generated method stub
	if(indexE - indexS < 2){
		return;
}

int indexM = (indexE + indexS)/2;

split(array, indexS, indexM, buffer);
split(array, indexM, indexE, buffer);
merge(array, indexS, indexM, indexE, buffer);
copy(buffer, indexS, indexE, array);

}

	
	
	
	
	private static void copy(int[] buffer, int indexS, int indexE, int[] array) {
	// TODO Auto-generated method stub
	int i = 0;
	for( i = indexS; i < indexE; i++){
		array[i] = buffer[i];
	}
}







	private static void merge(int[] array, int indexS, int indexM, int indexE, int[] buffer) {
	// TODO Auto-generated method stub
	int i, j, k = 0;
	i = indexS; j = indexM;
	for (k = indexS; k < indexE; k++){
		
	
	if(i < indexM &&( j >= indexE || array[i] <= array[j])){
		buffer[k] = array[i];
		i++;
	}else{
		buffer[k] = array[j];
		j++;
	}}
		
		
		
}







	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int[] array = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		MergeSort.sort(array);
		System.out.print("MergeSorted: ");
		for (int i : array)
		{
		    System.out.print(i + " ");
		}
		System.out.println("");
	}

}
