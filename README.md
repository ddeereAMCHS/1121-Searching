# Searching

### No Googling the linear search algorithm or the binary search algorithm

- Create a program called `Searching.java`
- Create a function that implements the linear search algorithm
  - This function should take an array of ints and a target int value
  - This function should return the index of the target value or -1 if the value is not in the array
  - This function should also return the number of comparisons made to find the target value
    - Think through how you would return two different things
- Create a function that implements the binary search algorithm
  - This function should take an array of ints and a target int value
  - This function should return the index of the target value or -1 if the value is not in the array
  - This function should also return the number of comparisons made to find the target value
    - Think through how you would return two different things
- In the main method: 
  - Prompt the user for a number
    - This will be the number of elements the user enters
  - Prompt the user for that many numbers and store them in an array
  - Prompt the user for a target value to search for
  - Call the linear search function with the array and target value
  - Sort the array and call the linear search function again
  - Call the binary search function with the array and target value
  - Print the index of the target value and the number of comparisons made from calling the unsorted linear search function
  - Print the index of the target value and the number of comparisons made from calling the sorted linear search function
  - Print the index of the target value and the number of comparisons made from calling the binary search function

Example Input:\
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
19\
Example Output:\
8 9\
5 6\
5 3
