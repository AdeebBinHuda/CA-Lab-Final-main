
public class SelectionSort {
   public static void main(String[] args) {
	  
	   int arr[]= {12,9,11,8,13,4,7,2};
	    
	   Sort(arr);
	   
	   System.out.println("After selection sort: ");
	   for(int i:arr) {
		   System.out.print(i+" ");
	   }
}
       public static void Sort(int[] arr) {
    	   for(int i=0;i<arr.length;i++) {
    		   int min_idx=i;
    		   for(int j=i+1;j<arr.length;j++) {
    			   if(arr[j]<arr[min_idx]) {
    				   min_idx=j;
    			   }
    			   
    			   //for finding the process
    			   for(int k=0;k<arr.length;k++) {
    		 			  System.out.print(arr[k]+" ");
    		 		  }
    		 		   System.out.println();
    		   }
    		   
    		   int temp= arr[i];
    		   arr[i]=arr[min_idx];
    		   arr[min_idx]=temp;		   
    	   }
    	   
    	   
       }
}
