package my.edu.tarc.lab13monthlypayment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView textViewstatus,textViewmonthlypayment;
    private ImageView imageViewresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent=getIntent();
        double payment=intent.getDoubleExtra(MainActivity.Loan_payment,0);
        String status=intent.getStringExtra(MainActivity.Loan_status);
        Boolean availability=intent.getBooleanExtra(MainActivity.Loan_availability,false);
        textViewstatus=(TextView)findViewById(R.id.textViewstatus);
        textViewmonthlypayment=(TextView)findViewById(R.id.textViewmonthlypayment);
        imageViewresult=(ImageView)findViewById(R.id.imageViewresult);
        textViewmonthlypayment.setText("Monthly Payment :"+String.format("%.2f",payment));
        textViewstatus.setText("Status :"+status);
if(availability){
    imageViewresult.setImageResource(R.drawable.up);
}
else{
    imageViewresult.setImageResource(R.drawable.down);
}



    }
    public void cloaseavtivity(View view){
        finish();
    }

}
