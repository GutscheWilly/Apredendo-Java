import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        
        // LocalData
        LocalDate aniversario = LocalDate.parse("31/07/2003", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(aniversario.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println(LocalDate.now());  // Formato ISO, pois não há o formatter

        // LocalDataTime
        System.out.println("--------------------------------");
        LocalDateTime momento = LocalDateTime.of(2222, 11, 04, 2, 55, 0);
        System.out.println(momento);
        System.out.println(momento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm")));

        // DateTimeFormatter
        System.out.println("--------------------------------");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(aniversario.format(formatter));
        System.out.println(momento.format(formatter));
    }
}
