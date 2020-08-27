package com.alaminkarno.androidbutterknife;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.textView)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        textView.setText("This is the test of ButterKnife");
    }

    @OnClick(R.id.button)
    void button(){
        Toast.makeText(this, "This button is Bind with ButterKnife", Toast.LENGTH_SHORT).show();
    }
}