package com.example.javierhdzc.seguridapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CipherActivity extends Activity {

    EditText text, key, encryptedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cipher);

        text = (EditText) findViewById(R.id.text_input);
        key = (EditText) findViewById(R.id.key_input);
        encryptedText = (EditText) findViewById(R.id.encrypted_text);
    }

    public void cipherText(View v) {
        String cipher = "";
        int code, aux;
        String input = text.getText().toString();
        int k = Integer.parseInt(key.getText().toString());
        for(int i = 0; i < input.length(); i++) {
            code = (int) input.charAt(i);
            if(code >= 65 && code <= 90) {
                code += k;
                while(code < 65 || code > 90) {
                    if(code < 65) {
                        aux = 65 - code;
                        code = 91 - aux;
                    }
                    else if(code > 90) {
                        aux = code - 91;
                        code = 65 + aux;
                    }
                }
            }
            else if(code >= 97 && code <= 122) {
                code += k;
                while(code < 97 || code > 122) {
                    if(code < 97) {
                        aux = 97 - code;
                        code = 123 - aux;
                    }
                    else if(code > 122) {
                        aux = code - 123;
                        code = 97 + aux;
                    }
                }
            }
            else {
                code += k;
            }
            cipher += (char) code;
        }
        encryptedText.setText(cipher);
    }

    public void decipherText(View v) {
        String cipher = "";
        int code, aux;
        String input = text.getText().toString();
        int k = Integer.parseInt(key.getText().toString()) * -1;
        for(int i = 0; i < input.length(); i++) {
            code = (int) input.charAt(i);
            if(code >= 65 && code <= 90) {
                code += k;
                while(code < 65 || code > 90) {
                    if(code < 65) {
                        aux = 65 - code;
                        code = 91 - aux;
                    }
                    else if(code > 90) {
                        aux = code - 91;
                        code = 65 + aux;
                    }
                }
            }
            else if(code >= 97 && code <= 122) {
                code += k;
                while(code < 97 || code > 122) {
                    if(code < 97) {
                        aux = 97 - code;
                        code = 123 - aux;
                    }
                    else if(code > 122) {
                        aux = code - 123;
                        code = 97 + aux;
                    }
                }
            }
            else {
                code += k;
            }
            cipher += (char) code;
        }
        encryptedText.setText(cipher);
    }
}
