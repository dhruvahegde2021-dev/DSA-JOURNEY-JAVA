// Pattern: Arrays
// Time Complexity: O(n + log n)
// Space Complexity: O(n)
class Solution {
    public int secondHighest(String s) {
        LinkedHashSet <Integer> st=new LinkedHashSet<>();
        for(Character c:s.toCharArray())
        {
            if(Character.isDigit(c))
                st.add(Character.getNumericValue(c));
        }
        List<Integer> ls=new ArrayList<>(st);
        Collections.sort(ls);
        int a=-1;
        if(ls.size()==1)
        {
            return -1;
        }
        if(ls.size()>=2)
                 {
                    Integer secondLast=ls.get(ls.size()-2);
                    a=secondLast;
                 }                   
        return a;
    }
}                                                                