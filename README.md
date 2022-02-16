# Searching

### No Googling the linear search algorithm or the binary search algorithm

- Create a program called `Searching.java`
- Create a function that implements the linear search algorithm
  - This function should take an array of ints and a target int value
  - This function should return the index of the target value or -1 if the value is not in the array
- Create a function that implements the binary search algorithm
  - This function should take a sorted array of ints and a target int value
  - This function should return the index of the target value or -1 if the value is not in the array
- In the main method: 
  - Prompt the user for a filename
  - The first line in the file will be how many numbers are in the rest of the file
  - Read in all the numbers and store them in an array
  - Prompt the user for a target value to search for
  - Call the linear search function with the array and target value
  - Sort the array and call the linear search function again
  - Call the binary search function with the array and target value
  - Print the index of the target value made from calling the linear search function on the unsorted array
  - Print the index of the target value made from calling the linear search function on the sorted array
  - Print the index of the target value made from calling the binary search function

***Example Input:***\
input1.txt\
19\
***Example Contents of input1.txt:***\
10\
3\
7\
2\
17\
30\
24\
85\
44\
19\
1\
***Example Output:***\
Linear search (unsorted): 8\
Linear search (sorted): 5\
Binary search: 5

- - - - - - - - - - - - 

## Extra Credit

- For your linear search function, make it so that it also returns the number of comparisons made to find the target value
    - Think through how you would return two different values
- For your binary search function, make it so that it also returns the number of comparisons made to find the target value
    - Think through how you would return two different values
