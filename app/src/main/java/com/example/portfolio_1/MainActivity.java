package com.example.portfolio_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView result, textView;
    Button add, sub, mul, div, back, equal, clear;
    String number;
    int value;
    int DIV = 0;
    int ADD =1;
    int MUL = 2;
    int SUB = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result=(TextView)findViewById(R.id.result);
        textView=(TextView)findViewById(R.id.text);
        number="";
        div = findViewById(R.id.div);
        add = findViewById(R.id.add);
        equal = findViewById(R.id.equal);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        back = findViewById(R.id.back);

        div.setOnClickListener(mListener);
        add.setOnClickListener(mListener);
        equal.setOnClickListener(mListener);
        sub.setOnClickListener(mListener);
        mul.setOnClickListener(mListener);
        back.setOnClickListener(mListener);

        clear = findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number="";
                result.setText("");
                textView.setText("");
            }
        });
    }
    Button.OnClickListener mListener = new Button.OnClickListener(){
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                
                case R.id.div: number = result.getText().toString();
                result.setText("");value = DIV; textView.append("÷");break;
                case R.id.add: number = result.getText().toString();
                    result.setText("");value = ADD; textView.append("+");break;
                case R.id.sub: number = result.getText().toString();
                    result.setText("");value = SUB; textView.append("-");break;
                case R.id.mul: number = result.getText().toString();
                    result.setText("");value = MUL; textView.append("×");break;
                case R.id.back:String del_number = result.getText().toString();
                     result.setText(del_number.substring(0,del_number.length() - 1));
                     textView.setText(del_number.substring(0,del_number.length() - 1));
                     break;

                case R.id.equal:
                    if(value==MUL){
                        result.setText(""+(Double.parseDouble(number)*Double.parseDouble(result.getText().toString())));
                    }
                    else if(value==DIV){
                        result.setText(""+(Double.parseDouble(number)/Double.parseDouble(result.getText().toString())));
                    }
                    else if(value==SUB){
                        result.setText(""+(Double.parseDouble(number)-Double.parseDouble(result.getText().toString())));
                    }
                    else if(value==ADD){
                        result.setText(""+(Double.parseDouble(number)+Double.parseDouble(result.getText().toString())));
                    }
                    textView.setText("");
                    number=result.getText().toString();
                    break;
            }
        }
    };
    public void onClick (View v)
    {
        switch(v.getId()){
            case R.id.num0 : result.setText(result.getText().toString() + 0); textView.append("0");break;
            case R.id.num1 : result.setText(result.getText().toString() + 1); textView.append("1");break;
            case R.id.num2 : result.setText(result.getText().toString() + 2); textView.append("2");break;
            case R.id.num3 : result.setText(result.getText().toString() + 3); textView.append("3");break;
            case R.id.num4 : result.setText(result.getText().toString() + 4); textView.append("4");break;
            case R.id.num5 : result.setText(result.getText().toString() + 5); textView.append("5");break;
            case R.id.num6 : result.setText(result.getText().toString() + 6); textView.append("6");break;
            case R.id.num7 : result.setText(result.getText().toString() + 7); textView.append("7");break;
            case R.id.num8 : result.setText(result.getText().toString() + 8); textView.append("8");break;
            case R.id.num9 : result.setText(result.getText().toString() + 9); textView.append("9");break;
        }
    }
}
