public class Geom {
    //Write your code here
    public static double segmentLength(long x1, long y1, long x2, long y2) {
        long dx = x2 - x1;
        long dy = y2 - y1;
        
        return Math.sqrt(dx * dx + dy * dy);
    }
    
    public static double trianglePerimetr(long x1, long y1, long x2, long y2, long x3, long y3) {
        double a = segmentLength(x1, y1, x2, y2);
        double b = segmentLength(x2, y2, x3, y3);
        double c = segmentLength(x3, y3, x1, y1);
        
        return a + b + c;
    }
}