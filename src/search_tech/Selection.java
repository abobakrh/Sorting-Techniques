package search_tech;

public class Selection { 
    
    
    
    
    
    
    
  
    public Selection (){}
    
       
   
     /*public static void Swap(int x , int y)
     {
         int temp;
         temp = x;
         x = y;
         y = temp;
     }*/
    public  int[] SelectionSort(int[] arr)
    {
        int i = 0;  
        int j = 0;
        int Minimumindex = 0;
        for(i=0;i<arr.length-1;i++)
        {
            Minimumindex = i;
            for(j=i+1;j<arr.length;j++)
            {
                
                if(arr[j] < arr[Minimumindex])
                {
                    Minimumindex = j;
                }
            }
            int temp;
            temp = arr[Minimumindex];
            arr[Minimumindex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}

    
