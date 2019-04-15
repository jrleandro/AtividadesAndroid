package leandro.com.br.exercicios;

public class Atividades {
    private String Nome;
    private EstadoAtual Estatus;
    private String Descricao;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public EstadoAtual getEstatus() {
        return Estatus;
    }

    public void setEstatus(EstadoAtual estatus) {
        Estatus = estatus;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    @Override
    public String toString() {
        return "Atividades{" +
                "Nome='" + Nome + '\'' +
                ", Estatus='" + Estatus + '\'' +
                ", Descricao='" + Descricao + '\'' +
                '}';
    }
}
