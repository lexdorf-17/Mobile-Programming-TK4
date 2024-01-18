package com.example.binusapp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"}, d2 = {"Lcom/example/binusapp/BaseApplication;", "Landroid/app/Application;", "()V", "onCreate", "", "Companion", "app_release"})
public final class BaseApplication extends android.app.Application {
    @org.jetbrains.annotations.NotNull
    public static final com.example.binusapp.BaseApplication.Companion Companion = null;
    public static com.example.binusapp.BaseApplication instance;
    public static com.example.binusapp.data.prefs.AppPreferences appPreferences;
    
    public BaseApplication() {
        super();
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/example/binusapp/BaseApplication$Companion;", "", "()V", "appPreferences", "Lcom/example/binusapp/data/prefs/AppPreferences;", "getAppPreferences", "()Lcom/example/binusapp/data/prefs/AppPreferences;", "setAppPreferences", "(Lcom/example/binusapp/data/prefs/AppPreferences;)V", "instance", "Lcom/example/binusapp/BaseApplication;", "getInstance", "()Lcom/example/binusapp/BaseApplication;", "setInstance", "(Lcom/example/binusapp/BaseApplication;)V", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.binusapp.BaseApplication getInstance() {
            return null;
        }
        
        public final void setInstance(@org.jetbrains.annotations.NotNull
        com.example.binusapp.BaseApplication p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.binusapp.data.prefs.AppPreferences getAppPreferences() {
            return null;
        }
        
        public final void setAppPreferences(@org.jetbrains.annotations.NotNull
        com.example.binusapp.data.prefs.AppPreferences p0) {
        }
    }
}