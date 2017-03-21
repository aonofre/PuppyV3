package mx.com.onofre.alejandro.puppy.Email;


/**
 * Created by 472185 on 16/03/2017.
 */


import javax.mail.AuthenticationFailedException;
import javax.mail.MessagingException;
import android.os.AsyncTask;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.widget.Toast;

import mx.com.onofre.alejandro.puppy.ContactActivity;
import mx.com.onofre.alejandro.puppy.R;


public class SendEmailAsyncTask extends AsyncTask<Void, Void, Boolean>
{
    public Mail getMail() {
        return m;
    }

    public void setMail(Mail m) {
        this.m = m;
    }

    public ContactActivity getActivity() {
        return activity;
    }

    public void setActivity(ContactActivity activity) {
        this.activity = activity;
    }

    Mail m;
    ContactActivity activity;

    public SendEmailAsyncTask() {}

    public void displayMessage(String message)
    {

        Snackbar.make(getActivity().findViewById(R.id.btnEnviar), message, Snackbar.LENGTH_LONG).setAction("Action", null).show();

    }

    @Override
    protected Boolean doInBackground(Void... params)
    {
        try
        {
            if (m.send())
            {
                //Toast.makeText(getActivity().getBaseContext(), "Email sent.", Toast.LENGTH_LONG);
                displayMessage("Email sent.");
            } else
            {
//                Toast.makeText(getActivity().getBaseContext(), "Email failed to send.", Toast.LENGTH_LONG);
                displayMessage("Email failed to send.");
            }
            return true;
        } catch (AuthenticationFailedException e)
        {
            Log.e(SendEmailAsyncTask.class.getName(), "Bad account details");
            e.printStackTrace();

//            Toast.makeText(getActivity().getBaseContext(), "Authentication failed.", Toast.LENGTH_LONG);
            displayMessage("Authentication failed.");
            return false;
        } catch (MessagingException e)
        {
            Log.e(SendEmailAsyncTask.class.getName(), "Email failed");
            e.printStackTrace();

            //Toast.makeText(getActivity().getBaseContext(), "Email failed.", Toast.LENGTH_LONG);
            displayMessage("Email failed to send.");
            return false;
        } catch (Exception e)
        {
            e.printStackTrace();

            //Toast.makeText(getActivity().getBaseContext(), "Unexpected error occured.", Toast.LENGTH_LONG);
            displayMessage("Unexpected error occured.");
            return false;
        }
    }
}

