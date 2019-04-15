package leandro.com.br.exercicios;

public enum EstadoAtual {
    FAZENDO{
        @Override
        public String toString() {
            return "Fazendo";
        }
    },FINALIZADO{
        @Override
        public String toString() {
            return "Finalizado";
        }
    }
}
