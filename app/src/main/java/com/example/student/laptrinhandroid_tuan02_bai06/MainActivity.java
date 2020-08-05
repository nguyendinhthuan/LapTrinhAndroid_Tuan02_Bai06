package com.example.student.laptrinhandroid_tuan02_bai06;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private TextView tv_KetQua;
    private ListView listView;
    private String[] array;
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();
        XuLy();
    }

    public void AnhXa() {
        tv_KetQua = (TextView) findViewById(R.id.tv_KetQua);

        listView = (ListView) findViewById(R.id.listView);
    }

    public void XuLy() {
        array = getResources().getStringArray(R.array.listview);
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, array);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                tv_KetQua.setText("Vị trí " + i + " là " + array[i]);
            }
        });
    }
}
