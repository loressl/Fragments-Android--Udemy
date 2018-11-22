package com.example.maqui.fragments.activity;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.maqui.fragments.R;
import com.example.maqui.fragments.fragment.ContatosFragment;
import com.example.maqui.fragments.fragment.ConversasFragment;

public class MainActivity extends AppCompatActivity {

    private Button buttonConversa, buttonContato;
    private ConversasFragment conversasFragment;
    private ContatosFragment contatosFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        buttonContato=findViewById( R.id.buttonContato );
        buttonConversa=findViewById( R.id.buttonConversa );

        //remover sombra da Actionbar
        getSupportActionBar().setElevation( 0 );

        conversasFragment= new ConversasFragment();
        contatosFragment= new ContatosFragment();

        //configurar objeto para o fragmento
        FragmentTransaction transaction= getSupportFragmentManager().beginTransaction();//começa uma transação
        transaction.replace(R.id.frameConteudo, conversasFragment);//coloca onde quer exibir (layout) e o que quer
        transaction.commit();//finaliza a transação

        buttonContato.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                contatosFragment= new ContatosFragment();

                FragmentTransaction transaction= getSupportFragmentManager().beginTransaction();
                transaction.replace( R.id.frameConteudo, contatosFragment );
                transaction.commit();
            }
        } );

        buttonConversa.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                conversasFragment= new ConversasFragment();

                //configurar objeto para o fragmento
                FragmentTransaction transaction= getSupportFragmentManager().beginTransaction();//começa uma transação
                transaction.replace(R.id.frameConteudo, conversasFragment);//coloca onde quer exibir (layout) e o que quer
                transaction.commit();//finaliza a transação
            }
        } );


    }
}
