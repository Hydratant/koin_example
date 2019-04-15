package com.sang.koin;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.sang.koin.view.main.MainPresenter;

import kotlin.Lazy;

import static org.koin.java.KoinJavaComponent.inject;


public class SS extends AppCompatActivity {
    private Lazy<MainPresenter> presenter = inject(MainPresenter.class);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
}
