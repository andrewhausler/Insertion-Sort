This project demonstrastes the use of insertion sort algorithm. This algorithm works by setting index 0 as the already sorted portion of the array. We begin iterating through the unsorted portion assigning the next unsorted index as the insertion. This index we must place it into the already sorted side of the array. To do this we must create a while loop checking comparing until another value is less than the insertion value or the indexes we are comparing to don't go past 0. Once that is done we have created an opening for the new index by shifting all the others one to the right. Now we finally insert that value in its correct spot and we can continue the process until all indexes have been fully sorted.