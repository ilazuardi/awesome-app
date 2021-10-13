// Generated by view binder compiler. Do not edit!
package com.irfan.awesomeapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.irfan.awesomeapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemGridBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView itemGridHeightLabelTv;

  @NonNull
  public final TextView itemGridHeightTv;

  @NonNull
  public final TextView itemGridOriginalSizeLabelTv;

  @NonNull
  public final ImageView itemGridPhotoIv;

  @NonNull
  public final TextView itemGridPhotographerTv;

  @NonNull
  public final TextView itemGridWidthLabelTv;

  @NonNull
  public final TextView itemGridWidthTv;

  private ItemGridBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView itemGridHeightLabelTv, @NonNull TextView itemGridHeightTv,
      @NonNull TextView itemGridOriginalSizeLabelTv, @NonNull ImageView itemGridPhotoIv,
      @NonNull TextView itemGridPhotographerTv, @NonNull TextView itemGridWidthLabelTv,
      @NonNull TextView itemGridWidthTv) {
    this.rootView = rootView;
    this.itemGridHeightLabelTv = itemGridHeightLabelTv;
    this.itemGridHeightTv = itemGridHeightTv;
    this.itemGridOriginalSizeLabelTv = itemGridOriginalSizeLabelTv;
    this.itemGridPhotoIv = itemGridPhotoIv;
    this.itemGridPhotographerTv = itemGridPhotographerTv;
    this.itemGridWidthLabelTv = itemGridWidthLabelTv;
    this.itemGridWidthTv = itemGridWidthTv;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemGridBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemGridBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_grid, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemGridBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.item_grid_height_label_tv;
      TextView itemGridHeightLabelTv = ViewBindings.findChildViewById(rootView, id);
      if (itemGridHeightLabelTv == null) {
        break missingId;
      }

      id = R.id.item_grid_height_tv;
      TextView itemGridHeightTv = ViewBindings.findChildViewById(rootView, id);
      if (itemGridHeightTv == null) {
        break missingId;
      }

      id = R.id.item_grid_original_size_label_tv;
      TextView itemGridOriginalSizeLabelTv = ViewBindings.findChildViewById(rootView, id);
      if (itemGridOriginalSizeLabelTv == null) {
        break missingId;
      }

      id = R.id.item_grid_photo_iv;
      ImageView itemGridPhotoIv = ViewBindings.findChildViewById(rootView, id);
      if (itemGridPhotoIv == null) {
        break missingId;
      }

      id = R.id.item_grid_photographer_tv;
      TextView itemGridPhotographerTv = ViewBindings.findChildViewById(rootView, id);
      if (itemGridPhotographerTv == null) {
        break missingId;
      }

      id = R.id.item_grid_width_label_tv;
      TextView itemGridWidthLabelTv = ViewBindings.findChildViewById(rootView, id);
      if (itemGridWidthLabelTv == null) {
        break missingId;
      }

      id = R.id.item_grid_width_tv;
      TextView itemGridWidthTv = ViewBindings.findChildViewById(rootView, id);
      if (itemGridWidthTv == null) {
        break missingId;
      }

      return new ItemGridBinding((ConstraintLayout) rootView, itemGridHeightLabelTv,
          itemGridHeightTv, itemGridOriginalSizeLabelTv, itemGridPhotoIv, itemGridPhotographerTv,
          itemGridWidthLabelTv, itemGridWidthTv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
