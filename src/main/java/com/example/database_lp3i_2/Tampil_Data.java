package com.example.database_lp3i_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

public class Tampil_Data extends AppCompatActivity {

    //deklarasi variabel
    private TextView code_txtStatus;
    private ListView code_lvMahasiswa;

    //arrayadapter digunakan untuk menampung data dalam array
    private ArrayAdapter adapterMahasiswa;
/*
    //deklarasi variabel tambahan
    //Contoh: private String URL = "http://192.168.120.95/_edo/mobile2/select.php";
    //Catatan: URL di atas tolong disesuaikan dengan IP4 kalian, cek di Command Prompt, ketik ipconfig
    private String URL = "http://192.168.120.95/mobile_lp/select.php";

    //Stringrequest salah satu library volley utk menangkap data
    StringRequest stringRequest;
    RequestQueue requestQueue;

    //deklarasi variable untuk Json
    private JSONObject jsonObj; //digunakan untuk proses pengambilan data JSon
    private JSONArray jsonMahasiswa;
    private JSONObject jsonData;

    //variabel temporary
    String nim, nama; //variabel ini digunakan untuk menampung isi dari nim dan nama
*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil_data);

        //konfigurasi
        code_txtStatus = (TextView) findViewById(R.id.txtStatus);
        code_lvMahasiswa = (ListView)findViewById(R.id.lvMahasiswa);

        //membuat constructor ArrayAdapter (dengan 2 parameter)
        //android.R.layout.simple_list_item_1 adalah layout bawaan dari Android sendiri
        adapterMahasiswa = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1);

        //membuat data adapter menggunakan method add()
        adapterMahasiswa.add("Senin");
        adapterMahasiswa.add("Selasa");
        code_lvMahasiswa.setAdapter(adapterMahasiswa);
    }
}