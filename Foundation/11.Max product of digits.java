// Pattern: Maths
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int maxProduct(int n) {
        int largest=0;
        int secondLargest=0;
        while(n!=0)
        {
            int digit=n%10;
             n=n/10;
            if(digit>=largest)
            {
                secondLargest=largest;
                largest=digit;
            }
            else if(digit > secondLargest)
            {
                secondLargest=digit;
            }
        }
        return (largest*secondLargest);
    }
}