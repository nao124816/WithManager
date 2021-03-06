package com.example.kohki.withmanager;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SelectSynchro extends AppCompatActivity {
    Context context = this;
    Button btnStart;
    Button btnSynchro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_synchro);

        btnStart = (Button)findViewById(R.id.btn_start);
        btnStart.setOnClickListener(mBtnSelectClicked);

        btnSynchro = (Button)findViewById(R.id.synchro);
        btnSynchro.setOnClickListener(mBtnSynchroClicked);

        findViewById(R.id.btn_test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itt_test = new Intent(getApplication(), TestBluetooth.class);
                startActivity(itt_test);
            }
        });
    }

    public final View.OnClickListener mBtnSelectClicked = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            try{
                Intent ittSelect = new Intent(context, VideoActivity.class);
                startActivity(ittSelect);
            }catch(Exception e){
                Log.v("IntentErr:", e.getMessage() + "," + e);
            }
        }
    };
    public final View.OnClickListener mBtnSynchroClicked = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            try{
                BluetoothAdapter Bt = BluetoothAdapter.getDefaultAdapter();
                if(!Bt.equals(null)){
                    System.out.println("BlueToothがサポートされています"); //confirm available BlueTooth
                }
                else System.out.println("BlueToothがサポートされていません");

                Intent ittSynchro = new Intent(context, Synchro.class);
                startActivity(ittSynchro);
            }catch(Exception e){
                Log.v("IntentErr:", e.getMessage() + "," + e);
            }
        }
    };

}
