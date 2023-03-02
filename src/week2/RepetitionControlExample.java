package src.week2;

public class RepetitionControlExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // for loop example
        for(int index=0; index<numbers.length; index++) {
            System.out.println(numbers[index]);
        }

        // for each loop example
        // in what situation we should not use for each loop?
        for(int num : numbers) {
            System.out.println(num);
        }

        // while loop example
        int index = 0;
        while(index<numbers.length) {
            System.out.println(numbers[index]);
            index++;
        }

        // do while loop example
        // what is the difference between while and do-while?
        index = 0;
        do {
            System.out.println(numbers[index]);
            index++;
        } while(index<numbers.length);
    }
}
