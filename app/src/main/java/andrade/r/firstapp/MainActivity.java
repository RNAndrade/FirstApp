package andrade.r.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btChange = (Button) findViewById(R.id.bt_change);
        Button btClear = (Button) findViewById(R.id.bt_clear);


        btChange.setOnClickListener(new View.OnClickListener() {

                                        EditText edtText = (EditText) findViewById(R.id.editText);

                                        @Override
                                        public void onClick(View v) {
                                            Toast.makeText(MainActivity.this, "Ola, "+ edtText.getText(), Toast.LENGTH_LONG).show();
                                        }

                                    }
        );
    }
}
