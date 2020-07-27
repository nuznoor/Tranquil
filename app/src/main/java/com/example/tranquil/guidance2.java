package com.example.tranquil;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageClickListener;
import com.synnapps.carouselview.ImageListener;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link guidance2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class guidance2 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    CarouselView carouselView;
    CarouselView carouselView2;

    public guidance2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment guidance2.
     */
    // TODO: Rename and change types and number of parameters
    public static guidance2 newInstance(String param1, String param2) {
        guidance2 fragment = new guidance2();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
    private int[] mImages = new int[]{
        R.drawable.do1, R.drawable.do2,R.drawable.do3,R.drawable.do4,R.drawable.dont1
    };
    private String[] mImageTitle = new String[]{
    "do","do","do","do","dont"
    };
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        super.onCreateView(R.layout.fragment_guidance2);
//        CarouselView carouselView = findViewById(R.id.carousel_dos_donts);
//        carouselView.setPageCount(mImages.length);
//        carouselView.setImageListener(new ImageListener() {
//            @Override
//            public void setImageForPosition(int position, ImageView imageView) {
//                imageView.setImageResource(mImages[position]);
//            }
//        });
//        carouselView.setImageClickListener(new ImageClickListener() {
//            @Override
//            public void onClick(int position) {
//                Toast.makeText(guidance2.this, mImagesTitle(position), Toast.LENGTH_SHORT).show();
//
//            }
//        });


        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_guidance2,container,false);
        carouselView = (CarouselView) root.findViewById(R.id.carousel_dos_donts);
                carouselView.setPageCount(mImages.length);

        carouselView.setImageListener(new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                 imageView.setImageResource(mImages[position]);


            }
        });

        carouselView.setImageClickListener(new ImageClickListener() {
            @Override
            public void onClick(int position) {
                // Toast.makeText(,"",Toast.LENGTH_SHORT);

            }
        });
        return root;

    }

}