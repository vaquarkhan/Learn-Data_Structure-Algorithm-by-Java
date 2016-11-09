public class Main 
{
	// Prints the array 
    private static void printList(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
	public static void main(String[] args) 
	{
		Bubble bubble = new Bubble();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        bubble.sort(arr);
        //bubble.modified_sort(arr);
        System.out.println("Sorted array");
        printList(arr);
	}

}
