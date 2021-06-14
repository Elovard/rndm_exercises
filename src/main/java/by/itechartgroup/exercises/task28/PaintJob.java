package by.itechartgroup.exercises.task28;

public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets <= 0) {
            throw new IllegalArgumentException("zero argument");
        }
        double totalArea = width * height;
        double totalBuckets = totalArea / areaPerBucket;
        double result = totalBuckets - extraBuckets;
        return (int) Math.round(result);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            throw new IllegalArgumentException("zero argument");
        }
        double totalArea = width * height;
        double totalBuckets = totalArea / areaPerBucket;
        return (int) Math.round(totalBuckets);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            throw new IllegalArgumentException("zero argument");
        }
        double result = area / areaPerBucket;
        return (int) Math.ceil(result);
    }
}
