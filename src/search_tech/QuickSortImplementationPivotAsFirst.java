package search_tech;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WAGDY 7
 */
public class QuickSortImplementationPivotAsFirst { 

    public QuickSortImplementationPivotAsFirst() {}
    
    
    public  int  partiition(int arr[],int low,int high)
    {
     int pivot= low ;
      int i=(low);
      int j =high;
       while(i<j)  
     {  
          while((arr[i] <= arr[ pivot ]) &&i<high)  
          {  
             i++;  
          }  
          while(arr[j] > arr[pivot])  
          {  
             j--;  
          }  
         if(i<j)  
         {  
            int  temp=arr[ i ];  
             arr[ i ] = arr[ j ];  
             arr[ j ] = temp;  
         }
           
     }  
         int  temp=arr[ pivot ];  
     arr[ pivot ] = arr[ j ];  
     arr[ j ] = temp;  
     return j; 
    
    
    
    
    
    
    }
     
void quick (int arr[],int low ,int high)
{
    
    
    if(low<high)
    {
        
        
        int part;
        part = partiition(arr, low, high);
        quick(arr, part+1, high);
        quick(arr, low, part-1);
        
        
    }
    
    
    }}
    
    
    

