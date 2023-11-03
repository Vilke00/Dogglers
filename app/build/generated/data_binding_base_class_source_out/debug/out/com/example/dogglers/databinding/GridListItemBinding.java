// Generated by view binder compiler. Do not edit!
package com.example.dogglers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.dogglers.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class GridListItemBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final ImageView dogImage;

  @NonNull
  public final TextView txtDogAge;

  @NonNull
  public final TextView txtDogHobbies;

  @NonNull
  public final TextView txtDogName;

  private GridListItemBinding(@NonNull MaterialCardView rootView, @NonNull ImageView dogImage,
      @NonNull TextView txtDogAge, @NonNull TextView txtDogHobbies, @NonNull TextView txtDogName) {
    this.rootView = rootView;
    this.dogImage = dogImage;
    this.txtDogAge = txtDogAge;
    this.txtDogHobbies = txtDogHobbies;
    this.txtDogName = txtDogName;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static GridListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static GridListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.grid_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static GridListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.dogImage;
      ImageView dogImage = ViewBindings.findChildViewById(rootView, id);
      if (dogImage == null) {
        break missingId;
      }

      id = R.id.txtDogAge;
      TextView txtDogAge = ViewBindings.findChildViewById(rootView, id);
      if (txtDogAge == null) {
        break missingId;
      }

      id = R.id.txtDogHobbies;
      TextView txtDogHobbies = ViewBindings.findChildViewById(rootView, id);
      if (txtDogHobbies == null) {
        break missingId;
      }

      id = R.id.txtDogName;
      TextView txtDogName = ViewBindings.findChildViewById(rootView, id);
      if (txtDogName == null) {
        break missingId;
      }

      return new GridListItemBinding((MaterialCardView) rootView, dogImage, txtDogAge,
          txtDogHobbies, txtDogName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
