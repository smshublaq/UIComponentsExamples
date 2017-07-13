package edu.gsg.uicomponentsexamples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

// implements View.OnClickListener
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button)findViewById(R.id.btn);
        final EditText et = (EditText)findViewById(R.id.etName);
        final EditText etNum = (EditText)findViewById(R.id.etNum);
        final TextView tvResult = (TextView)findViewById(R.id.tvResult);
        RatingBar ratingBar = (RatingBar)findViewById(R.id.ratingBar);
        et.setText(R.string.app_name);
        et.setText("Ahmed");
        List<Student> student = new ArrayList();
        student.add(new Student("ahmed","123"));
        student.add(new Student("asda","213"));
        student.add(new Student("dfs","532"));

        RadioGroup group = (RadioGroup)findViewById(R.id.radioGroup);
        Spinner spinner = (Spinner)findViewById(R.id.spinner);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //String value = et.getText().toString();
                int num1 = Integer.parseInt(et.getText().toString());
                int num2 = Integer.parseInt(etNum.getText().toString());
                int result = num1 + num2;
                tvResult.setText(result+"");
                //Toast.makeText(view.getContext(), "Button Clicked Programmatically " + value, Toast.LENGTH_SHORT).show();
                //et.setSelection(0,3);
            }
        });
        //ArrayAdapter<String> adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1);
        ArrayAdapter<String> adapter = new ArrayAdapter(this,R.layout.spinner_layout,R.id.tvItem,student);
        /*
        adapter.add("ahmed");
        adapter.add("yousef");
        adapter.add("mohammed");
        */
        spinner.setAdapter(adapter);

        //btn.setOnClickListener(this);

        SeekBar seekBar = (SeekBar)findViewById(R.id.seekBar);
        seekBar.setProgress(10);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean isUser) {
                tvResult.setText(progress+"");
                tvResult.setTextSize(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "onStartTrackingTouch", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "onStopTrackingTouch", Toast.LENGTH_SHORT).show();

            }
        });

        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                RadioButton radio = (RadioButton)radioGroup.findViewById(id);
                Toast.makeText(MainActivity.this, radio.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float step, boolean isUser) {
                Toast.makeText(MainActivity.this, step+"", Toast.LENGTH_SHORT).show();

            }
        });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                //String selectedItem = (String)adapterView.getItemAtPosition(position);
                Student selectedItem = (Student)adapterView.getItemAtPosition(position);
                Toast.makeText(MainActivity.this, selectedItem.getId(), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }


    

    /*
    @Override
    public void onClick(View view) {
        Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show();
    }
    */


    public void btnClick(View v){
        Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show();
        
    }

}
