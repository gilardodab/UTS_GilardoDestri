package com.gilardo.utsgilardo.data_203310033

import com.gilardo.utsgilardo.R
import com.gilardo.utsgilardo.model_203310033.Berita
//membuat kelas datasource dari list berita
class Datasource {
    fun loadBeritas(): List<Berita> {
        return listOf<Berita>(
            Berita(R.string.Berita1, R.drawable.image1),
            Berita(R.string.Berita2, R.drawable.image2),
            Berita(R.string.Berita3, R.drawable.image3),
            Berita(R.string.Berita4, R.drawable.image4),
            Berita(R.string.Berita5, R.drawable.image5),
            Berita(R.string.Berita6, R.drawable.image6),
            Berita(R.string.Berita7, R.drawable.image7),
            Berita(R.string.Berita8, R.drawable.image8),
            Berita(R.string.Berita9, R.drawable.image9),
            Berita(R.string.Berita10, R.drawable.image10),
        )
    }
}