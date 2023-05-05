package sg.edu.rp.c346.id22015056.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    TextView tvDisplay;
    EditText etInput;
    Button btnDisplay;

    ToggleButton tbtn;
    RadioGroup rgGender;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDisplay=findViewById(R.id.textViewDisplay);
        etInput=findViewById(R.id.editTextInput);
        btnDisplay=findViewById(R.id.buttonDisplay);
        tbtn=findViewById(R.id.toggleButtonEnabled);
        rgGender=findViewById(R.id.RadioGroupGender);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String said="";
                int checkedRadioId=rgGender.getCheckedRadioButtonId();
                if(checkedRadioId==R.id.radioButtonGenderMale){
                    said="He said ";
                }
                else{
                    said="She said ";
                }

                String stringResponse = etInput.getText().toString();
                tvDisplay.setText(said + stringResponse);
                Toast.makeText(MainActivity.this, "Text changed to "+stringResponse,
                        Toast.LENGTH_LONG).show();
            }
        });
        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                if(tbtn.isChecked()) {
                    etInput.setEnabled(true);
                }
                else{
                    etInput.setEnabled(false);
                }
            }
        });

    }
}