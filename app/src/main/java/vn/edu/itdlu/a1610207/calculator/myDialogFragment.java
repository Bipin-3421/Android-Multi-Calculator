package vn.edu.itdlu.a1610207.calculator;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public class myDialogFragment extends android.app.DialogFragment {
    String title;
    String message;
    String button;

    public myDialogFragment() {
        title = "About...";
        message = "Author: Lee Baral \r\n" +

                "Study at Pokhara University\r\n\n";

        button = " Thanks  a lot :)))";
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setButton(String button) {
        this.button = button;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(title);
        builder.setMessage(message);
        builder.setPositiveButton(button, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        return builder.create();
    }
}
