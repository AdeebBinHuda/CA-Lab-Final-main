
public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {5,1,4,8,4,6,7};
        InsertionSort(arr);
        
        for(int i:arr) {
        	System.out.println(i);
        }
	}
	public static void InsertionSort(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			int key=arr[i];
			int j;
			for( j=i-1;j>=0 && arr[j]>key;j--) {
		
					arr[j+1]=arr[j];
				
			}
			arr[j+1]=key;
			
			//print the array after each insertion
			System.out.println("Afer insertion element:"+ key+" :");
			printArray(arr);
		}
	}
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
