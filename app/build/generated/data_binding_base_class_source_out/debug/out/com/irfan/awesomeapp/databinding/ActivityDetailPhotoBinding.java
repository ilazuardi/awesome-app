// Generated by view binder compiler. Do not edit!
package com.irfan.awesomeapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.irfan.awesomeapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDetailPhotoBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final AppBarLayout appBar;

  @NonNull
  public final ContentDetailPhotoBinding content;

  @NonNull
  public final ImageView ivDetailImage;

  @NonNull
  public final Toolbar toolbar;

  private ActivityDetailPhotoBinding(@NonNull CoordinatorLayout rootView,
      @NonNull AppBarLayout appBar, @NonNull ContentDetailPhotoBinding content,
      @NonNull ImageView ivDetailImage, @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.appBar = appBar;
    this.content = content;
    this.ivDetailImage = ivDetailImage;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDetailPhotoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDetailPhotoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_detail_photo, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDetailPhotoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.app_bar;
      AppBarLayout appBar = ViewBindings.findChildViewById(rootView, id);
      if (appBar == null) {
        break missingId;
      }

      id = R.id.content;
      View content = ViewBindings.findChildViewById(rootView, id);
      if (content == null) {
        break missingId;
      }
      ContentDetailPhotoBinding binding_content = ContentDetailPhotoBinding.bind(content);

      id = R.id.iv_detail_image;
      ImageView ivDetailImage = ViewBindings.findChildViewById(rootView, id);
      if (ivDetailImage == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivityDetailPhotoBinding((CoordinatorLayout) rootView, appBar, binding_content,
          ivDetailImage, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
