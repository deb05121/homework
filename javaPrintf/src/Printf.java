import java.util.Date;
import java.util.Locale;

public class Printf {
    public static void main(String[] args) {
        //      System.out.printf(format, arguments);
        //      %<flags><width><.precision>specifier

        int x = 1023456789;
        System.out.printf("Formatted output is: %,d \t %d\n", x, -x);
                //Format Specifiers %d  %f  %s  %t
        float y = 2.28f;
        System.out.printf("Precision formatting upto 4 decimal places %.4f\n",y);

        double z = 3.147293165;
        System.out.printf("%e",z);
        System.out.println();
        System.out.printf("Precision formatting upto 2 decimal places %.2f\n",z);
                //'shows extent of text'
        System.out.printf("'%5.2f'%n", 2.28);
                //Filling with zeros
        System.out.printf("'%05.2f'%n", 2.28);
                //
        System.out.printf("'%010.6f'%n", 2.28);
                // aligns to the left
        System.out.printf("'%-10.2f'%n", 2.28);
                //locale
        System.out.printf(Locale.US, "%,d %n", 5000);
                //
        System.out.printf("%s %s!%n","Hello","World");

        System.out.printf("%s\f%s!%n","Hello","World!");
                //
        System.out.printf("%s %S!%n","Hello","World");

        Date date = new Date();
        System.out.printf("%tT%n", date);
        System.out.printf("H : %tH, M: %tM, S: %tS%n",date,date,date);
                //we can use the index reference of our input parameter, which is 1$ in our case
        System.out.printf("H : %1$tH, M: %1$tM, S: %1$tS%n",date);

        System.out.printf(Locale.US,"%1$tH:%1$tM:%1$tS %1$Tp GMT %1$tz  %n", date);

        System.out.printf(Locale.US,"%s %tB %<ta, %<tY%n", "Current date: ", date);
        System.out.printf("%s %tb %<te, %<ty", "Current date: ", date);


    }
}
