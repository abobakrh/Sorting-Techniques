package search_tech;


public class MergeSort {    
    public MergeSort() {
    }
 
     
     public  int[] Divide (int[] arr)
     {
         int[] Right;
         int[] Result;
         int s = 0;
         /* Our Base Case Of Stopping Recurrsion */
         if(arr.length <= 1)   /* if array has one or zero elements return the array*/
             return arr;
         else
         {
             int mid = arr.length/2;
             /* create left and right array after dividing */
             int[] Left = new int[mid];
             if(arr.length % 2 == 0)
             {
                  Right = new int[mid];
             }
             else
             {
                  Right = new int[mid+1];
             }
             /* Array To Hold The Sorted Numbers*/
             Result = new int[arr.length];
             for(int i=0;i<mid;i++)
             {
                 Left[i] = arr[i];
             }
             for(int i=mid;i<arr.length;i++)
             {
                 Right[s] = arr[i];
                 s++;
             }
             /* We Keep Dividing The Big Array Into Smaller Arrays Till We Have 1 Element In It*/
             Left = Divide(Left);
             Right = Divide(Right);
             /* After We Finish Dividing We Need To Merge Them*/
             Result = MergeSort(Left,Right);
             
         }
         return Result;
     }
     public int[] MergeSort (int[] L,int[] R)
     {
         /* Intializing 3 Counters For The 3 Arrays That We Have To Use Them As Pointers To Help Us Compare Each Element With Its Corresponding And Store Result*/
         int Lindex = 0;
         int Rindex = 0;
         int Resultindex = 0;
         /* Creating A Result Array Of Size = L + R...*/
         int[] Res = new int[L.length+R.length];
         /*This Condition Is For Having Elements To Compare In Each Of THe Left And Right Array */
         while(Lindex<L.length || Rindex<R.length)
         {
             if(Lindex<L.length && Rindex<R.length) /*Here The Limitation Is That We Must Have Elements In Both Arrays */
             {
                 if(L[Lindex] <= R[Rindex]) /*Comparing Elements If Element in Left is Smaller  */
                 {
                     Res[Resultindex] = L[Lindex];
                     Resultindex ++;
                     Lindex ++;
                 }
                 else
                 {
                     Res[Resultindex] = R[Rindex];
                     Resultindex ++;
                     Rindex ++;
                 }
             }
             else if (Lindex < L.length) /*Here We Have Only Elements On The Left Array And Nothing In Right One */
             {
                Res[Resultindex] = L[Lindex];
                Resultindex ++;
                Lindex ++;
             }
             else if (Rindex < R.length) /*Here We Have Elements On The Right Only */
             {
                 Res[Resultindex] = R[Rindex];
                 Resultindex ++;
                 Rindex ++;
             }
         }
         return Res;
     }
     
     


    
}