class Pair implements Comparable<Pair> {
	int val;
	int freq;
	
	Pair(int val, int freq) {
		this.val = val;
		this.freq = freq;
	}
	public int compareTo(Pair p) {
		if (this.freq == p.freq)
			return this.val - p.val;
		return this.freq - p.freq;
	}
}
class Solution {
	public ArrayList<Integer> topKFreq(int[] arr, int k) {
		// Code here
		Map<Integer, Integer> map = new HashMap<>();
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		ArrayList<Integer> ans = new ArrayList<>();
		
		for (int num:arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		
		for (int key : map.keySet()) {
			pq.offer(new Pair(key, map.get(key)));
			if (pq.size()>k)
				pq.poll();
		}
		
		while (!pq.isEmpty())
			ans.add(pq.poll().val);
		
		Collections.reverse(ans);
		
		return ans;
	}
}
