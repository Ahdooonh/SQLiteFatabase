package android.sas.ita.sqlitefatabasedemo;

import android.os.Bundle;
import android.sas.ita.sqlitefatabasedemo.database_module.DetabaseHelperClass;
import android.sas.ita.sqlitefatabasedemo.database_module.Student;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText name,department;
    String name1,department1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void save(View view)
    {
        name=(EditText)findViewById(R.id.name);
        department=(EditText)findViewById(R.id.name);
        name1=name.getText().toString();
        department1=department.getText().toString();

        Student student= new Student();
        student.setName(name1);
        student.setDepartment(department1);
        DetabaseHelperClass myHelpoer=new DetabaseHelperClass(this);
        long l =myHelpoer.insertStudentRecord(student);
        if(1>0)
        {
            Toast.makeText(this,"Success",Toast.LENGTH_SHORT).show();

        }
        else
        {
            Toast.makeText(this,"Success",Toast.LENGTH_SHORT).show();
        }
    }
    public void display(View view)
    {


    }
}
