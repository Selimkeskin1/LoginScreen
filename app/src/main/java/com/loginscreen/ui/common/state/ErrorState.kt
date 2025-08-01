package com.loginscreen.ui.common.state

import androidx.annotation.StringRes
import com.loginscreen.R

data class ErrorState(
    val hasError: Boolean = false,
    @StringRes val errorMessageStringResource: Int = R.string.empty_string
)