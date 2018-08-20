package hub.beeline.sampleproject;

import android.graphics.drawable.PictureDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = findViewById(R.id.bg_image);
        Glide.with(imageView)
                .load("https://ms-dev.beeline.uz/binaries/content/gallery/mainsite/backgrounds-all/1200x600_bravo-online.jpg")
                .into(imageView);
        ImageView svg1 = findViewById(R.id.icon1);
        Glide.with(svg1)
                .as(PictureDrawable.class)
                .listener(new SvgSoftwareLayerSetter())
                .load("https://ms-dev.beeline.uz/binaries/content/gallery/mainsite/icons/money.svg")
                .into(svg1);
        ImageView svg2 = findViewById(R.id.icon2);
        Glide.with(svg2)
                .as(PictureDrawable.class)
                .listener(new SvgSoftwareLayerSetter())
                .load("https://ms-dev.beeline.uz/binaries/content/gallery/mainsite/icons/min.svg")
                .into(svg2);
        ImageView svg3 = findViewById(R.id.icon3);
        Glide.with(svg3)
                .as(PictureDrawable.class)
                .listener(new SvgSoftwareLayerSetter())
                .load("https://ms-dev.beeline.uz/binaries/content/gallery/mainsite/icons/sms.svg")
                .into(svg3);
        WebView webView = findViewById(R.id.webview);
        webView.loadUrl("https://ms-dev.beeline.uz/binaries/content/gallery/mainsite/icons/money.svg");
    }
}