package com.gilardo.utsgilardo.model_203310033

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
//membuat kelas Berita
data class Berita(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)