class Solution {
    class Pair{
        String word;
        int count;
        Pair(String word,int count){
            this.word=word;
            this.count=count;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set= new HashSet<>(wordList);
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(beginWord,1));
        while(!queue.isEmpty()){
            Pair poll=queue.poll();
            String word=poll.word;
            int count=poll.count;
            if(word.equals(endWord)) return count ;
            for(int i=0;i<word.length();i++){
                for(char ch='a' ; ch<='z';ch++){
                    char[] replaced=word.toCharArray();
                    replaced[i]=ch;
                    String newWord= new String(replaced);
                    if(set.contains(newWord)){
                        queue.add(new Pair(newWord,count+1));
                        set.remove(newWord);
                    }
                }
            }
        }
        return 0;
    }
}