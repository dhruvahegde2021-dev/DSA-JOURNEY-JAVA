// Pattern: Arrays
// Time Complexity: O(2n)=O(n)
// Space Complexity: O(n)
class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[]b) {
        HashSet<Integer> st1= new LinkedHashSet<>();
        for(Integer i:a)
            st1.add(i);
        for(Integer j:b)
            st1.add(j);
        ArrayList<Integer> res=new ArrayList<>(st1);
        return res;
        
    }
}