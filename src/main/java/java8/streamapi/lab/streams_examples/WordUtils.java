package java8.streamapi.lab.streams_examples;

import lombok.SneakyThrows;

/**
 * @author Evgeny Borisov
 */
public class WordUtils {
    @SneakyThrows
    public static void main(String[] args) {


        double sqrt=0;
        long start = System.nanoTime();
        int num = 1_000_000_000;
        for (int i = 0; i < num; i++) {
            sqrt += Math.sqrt(4);
        }

        long end = System.nanoTime();

        System.out.println((end-start)/num);

        System.out.println(sqrt);
  /*      long start = System.nanoTime();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("data/song.txt")));
        long count = bufferedReader.lines().flatMap(line -> Arrays.stream(line.split("\\W+"))).peek(System.out::println).count();
        System.out.println("count = " + count);
        long end = System.nanoTime();
        System.out.println(end-start);*/
    }
}
