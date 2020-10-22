# Practice folder by Akshit

1. [Array Rotation]('/ArrayRotation.java')
2. [Array Rotation using Juggling Algorithm]('/JugglingAlgorithm.java')
(A Juggling Algorithm)
This is an extension of method 2. Instead of moving one by one, divide the array in different sets
where number of sets is equal to GCD of n and d and move the elements within sets.
If GCD is 1 as is for the above example array (n = 7 and d =2), then elements will be moved within one set only, we just start with temp = arr[0] and keep moving arr[I+d] to arr[I] and finally store temp at the right place.

Here is an example for n =12 and d = 3. GCD is 3 and
[Source]('https://www.geeksforgeeks.org/array-rotation/')
![Juggling Algorithm Explanation]('References/juggling.png')