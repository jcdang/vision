package io.dang.vision;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import org.rajawali3d.surface.RajawaliSurfaceView;

import java.util.concurrent.atomic.AtomicBoolean;

public class MainActivity extends AppCompatActivity {

    private AtomicBoolean mIsConnected = new AtomicBoolean(false);
    private Renderer mRenderer = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RajawaliSurfaceView glView = (RajawaliSurfaceView) findViewById(R.id.gl_surface_view);

        Renderer renderer = new Renderer(this);
        glView.setEGLContextClientVersion(2);
        glView.setSurfaceRenderer(renderer);
    }
}
