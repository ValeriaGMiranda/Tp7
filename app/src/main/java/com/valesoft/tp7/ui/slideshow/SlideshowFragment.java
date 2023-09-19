package com.valesoft.tp7.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.valesoft.tp7.Dialogos;
import com.valesoft.tp7.databinding.FragmentSlideshowBinding;

public class SlideshowFragment extends Fragment {

    private FragmentSlideshowBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentSlideshowBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.bCerr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialogos.mostrarDialogo(getActivity());
            }
        });

        return root;
    }
}