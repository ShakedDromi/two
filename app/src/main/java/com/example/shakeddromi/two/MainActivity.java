package com.example.shakeddromi.two;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.shakeddromi.two.Main2Activity;
import com.example.shakeddromi.two.R;

import java.util.EmptyStackException;

public class MainActivity extends AppCompatActivity{

    EditText et;
    double n,y;
    boolean bo=true;
    String st;
    int last=1;
    String lastAnswer="not yet";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=(EditText) findViewById(R.id.et);
    }

    public void plus(View view) {
        if(bo) {
            st=et.getText().toString();
            if((st.length()!=0)&&(st.length()<=10)){
                n=Double.parseDouble(st);
                et.setHint(""+n);
                et.setText("");
                bo=false;}
            else {
                et.setText("");
                et.setHint("Start Again");
                bo=true;
            }
        }
        else {
            st=et.getText().toString();
            if((st.length()!=0)&&(st.length()<=10)){
                y=Double.parseDouble(st);
                switch (last) {
                    case 1: n=n+y;
                        break;
                    case 2: n=n-y;
                        break;
                    case 3: n=n*y;
                        break;
                    case 4: if(y!=0){
                        n=n/y;}
                    else{ et.setText("");
                        et.setHint("Start Again");
                        bo=true;}
                        break;}
                et.setHint(""+n);
                et.setText("");
            }
            else {
                et.setText("");
                et.setHint("Start Again");
                bo=true;
            }
        }

        last=1;
    }

    public void minus(View view) {

        if(bo) {
            st=et.getText().toString();
            if((st.length()!=0)&&(st.length()<=10)){
                n=Double.parseDouble(st);
                et.setHint(""+n);
                et.setText("");
                bo=false;}
            else {
                et.setText("");
                et.setHint("Start Again");
                bo=true;
            }
        }
        else {
            st=et.getText().toString();
            if((st.length()!=0)&&(st.length()<=10)){
                y=Double.parseDouble(st);
                switch (last) {
                    case 1: n=n+y;
                        break;
                    case 2: n=n-y;
                        break;
                    case 3: n=n*y;
                        break;
                    case 4: if(y!=0){
                        n=n/y;}
                    else{ et.setText("");
                        et.setHint("Start Again");
                        bo=true;}
                        break;}
                et.setHint(""+n);
                et.setText("");
            }
            else {
                et.setText("");
                et.setHint("Start Again");
                bo=true;
            }
        }

        last=2;
    }



    public void multipy(View view) {


        if(bo) {
            st=et.getText().toString();
            if((st.length()!=0)&&(st.length()<=10)){
                n=Double.parseDouble(st);
                et.setHint(""+n);
                et.setText("");
                bo=false;}
            else {
                et.setText("");
                et.setHint("Start Again");
                bo=true;
            }
        }
        else {
            st=et.getText().toString();
            if((st.length()!=0)&&(st.length()<=10)){
                y=Double.parseDouble(st);
                switch (last) {
                    case 1: n=n+y;
                        break;
                    case 2: n=n-y;
                        break;
                    case 3: n=n*y;
                        break;
                    case 4: if(y!=0){
                        n=n/y;}
                    else{ et.setText("");
                        et.setHint("Start Again");
                        bo=true;}
                        break;}
                et.setHint(""+n);
                et.setText("");
            }
            else {
                et.setText("");
                et.setHint("Start Again");
                bo=true;
            }
        }

        last=3;
    }



    public void devide(View view) {


        if(bo) {
            st=et.getText().toString();
            if((st.length()!=0)&&(st.length()<=10)){
                n=Double.parseDouble(st);
                et.setText("");
                et.setHint(""+n);
                bo=false;}
            else {
                et.setText("");
                et.setHint("Start Again");
                bo=true;
            }
        }
        else {
            st=et.getText().toString();
            if((st.length()!=0)&&(st.length()<=10)){
                y=Double.parseDouble(st);
                switch (last) {
                    case 1: n=n+y;
                        break;
                    case 2: n=n-y;
                        break;
                    case 3: n=n*y;
                        break;
                    case 4: if(y!=0){
                        n=n/y;}
                    else{ et.setText("");
                        et.setHint("Start Again");
                        bo=true;}
                        break;}
                et.setHint(""+n);
                et.setText("");
            }
            else {
                et.setText("");
                et.setHint("Start Again");
                bo=true;
            }
        }

        last=4;
    }

    public void shave(View view) {
        if(bo) {
            st=et.getText().toString();
            if((st.length()!=0)&&(st.length()<=10)){
                n=Double.parseDouble(st);
                et.setText("Answer="+n);
                bo=false;}
            else {
                et.setText("");
                et.setHint("Start Again");
                bo=true;
            }
        }
        else {
            st=et.getText().toString();
            if((st.length()!=0)&&(st.length()<=10)){
                y=Double.parseDouble(st);
                switch (last) {
                    case 1: n=n+y;
                        break;
                    case 2: n=n-y;
                        break;
                    case 3: n=n*y;
                        break;
                    case 4: if(y!=0){
                        n=n/y;}
                    else{ et.setText("");
                        et.setHint("Start Again");
                        bo=true;}
                        break;}
                et.setText("Answer="+n);
                lastAnswer=""+n;
            }
            else {
                et.setText("");
                et.setHint("Start Again");
                bo=true;
            }
        }



    }

    public void ac(View view) {
        et.setText("");
        et.setHint("");
        bo=true;
    }

    public void credits(View view) {
        Intent si=new Intent(this,Main2Activity.class);
        si.putExtra("Answer",lastAnswer);
        startActivity(si);}

}