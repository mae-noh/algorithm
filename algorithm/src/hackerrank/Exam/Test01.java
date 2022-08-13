package hackerrank.Exam;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.IntStream;



class Result01 {

    /*
     * Complete the 'preprocessDate' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY dates as parameter.
     */

    public static List<String> preprocessDate(List<String> dates) {
    // Write your code here
    	
    	List<String> newDates = new ArrayList<String>();
    	try {
	
	    	for(String date : dates) {
	    		date = date.replace("st", "").replace("nd", "").replace("rd", "").replace("th", "");
	    		SimpleDateFormat originDateFormat = new SimpleDateFormat("d MMMM yyyy");
	    		Date originDate = originDateFormat.parse(date);
	    		
	    		SimpleDateFormat newDateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    		String newDate = newDateFormat.format(originDate);
	    		
	    		newDates.add(newDate);
	    	}
    	}
    	catch(ParseException e) {
    		System.out.println(e);
    	}
    	
    	return newDates;
    }

}

public class Test01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int datesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> dates = IntStream.range(0, datesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<String> result = Result01.preprocessDate(dates);

        bufferedWriter.write(
            result.stream()
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
