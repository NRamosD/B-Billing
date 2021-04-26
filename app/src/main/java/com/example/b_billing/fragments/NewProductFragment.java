package com.example.b_billing.fragments;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.b_billing.R;

import java.io.File;

import static android.app.Activity.RESULT_OK;
import static androidx.core.graphics.TypefaceCompatUtil.getTempFile;

public class NewProductFragment extends Fragment{

    ImageView imgProducto;

    private static final String CPrincipal = "imgP/";
    private static final String CImg = "imagenes";
    private static final String DirectorioImg = CPrincipal + CImg;
    private String path;
    private static final String TEMP_IMAGE_NAME = "tempImage";
    File fImg;
    Bitmap bitmap;


    private static final int CSelecciona = 10;
    private static final int CFoto = 20;

    public NewProductFragment() {
        // Required empty public constructor
    }

    public static Fragment newInstance() {
        return new NewProductFragment();
    }



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_new_product, container, false);
        imgProducto = v.findViewById(R.id.imgProduct);


        imgProducto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                takepickPhoto();
            }
        });



        return v;
    }



    private void takepickPhoto(){
        final CharSequence[] options = {"Tomar foto", "Seleccionar imagen"};
        final AlertDialog.Builder builder=new AlertDialog.Builder(getContext());
        builder.setTitle("Elige una opción");
        builder.setItems(options, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if(options[which].equals("Tomar foto")){
                    Intent takePicture = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                    startActivityForResult(takePicture, 0);
                }else if(options[which].equals("Seleccionar imagen")){
                    Intent pickPhoto = new Intent(Intent.ACTION_PICK,
                            android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                    startActivityForResult(pickPhoto , 1);
                }
            }
        });
        builder.show();
    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch(requestCode) {
            case 0:
                if(resultCode == RESULT_OK){
                    Bundle extras = data.getExtras();
                    Bitmap imageBitmap = (Bitmap) extras.get("data");
                    imgProducto.setImageBitmap(imageBitmap);
                }

                break;
            case 1:
                if(resultCode == RESULT_OK){
                    Uri selectedImage = data.getData();
                    imgProducto.setImageURI(selectedImage);
                }
                break;
            default:
                break;
        }

    }

}
