package com.example.eider.carpoolinguniversitario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.util.Log;
import android.widget.Toast;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

import org.json.JSONException;
import org.json.JSONObject;

import java.net.MalformedURLException;
import java.net.URL;

public class LoginActivity extends AppCompatActivity {

    private LoginButton loginButton;
    private CallbackManager callbackManager;
    Bundle bFacebookData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        callbackManager = CallbackManager.Factory.create();
        loginButton = (LoginButton)findViewById(R.id.login_button);
        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {

                String accessToken = loginResult.getAccessToken().getToken();
                Toast.makeText(LoginActivity.this, "si que si con este token"+accessToken, Toast.LENGTH_SHORT).show();
                GraphRequest request = GraphRequest.newMeRequest(loginResult.getAccessToken(), new GraphRequest.GraphJSONObjectCallback() {
                    @Override
                    public void onCompleted(JSONObject object, GraphResponse response) {
                        // Get facebook data from login
                        bFacebookData  = getFacebookData(object);
                    }
                });
                Bundle parameters = new Bundle();
                parameters.putString("fields", "id, first_name, last_name, email,gender, birthday, location"); // Parámetros que pedimos a facebook
                request.setParameters(parameters);
                request.executeAsync();
                goMainScreen(bFacebookData);

                }

            @Override
            public void onCancel() {
                Toast.makeText(LoginActivity.this, "login cancelado", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onError(FacebookException error) {
                Toast.makeText(LoginActivity.this, "error en login:"+error.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
        
    }
    private Bundle getFacebookData(JSONObject object) {

        try {
            Bundle bundle = new Bundle();
            String id = object.getString("id");
            Toast.makeText(this, "id prro: "+id, Toast.LENGTH_LONG).show();
            try {
                URL profile_pic = new URL("https://graph.facebook.com/" + id + "/picture?width=200&height=150");
                Log.i("profile_pic", profile_pic + "");
                bundle.putString("profile_pic", profile_pic.toString());

            } catch (MalformedURLException e) {
                e.printStackTrace();
                return null;
            }

            bundle.putString("idFacebook", id);
            if (object.has("first_name")){
                bundle.putString("first_name", object.getString("first_name"));
                Toast.makeText(this, ""+object.getString("first_name"), Toast.LENGTH_SHORT).show();
            }

            if (object.has("last_name")){
                bundle.putString("last_name", object.getString("last_name"));
                Toast.makeText(this, ""+object.getString("last_name"), Toast.LENGTH_SHORT).show();
            }

            if (object.has("email") && !object.getString("email").equals(null)){
                bundle.putString("email", String.valueOf(object.getString("email")));
                Toast.makeText(this, ""+String.valueOf(object.getString("email")), Toast.LENGTH_SHORT).show();
            }

            if (object.has("gender") && !object.getString("gender").equals(null) ){
                bundle.putString("gender", String.valueOf(object.getString("gender")));
                Toast.makeText(this, ""+String.valueOf(object.getString("gender")), Toast.LENGTH_SHORT).show();
            }

            if (object.has("birthday") && !object.getString("birthday").equals(null)){
                bundle.putString("birthday", String.valueOf(object.getString("birthday")));
                Toast.makeText(this, ""+String.valueOf(object.getString("birthday")), Toast.LENGTH_SHORT).show();
            }
            if (object.has("location") &&  !object.getJSONObject("location").getString("name").equals(null)) {
                bundle.putString("location", String.valueOf(object.getJSONObject("location").getString("name")));
                Toast.makeText(this, "" + String.valueOf(object.getJSONObject("location").getString("name")), Toast.LENGTH_SHORT).show();
            }
            return bundle;
        }
        catch(JSONException e) {
            Toast.makeText(this, "error parsing JSON: "+e.getMessage(), Toast.LENGTH_SHORT).show();        }
        return null;
    }

    private void goMainScreen(Bundle paketaxo) {
        Intent intent = new Intent(this,MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtra("paketaxoFacebook",paketaxo);
        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode,resultCode,data);
    }
}
