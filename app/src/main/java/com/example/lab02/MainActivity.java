package com.example.lab02;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    int numMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        numMessage = 10;
        Log.i("numMessage = ", "" + numMessage);

        numMessage++;
        numMessage = numMessage + 1;
        Log.i("numMessage = ", "" + numMessage);
        boolean isFriend = true;
        Log.i("isFriend = ", "" + isFriend);

        String command = "go east";
        switch (command) {
            case "go east":
                Log.i("massage= ", "Player go to east");
                break;
            case "go west":
                Log.i("massage= ", "Player go to west");
                break;
            default:
                Log.i("massage= ", "Default message");
                break;
        }

        Log.i("massage:", "In countUp method");
        int x = 0;

        while (true) {
            x++;
            Log.i("x =", "" + x);
            if (x == 3) {
                break;
            }
        }
        String mess = joinThese("Method ", "are", "cool");
        Log.i("massage=", mess);
        float area = getAreaCircle(5f);
        Log.i("area=", "" + area);
    }
    String joinThese(String a, String b, String c){
        return a + b + c;
    }
    float getAreaCircle(float radius){
        return 3.14f*radius*radius;
    }
}