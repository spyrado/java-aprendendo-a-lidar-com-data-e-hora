package main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest {

  public static void main(String[] args) {
    LocalDateTime localDateTime = LocalDateTime.now();
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
    System.out.println(localDateTime);

    System.out.println("=============== [INICIO] FORMATANDO AS DATAS ===============");
    System.out.println("Data atual com hora: " + formato.format(localDateTime));
    System.out.println("=============== [FIM] FORMATANDO AS DATAS ===============");
  }
}
