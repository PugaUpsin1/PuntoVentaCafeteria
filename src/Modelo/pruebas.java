
package Modelo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleDateFormat dtf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();

        Date dateObj = calendar.getTime();
        String formattedDate = dtf.format(dateObj);
        System.out.println(formattedDate);
    }
    
}
