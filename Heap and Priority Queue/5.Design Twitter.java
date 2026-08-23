// Pattern:Heap and Priority Queue
// Time Complexity: O(nlog n)
// Space Complexity: O(n)
class Twitter {
    int timestamp;
    Map<Integer,List<int[]>> tweets;
    Map<Integer,Set<Integer>> following;

    public Twitter() {
        timestamp=0;
        tweets=new HashMap<>();
        following=new HashMap<>();
    }
    
    public void postTweet(int userId, int tweetId) {
        tweets.computeIfAbsent(userId, k->new ArrayList<>()).add(new int[]{timestamp++,tweetId});
        return;
    }
    
    public List<Integer> getNewsFeed(int userId) {
        List<int[]> allTweets=new ArrayList<>();
        allTweets.addAll(tweets.getOrDefault(userId,new ArrayList<>()));
        for(int followeeId : following.getOrDefault(userId,new HashSet<>()))
        {
            allTweets.addAll(tweets.getOrDefault(followeeId,new ArrayList<>()));
        }
              
        allTweets.sort((a,b)-> b[0]-a[0]);
        List<Integer> res=new ArrayList<>();
        for(int i=0;i< Math.min(10,allTweets.size());i++)
        {
            res.add(allTweets.get(i)[1]);
        }
        return res;
    }
    
    public void follow(int followerId, int followeeId) {
        if(followerId==followeeId)
            return;
        following.computeIfAbsent(followerId,k->new HashSet<>()).add(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        if(following.containsKey(followerId))
           following.get(followerId).remove(followeeId);
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */