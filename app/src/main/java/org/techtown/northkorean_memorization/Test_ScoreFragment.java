package org.techtown.northkorean_memorization;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class Test_ScoreFragment extends Fragment {
    private TextView score;
    int resultScore;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.test_score, container, false);
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Bundle bundle = getArguments();
        resultScore = bundle.getInt("score");
        score = view.findViewById(R.id.test_score);
        score.setText("" + resultScore);
    }
}