/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.phubber.gradle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.phubber.gradle.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }
    }
}
