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
	   
	    
