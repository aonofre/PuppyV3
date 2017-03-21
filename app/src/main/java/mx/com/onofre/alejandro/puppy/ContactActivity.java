package mx.com.onofre.alejandro.puppy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import mx.com.onofre.alejandro.puppy.Email.SendEmailAsyncTask;

import mx.com.onofre.alejandro.puppy.Email.Mail;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        Button btnEnviar = (Button) findViewById(R.id.btnEnviar);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enviaCorreo();
            }

        });
    }

    private void enviaCorreo()
    {
/*
        Especifica los datos de tu cuenta de correo de Gmail. Estos datos serán
        usados para el envío de correo.

        Importante: Las políticas de Gmail requieren que habilites la opción de
                    "Acceso de aplicaciones menos seguras"
                    para permitir la autenticación mediante esta aplicación.
*/
        String tu_correo_gmail = "correo@gmail.com";
        String tu_password_gmail = "password";

        TextView edtNombre = (TextView) findViewById(R.id.edtNombre);
        TextView edtCorreo = (TextView) findViewById(R.id.edtCorreo);
        TextView edtComentario = (TextView) findViewById(R.id.edtCommentario);

        String[] recipients = { edtCorreo.getText().toString() };

        SendEmailAsyncTask email = new SendEmailAsyncTask();

        email.setActivity(this);
        email.setMail( new Mail(tu_correo_gmail, tu_password_gmail ));
        email.getMail().set_from(tu_correo_gmail);
        email.getMail().setBody(edtComentario.getText().toString());
        email.getMail().set_to(recipients);
        email.getMail().set_subject(edtNombre.getText().toString() + " te ha enviado un mensaje.");
        email.execute();
    }
}
