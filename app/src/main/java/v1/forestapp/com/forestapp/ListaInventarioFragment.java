package v1.forestapp.com.forestapp;


import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import v1.forestapp.com.forestapp.ClasesAsincronas.GetAsyncrona;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListaInventarioFragment extends Fragment {


    Context cnt;

    public ListaInventarioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        cnt = getActivity().getApplicationContext();
        final View vista = inflater.inflate(R.layout.fragment_lista_inventario, container, false);


        ListView lista;
        final String [] menuItems = {
                "Achote o Achoite",
                "Cañaguate",
                "Mango Hilaza",
                "Mango de Manzana",
                "Almendro",
                "Caracolí",
                "Caña dulce",
                "Ceiba",
                "Guarumo",
                "Algarrubillo",
                "Manzanillo",
                "Mataraton",
                "Palma Estera",
                "Puy",
                "Totumo"
        };

        lista = (ListView) vista.findViewById(R.id.listViewInventario2);
        ArrayAdapter adapter = new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,menuItems);
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int position, long l) {
                Toast.makeText(getActivity(), menuItems[position], Toast.LENGTH_SHORT).show();
            }
                //android.app.FragmentManager fm = getFragmentManager();
                //DialogInformacion dialogInformacion = new DialogInformacion();

                //TextView titulo = (TextView)adapterView.findViewById(R.id.textTitulo);
                //TextView Subtitulo = (TextView)adapterView.findViewById(R.id.textSubTitulo);
                //ArbolDTO a = new ArbolDTO();
                //a.setTitulo(titulo.getText().toString());
                //a.setSubTitulo(Subtitulo.getText().toString());

                //dialogInformacion.setInventario(a);
                //dialogInformacion.show(fm,"");
                //overridePendingTransition(R.anim.fade_in, R.anim.fade_out);

        });
                return vista;
    }
}



