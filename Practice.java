/*public class MaxInArray {
    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7, 6};
        System.out.println("Maximum: " + findMax(numbers)); // Output: 9
    }
}
*/
public class Practice {
    public static void main(String[] args0) {
        double currentCGPA = 7.7;
        boolean hasDailyCodingDiscipline = true;
        
        System.out.println("--- Checking Future package Eligibility ---");

        if (currentCGPA >= 7.5 && hasDailyCodingDiscipline == true) {
            System.out.println("Results: YOU are on track for the 30+ LPA trajectory!");
        } else if (currentCGPA >= 7.5 && hasDailyCodingDiscipline == false) {
            System.out.println("Results: Danger! High potential ,but lack of consistency will drop you to Tier-4 placement levels.");
        }else  {
            System.out.println("Results: Immediate academic correction required to .Keep CGPA above 7.5.");
            
        }
    }
}