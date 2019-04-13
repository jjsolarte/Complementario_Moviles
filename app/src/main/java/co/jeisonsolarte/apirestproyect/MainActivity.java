package co.jeisonsolarte.apirestproyect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    TextView edtCambiarFoto;
    Boolean ban;
    Button button1;
    RadioGroup radioGroup;
    EditText edtNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=findViewById(R.id.main_img);
        edtCambiarFoto=findViewById(R.id.main_subirFoto);
        ban=true;
        radioGroup=findViewById(R.id.main_radiog);
        button1=findViewById(R.id.btn);
        edtNombre=findViewById(R.id.edtnombre);

        edtCambiarFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ban){
                    imageView.setImageResource(R.drawable.ic_launcher_foreground);
                    ban=false;
                }
                else{
                    imageView.setImageResource(R.mipmap.ic_launcher);
                    ban=true;
                }
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (R.id.radio1 == checkedId)
                    Toast.makeText(MainActivity.this, "Checked Radio 1", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Checked Radio 2", Toast.LENGTH_SHORT).show();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "ok "+edtNombre.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }


}
