package com.dilm.toasty;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class MathCalMessageDialog extends Dialog {

    private TextView tvResultValue;
    private Button btnClose;
    private final String msg;

    public MathCalMessageDialog(@NonNull Context ctx, String msg) {
        super(ctx);
        this.msg = msg;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_dialog_math_cal_message_display);

        initViews();
        initObjects();
        initListeners();
    }

    private void initViews() {
        tvResultValue = findViewById(R.id.tv_result_value);
        btnClose = findViewById(R.id.btn_close);
    }

    private void initObjects() {
        tvResultValue.setText(msg);
    }

    private void initListeners() {
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
    }
}
