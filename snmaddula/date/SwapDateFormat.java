package snmaddula.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * 
 * @author snmaddula
 *
 */
public class SwapDateFormat {
  public static void main(String[] args) throws Exception {
    DateFormat slashDF = new SimpleDateFormat("dd/mm/yyyy");
    DateFormat dotDF = new SimpleDateFormat("dd.mm.yyyy");
    String input = "15/04/1991";
    String output = dotDF.format(slashDF.parse(input));
    System.out.printf("INPUT  : %s\nOUTPUT : %s", input, output);
  }
}

/********************
OUTPUT
------
INPUT  : 15/04/1991
OUTPUT : 15.04.1991
*********************/
