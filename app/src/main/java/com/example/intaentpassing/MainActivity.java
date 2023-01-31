package com.example.intaentpassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.nio.channels.InterruptedByTimeoutException;

public class MainActivity extends AppCompatActivity {
Button btndial,btnshare,btnmessage,btnemail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btndial=(Button) findViewById(R.id.btndial);
        btnemail=(Button) findViewById(R.id.btnemail);
        btnmessage=(Button)findViewById(R.id.btnmessage);
        btnshare=(Button) findViewById(R.id.btnshare);
        btndial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent idial=new Intent(Intent.ACTION_DIAL);
                idial.setData(Uri.parse("tel: +919742988505"));
                startActivity(idial);
            }
        });
        btnmessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent imessge=new Intent(Intent.ACTION_SENDTO);
                imessge.setData(Uri.parse(" smsto:"+Uri.encode("+919742988505")));
                imessge.putExtra("sms_body","please fuck yourself");
                startActivity(Intent.createChooser(imessge,"send via"));
            }
        });

        btnemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iemail=new Intent(Intent.ACTION_SENDTO);
                iemail.setType("message/rfc822");
                iemail.putExtra(Intent.EXTRA_EMAIL,new String[]{"danunaik0@gmail.com","2gi20is002@students.git.edu"});
                iemail.putExtra(Intent.EXTRA_SUBJECT,"Quaries");
                iemail.putExtra(Intent.EXTRA_TEXT,"please fuck yourself");
                startActivity(Intent.createChooser(iemail,"Email via "));
            }
        });
        btnshare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ishare=new Intent(Intent.ACTION_SEND);
                ishare.setType("text/plain");
                ishare.putExtra(Intent.EXTRA_TEXT,"downolad karoo bhai nothing will happen to your device ");
                startActivity(ishare);
            }
        });
    }
}