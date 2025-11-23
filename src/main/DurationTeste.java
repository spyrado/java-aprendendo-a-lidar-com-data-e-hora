package main;

import java.time.Duration;
import java.time.LocalTime;

public class DurationTeste {
  public static void main(String[] args) {
    LocalTime inicio = LocalTime.of(9, 0);
    LocalTime fim = LocalTime.of(17, 30);
    // Possibilidades do que fazer com Duration
    // https://chatgpt.com/share/69230855-74dc-800c-904c-23c4ec7af426
    Duration duracao = Duration.between(inicio, fim);

    System.out.println("=============== ESTIMANDO UMA DURAÇÃO entre uma hora e outra hora ===============");
    System.out.println("Duração do expediente: " + duracao.toHours() + " horas e " + duracao.toMinutesPart() + " minutos.");
  }
}
