package android.mrfox;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Drawable originalDrawable = getResources().getDrawable(R.drawable.fox);
        // Bitmap originalBitmap = ((BitmapDrawable) originalDrawable).getBitmap();

        // RoundedBitmapDrawable roundedDrawable = RoundedBitmapDrawableFactory.create(getResources(), originalBitmap);
        // roundedDrawable.setCornerRadius(originalBitmap.getHeight());

        //ImageView imageView = (ImageView) findViewById(R.id.imageView);

        // imageView.setImageDrawable(roundedDrawable);


    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                Log.i("ActionBar", "Nuevo!");
                return true;
            case R.id.papelera:
                Log.i("ActionBar", "Buscar!");;
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
