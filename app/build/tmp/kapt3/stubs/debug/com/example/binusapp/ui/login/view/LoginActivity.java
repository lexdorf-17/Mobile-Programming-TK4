package com.example.binusapp.ui.login.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0016\u0010\u0013\u001a\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002J\u0012\u0010\u0017\u001a\u00020\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0012H\u0002J\u0010\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0016H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/example/binusapp/ui/login/view/LoginActivity;", "Lcom/example/binusapp/core/BaseActivity;", "()V", "LOCATION_PERMISSION_REQUEST_CODE", "", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "binding", "Lcom/example/binusapp/databinding/ActivityLoginBinding;", "googleSignInClient", "Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "loadingDialog", "Lcom/example/binusapp/util/LoadingDialog;", "backPress", "", "handleResults", "task", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "signInGoogle", "updateUI", "account", "app_debug"})
public final class LoginActivity extends com.example.binusapp.core.BaseActivity {
    private com.example.binusapp.databinding.ActivityLoginBinding binding;
    private com.google.firebase.auth.FirebaseAuth auth;
    private com.google.android.gms.auth.api.signin.GoogleSignInClient googleSignInClient;
    private final int LOCATION_PERMISSION_REQUEST_CODE = 100;
    private final com.example.binusapp.util.LoadingDialog loadingDialog = null;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> launcher = null;
    
    public LoginActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void backPress() {
    }
    
    private final void signInGoogle() {
    }
    
    private final void handleResults(com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.signin.GoogleSignInAccount> task) {
    }
    
    private final void updateUI(com.google.android.gms.auth.api.signin.GoogleSignInAccount account) {
    }
}