/*import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
class Program1{
    public static void main(String args[])throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date and time: ");
        String d = sc.nextLine();
        LocalDateTime localDateTime = LocalDateTime.parse(s, DateTimeFormatter.ofPattern("dd/mm/yyyy hh:mm:ss"));
        SimpleDateFormat sdf1 =new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 =new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat sdf3 =new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat sdf4 =new SimpleDateFormat("hh:mm:ss");
        SimpleDateFormat sdf5 =new SimpleDateFormat("hh:mm:ss");
        SimpleDateFormat sdf6 =new SimpleDateFormat("hh:mm");
        String strDate1 = sdf1.format(date);
        String strDate2 = sdf2.format(date);
        String strDate3 = sdf3.format(date);
        String strDate4 = sdf4.format(date1);
        String strDate5 = sdf5.format(date1);
        String strDate6 = sdf6.format(date1);
        System.out.println(strDate1);
        System.out.println(strDate2);
        System.out.println(strDate3);
        System.out.println(strDate4);
        System.out.println(strDate5);
        System.out.println(strDate6);
        
        
        
        
        


    }
}
*/
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Enter date and time : ");
        String dateTimeStr = scanner.nextLine();
        

        LocalDateTime localDateTime = LocalDateTime.parse(dateTimeStr, DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a"));

        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("hh:mm:ss")));
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("hh:ss:mm")));
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("hh:mm")));
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss")));
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss")));
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm")));
    }
}
