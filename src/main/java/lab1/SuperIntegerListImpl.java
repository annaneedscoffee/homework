package lab1;


import java.util.Arrays;

public class SuperIntegerListImpl implements SuperIntegerList {

    int[] array = new int[10];
    int currentIndex;

    {
        currentIndex = 0;
    }

    @Override
    public void add(int number) {

        if (currentIndex == array.length){
            int[] newArray = Arrays.copyOf(this.array, this.array.length+10);
            this.array = newArray;
        }

        this.array[currentIndex] = number;
        currentIndex++;

    }

    @Override
    public void removeByIndex(int index) {



    }

    @Override
    public void removeByValue(int value) {

    }

    @Override
    public int get(int index) {
        return 0;
    }

    @Override
    public void printAll() {

    }
}
