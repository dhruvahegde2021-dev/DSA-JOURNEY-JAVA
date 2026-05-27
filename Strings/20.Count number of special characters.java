// Pattern: Strings
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int numberOfSpecialChars(String word) {
      Set<Character> a=new HashSet<>();
      Set<Character> b=new HashSet<>();
      int count=0;
      for(char c: word.toCharArray())
      {
        if(Character.isLowerCase(c))
            a.add(c);
        else
            b.add(Character.toLowerCase(c));
      }

      for(char c:a)
      {
        if(b.contains(c))
            count++;
      }
      return count;
    }
}