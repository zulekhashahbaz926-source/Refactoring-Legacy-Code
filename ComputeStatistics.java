import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ComputeStatistics {

    public static void computeStats(String file) {

        int total = 0;
        int sum = 0;
        int min = 0;
        int max = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line = br.readLine();
            int firstLine = Integer.parseInt(line);

            min = firstLine;
            max = firstLine;

            while (line != null) {

                int num = Integer.parseInt(line);
                total++;
                sum += num;

                if (min > num) {
                    min = num;
                }

                if (max < num) {
                    max = num;
                }

                line = br.readLine();
            }

            System.out.println("total = " + total);
            System.out.println("summation = " + sum);
            System.out.println("average = " + Math.round((double) sum / total));
            System.out.println("Minimum = " + min);
            System.out.println("Maximum = " + max);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ComputeStatistics cs = new ComputeStatistics();
        cs.computeStats("random_nums.txt");
    }
}
