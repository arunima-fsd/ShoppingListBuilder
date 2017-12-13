package android.gaad.com.shoppinglistbuilder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final int TEXT_REQUEST = 1;
    private TextView listItem1;
    private TextView listItem2;
    private TextView listItem3;
    private TextView listItem4;
    private TextView listItem5;
    private TextView listItem6;
    private TextView listItem7;
    private TextView listItem8;
    private TextView listItem9;
    private TextView listItem10;
    List<TextView> itemList = new ArrayList<TextView>();



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v(LOG_TAG, "............");
        Log.v(LOG_TAG,"onCreate");

        listItem1 = (TextView) findViewById(R.id.listItem1);
        itemList.add(listItem1);
        listItem2 = (TextView) findViewById(R.id.listItem2);
        itemList.add(listItem2);
        listItem3 = (TextView) findViewById(R.id.listItem3);
        itemList.add(listItem3);
        listItem4 = (TextView) findViewById(R.id.listItem4);
        itemList.add(listItem4);
        listItem5 = (TextView) findViewById(R.id.listItem5);
        itemList.add(listItem5);
        listItem6 = (TextView) findViewById(R.id.listItem6);
        itemList.add(listItem6);
        listItem7 = (TextView) findViewById(R.id.listItem7);
        itemList.add(listItem7);
        listItem8 = (TextView) findViewById(R.id.listItem8);
        itemList.add(listItem8);
        listItem9 = (TextView) findViewById(R.id.listItem9);
        itemList.add(listItem9);
        listItem10 = (TextView) findViewById(R.id.listItem10);
        itemList.add(listItem10);

        if(savedInstanceState!=null)
        {
            for(int i=0; i<10; i++)
            {
                if(savedInstanceState.getString(Integer.toString(i))!= null)
                {
                    Log.v(LOG_TAG, savedInstanceState.getString(Integer.toString(i)));
                    itemList.get(i).setText(savedInstanceState.getString(Integer.toString(i)));
                    itemList.get(i).setVisibility(View.VISIBLE);

                }
                else
                {
                    break;
                }
            }
        }



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

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        for(int i=0; i<10; i++)
        {
            if(itemList.get(i).getVisibility() == View.VISIBLE)
            {
                outState.putString(Integer.toString(i), itemList.get(i).getText().toString());
            }
            else
            {
                break;
            }

        }
    }


    public void launchItemActivity(View view)
    {
        Intent intent = new Intent(this, ItemsActivity.class);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {


        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == TEXT_REQUEST)
        {
            if(resultCode == RESULT_OK)
            {
                String itemName = data.getStringExtra(ItemsActivity.EXTRA_ITEM);
                Log.d(LOG_TAG, itemName);
                for(int i=0; i<10; i++)
                {
                    if(itemList.get(i).getVisibility() != View.VISIBLE)
                    {
                        itemList.get(i).setText(itemName);
                        itemList.get(i).setVisibility(View.VISIBLE);
                        break;
                    }
                }

            }
        }

    }
}
