package com.loginscreen.ui.screens.unauthenticated.login.state

import com.loginscreen.ui.common.state.ErrorState
import com.loginscreen.R


val emailOrMobileEmptyErrorState = ErrorState(
    hasError = true,
    errorMessageStringResource = R.string.login_error_msg_empty_email_mobile
)

val passwordEmptyErrorState = ErrorState(
    hasError = true,
    errorMessageStringResource = R.string.login_error_msg_empty_password
)