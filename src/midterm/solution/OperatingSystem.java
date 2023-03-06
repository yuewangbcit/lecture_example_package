package src.midterm.solution;

import java.util.Arrays;
import java.util.Random;

public final class OperatingSystem {
    private static Component[] makeRandomComponentArray(int arraySize) {
        Component[] arrayOfComponents = null;
        if(arraySize>0) {
            arrayOfComponents = new Component[arraySize];
            for(int i=0; i<arraySize; i++) {
                arrayOfComponents[i] = makeRandomComponent();
            }
        }
        return arrayOfComponents;
    }

    private static Component makeRandomComponent() {
        File.Types[] types = File.Types.values();
        Random rand = new Random();
        if(rand.nextDouble()<0.5) {
            return new File(types[rand.nextInt(types.length)], makeRandomName(3));
        }
        else {
            Directory directory = new Directory(makeRandomName(3));
            int count = rand.nextInt(6);
            for(int i=0; i<count; i++) {
                directory.add(new File(types[rand.nextInt(types.length)], makeRandomName(3)));
            }
            return directory;
        }
    }

    private static String makeRandomName(int length) {
        Random rand = new Random();
        String name = "";
        for(int i=0; i<length; i++) {
            int decimal = rand.nextInt(65, 117);
            if(decimal>=91) {
                decimal += 6;
            }
            name += (char) decimal;
        }
        return name;
    }

    private static void displayComponentArray(Component[] arrayOfComponents) {
        for(int i=0; i<arrayOfComponents.length; i++) {
            if(arrayOfComponents[i]!=null) {
                arrayOfComponents[i].print();
            }
        }
    }

    private static void openComponents(Component[] arrayOfComponents) {
        for(int i=0; i<arrayOfComponents.length; i++) {
            if(arrayOfComponents[i]!=null) {
                arrayOfComponents[i].open();
            }
        }
    }

    private static void closeComponents(Component[] arrayOfComponents) {
        for(int i=0; i<arrayOfComponents.length; i++) {
            if(arrayOfComponents[i]!=null) {
                arrayOfComponents[i].close();
            }
        }
    }
    public static void main(String[] args) {
        Component[] arrayOfComponents = makeRandomComponentArray(10);
        displayComponentArray(arrayOfComponents);
        System.out.println();
        Arrays.sort(arrayOfComponents);
        openComponents(arrayOfComponents);
        System.out.println();
        Arrays.sort(arrayOfComponents, new ComponentNameSorter());
        closeComponents(arrayOfComponents);
    }
}
