package ExercisesPartTwo;

public class PaintJob {

    public static void main(String[] args) {
        int bucketCount = 0;
        bucketCount = getBucketCount(3.4, 2.1, 1.5, 2);
        //bucketCount = getBucketCount(3.4,2.1,1.5);
        //bucketCount = getBucketCount(6.26, 2.2);
        System.out.println(bucketCount);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if(width <=0 || height <=0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double numberOfBuckets = 0;
        double area = width * height;
        numberOfBuckets = Math.ceil(area/areaPerBucket);
        return (int)(numberOfBuckets - extraBuckets);
    }
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        double numberOfBuckets = 0;
        if(width <=0 || height <=0 || areaPerBucket <= 0) {
            return -1;
        }
        double area = width * height;
        numberOfBuckets = Math.ceil(area/areaPerBucket);
        return (int)numberOfBuckets;

    }

    public static int getBucketCount(double area, double areaPerBucket) {
        double numberOfBuckets = 0;
        if(area <=0 || areaPerBucket <=0) {
            return -1;
        }
        numberOfBuckets = Math.ceil(area/areaPerBucket);

        return (int)numberOfBuckets;
    }
}
