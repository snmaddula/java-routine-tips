package snmaddula.file;

import static java.nio.file.Files.createDirectories;
import static java.nio.file.Files.move;
import static java.nio.file.Paths.get;
import static java.nio.file.StandardCopyOption.ATOMIC_MOVE;

/**
 * 
 * @author snmaddula
 *
 */
public class MoveFiles {
  
  public static void main(String[] args) throws Exception {
    String fileName = "hello.txt";
    String sourcePath = "C:/Users/USERNAME/Desktop/";
    String targetPath = "C:/Users/USERNAME/Desktop/my_files/";
    createDirectories(get(targetPath));
    move(get(sourcePath), get(targetPath + fileName), ATOMIC_MOVE);
  }
}
    
    
