package mx.com.onofre.alejandro.puppy;

import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by 472185 on 08/02/2017.
 */

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder> {

    ArrayList<Mascota> mascotas;

    public MascotaAdaptador(ArrayList<Mascota> mascotas){
        this.mascotas = mascotas;
    }
    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.mascota_cardview, parent, false);
        return new MascotaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MascotaViewHolder holder, int position) {
        final Mascota mascota = mascotas.get(position);
        holder.foto.setImageResource(mascota.getFoto());
        holder.nombre.setText(mascota.getNombre());

        holder.ranking.setText(String.valueOf(mascota.getRanking()));
    }

    @Override
    public int getItemCount() {
        return mascotas.size();

    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder {

        private TextView nombre;
        private ImageView foto;
        private TextView ranking;
        private ImageButton btnRanking;

        public MascotaViewHolder(final View itemView) {
            super(itemView);
            nombre = (TextView) itemView.findViewById(R.id.cvNombre);
            foto = (ImageView) itemView.findViewById(R.id.cvFoto);
            ranking = (TextView) itemView.findViewById(R.id.cvRanking);
            btnRanking = (ImageButton) itemView.findViewById(R.id.btnRanking);
        }
    }
}
