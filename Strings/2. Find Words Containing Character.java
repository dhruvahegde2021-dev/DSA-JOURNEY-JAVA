// Pattern: Strings
// Time Complexity: O(n)
// Space Complexity: O(n)
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> a=new ArrayList<>();
        int i=0;
        while(i<words.length)
        {
            if((words[i].indexOf(x))!=-1)
                a.add(i);
            i++;
        }
        return a;
    }
}