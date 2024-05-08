import java.util.Scanner;
import org.jfree.data.xy.XYSeries;

public class Principal {

    public static void main(String[] args) {

        PesquisaInterpolacao objPesquisaInterpolacao = new PesquisaInterpolacao();
        Grafico objGrafico;

        Scanner teclado = new Scanner(System.in);
        int NumeroProcurado;
        System.out.println("Digite o número para procurar no vetor: ");
        NumeroProcurado = teclado.nextInt();

        XYSeries series = new XYSeries("Complexidade do Algoritmo de Busca por Interpolação");

        for (int tamanho = 100; tamanho <= 1000; tamanho += 100) {

            int vetor[] = new int[tamanho];

            for (int i = 0; i < tamanho; i++) {
                vetor[i] = i;
            }

            int quantidade = objPesquisaInterpolacao.pesquisa(NumeroProcurado, vetor);

            series.add(tamanho, quantidade);
            System.out.println("Quantidade de buscas para o vetor de tamanho " + tamanho + ": " + quantidade);
        }

        objGrafico = new Grafico(series, "Busca por Interpolação");
        System.out.println("Gráfico gerado com sucesso!");
    }
}
