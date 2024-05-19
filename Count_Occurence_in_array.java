//package Binary;

public class Count_Occurence_in_array 
{
    public static void main(String[] args) 
    {
        int arr[] = {1, 1, 2, 2, 2, 2, 2, 3};
        int low = 0 , high = (arr.length)-1;
        int target=2;
        int last_index = find_count_last_occurence_in_array(arr,low,high,target);
        int first_index = find_count_first_occurence_in_array(arr,low,high,target);
        System.out.println(target+ " is occurring "+((first_index-last_index)+1)+" in the given array so it is our answer" );
        
    }   
    public static int find_count_last_occurence_in_array(int arr[], int low, int high, int Target)
    {
    	int last_index = -1;
    	while(low<=high)
    	{
    		int mid =(low+high)/2;
    		if(arr[mid]==Target)
    		{
    			last_index=mid;
    			high=high-1;
    		}
    		else {
				low=mid+1;
			}
    	}
    	return last_index;
    }
    public  static int find_count_first_occurence_in_array(int arr[], int low, int high, int Target)
    {
		int first_index=-1;
		while(low<=high) 
		{
			int mid=(low+high)/2;
			if(arr[mid]==Target)
			{
				first_index=mid;
				low=mid+1;
			}
			else {
				low=mid+1;
				
			}
		
		}
		return first_index;
	}
    
}
