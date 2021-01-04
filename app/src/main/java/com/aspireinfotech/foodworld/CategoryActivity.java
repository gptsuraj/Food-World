package com.aspireinfotech.foodworld;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.google.android.material.snackbar.Snackbar;
import com.ontbee.legacyforks.cn.pedant.SweetAlert.SweetAlertDialog;

public class CategoryActivity extends AppCompatActivity {
    private int[]image= {R.drawable.chocolatecake,R.drawable.cheesecake,R.drawable.icecream,R.drawable.redvelvet,R.drawable.coffeecake,R.drawable.strawberrycake,R.drawable.moltenchocolate,R.drawable.poundcake,R.drawable.blackforest,R.drawable.bostonpie,R.drawable.whitecake,R.drawable.layercake,R.drawable.swissroll,R.drawable.coconutcake,R.drawable.bananacake,R.drawable.spongecake,R.drawable.applecake1,R.drawable.germanchoco};
private String[] title={"Chocolate Cake","Cheese Cake","Ice-Cream Cake","Red Velvet Cake","Coffee Cake","Strawberry Cake","Molten Chocolate Cake","Pound Cake","Black Forest cake","Boston Cake","White Cake","Layer Cake","Swiss Roll Cake","Coconuut Cake","Banana Cake","Sponge Cake","Apple Cake","Greman Choco Cake"};
private GridView gridView;
private Context mcontext;
private View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        mcontext=this;
        view = (findViewById(R.id.parent));
       /* if(isNetworkAvailable()){*/
            gridView=(GridView)findViewById(R.id.category_gv);
            gridView.setAdapter(new CustomAdapter(mcontext,image,title));
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    switch (position){

                        case 0 : Intent intent = new Intent(CategoryActivity.this,ChocolateCakeActivity.class);
                            startActivity(intent);
                            break;

                        case 1 : Intent intent1 = new Intent(CategoryActivity.this,CheeseCakeActivity.class);
                            startActivity(intent1);
                            break;
                        case 2 : Intent intent2 = new Intent(CategoryActivity.this,IceCreamCakeActivity.class);
                            startActivity(intent2);
                            break;
                        case 3 : Intent intent3 = new Intent(CategoryActivity.this,RedVelvetCakeActivity.class);
                            startActivity(intent3);
                            break;
                        case 4 : Intent intent4 = new Intent(CategoryActivity.this,CoffeeCakeActivity.class);
                            startActivity(intent4);
                            break;

                        case 5 : Intent intent5 = new Intent(CategoryActivity.this,StrawberryCakeActivity.class);
                            startActivity(intent5);
                            break;
                        case 6 : Intent intent6 = new Intent(CategoryActivity.this,MoltenChocolateCakeActivity.class);
                            startActivity(intent6);
                            break;
                        case 7 : Intent intent7 = new Intent(CategoryActivity.this,PoundCakeActivity.class);
                            startActivity(intent7);
                            break;
                        case 8 : Intent intent8 = new Intent(CategoryActivity.this,BlackForestCakeActivity.class);
                            startActivity(intent8);
                            break;
                        case 9 : Intent intent9 = new Intent(CategoryActivity.this,BostonCakeActivity.class);
                            startActivity(intent9);
                            break;
                        case 10 : Intent intent10 = new Intent(CategoryActivity.this,WhiteCakeActivity.class);
                            startActivity(intent10);
                            break;
                        case 11 : Intent intent11 = new Intent(CategoryActivity.this,LayerCakeActivity.class);
                            startActivity(intent11);
                            break;
                        case 12 : Intent intent12 = new Intent(CategoryActivity.this,SwissRollCakeActivity.class);
                            startActivity(intent12);
                            break;
                        case 13 : Intent intent13 = new Intent(CategoryActivity.this,CoconutCakeActivity.class);
                            startActivity(intent13);
                            break;
                        case 14 : Intent intent14 = new Intent(CategoryActivity.this,BananaCakeActivity.class);
                            startActivity(intent14);
                            break;
                        case 15 : Intent intent15 = new Intent(CategoryActivity.this,SpongeCakeActivity.class);
                            startActivity(intent15);
                            break;
                        case 16 : Intent intent16 = new Intent(CategoryActivity.this,AppleCakeActivity.class);
                            startActivity(intent16);
                            break;
                        case 17 : Intent intent17 = new Intent(CategoryActivity.this,GermanChocoCakeActivity.class);
                            startActivity(intent17);
                            break;

                    }

                }
            });
        /*}else {
            Snackbar snackbar = Snackbar
                    .make(view, "No internet connection!", Snackbar.LENGTH_LONG)
                    .setAction("RETRY", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                        }
                    });

            snackbar.show();
        }*/

    }

    public boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager = ((ConnectivityManager) mcontext.getSystemService(Context.CONNECTIVITY_SERVICE));
        return connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnected();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.app_info:
                Intent intent=new Intent(CategoryActivity.this, AppinfoActivity.class);
                startActivity(intent);
                break;
            case R.id.disclaimer:
                new SweetAlertDialog(this, SweetAlertDialog.CUSTOM_IMAGE_TYPE)
                        .setTitleText("Disclaimer!")
                        .setContentText("Cakes are special. Every birthday, every celebration ends with something sweet, a cake, and people remember. It's all about the memories.All the images and content taken from google and credit goes to them")
                        .setCustomImage(R.drawable.cake_back)
                        .show();
                break;
            case R.id.share:
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                i.putExtra(Intent.EXTRA_SUBJECT, "Cake Bake");
                String sAux = "\nA Must Have Application For Cake\n\n";
                sAux = sAux + "https://play.google.com/store/apps/details?id=com.aspireinfotech.foodworld \n\n";
                i.putExtra(Intent.EXTRA_TEXT, sAux);
                startActivity(Intent.createChooser(i, "choose one"));

                break;



            default: super.onOptionsItemSelected(item);
        }
        return true;
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder=new AlertDialog.Builder(CategoryActivity.this);
        builder.setMessage("Do you want to exit");
        AlertDialog.Builder builder1 = builder.setIcon(R.mipmap.ic_launcher);
        builder.setCancelable(false);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        AlertDialog alert = builder.create();
        alert.show();


    }
}
