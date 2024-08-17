import random

# Class Insertion
class Insertion:
    
    # Default Constructor
    # Sets The List With A Length Of 5 Random Numbers
    def __init__(self):
        self.unsortedList = [random.randint(0, 21) for i in range(5)]
    # Method Sort
    # Sorts The List Using Insertion Sort Algorithm
    def sort(self):
        # Begin Iterating From Index 1 To The Remaining Length Of The List
        for i in range(1, len(self.unsortedList)):
            # Key Is The Data We Want To Have Inserted Into The Already Sorted Portion Of The List
            key = self.unsortedList[i]
            # J Is The Index We Will Start Comparing With To See If Swapping Is Needed
            j = i-1

            # Checking To See If It Doesn't Cause Index Out Of Bounds With -1
            # Checking If Key Value Is Less Than The Already Sorted Values
            while(j>=0 and key < self.unsortedList[j]):
                # Sets The Index Ahead To The Same Value
                self.unsortedList[j+1] = self.unsortedList[j]
                # Brings J By 1 Index To Compare The Next Lower Index
                j -= 1
            # Once Loop Is Done Key Was Holding The Temporary Value Now Equals That Index
            self.unsortedList[j+1] = key
    # Displays Object As String Rather Than Object Memory Address
    def __str__(self):
        return f"{self.unsortedList}"

if __name__ == "__main__":
    unsortedList = Insertion()
    print(f"Unsorted List: {unsortedList}")
    unsortedList.sort()
    print(f"Sorted List: {unsortedList}")