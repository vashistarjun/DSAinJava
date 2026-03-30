class Solution {
    class pair{
        String word;
        int step;
        pair(String word,int step){
            this.word=word;
            this.step=step;
        }

    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set= new HashSet<>(wordList);
        if(!set.contains(endWord)) return 0;
        Queue<pair> queue= new LinkedList<>();
        queue.add(new pair(beginWord,1));
        while(!queue.isEmpty()){
            pair poll=queue.poll();
            String word=poll.word;
            int step=poll.step;
            if(word.equals(endWord)) return step;
            for(int i=0;i<word.length();i++){
                for(char ch='a';ch<='z';ch++){
                    char [] replace=word.toCharArray();
                    replace[i]=ch;
                    String wordcreated= new String(replace);
                    if(set.contains(wordcreated)){
                        queue.add(new pair(wordcreated,step+1));
                        set.remove(wordcreated);
                    }
                }
            }
        }
        return 0;
    }
}