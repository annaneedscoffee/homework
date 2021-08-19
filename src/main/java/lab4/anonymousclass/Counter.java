package lab4.anonymousclass;

class Counter{

    int counter;

    public Counter(int counter){
        this.counter = counter;
    }

    public void getAndIncreaseCounter(){
        System.out.println(this.counter);
        this.counter++;
    }
}
