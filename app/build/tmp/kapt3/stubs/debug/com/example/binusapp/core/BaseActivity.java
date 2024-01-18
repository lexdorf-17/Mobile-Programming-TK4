package com.example.binusapp.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0017J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0014J\u0012\u0010\u000e\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016\u00a8\u0006\u0011"}, d2 = {"Lcom/example/binusapp/core/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "changeStatusBarWhite", "finish", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "overridePendingTransitionEnter", "overridePendingTransitionExit", "startActivity", "intent", "Landroid/content/Intent;", "app_debug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    
    public BaseActivity() {
        super();
    }
    
    @java.lang.Override
    protected void attachBaseContext(@org.jetbrains.annotations.NotNull
    android.content.Context newBase) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void finish() {
    }
    
    @java.lang.Override
    public void startActivity(@org.jetbrains.annotations.Nullable
    android.content.Intent intent) {
    }
    
    /**
     * Overrides the pending Activity transition by performing the "Enter" animation.
     */
    @kotlin.Suppress(names = {"DEPRECATION"})
    public void overridePendingTransitionEnter() {
    }
    
    /**
     * Overrides the pending Activity transition by performing the "Exit" animation.
     */
    @kotlin.Suppress(names = {"DEPRECATION"})
    protected void overridePendingTransitionExit() {
    }
    
    @android.annotation.SuppressLint(value = {"ObsoleteSdkInt"})
    public void changeStatusBarWhite() {
    }
}