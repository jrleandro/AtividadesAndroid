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
        List<Atividades> AtivList = getTodosAtividades();
        ListView ListarAtividades = findViewById(R.id.ListarAtividades);
        ArrayAdapter<Atividades> adapter =
                new ArrayAdapter<Atividades>(this,android.R.layout.simple_list_item_1,AtivList);
        ListarAtividades.setAdapter(adapter);


    }

    public List<Atividades> getTodosAtividades(){
        List<Atividades> ListaAtividades =new ArrayList<Atividades>();
        Atividades atividades=new Atividades();
        atividades.setNome("Manutencao ");
        atividades.setDescricao("Manutencao dos computadores do laboratorios");
        atividades.setEstatus(EstadoAtual.FAZENDO);
        ListaAtividades.add(atividades);
        return ListaAtividades;


    }
}
