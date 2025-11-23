package main;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DataBaseadaEmFusoHorario {

  public static void main(String[] args) {
    ZonedDateTime dataCompra = ZonedDateTime.now();
    ZonedDateTime dataCompraNy = dataCompra.withZoneSameInstant(ZoneId.of("America/New_York"));
    System.out.println("=============== HORÁRIO DA COMPRA FEITA NO BRASIL ===============");
    System.out.println("Data compra: " + dataCompra);
    System.out.println("=============== HORÁRIO DA MESMA COMPRA FEITA EM NOVA YORK ===============");
    System.out.println("Data compra: " + dataCompraNy);
  }
}
