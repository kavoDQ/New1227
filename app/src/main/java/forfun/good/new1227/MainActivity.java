package forfun.good.new1227;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    TextView tv;
    EditText ed;
    EditText ed2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.textView2);
        ed = (EditText) findViewById(R.id.editText);
        ed2 = (EditText) findViewById(R.id.editText2);



    }
    public void CL1(View v)
    {
        int num1 = Integer.parseInt(ed.getText().toString());
        int num2 = Integer.parseInt(ed2.getText().toString());
        tv.setText("兩個相加是"+(num1+num2));
        /*
          EditText ed1, ed2;
        ed1 = (EditText) findViewById(R.id.editText);
        ed2 = (EditText) findViewById(R.id.editText2);
        int q1 = Integer.valueOf(ed1.getText().toString());
        int q2 = Integer.valueOf(ed2.getText().toString());
        int ans = q1 + q2;
        TextView tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setText(String.valueOf(ans));
        老師的寫法
         */
    }

}
