package com.example.thisdoesnotexist.helpinghands;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import java.net.*;
import java.io.*;
public class CharityList extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charity_list);
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CharityList.this, Menu.class));
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CharityList.this, NeighborhoodAlliance.class));

                 /*class Client { public  void main (String [] args ) throws IOException { int filesize=1022386; int bytesRead;
                    int currentTot = 0;
                    Socket socket = new Socket("127.0.0.1",15138);
                    byte [] bytearray = new byte [filesize];
                    InputStream is = socket.getInputStream();
                    FileInputStream fos = new FileInputStream("URLOut.csv");
                    BufferedInputStream bos = new BufferedInputStream(fos);
                    bytesRead = is.read(bytearray,0,bytearray.length);
                    currentTot = bytesRead;
                    do { bytesRead = is.read(bytearray, currentTot, (bytearray.length-currentTot));
                        if(bytesRead >= 0) currentTot += bytesRead; }
                    while(bytesRead > -1); bos.read(bytearray, 0 , currentTot);
                    bos.close();
                    socket.close(); } }*/

            }
        });
        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CharityList.this, DonateToUs.class));
            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CharityList.this, NeighborhoodAlliance.class));
            }
        });
    }
}
