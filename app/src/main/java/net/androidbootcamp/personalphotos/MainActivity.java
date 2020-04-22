package net.androidbootcamp.personalphotos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Integer[] Pictures = {R.drawable.banksfamilysm, R.drawable.beckerfamilysm, R.drawable.fletchandrydersm,
    R.drawable.fletcheastersm, R.drawable.grandparentssm, R.drawable.nickandfletchsm, R.drawable.thelakesm,
    R.drawable.threestoogessm};
    ImageView pic;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        GridView grid = (GridView)findViewById(R.id.gridView);
        final ImageView pic = (ImageView) findViewById(R.id.imgLarge);
        grid.setAdapter(new ImageAdapter(this));
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:
                        name = getString(R.string.txtToastIndex0);
                        break;
                    case 1:
                        name = getString(R.string.txtToastIndex1);
                        break;
                    case 2:
                        name = getString(R.string.txtToastIndex2);
                        break;
                    case 3:
                        name = getString(R.string.txtToastIndex3);
                        break;
                    case 4:
                        name = getString(R.string.txtToastIndex4);
                        break;
                    case 5:
                        name = getString(R.string.txtToastIndex5);
                        break;
                    case 6:
                        name = getString(R.string.txtToastIndex6);
                        break;
                    case 7:
                        name = getString(R.string.txtToastIndex7);
                        break;
                }
                Toast.makeText(getBaseContext(), name , Toast.LENGTH_SHORT).show();
                pic.setImageResource(Pictures[position]);
            }
        });
    }
    public class ImageAdapter extends BaseAdapter {
        private Context context;

        public ImageAdapter(Context c) {
            context = c;
        }

        @Override
        public int getCount() {
            return Pictures.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            pic = new ImageView(context);
            pic.setImageResource(Pictures[position]);
            pic.setScaleType(ImageView.ScaleType.FIT_XY);
            pic.setLayoutParams(new GridView.LayoutParams(250,225));
            return pic;
        }
    }
}
