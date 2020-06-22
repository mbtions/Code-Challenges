class Solution 
{
    public int[] twoSum(int[] numbers, int target) 
    {
        int indices[]; // array to return indexes
        indices = new int [2]; //since we have to only return 2 indexes
         if(numbers.length < 2)
         {
             return null; // if array has less than 2 numbers then no sum hence no target therefore no indexes to return
         }
        
          for(int i = 0; i < numbers.length; i++)
          {
              for(int j = i+1; j < numbers.length; j++)
              {
                   if(numbers[i]+numbers[j] == target && i < j)  // if index1<index2 condition is also followed along with getting the target
                   {
                        indices[0] = i+1;
                        indices[1] = j+1;
                       
                       break;   // since we find both the indexes then terminating the loop and returning array of indices
                   }
              }
             
           }
        return indices;
    }
}
