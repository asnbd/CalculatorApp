package com.example.nomaan.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText display;
    Button btnEqual, btnPlus, btnMinus, btnMul, btnDiv, btnC, btnBackspace, btnDot, btnPlusMinus;
    Button btn[] = new Button[10];

    int lastOpr = 0;
    double result = 0;
    boolean displayFlag = false;
    boolean resultFlag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.display);

        btnEqual = findViewById(R.id.btn_equal);
        btnPlus = findViewById(R.id.btn_plus);
        btnMinus = findViewById(R.id.btn_minus);
        btnMul = findViewById(R.id.btn_mul);
        btnDiv = findViewById(R.id.btn_div);
        btnC = findViewById(R.id.btn_c);
        btnBackspace = findViewById(R.id.btn_backspace);
        btnDot = findViewById(R.id.btn_dot);
        btnPlusMinus = findViewById(R.id.btn_plus_minus);

        btn[0] = findViewById(R.id.btn_0);
        btn[1] = findViewById(R.id.btn_1);
        btn[2] = findViewById(R.id.btn_2);
        btn[3] = findViewById(R.id.btn_3);
        btn[4] = findViewById(R.id.btn_4);
        btn[5] = findViewById(R.id.btn_5);
        btn[6] = findViewById(R.id.btn_6);
        btn[7] = findViewById(R.id.btn_7);
        btn[8] = findViewById(R.id.btn_8);
        btn[9] = findViewById(R.id.btn_9);

        btn[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resultFlag) {
                    result = 0;
                    resultFlag = false;
                }
                if (displayFlag) {
                    display.setText("0");
                    displayFlag = false;
                } else if (!display.getText().toString().equals("0")) {
                    display.setText(display.getText().toString() + "0");
                }
            }
        });

        btn[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resultFlag) {
                    result = 0;
                    resultFlag = false;
                }
                if (displayFlag || display.getText().toString().equals("0")) {
                    display.setText("1");
                    displayFlag = false;
                } else {
                    display.setText(display.getText().toString() + "1");
                }
            }
        });


        btn[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resultFlag) {
                    result = 0;
                    resultFlag = false;
                }
                if (displayFlag || display.getText().toString().equals("0")) {
                    display.setText("2");
                    displayFlag = false;
                } else {
                    display.setText(display.getText().toString() + "2");
                }
            }
        });

        btn[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resultFlag) {
                    result = 0;
                    resultFlag = false;
                }
                if (displayFlag || display.getText().toString().equals("0")) {
                    display.setText("3");
                    displayFlag = false;
                } else {
                    display.setText(display.getText().toString() + "3");
                }
            }
        });

        btn[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resultFlag) {
                    result = 0;
                    resultFlag = false;
                }
                if (displayFlag || display.getText().toString().equals("0")) {
                    display.setText("4");
                    displayFlag = false;
                } else {
                    display.setText(display.getText().toString() + "4");
                }
            }
        });

        btn[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resultFlag) {
                    result = 0;
                    resultFlag = false;
                }
                if (displayFlag || display.getText().toString().equals("0")) {
                    display.setText("5");
                    displayFlag = false;
                } else {
                    display.setText(display.getText().toString() + "5");
                }
            }
        });

        btn[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resultFlag) {
                    result = 0;
                    resultFlag = false;
                }
                if (displayFlag || display.getText().toString().equals("0")) {
                    display.setText("6");
                    displayFlag = false;
                } else {
                    display.setText(display.getText().toString() + "6");
                }
            }
        });

        btn[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resultFlag) {
                    result = 0;
                    resultFlag = false;
                }
                if (displayFlag || display.getText().toString().equals("0")) {
                    display.setText("7");
                    displayFlag = false;
                } else {
                    display.setText(display.getText().toString() + "7");
                }
            }
        });

        btn[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resultFlag) {
                    result = 0;
                    resultFlag = false;
                }
                if (displayFlag || display.getText().toString().equals("0")) {
                    display.setText("8");
                    displayFlag = false;
                } else {
                    display.setText(display.getText().toString() + "8");
                }
            }
        });

        btn[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resultFlag) {
                    result = 0;
                    resultFlag = false;
                }
                if (displayFlag || display.getText().toString().equals("0")) {
                    display.setText("9");
                    displayFlag = false;
                } else {
                    display.setText(display.getText().toString() + "9");
                }
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lastOpr = 1;
                result += Double.parseDouble(display.getText().toString());
                display.setText(result + "");
                displayFlag = true;
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lastOpr = 2;
                result -= Double.parseDouble(display.getText().toString());
                display.setText(result + "");
                displayFlag = true;
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lastOpr = 3;
                result *= Double.parseDouble(display.getText().toString());
                display.setText(result + "");
                displayFlag = true;
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lastOpr = 4;
                result /= Double.parseDouble(display.getText().toString());
                display.setText(result + "");
                displayFlag = true;
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (lastOpr == 0)
                    result = Double.parseDouble(display.getText().toString());
                else if (lastOpr == 1)
                    result += Double.parseDouble(display.getText().toString());
                else if (lastOpr == 2)
                    result -= Double.parseDouble(display.getText().toString());
                else if (lastOpr == 3)
                    result *= Double.parseDouble(display.getText().toString());
                else if (lastOpr == 4)
                    result /= Double.parseDouble(display.getText().toString());

                display.setText(result + "");
                displayFlag = true;
                resultFlag = true;
            }
        });

    }

/*    private void buttonAction(int opr) {

    }*/
}
