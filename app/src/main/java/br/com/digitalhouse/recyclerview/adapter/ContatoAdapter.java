package br.com.digitalhouse.recyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.com.digitalhouse.recyclerview.R;
import br.com.digitalhouse.recyclerview.model.Contato;

public class ContatoAdapter extends RecyclerView.Adapter<ContatoAdapter.ViewHolder> {

    private List<Contato> listadeContatos;  //Declarando Lista de Contatos

    // Construtor
    public ContatoAdapter(List<Contato> listadeContatos) {
        this.listadeContatos = listadeContatos;
    }

    //Método que retorna o tamanho da lista
    @Override
    public int getItemCount() {
        return listadeContatos.size();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        //Infla o layout do Item
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_lista_recycler_view, viewGroup, false);
        return new ViewHolder(view);
        //retorna uma nova instancia da classe ViewHolder
    }

    //Método que possui um objeto que recebe o valor de acordo com a posição da lista
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int posicao) {
        Contato contato = listadeContatos.get(posicao);

        viewHolder.onBind(contato);

    }


    //CLASSE
    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView txtNome;
        private TextView txtTel;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNome = itemView.findViewById(R.id.txtNome);
            txtTel = itemView.findViewById(R.id.txtTel);

        }


        //acessa pelo get o atributo do objeto recebido do metodo onBindViewHolder e usa o set para altera-los em sua lista
        public void onBind(Contato contato) {
            txtNome.setText(contato.getNome());
            txtTel.setText(contato.getTel());
        }
    }
}
