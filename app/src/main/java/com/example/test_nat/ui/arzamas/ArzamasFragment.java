package com.example.test_nat.ui.arzamas;

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


public class ArzamasFragment extends Fragment {

    private FragmentAllBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_all, container, false);

        TextView title = (TextView) view.findViewById(R.id.title);

        LinearLayout linearMuz1 = (LinearLayout) view.findViewById(R.id.linearMuz1);
        TextView textMuz1 = (TextView) view.findViewById(R.id.textMuz1);
        ImageView imageMuz1 = (ImageView) view.findViewById(R.id.imageMuz1);

        title.setText("Музеи Арзамаса");

        linearMuz1.setBackgroundResource(R.drawable.cornen_radius);
        textMuz1.setText("Арзамасский историко - художественный музей");
        imageMuz1.setImageResource(R.drawable.arzamasmuz1);
        
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}