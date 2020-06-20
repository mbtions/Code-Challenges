class Solution 
{
    public int[] twoSum(int[] numbers, int target) 
    {
        int indices[];
        indices = new int [2]; //since we have to only return 2
         if(numbers.length < 2)
         {
             return null;
         }
        
          for(int i = 0; i < numbers.length; i++)
          {
              for(int j = i+1; j < numbers.length; j++)
              {
                   if(numbers[i]+numbers[j] == target && i < j)
                   {
                        indices[0] = i+1;
                        indices[1] = j+1;
                       
                       break;
                   }
              }
             
           }
        return indices;
    }
}