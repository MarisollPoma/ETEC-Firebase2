package br.com.etechoracio.firebase.holder;

import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import br.com.etechoracio.firebase.R;

public class LineHolder  extends RecyclerView.ViewHolder {

    private TextView viewNome;
    private ImageButton imgDelete;


    public LineHolder(@NonNull View itemView) {
        super(itemView);

        viewNome = itemView.findViewById(R.id.itemViewNomeBD);
        imgDelete = itemView.findViewById(R.id.btnDelete);
    }

    public TextView getViewNome() {
        return viewNome;
    }

    public ImageView getImgDelete() {
        return imgDelete;
    }
}
