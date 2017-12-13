package android.gaad.com.shoppinglistbuilder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ItemsActivity extends AppCompatActivity
{
    public static final String EXTRA_ITEM = "android.gaad.com.shoppinglistbulider.extra.ITEM";
    private static final String LOG_TAG = ItemsActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);
        Log.v(LOG_TAG, "..............");
        Log.v(LOG_TAG, "onCreate");

    }

    public void onStart()
    {
        super.onStart();
        Log.d(LOG_TAG, "onStart");
    }

    public void onResume()
    {
        super.onResume();
        Log.d(LOG_TAG, "onResume");
    }

    public void onPause()
    {
        super.onPause();
        Log.d(LOG_TAG, "onPause");
    }

    public void onStop()
    {
        super.onStop();
        Log.d(LOG_TAG, "onStop");
    }

    public void onRestart()
    {
        super.onRestart();
        Log.d(LOG_TAG, "onRestart");
    }

    public void onDestroy()
    {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
    }

    public void addCereal(View view)
    {
        makeIntent(view);
    }

    public void addCookies(View view)
    {
        makeIntent(view);
    }

    public void addRice(View view)
    {
        makeIntent(view);
    }

    public void addCarrots(View view)
    {
        makeIntent(view);
    }

    public void addBeans(View view)
    {
        makeIntent(view);
    }

    public void addCheese(View view)
    {
        makeIntent(view);
    }

    public void addApple(View view)
    {
        makeIntent(view);
    }

    public void addPeanuts(View view)
    {
        makeIntent(view);
    }

    public void addCashew(View view)
    {
        makeIntent(view);
    }

    public void addOats(View view)
    {
        makeIntent(view);
    }

    private void makeIntent(View view)
    {
        Button b = (Button) view;
        String item = b.getText().toString();
        Log.v(LOG_TAG, item);
        Intent intent = new Intent();
        intent.putExtra(EXTRA_ITEM, item);
        setResult(RESULT_OK, intent);
        finish();

    }
}
