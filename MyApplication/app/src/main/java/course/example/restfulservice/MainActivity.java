package course.example.restfulservice;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {
    Button mybtn;
    TextView txtView;
    String hello;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.content_main);
        super.onCreate(savedInstanceState);

        mybtn = (Button)findViewById(R.id.mybtn);
        txtView=(TextView)findViewById(R.id.txtView);
        hello="This is my first project";


        mybtn.setOnClickListener(this);
    }

    public void onClick(View view){
        txtView.setText(hello);

        //printmyname();
        Toast.makeText(MainActivity.this, hello, Toast.LENGTH_LONG).show();

    }
    private void printmyname(){
        System.out.println("coming");

    }
}
