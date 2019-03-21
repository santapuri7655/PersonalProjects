package Arrays;

public class LectureExamples {

    public static void main(String[] args) {

        int[] myIntValues = new int[23];//{21,22,23,26,67,76,54,46,79,90};

        for(int i=0; i<myIntValues.length; i++) {
            myIntValues[i] = i*10;
        }

        for(int i=0; i<myIntValues.length; i++) {
            System.out.println("element at position " + i + " is: " + myIntValues[i]);
        }
    }
}
