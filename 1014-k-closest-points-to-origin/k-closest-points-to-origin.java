class Solution {
    public class Point implements Comparable<Point>{
            int x ;
            int y;
            double distance;
            int i;

            // constructor initalization
            public Point(int x,int y,double distance ,int i){
                this.x = x;
                this.y = y;
                this.distance = distance;
                this.i = i;
            }
            @Override
            public int compareTo(Point p1){
                // sort the data on the basics of distance value
                // in Ascending Order
                return Double.compare(this.distance,p1.distance);
            }
        }
    public int[][] kClosest(int[][] points, int k) {
        //1.Build of minheap
        PriorityQueue<Point> minHeap =  new PriorityQueue<>();
        for(int i=0;i<points.length;i++){
            // Euclidean distance formula
            double distance = Math.sqrt(points[i][0] * points[i][0] + points[i][1]*points[i][1]);
            minHeap.add(new Point(points[i][0],points[i][1],distance,i));
        }
        //2.Deletion until k number of times
        int result[][] = new int[k][];
        for(int i=0;i<k;i++){
            Point point = minHeap.remove();
            result[i] = new int[]{points[point.i][0],points[point.i][1]};
        }
        return result;
    }
}