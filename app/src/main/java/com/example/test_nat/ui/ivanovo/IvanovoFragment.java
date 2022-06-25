package com.example.test_nat.ui.ivanovo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.test_nat.R;
import com.example.test_nat.databinding.FragmentAllBinding;


public class IvanovoFragment extends Fragment {

    private FragmentAllBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_all, container, false);

        TextView title = (TextView) view.findViewById(R.id.title);

        LinearLayout linearMuz1 = (LinearLayout) view.findViewById(R.id.linearMuz1);
        TextView textMuz1 = (TextView) view.findViewById(R.id.textMuz1);
        ImageView imageMuz1 = (ImageView) view.findViewById(R.id.imageMuz1);

        LinearLayout linearMuz2 = (LinearLayout) view.findViewById(R.id.linearMuz2);
        TextView textMuz2 = (TextView) view.findViewById(R.id.textMuz2);
        ImageView imageMuz2 = (ImageView) view.findViewById(R.id.imageMuz2);

        LinearLayout linearMuz3 = (LinearLayout) view.findViewById(R.id.linearMuz3);
        TextView textMuz3 = (TextView) view.findViewById(R.id.textMuz3);
        ImageView imageMuz3 = (ImageView) view.findViewById(R.id.imageMuz3);

        title.setText("Музеи Иваново");

        linearMuz1.setBackgroundResource(R.drawable.cornen_radius);
        textMuz1.setText("Музей ивановского ситца г. Иваново, ул. Батурина, 11/42");
        imageMuz1.setImageResource(R.drawable.ivanovomuz1);

        linearMuz2.setBackgroundResource(R.drawable.cornen_radius);
        textMuz2.setText("Ивановский областной художественный музей г.Иваново, проспект Ленина, 33");
        imageMuz2.setImageResource(R.drawable.ivanovomuz2);

        linearMuz3.setBackgroundResource(R.drawable.cornen_radius);
        textMuz3.setText("Музей промышленности и искусств г.Иваново, улица Батурина, 6/40");
        imageMuz3.setImageResource(R.drawable.ivanovomuz3);

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}