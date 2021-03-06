class Solution {
    public ArrayList<Integer> findKMaxElements(int[] nums, int k) {
        //intialize the min heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i=0;
        for(int num : nums){
            pq.add(num);
            i++;
            //when size of priority queue is bigger than k pop the top elements
            if (i > k) pq.poll();
        }
        Iterator iterator = pq.iterator(); 
        ArrayList<Integer> ans=new ArrayList<>();
        while (iterator.hasNext()) 
        { 
            //add all remaining elements in heap to our ans.
            ans.add(iterator.next()); 
        } 
        
        return ans();
    }
}
