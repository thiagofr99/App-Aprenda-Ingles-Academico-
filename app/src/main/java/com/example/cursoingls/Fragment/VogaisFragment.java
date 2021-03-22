package com.example.cursoingls.Fragment;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.cursoingls.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link VogaisFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class VogaisFragment extends Fragment implements View.OnClickListener {

    private TextView textView1, textView2, textView3, textView4, textView5, textView6;
    private MediaPlayer mediaPlayer;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public VogaisFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment VogaisFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static VogaisFragment newInstance(String param1, String param2) {
        VogaisFragment fragment = new VogaisFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_vogais, container, false);

        textView1 = view.findViewById(R.id.textView1);
        textView2 = view.findViewById(R.id.textView2);
        textView3 = view.findViewById(R.id.textView3);
        textView4 = view.findViewById(R.id.textView4);
        textView5 = view.findViewById(R.id.textView5);
        textView6 = view.findViewById(R.id.textView6);

        textView1.setOnClickListener(this);
        textView2.setOnClickListener(this);
        textView3.setOnClickListener(this);
        textView4.setOnClickListener(this);
        textView5.setOnClickListener(this);
        textView6.setOnClickListener(this);


        return view;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.textView1:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.goodmorning);
                tocarSom();
                break;
            case R.id.textView2:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.whattime);
                tocarSom();
                break;
            case R.id.textView3:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.whatday);
                tocarSom();
                break;
            case R.id.textView4:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.imhungry);
                tocarSom();
                break;
            case R.id.textView5:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.howday);
                tocarSom();
                break;
            case R.id.textView6:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.goodnight);
                tocarSom();
                break;
        }
    }

    public void tocarSom(){
        if( mediaPlayer !=null){
            mediaPlayer.start();
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mediaPlayer.release();
                }
            });
        }
    }
}