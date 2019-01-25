package com.android.camera2video;

import android.app.Activity;
import android.os.Bundle;

public class CameraActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (null == savedInstanceState) {
            getFragmentManager().beginTransaction()
                    .replace(android.R.id.content, Camera2VideoFragment.newInstance())
                    .commit();
        }
    }
}
