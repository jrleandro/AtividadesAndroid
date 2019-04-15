package leandro.com.br.exercicios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ListarAtividadesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_atividades);
        List<String> AtivList = getTodosAtividades();
        ListView ListarAtividades = findViewById(R.id.ListarAtividades);
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,AtivList);
        ListarAtividades.setAdapter(adapter);

    }

    public List<String> getTodosAtividades(){
        List<String> ListaAtividades =new ArrayList<String>();
        Atividades atividades=new Atividades();
        atividades.setNome("Manutencao");
        atividades.setDescricao("Manutencao dos computadores do laboratorios");
        atividades.setEstatus(EstadoAtual.FAZENDO);
        ListaAtividades.add(atividades.getNome());

        for(int i =0; i<=20; i++){
            Atividades atividadeInterno = new Atividades();
            atividadeInterno.setNome("Atividade" + i);
            atividadeInterno.setDescricao("Manutencao dos computadores do laboratorios");
            atividadeInterno.setEstatus(EstadoAtual.FAZENDO);
            ListaAtividades.add(atividadeInterno.getNome());

        }
        return ListaAtividades;

    }
}
