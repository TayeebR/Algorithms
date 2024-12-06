import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    private static File f;
    private static Scanner s;
    public static void main(String[] args) throws FileNotFoundException {
        f = new File("Numbers.txt");
        int odds = odds();
        int evens = evens();
        int tenses = tenses();
        int big500 = big500();
        int greatest = greatest();
        int least = least();
        int sum = sum();
        double mean = mean();
        int mode = mode();
        System.out.println(odds);
        System.out.println(evens);
        System.out.println(tenses);
        System.out.println(big500);
        System.out.println(greatest);
        System.out.println(least);
        System.out.println(sum);
        System.out.println(mean);
        System.out.println(mode);
        s.close();
    }

    public static int odds() throws FileNotFoundException{
        s = new Scanner(f);
        int odds = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 != 0)
                odds++;
        }
        return odds;
    }
    public static int evens() throws FileNotFoundException{
        s = new Scanner(f);
        int evens = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 == 0)
                evens++;
        }
        return evens;
    }
    public static int tenses() throws FileNotFoundException{
        s = new Scanner(f);
        int tens = 0;
        while (s.hasNext()) {
            int nextInt = s.nextInt();
            if (nextInt >= 10 && nextInt <= 99)
                tens++;
        }
        return tens;
    }
    public static int big500() throws FileNotFoundException{
        s = new Scanner(f);
        int big = 0;
        while (s.hasNext()) {
            if (s.nextInt() > 500) {
              big ++;  
            }
        }
        return big;
    }
    public static int greatest() throws FileNotFoundException{
        s = new Scanner(f);
        int greatest = 0;
        while (s.hasNext()) {
            if (s.nextInt() > greatest) {
              greatest = s.nextInt();  
            }
        }
        return greatest;
    }
    public static int least() throws FileNotFoundException{
        s = new Scanner(f);
        int least = 0;
        while (s.hasNext()) {
            if (s.nextInt() < least) {
              least = s.nextInt();  
            }
        }
        return least;
    }
    public static int sum() throws FileNotFoundException{
        s = new Scanner(f);
        int sum = 0;
        while (s.hasNext()) {
            sum += s.nextInt();
        }
        return sum;
    }
    public static double mean() throws FileNotFoundException{
        s = new Scanner(f);
        double mean = 0;
        while (s.hasNext()) {
            mean += s.nextInt();
        }
        mean = mean/999878;
        return mean;
    }
    public static int mode() throws FileNotFoundException{
        s = new Scanner(f);
        int mode = 0;
        while (s.hasNext()) {
            mode += s.nextInt();
        }
        return mode;
    }
}