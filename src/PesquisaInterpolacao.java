public class PesquisaInterpolacao {
    public int pesquisa(int chave, int vetor[]) {
        int quantidadeOperacoes = 0;

        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio <= fim && chave >= vetor[inicio] && chave <= vetor[fim]) {
            quantidadeOperacoes++;

            // Fórmula de interpolação para encontrar a posição mais provável da chave
            int posicao = inicio + (((fim - inicio) / (vetor[fim] - vetor[inicio])) * (chave - vetor[inicio]));

            if (vetor[posicao] == chave)
                return quantidadeOperacoes;

            if (vetor[posicao] < chave)
                inicio = posicao + 1;
            else
                fim = posicao - 1;
        }
        return quantidadeOperacoes;
    }
}
