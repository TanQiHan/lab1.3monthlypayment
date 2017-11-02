package my.edu.tarc.lab13monthlypayment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextSalary, editTextVehiclePrice, editTextDownpayment, editTextInterestRate, editTextRepaymentmonth;
    public static final String Loan_payment = "payment";
    public static final String Loan_status = "status";
    public static final String Loan_availability = "availability";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextSalary = (EditText) findViewById(R.id.editTextSalary);
        editTextVehiclePrice = (EditText) findViewById(R.id.editTextVehiclePrice);
        editTextDownpayment = (EditText) findViewById(R.id.editTextDownpayment);
        editTextInterestRate = (EditText) findViewById(R.id.editTextInterestRate);
        editTextRepaymentmonth = (EditText) findViewById(R.id.editTextRepaymentmonth);


    }

    public void calculatemonthlypayment(View view) {
        Double totalinterest, loan, monthlypayment, limit;
        totalinterest = (Double.parseDouble(editTextVehiclePrice.getText().toString()) - Double.parseDouble(editTextDownpayment.getText().toString())) * (Double.parseDouble(editTextInterestRate.getText().toString()) / 100) * (Double.parseDouble(editTextRepaymentmonth.getText().toString()) / 12);
        loan = (Double.parseDouble(editTextVehiclePrice.getText().toString()) - Double.parseDouble(editTextDownpayment.getText().toString())) + totalinterest;
        monthlypayment = loan / Double.parseDouble(editTextRepaymentmonth.getText().toString());
        limit = Double.parseDouble(editTextSalary.getText().toString()) * 0.3;
        String status;
        Boolean availablility;
        if (monthlypayment < limit) {
            status = "Approved";
            availablility = true;
        } else {
            status = "Rejected";
            availablility = false;
        }

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra(Loan_payment, monthlypayment);
        intent.putExtra(Loan_status, status);
        intent.putExtra(Loan_availability, availablility);
        startActivity(intent);


    }

    public void resetvalue() {
        editTextDownpayment.setText("");
        editTextInterestRate.setText("");
        editTextRepaymentmonth.setText("");
        editTextSalary.setText("");
        editTextVehiclePrice.setText("");

    }
}
