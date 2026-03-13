import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ComputeStatistics {
public static void computeStats(String file) {
int total = 0;
int sum = 0;
int average = 0;
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

PLO CLO LL
4 2 4

if (min &gt; num) {
min = num;
}
if (max &lt; num) {
max = num;
}
line = br.readLine();
}
System.out.println(&quot;total = &quot; + total);
System.out.println(&quot;summation = &quot; + sum);
System.out.println(&quot;average = &quot; + Math.round((double) sum / total));
System.out.println(&quot;Minimum = &quot; + min);
System.out.println(&quot;Maximum = &quot; + max);
} catch (IOException e) {
e.printStackTrace();
}
}
public static void main(String[] args) {
ComputeStatistics cs = new ComputeStatistics();
cs.computeStats(&quot;random_nums.txt&quot;);
}
}
