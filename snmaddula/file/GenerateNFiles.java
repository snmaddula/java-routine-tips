package snmaddula.file;

import static java.nio.file.Files.write;
import static java.nio.file.Paths.get;
import static java.util.stream.IntStream.rangeClosed;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author snmaddula
 *
 */
public class GenerateNFiles {
  
  public static void main(String[] args) {
    String content = "Hello Bhaaru!";
    DateFormat df = new SimpleDateFormat("yyyyMMdd_HHmmss.SSS");
    rangeClosed(1, 10).forEach(i -> {
	try {
	  write(get("FILE_" + df.format(new Date()) + ".txt"), content.getBytes());
	} catch (Exception e) {
	  System.err.println(e.getMessage());
	}
    });
  }
	
}
	   
/******************************
GENERATES FILES LIKE:

FILE_20190430_112550.363.txt
FILE_20190430_112550.379.txt
FILE_20190430_112550.381.txt
FILE_20190430_112550.382.txt
FILE_20190430_112550.383.txt
FILE_20190430_112550.384.txt
FILE_20190430_112550.385.txt
FILE_20190430_112550.387.txt
FILE_20190430_112550.388.txt
FILE_20190430_112550.389.txt

********************************/
