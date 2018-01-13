package toong.vn.androiddrawable;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.graphics.drawable.VectorDrawableCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.content.res.AppCompatResources;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);

        useVector();
    }

    private void useNormalImage() {
        Drawable drawable = imageView.getDrawable();
        VectorDrawableCompat drawableCompat =
                VectorDrawableCompat.create(getResources(), R.drawable.ic_next, getTheme());
        Drawable drawableAppCompatResources =
                AppCompatResources.getDrawable(this, R.drawable.ic_next);
        Drawable drawableContextCompat = ContextCompat.getDrawable(this, R.drawable.ic_next);
        Drawable drawableResourcesCompat =
                ResourcesCompat.getDrawable(getResources(), R.drawable.ic_next, this.getTheme());
    }

    private void useVector() {
        Drawable drawable = imageView.getDrawable();
        VectorDrawableCompat drawableCompat =
                VectorDrawableCompat.create(getResources(), R.drawable.ic_android_black,
                        getTheme());
        Drawable drawableAppCompatResources =
                AppCompatResources.getDrawable(this, R.drawable.ic_android_black);

        Drawable drawableContextCompat =
                ContextCompat.getDrawable(this, R.drawable.ic_android_black);
        Drawable drawableResourcesCompat =
                ResourcesCompat.getDrawable(getResources(), R.drawable.ic_android_black,
                        this.getTheme());
    }
}
