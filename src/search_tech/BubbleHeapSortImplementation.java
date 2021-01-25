package search_tech;



public class BubbleHeapSortImplementation {
    
    
    
    
  void BubbleSort(int a[]) {

		int smallest =0;
                
		for (int i = a.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {

				if (a[j] > a[j + 1]) {
					smallest = a[j + 1];
					a[j + 1] = a[j];
					a[j] = smallest;
				}

			}
		}}}

	

    

