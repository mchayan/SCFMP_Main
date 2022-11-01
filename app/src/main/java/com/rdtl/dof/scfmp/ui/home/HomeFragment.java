package com.rdtl.dof.scfmp.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.rdtl.dof.scfmp.R;
import com.rdtl.dof.scfmp.WebViewController;




import com.rdtl.dof.scfmp.databinding.FragmentHomeBinding;
import com.rdtl.dof.scfmp.ui.gallery.GalleryViewModel;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        WebView webView=root.findViewById(R.id.web_view_dof_main);
        webView.loadUrl("https://app.rdtl.xyz/");

        webView.setWebViewClient(new WebViewController());
        return root;
    }
}