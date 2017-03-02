package com.upi.indraga.navi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wikitude.architect.ArchitectStartupConfiguration;
import com.wikitude.architect.ArchitectView;

public class MainActivity extends AppCompatActivity {

    ArchitectView architectView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.architectView = (ArchitectView)this.findViewById( R.id.architectView );
        final ArchitectStartupConfiguration config = new ArchitectStartupConfiguration();
        config.setLicenseKey("30RKUYqCXrbXLr8FrpdeyNDfo1DWTpUyZh3OkVTs7v0zzDcc26Vf8DEWzyLlVEW8Aj9UsgiVxvZMmdPxdNE/IpeBEWUR0Azw5QiF2LKV7qUiGS09hnA8CwQJinJxJJtaedgqWdBV1sHiuInSormXbfTPR3uHHgMrpCnT7SaKy4NTYWx0ZWRfXx9SZFAFPB+e1Js6ekNTiNfEfLGTU1FxD8JexXqx0obOhhm6BvV/VoJuL2cOlRf3LNonw6vKOeuUstr4C8oNwjRI4+7xVnLwRZIgTXjofeCs4Im7tUyfLgcJl+7+pbJeeS6sFRHHJItLofmEeYJFObKmTR0FifqMUcYYv/+xjA2fFIoSRDLx3jwKb1waqu8XLYX7D+UYNlEH8q4iGWnqyRor3l3Tr+ja9PGXkxgRK8CK2ulzoZWvtl5RWP3legBY69IG4WYVCIZqUFGWSn8QLD2h2RMpSr7vhMz+r5bXDHnhJJpJ2Grho3+H87c8rmrBb0t3y7vR3wWeMyTOefAjX4eRHeBaWZkNdbJRUirYO3GDhy8JrUsho51539NqPVw0Gc44j+qQUOXM4pIzTtBWufGtjfb9jG8s2yQ+arULF/fLZbLGk7aiO/9FVuscCiDhUFOIunXGUO4gMArgnhb6TIInIkWdituK73sGjqDNw8B9S9HzVsRbwZquLGE3WGHn5en7aU/JZDaH");
        this.architectView.onCreate( config );
    }

    @Override
    protected void onPostCreate(Bundle savedInstaceState){
        super.onPostCreate(savedInstaceState);
        architectView.onPostCreate();
        try{
            this.architectView.load("file:///android_asset/3dm/index.html");
        }catch (Exception e){

        }
    }

    @Override
    protected void onResume(){
        super.onResume();
        architectView.onResume();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        architectView.onDestroy();
    }

    @Override
    protected void onPause(){
        super.onPause();
        architectView.onPause();
    }
}
