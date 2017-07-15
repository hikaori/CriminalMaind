package com.derrick.park.criminalmind;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.io.File;

/**
 * Created by kaorihirata on 2017-07-12.
 */

public class ZoomDialogFragment extends DialogFragment {

    private File mPhotoFile;
    public static final String PHOTO = "photo";

    public static ZoomDialogFragment newInstance(File mPhotoFile) {
        ZoomDialogFragment pf = new ZoomDialogFragment();
        Bundle args = new Bundle();
        args.putSerializable(PHOTO, mPhotoFile);
        pf.setArguments(args);
        return pf;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        mPhotoFile = (File) getArguments().getSerializable(PHOTO);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.zoom_dialogfragment, container, false);

        ImageView mPhotoView = (ImageView) v.findViewById(R.id.zoom_pic);
        Bitmap bitmap = BitmapFactory.decodeFile(mPhotoFile.getAbsolutePath());
        mPhotoView.setImageBitmap(bitmap);
        return v;
    }

}
