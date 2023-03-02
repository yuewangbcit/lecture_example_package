package src.week8;

public class ExceptionExamples {


    public static void main(String[] args) {
//        // NullPointerException
//        String s = null;
//        System.out.println(s.length());

//        // ArrayIndexOutOfBoundsException
//        int[] nums = new int[5];
//        System.out.println(nums[5]);

//        // ClassCastException
//        Object x = 0;
//        System.out.println((String)x);

//        // ConcurrentModificationException
//        ArrayList<Integer> integers = new ArrayList<>();
//        integers.add(5);
//        integers.add(6);
//        integers.add(7);
//        for(Integer i : integers) {
//            if(i.intValue()==7) {
//                integers.remove(i);
//            }
//        }

//        // InputMismatchException
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter an integer: ");
//        int y = scan.nextInt();

        // ArithmeticException
        final int numerator = 10;
        final int denominator = 0;
        System.out.println(numerator / denominator);
    }
}
