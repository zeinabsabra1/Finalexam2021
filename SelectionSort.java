
public class SelectionSort {
	public static void sort( int arr[] ){
        int N = arr.length;
        int i, j, pos, temp;
        for (i = 0; i < N; i++)
        {
        	/*first mistake pos=j
        	 * it is equal to i*/
        
            pos = i;
            /*second mistake j goes to N
             * not N-1
             */
            for (j = i+1; j < N; j++)
            {
                if (arr[j] < arr[pos])
                {
                    pos = j;
                }
            }
            /* Swap arr[i] and arr[pos] */
            temp = arr[i];
            arr[i] = arr[pos];
            arr[pos]= temp;            
        }        
      }

	public void basicSelectionSort(int[] arr)
	{
		// TODO Auto-generated method stub
int all_positive[]= {10,5,8,1,25,3,69,96,32,15};
sort(all_positive);
for(int i:all_positive)
	System.out.print(i+" ");
System.out.println();

int all_negative[]= {-10,-5,-8,-1,-25,-3,-69,-96,-32,-15};
sort(all_negative);
for(int i:all_negative)
	System.out.print(i+" ");
System.out.println();

int mix_positive_negative[]= {-10,5,-8,1,-25,3,-69,96,-32,15};
sort(mix_positive_negative);
for(int i:mix_positive_negative)
	System.out.print(i+" ");

	}
}
