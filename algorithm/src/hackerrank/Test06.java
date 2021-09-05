package hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result06 {

    /*
     * Complete the 'hospital' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts UNWEIGHTED_INTEGER_GRAPH city as parameter.
     */

    /*
     * For the unweighted graph, <name>:
     *
     * 1. The number of nodes is <name>Nodes.
     * 2. The number of edges is <name>Edges.
     * 3. An edge exists between <name>From[i] and <name>To[i].
     *
     */

    public static int hospital(int cityNodes, List<Integer> cityFrom, List<Integer> cityTo) {

    }

}

public class Test06 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] cityNodesEdges = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int cityNodes = Integer.parseInt(cityNodesEdges[0]);
        int cityEdges = Integer.parseInt(cityNodesEdges[1]);

        List<Integer> cityFrom = new ArrayList<>();
        List<Integer> cityTo = new ArrayList<>();

        IntStream.range(0, cityEdges).forEach(i -> {
            try {
                String[] cityFromTo = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                cityFrom.add(Integer.parseInt(cityFromTo[0]));
                cityTo.add(Integer.parseInt(cityFromTo[1]));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result06.hospital(cityNodes, cityFrom, cityTo);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
