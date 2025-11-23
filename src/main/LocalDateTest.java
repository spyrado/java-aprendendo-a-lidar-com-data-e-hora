package main;

import java.time.LocalDate;

public class LocalDateTest {
  public static void main(String[] args) {
    LocalDate dataCompra = LocalDate.of(2025, 11, 23);
    LocalDate dataPrimeiraParcela = dataCompra.plusDays(15);
    LocalDate dataSegundaParcela = dataPrimeiraParcela.plusDays(30);

    var dataAtual = LocalDate.now();

    System.out.println("=============== [INICIO] VERIFICANDO O ESTADO QUE SE ENCONTRA A PARCELA ===============");

    if(dataPrimeiraParcela.isEqual(dataAtual)) {
      System.out.println("Dia do vencimento da primeira parcela.");
    } else if(dataPrimeiraParcela.isBefore(dataAtual)) {
      System.out.println("Primeira parcela venceu o prazo de pagamento.");
    } else if(dataPrimeiraParcela.isAfter(dataAtual)) {
      System.out.println("Primeira parcela ainda não venceu.");
    }

    System.out.println("=============== [FIM] VERIFICANDO O ESTADO QUE SE ENCONTRA A PARCELA ===============");

    System.out.println("=============== [INICIO] LOGANDO AS DATAS ===============");

    System.out.println("Data atual: " + dataAtual);
    System.out.println("Data compra: " + dataCompra);
    System.out.println("Data primeira parcela: " + dataPrimeiraParcela);
    System.out.println("Data segunda parcela: " + dataSegundaParcela);

    System.out.println("=============== [FIM] LOGANDO AS DATAS ===============");
  }
}
