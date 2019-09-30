package br.com.digitalhouse.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

import br.com.digitalhouse.recyclerview.adapter.ContatoAdapter;
import br.com.digitalhouse.recyclerview.model.Contato;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ContatoAdapter adapter;
    private List<Contato> agenda = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerViewMain);

        adapter = new ContatoAdapter((contatosDaAgenda()));

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private List<Contato> contatosDaAgenda() {
        agenda.add(new Contato("Jonhy","11 5637-3938"));
        agenda.add(new Contato("Joao", "22222222222"));
        agenda.add(new Contato("Ariel", "22222222222"));
        agenda.add(new Contato("Rafael", "22222222222"));
        agenda.add(new Contato("Andreza", "22222222222"));
        agenda.add(new Contato("Robson", "22222222222"));
        agenda.add(new Contato("William", "22222222222"));
        agenda.add(new Contato("Victor", "22222222222"));
        agenda.add(new Contato("Nina", "22222222222"));
        agenda.add(new Contato("Deivid", "22222222222"));
        agenda.add(new Contato("Luiz", "22222222222"));
        agenda.add(new Contato("Josemar", "22222222222"));
        agenda.add(new Contato("Cecilia", "22222222222"));
        agenda.add(new Contato("Katheryne", "22222222222"));
        agenda.add(new Contato("Camila", "22222222222"));

        return agenda;

    }
}
