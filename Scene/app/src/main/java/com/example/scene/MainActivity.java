package com.example.scene;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    private Scene mOverScene;
    private Scene mInfoScene;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewGroup senceroot=findViewById(R.id.scene_root);
        mOverScene = Scene.getSceneForLayout(senceroot,R.layout.scene_overview,getApplicationContext());
        mInfoScene =Scene.getSceneForLayout(senceroot,R.layout.sence_info,getBaseContext());
        TransitionManager.go(mOverScene);
    }
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void onClick(View view){
        switch (view.getId()) {
            case R.id.imageButton:
                TransitionManager.go(mInfoScene);
                break;
            case R.id.imageButton2:
                TransitionManager.go(mOverScene);
                break;
        }
    }
}
