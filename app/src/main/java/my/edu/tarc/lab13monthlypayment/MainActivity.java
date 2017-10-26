package my.edu.tarc.lab13monthlypayment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewResult;
    private EditText editTextSalary,editTextVehiclePrice,editTextDownpayment,editTextInterestRate,editTextRepaymentmonth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextSalary =(EditText)findViewById(R.id.editTextSalary);
        editTextVehiclePrice=(EditText)findViewById(R.id.editTextVehiclePrice);
        editTextDownpayment=(EditText)findViewById(R.id.editTextDownpayment);
        editTextInterestRate=(EditText)findViewById(R.id.editTextInterestRate);
        editTextRepaymentmonth=(EditText)findViewById(R.id.editTextRepaymentmonth);
        textViewResult=(TextView)findViewById(R.id.textViewResult);

    }
    public void calculatemonthlypayment(View view){
        Double totalinterest,loan,monthlypayment,limit;

        totalinterest=(Double.parseDouble(editTextVehiclePrice.getText().toString())-Double.parseDouble(editTextDownpayment.getText().toString()))*Double.parseDouble(editTextInterestRate.getText().toString())*(Double.parseDouble(editTextRepaymentmonth.getText().toString())/12);
        loan=(Double.parseDouble(editTextVehiclePrice.getText().toString())-Double.parseDouble(editTextDownpayment.getText().toString()))+totalinterest;
        monthlypayment=loan/Double.parseDouble(editTextRepaymentmonth.getText().toString());


        if(monthlypayment>)



    }
}
