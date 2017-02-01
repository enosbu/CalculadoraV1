package com.example.enrique.calculadora;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;

public class calculator extends AppCompatActivity {

    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
    private TextView Display;
    private TextView Display3;
    private TextView Display4;
    private String num;
    private int tipe;
    private Float sum;
    private Float aux;
    private int igual;
    private float index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        b1=(Button)findViewById(R.id.button8);
        b2=(Button)findViewById(R.id.button10);
        b3=(Button)findViewById(R.id.button11);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button7);
        b6=(Button)findViewById(R.id.button5);
        b8=(Button)findViewById(R.id.button17);
        b9=(Button)findViewById(R.id.button16);
        b10=(Button)findViewById(R.id.button9);
        b11=(Button)findViewById(R.id.button12);
        b12=(Button)findViewById(R.id.button6);
        b13=(Button)findViewById(R.id.button3);
        b14=(Button)findViewById(R.id.button2);

        b16=(Button)findViewById(R.id.button15);
        b17=(Button)findViewById(R.id.button);
        Display=(TextView) findViewById(R.id.textView2);
        Display3=(TextView) findViewById(R.id.textView3);
        Display4=(TextView) findViewById(R.id.textView);
        limpiar2();
    }

    private void limpiar2() {
        Display.setText("");
        Display3.setText("");
        Display4.setText("");
        index=0;
        igual=0;
        sum= Float.valueOf(0);
    }

    public void Suma(View view){
            tipe=0;
            if(Display.getText()==""){
                Display3.setText("+");
            }
            else {
                if (Display4.getText() == "") {
                    sum = Float.parseFloat(String.valueOf(Display.getText()));
                    Display4.setText(String.valueOf(sum));
                    Display3.setText("+");
                    Display.setText("");
                    index = index + sum;
                } else {
                    if (Display.getText() != "") {
                        Display3.setText("+");
                        aux = Float.parseFloat(String.valueOf(Display.getText()));
                        sum = Float.parseFloat(String.valueOf(Display4.getText()));
                        index = aux + (sum);
                        Display4.setText(String.valueOf(index));
                        Display.setText("");
                    }

                }
            }
            if(igual==1){
                Display.setText("");
                igual=0;
            }
        }
        public void Multiplicacion(View view){
            tipe=0;
            if(Display.getText()==""){
                Display3.setText("*");
            }
            else {
                if (Display4.getText() == "") {
                    sum = Float.parseFloat(String.valueOf(Display.getText()));
                    Display4.setText(String.valueOf(sum));
                    Display3.setText("*");
                    Display.setText("");
                    index = index * sum;
                } else {
                    if (Display.getText() != "") {
                        Display3.setText("*");
                        aux = Float.parseFloat(String.valueOf(Display.getText()));
                        sum = Float.parseFloat(String.valueOf(Display4.getText()));
                        index = (aux)*(sum);
                        Display4.setText(String.valueOf(index));
                        Display.setText("");
                    }

                }
            }
            if(igual==1){
                Display.setText("");
                igual=0;
            }
        }

        public void Resta(View view){
             tipe=0;
            if(Display.getText()=="-"){
                Display3.setText("-");
            }
            else{
             if(Display.getText()==""){
                 Display.setText("-");
                 Display3.setText("-");
             }
             else {
                 if (Display4.getText() == "") {
                     sum = Float.parseFloat(String.valueOf(Display.getText()));
                     Display4.setText(String.valueOf(sum));
                     Display3.setText("-");
                     Display.setText("");
                     index = index + sum;
                 } else {
                     if (Display.getText() != "") {
                         Display3.setText("-");
                         aux = Float.parseFloat(String.valueOf(Display.getText()));
                         sum = Float.parseFloat(String.valueOf(Display4.getText()));
                         aux = (aux) * (-1);
                         index = aux + (sum);
                         Display4.setText(String.valueOf(index));
                         Display.setText("");
                     }

                 }
                 }
            }
             if(igual==1){
                 Display.setText("");
                 igual=0;
             }
        }

    public void Division(View view){
        tipe=0;
        if(Display.getText()==""){
            Display3.setText("/");
        }
        else {
            if (Display4.getText() == "") {
                sum = Float.parseFloat(String.valueOf(Display.getText()));
                Display4.setText(String.valueOf(sum));
                Display3.setText("/");
                Display.setText("");
                index = index + sum;
            } else {
                if (Display.getText() != "") {
                    Display3.setText("/");
                    aux = Float.parseFloat(String.valueOf(Display.getText()));
                    sum = Float.parseFloat(String.valueOf(Display4.getText()));
                    index = aux / (sum);
                    Display4.setText(String.valueOf(index));
                    Display.setText("");
                }

            }
        }
        if(igual==1){
            Display.setText("");
            igual=0;
        }
    }

        public void Total(View view){
            if(Display.getText()=="")
            { Display.setText(String.valueOf(index));
                index=0;}
            else{
                tipe=tipe+1;
                if(tipe==2){
                    Display.setText("");
                    Display3.setText("");
                    Display4.setText("");
                    index=0;
                    tipe=0;
                }
                else{
                    if(Display3.getText()=="+"){
                        Display3.setText("+");
                        aux = Float.parseFloat(String.valueOf(Display.getText()));
                        sum = Float.parseFloat(String.valueOf(Display4.getText()));
                        index = aux + (sum);
                        Display4.setText(String.valueOf(index));
                        Display.setText("");
                        index=0;
                        igual=1;
                        tipe=0;
                        sum= Float.valueOf(0);}
                    else if(Display3.getText()=="-"){
                        if(Display4.getText()==""){
                            Display4.setText(Display.getText());
                            Display3.setText("-");
                            Display.setText("");
                            index=0;
                            igual=1;
                            tipe=0;}
                        else{
                        Display3.setText("-");
                        aux = Float.parseFloat(String.valueOf(Display.getText()));
                        sum = Float.parseFloat(String.valueOf(Display4.getText()));
                        aux=(aux)*(-1);
                        index = aux + (sum);
                        Display4.setText(String.valueOf(index));
                        Display.setText("");
                        index=0;
                        igual=1;
                        tipe=0;
                        sum= Float.valueOf(0);}
                    }
                    else if(Display3.getText()=="*"){
                        Display3.setText("*");
                        aux = Float.parseFloat(String.valueOf(Display.getText()));
                        sum = Float.parseFloat(String.valueOf(Display4.getText()));
                        index = (aux) * (sum);
                        Display4.setText(String.valueOf(index));
                        Display.setText("");
                        index=0;
                        igual=1;
                        tipe=0;
                        sum= Float.valueOf(0);
                    }
                    else{
                        Display3.setText("/");
                        aux = Float.parseFloat(String.valueOf(Display.getText()));
                        sum = Float.parseFloat(String.valueOf(Display4.getText()));
                        index = (sum) / (aux);
                        Display4.setText(String.valueOf(index));
                        Display.setText("");
                        index=0;
                        igual=1;
                        tipe=0;
                        sum= Float.valueOf(0);
                    }

                }
            }

        }

            public void imprimir7(View view){
                    num = (String) Display.getText();
                    if(num==""){
                        Display.setText("7");
                    }
                    else{
                        String num2="7";
                        num=num+num2;
                        Display.setText(num);
                    }
            }

            public void imprimir1(View view){

                num = (String) Display.getText();
                if(num==""){
                    Display.setText("1");
                }
                else{
                    String num2="1";
                    num=num+num2;
                    Display.setText(num);
                }
            }
        public void imprimir2(View view){
            num = (String) Display.getText();
            if(num==""){
                Display.setText("2");
            }
            else{
                String num2="2";
                num=num+num2;
                Display.setText(num);
            }
        }
        public void imprimir3(View view){

                num = (String) Display.getText();
                if(num==""){
                    Display.setText("3");
                }
                else{
                    String num2="3";
                    num=num+num2;
                    Display.setText(num);
                }
            }

        public void imprimir4(View view){
                num = (String) Display.getText();
                if(num==""){
                    Display.setText("4");
                }
                else{
                    String num2="4";
                    num=num+num2;
                    Display.setText(num);
                }
        }
        public void imprimir5(View view){

                num = (String) Display.getText();
                if(num==""){
                    Display.setText("5");
                }
                else{
                    String num2="5";
                    num=num+num2;
                    Display.setText(num);
                }
            }

        public void imprimir6(View view){
                num = (String) Display.getText();
                if(num==""){
                    Display.setText("6");
                }
                else{
                    String num2="6";
                    num=num+num2;
                    Display.setText(num);
                }
            }

        public void imprimir8(View view){
                num = (String) Display.getText();
                if(num==""){
                    Display.setText("8");
                }
                else{
                    String num2="8";
                    num=num+num2;
                    Display.setText(num);
                }
            }

        public void imprimir9(View view){
                num = (String) Display.getText();
                if(num==""){
                    Display.setText("9");
                }
                else{
                    String num2="9";
                    num=num+num2;
                    Display.setText(num);
                }
            }

        public void imprimir0(View view){

                num = (String) Display.getText();
                if(num==""){
                    Display.setText("0");
                }
                else{
                    String num2="0";
                    num=num+num2;
                    Display.setText(num);
                }
            }

        public void limpiar(View view){

                Display.setText("");
                Display3.setText("");
                Display4.setText("");
                index=0;
                igual=0;
                sum= Float.valueOf(0);

            }

    }

