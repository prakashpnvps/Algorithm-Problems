class MedianFinder {
    List<Integer> list;
    /** initialize your data structure here. */
    public MedianFinder() {
        list = new ArrayList<>();
    }
    
    public void addNum(int num) {
        list.add(num);
    }
    
    public double findMedian() {
        Collections.sort(list);
        int n = list.size();
        return n % 2 != 0 ? list.get(n/2) : (list.get(n/2-1)+list.get(n/2))*0.5;
    }
}
