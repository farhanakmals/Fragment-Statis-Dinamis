package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mButton;
    private boolean isFragmentDisplayed = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = findViewById(R.id.btnNext);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment;
                if (!isFragmentDisplayed) {
                    fragment = SimpleFragment.newInstance();
                    mButton.setText(R.string.btn1);
                } else {
                    fragment = DinamisFragment.newInstance();
                    mButton.setText(R.string.btn2);
                }
                displayFragment(fragment);
                isFragmentDisplayed = !isFragmentDisplayed;
            }
        });

        displayFragment(SimpleFragment.newInstance());
    }

    private void displayFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager
                .beginTransaction();

        fragmentTransaction.replace(R.id.fragment2, fragment)
                .addToBackStack(null)
                .commit();
    }
}