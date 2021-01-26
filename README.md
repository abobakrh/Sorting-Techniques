# Sorting-Techniques
A Sorting Algorithm is used to rearrange a given array or list elements according to a comparison operator on the elements.
The comparison operator is used to decide the new order of element in the respective data structure.

 ## comparision between sorting tech
 <p align="center">
   <img src="http://www-scf.usc.edu/~zhan468/public/Notes/resources/5F2F2130A480467D3A92AFA78F128E06.png">
  </p>
  
 ## Marge Sort 
  
* Merge sort takes advantage of the ease of merging already sorted lists into a new sorted list
* Advantage: Stable, worst time complexity is O(n log n)
* Disadvantage: O(n) space complexity
  <img src="http://www-scf.usc.edu/~zhan468/public/Notes/resources/CDDA3F11C6EFBC01577F5C29A9066772.gif">
  </p>

## Inserstion Sort 

insertion sort is a simple sorting algorithm that works similar to the way you sort playing cards in your hands. The array is virtually split into a sorted and an unsorted part.
Values from the unsorted part are picked and placed at the correct position in the sorted part.  

 <p align="center">
  <img src="http://www-scf.usc.edu/~zhan468/public/Notes/resources/91B76E8E4DAB9B0CAD9A017D7DD431E2.gif">
  </p>
  

## Quick  Sort 

* divide and conquer, pivot, shuffle
* Advantage: quick
* Disadvantage: not stable, space complexity is log(n) on average, worst time complexity is O(n^2)
 <p align="center">
  <img src="http://www-scf.usc.edu/~zhan468/public/Notes/resources/C411339B79F92499DCB7B5F304C826F4.gif">
  </p>
  
  
## Selection Sort

* The selection sort works by repeatedly going through the list of items, each time selecting an item according to its ordering and placing it in the correct position in the sequence
* advantage :it performs well on a small list. Furthermore, because it is an in-place sorting algorithm.
* disadvantage poor efficiency when dealing with a huge list of items. Similar to the bubble sort,
  
  <p align="center">
  <img src="http://www-scf.usc.edu/~zhan468/public/Notes/resources/1C7E20F306DDC02EB4E3A50FA7817FF4.gif">
  </p>

## Bubble Sort  

* Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
* advantage :it is popular and easy to implememnt
* disadvantage :complexity is n^2 
<p align="center">
  <img src="http://www-scf.usc.edu/~zhan468/public/Notes/resources/33A947C71AD62B254CAB62E5364D2813.gif">
  </p>
  
  
 ## Heap sort (the best)
* Min heap & Max heap, finding the next largest element takes O(log n) time
* Advantage: O(n log b) time complexity, O(1) space complexity
* Disadvantage: not stable, need to create a heap
  <p align="center">
  <img src="http://www-scf.usc.edu/~zhan468/public/Notes/resources/7073C729230E1A2C3C3C9207B25F6B43.gif">
  </p>
 # How to run 
 1 Run newmain.java 
 2 enter if you want to show the execution time of sorting 1000 element or sort a specific array
 3 if select 2, you should enter  your specific array
 
 
 
 Thank you ! 
