package com.manrajsingh.example.lesson4;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * Created by manraj singh on 10/16/2015.
 */
public class MyDialogFragment extends DialogFragment{

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder theDialog = new AlertDialog.Builder(getActivity());
        View view = getActivity().getLayoutInflater().inflate(R.layout.abc_alert_dialog_material,null);
        theDialog.setTitle("Sample Dialog");
        theDialog.setMessage("Hello I'm a dialog");
        theDialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(), "Clicked OK", Toast.LENGTH_SHORT).show();
            }
        });
        theDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(),"Clicked Cancel",Toast.LENGTH_SHORT).show();
            }
        });
        theDialog.setView(view);
        return theDialog.create();
    }
}
