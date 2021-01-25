package search_tech;




/**
 *
 * @author WAGDY 7
 */
public class QuickSortImplementation { 
    
       
     int  partiition(int arr[],int low,int high)
    {
     int pivot=arr[high];
      int i=(low-1);
      for(int j=low;j<=high-1;j++)
      {if(arr[j]<=pivot)
     {
         i++;
         int temp =arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
         
       
         
     }
      
    } 
       
      int temp = arr[i+1];
      arr[i+1]=arr[high];
      arr[high]=temp;
      
      
      return i;
     }
     
   public void quick (int arr[],int low ,int high)
{
    
    
    if(low<high)
    {
        
        
        int part;
        part = partiition(arr, low, high);
        quick(arr, part+1, high);
        quick(arr, low, part-1);
        
        
    }
    
    
     
}}
    

