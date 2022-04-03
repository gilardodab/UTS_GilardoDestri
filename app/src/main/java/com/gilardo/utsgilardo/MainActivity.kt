package com.gilardo.utsgilardo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.gilardo.utsgilardo.adapter_203310033.ItemAdapter
import com.gilardo.utsgilardo.data_203310033.Datasource

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialisai data.
        val myDataset = Datasource().loadBeritas()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)

        // Gunakan pengaturan ini untuk meningkatkan kinerja jika Anda tahu itu berubah
        // dalam konten tidak mengubah ukuran tata letak RecyclerView
        recyclerView.setHasFixedSize(true)
    }
}