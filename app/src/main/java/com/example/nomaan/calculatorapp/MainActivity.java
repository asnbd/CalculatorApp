package com.example.nomaan.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText display;
    TextView resultView;
    Button btnEqual, btnPlus, btnMinus, btnMul, btnDiv, btnCE, btnC, btnBackspace, btnDot, btnPlusMinus;
    Button btn[] = new Button[10];

    int lastOpr = 0;
    double result = 0;
    boolean displayFlag = false;
    boolean resultFlag = false;
    boolean dotFlag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.display);
        resultView = findViewById(R.id.result);

        btnEqual = findViewById(R.id.btn_equal);
        btnPlus = findViewById(R.id.btn_plus);
        btnMinus = findViewById(R.id.btn_minus);
        btnMul = findViewById(R.id.btn_mul);
        btnDiv = findViewById(R.id.btn_div);
        btnCE = findViewById(R.id.btn_ce);
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

        display.setKeyListener(null);

        btn[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonAction(0);
            }
        });
        btn[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonAction(1);
            }
        });
        btn[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonAction(2);
            }
        });
        btn[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonAction(3);
            }
        });
        btn[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonAction(4);
            }
        });
        btn[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonAction(5);
            }
        });
        btn[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonAction(6);
            }
        });
        btn[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonAction(7);
            }
        });
        btn[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonAction(8);
            }
        });
        btn[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonAction(9);
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oprBtnAction(1);
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oprBtnAction(2);
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oprBtnAction(3);
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oprBtnAction(4);
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (display.getText().toString().equals("+") || display.getText().toString().equals("-") || display.getText().toString().equals("*") || display.getText().toString().equals("/"))
                    return;
                else if (lastOpr == 1) {
                    result += Double.parseDouble(display.getText().toString());
                } else if (lastOpr == 2) {
                    result -= Double.parseDouble(display.getText().toString());
                } else if (lastOpr == 3) {
                    result *= Double.parseDouble(display.getText().toString());
                } else if (lastOpr == 4) {
                    result /= Double.parseDouble(display.getText().toString());
                } else {
                    result = Double.parseDouble(display.getText().toString());
                }
                lastOpr = 0;
                display.setText(result + "");
                resultView.setText(result + "");
                displayFlag = true;
                resultFlag = true;
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayFlag = false;
                resultFlag = false;
                result = 0;
                lastOpr = 0;
                display.setText("0");
                resultView.setText("0");
            }
        });

        btnCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText("0");
                dotFlag = false;
            }
        });

        btnBackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (display.getText().toString().isEmpty()) {
                    display.setText("0");
                } else if (display.getText().toString().length() == 1) {
                    display.setText("0");
                } else {
                    int lastIndex = display.getText().toString().length() - 1;
                    display.setText(display.getText().toString().substring(0, lastIndex));
                }
            }
        });

        btnPlusMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText("" + -1 * Double.parseDouble(display.getText().toString()));
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!dotFlag) {
                    dotFlag = true;
                    display.setText(display.getText().toString() + ".");

                    if (resultFlag) {
                        result = 0;
                        resultFlag = false;
                        display.setText(".");
                     //   dotFlag = false;
                    }
                    if (displayFlag) {
                        display.setText(".");
                        displayFlag = false;
                    }
                }
            }
        });
    }

    private void oprBtnAction(int opr) {
        if (opr == 1) {
            lastOpr = 1;
            if (resultFlag) {
                result = Double.parseDouble(display.getText().toString());
                resultFlag = false;
            } else {
                result += Double.parseDouble(display.getText().toString());
            }
            display.setText("+");
        } else if (opr == 2) {
            lastOpr = 2;
            if (resultFlag) {
                result = Double.parseDouble(display.getText().toString());
                resultFlag = false;
            } else {
                if (result == 0) {
                    result = Double.parseDouble(display.getText().toString());
                } else {
                    result -= Double.parseDouble(display.getText().toString());
                }
            }
            display.setText("-");
        } else if (opr == 3) {
            lastOpr = 3;
            if (resultFlag) {
                result = Double.parseDouble(display.getText().toString());
                resultFlag = false;
            } else {
                if (result == 0) {
                    result = Double.parseDouble(display.getText().toString());
                } else {
                    result *= Double.parseDouble(display.getText().toString());
                }
            }
            display.setText("*");
        } else if (opr == 4) {
            lastOpr = 4;
            if (resultFlag) {
                result = Double.parseDouble(display.getText().toString());
                resultFlag = false;
            } else {
                if (result == 0) {
                    result = Double.parseDouble(display.getText().toString());
                } else {
                    result /= Double.parseDouble(display.getText().toString());
                }
            }
            display.setText("/");
        }

        resultView.setText("" + result);
        displayFlag = true;
        dotFlag = false;
    }

    private void buttonAction(int btn) {
        if (btn == 0) {
            if (resultFlag) {
                result = 0;
                resultFlag = false;
                dotFlag = false;
            }
            if (displayFlag) {
                display.setText("0");
                displayFlag = false;
                dotFlag = false;
            } else if (!display.getText().toString().equals("0")) {
                display.setText(display.getText().toString() + "0");
            }
        } else {
            if (resultFlag) {
                result = 0;
                resultFlag = false;
                dotFlag = false;
            }
            if (displayFlag || display.getText().toString().equals("0")) {
                display.setText(btn + "");
                displayFlag = false;
                dotFlag = false;
            } else {
                display.setText(display.getText().toString() + btn);
            }
        }
    }
}
