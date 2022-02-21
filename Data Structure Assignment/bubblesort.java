class BubbleSort{

    public int[] bubbleSort(int arr[]) {
    	int temp;
    	for(int i=0;i<15;i++)
    	{
    		for(int j=i+1;j<15;j++) {
    			if(arr[i]>arr[j]) {
    				temp=arr[i];
    				arr[i]=arr[j];
    				arr[j]=temp;
    			}
    		}
    		
    	}
    	return arr;
    }
}
 class Assignment1Q8 {
    public static void main(String args[]) {
        int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        
        BubbleSort x=new BubbleSort();
        int y[]=x.bubbleSort(arr);
        
        System.out.println("sorted array  ");
        for(int i=0;i<15;i++) {
        	System.out.println(y[i]+"\t");
        }
        
    }
}