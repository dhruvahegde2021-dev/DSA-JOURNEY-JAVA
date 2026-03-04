// Pattern: Arrays
// Time Complexity: O(2n)=O(n)
// Space Complexity: O(n)
class Sol {
    public static int search(int n, int arr[]) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        for(int j:map.keySet())
        {
            if(map.get(j)!=2)
                return j;
        }
        return -1;
        
    }
}