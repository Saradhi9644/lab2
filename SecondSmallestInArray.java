package COM;

public class SecondSmallestInArray {
	public static int getSecondSmallest(int[] a, int total){  
		int temp;  
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 2; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[1];
		}  
		public static void main(String args[]){  
		int a[]={2,4,6,8,7,9};  
		int b[]={34,66,55,27,33,86,13};  
		System.out.println("Second smallest: "+getSecondSmallest(a,3));  
		System.out.println("Second smallest: "+getSecondSmallest(b,4));  
		}}


