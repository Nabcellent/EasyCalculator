package com.example.easycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView solutionTxt, resultTxt;
    MaterialButton btnC, btnBrackOpen, btnBrackClose;
    MaterialButton btnDivide, btnMultiply, btnPlus, btnMinus, btnEquals;
    MaterialButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    MaterialButton btnAC, btnDot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTxt = findViewById(R.id.result);
        solutionTxt = findViewById(R.id.solution);

        assignId(btnC, R.id.btn_c);
        assignId(btnBrackOpen, R.id.btn_open_bracket);
        assignId(btnBrackClose, R.id.btn_close_bracket);
        assignId(btnDivide, R.id.btn_divide);
        assignId(btnMultiply, R.id.btn_multiply);
        assignId(btnPlus, R.id.btn_plus);
        assignId(btnMinus, R.id.btn_minus);
        assignId(btnEquals, R.id.btn_equals);
        assignId(btn0, R.id.btn_zero);
        assignId(btn1, R.id.btn_one);
        assignId(btn2, R.id.btn_two);
        assignId(btn3, R.id.btn_three);
        assignId(btn4, R.id.btn_four);
        assignId(btn5, R.id.btn_five);
        assignId(btn6, R.id.btn_six);
        assignId(btn7, R.id.btn_seven);
        assignId(btn8, R.id.btn_eight);
        assignId(btn9, R.id.btn_nine);
        assignId(btnAC, R.id.btn_ac);
        assignId(btnDot, R.id.btn_dot);
    }

    void assignId(MaterialButton btn, int id) {
        btn = findViewById(id);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        MaterialButton button = (MaterialButton) view;
        String btnText = button.getText().toString();
        String dataToCalculate = solutionTxt.getText().toString();

        if (btnText.equals("AC")) {
            solutionTxt.setText("");
            resultTxt.setText(0);
            return;
        } else if (btnText.equals("")) {
            solutionTxt.setText(resultTxt.getText());
            return;
        } else if (btnText.equals("C")) {
            dataToCalculate = dataToCalculate.substring(0, dataToCalculate.length() - 1);
        } else {
            dataToCalculate = dataToCalculate + btnText;
        }

        solutionTxt.setText(dataToCalculate);
    }

    String solve(String data) {
        return "Calculateed";
    }
}