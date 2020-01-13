package com.example.lenovo.sfarApp.clerk;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.lenovo.sfar.R;
import com.example.lenovo.sfarApp.dbutil.Constants;
import com.example.lenovo.sfarApp.dbutil.Manager;

public class DeleteClerk extends AppCompatActivity {
    Manager cm;
    SQLiteDatabase sb;
    EditText deleteid;
    String del_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);
        cm=new Manager(this);
        sb=cm.openDb();
        deleteid=(EditText)findViewById(R.id.deleteid);
    }

    public  void DeleteData(View v)
    {
        del_id=deleteid.getText().toString();
        // String em="abc@gmail.com";
        String args[]={del_id};
        long rw=  sb.delete(Constants.TBL_NAME, Constants.COL_ID+" =?",args);
        //? is place holder
        if(rw>0)
            Toast.makeText(this,"datadelete",Toast.LENGTH_SHORT).show();

    }
}
