// Pattern: Arrays
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> ls=new ArrayList<>();
        int maxEle=arr[arr.length-1];
        ls.add(maxEle);
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]>=maxEle)
            {
                maxEle=arr[i];
                ls.add(maxEle);
            }
        }
        Collections.reverse(ls);
        return ls;
    }
}
