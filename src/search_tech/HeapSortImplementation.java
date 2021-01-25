package search_tech;

public class HeapSortImplementation {

    public HeapSortImplementation() {
    }
    
    
 void heapify(int arr[], int n, int i) {
        int largest = i;  
        int l = Left(i);
        int r = Right(i); 

        // If left child is larger than root 
        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }

        // If right child is larger than largest so far 
        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }

        // If largest is not root 
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree 
            heapify(arr, n, largest);
        }

    }

     void BuildMax(int arr[]) {

        for (int k = (arr.length) / 2; k >= 0; k--) {

            heapify(arr, arr.length, k);
        }
    }
 void HeapSort(int arr[]) {

        BuildMax(arr);

        for (int counter = arr.length - 1; counter >= 0; counter--) {

            int temp = arr[0];
            arr[0] = arr[counter];
            arr[counter] = temp;

            heapify(arr, counter, 0);
        }
    }

   int Left(int parent) {

        return 2 * parent + 1;
    }
 int Right(int parent) {

        return 2 * parent + 2;
    }

}    
    
    
    
    
    
