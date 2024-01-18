// Generated by data binding compiler. Do not edit!
package com.example.binusapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.binusapp.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityLaunchBinding extends ViewDataBinding {
  @NonNull
  public final ImageView Image;

  @NonNull
  public final CoordinatorLayout layoutContent;

  protected ActivityLaunchBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView Image, CoordinatorLayout layoutContent) {
    super(_bindingComponent, _root, _localFieldCount);
    this.Image = Image;
    this.layoutContent = layoutContent;
  }

  @NonNull
  public static ActivityLaunchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_launch, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLaunchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityLaunchBinding>inflateInternal(inflater, R.layout.activity_launch, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityLaunchBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_launch, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLaunchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityLaunchBinding>inflateInternal(inflater, R.layout.activity_launch, null, false, component);
  }

  public static ActivityLaunchBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityLaunchBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityLaunchBinding)bind(component, view, R.layout.activity_launch);
  }
}