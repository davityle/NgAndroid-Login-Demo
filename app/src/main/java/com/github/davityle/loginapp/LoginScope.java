package com.github.davityle.loginapp;

import android.content.Context;
import android.widget.Toast;

import com.ngandroid.lib.annotations.NgModel;
import com.ngandroid.lib.annotations.NgScope;

@NgScope(name="Login")
public class LoginScope {
    @NgModel
    User user;
    @NgModel
    NetworkCall call;

    void onSubmit(Context context) {
        call.setActive(true);
        Toast.makeText(context, user.getUsername() + " : " +user.getPassword(), Toast.LENGTH_SHORT ).show();
    }
}
