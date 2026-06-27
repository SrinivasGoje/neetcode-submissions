 class Solution {
      public int removeDuplicates(int[] nums) {

          // 'k' is where we will place the next unique number.
          // The first number (at index 0) is always unique,
          // so we start k at 1.
          int k = 1;

          // Start looking from the second number (index 1)
          // and go until the end of the array.
          for (int i = 1; i < nums.length; i++) {

              // If the current number is DIFFERENT from the one before it,
              // it means we found a new unique number.
              if (nums[i] != nums[i - 1]) {

                  // Place that unique number at position k...
                  nums[k] = nums[i];
  
                  // ...and move k forward so the next unique number
                  // goes in the next slot.
                  k++;
              }
              // If the numbers are the SAME, we do nothing (skip the duplicate).
          }

          // k is now the count of unique numbers.
          return k;
      }
  }