package catchme.messenger.catchme;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import catchme.messenger.logic.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button dima, lesya, logicButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dima = findViewById(R.id.dima);
        lesya = findViewById(R.id.lesya);
        logicButton = findViewById(R.id.logic);


        logicButton.setOnClickListener(this);
        dima.setOnClickListener(this);
        lesya.setOnClickListener(this);
    }


    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.logic:
                Intent logicIntent = new Intent(this, catchme.messenger.logic.LogicTest.class);
                startActivity(logicIntent);
                break;
            case R.id.dima:
                Intent logicIntentMain = new Intent(this, catchme.messenger.logic.STUDY.class);
                startActivity(logicIntentMain);
                break;
            case R.id.lesya:
                Intent uiIntentMain = new Intent(this, LoginActivity.class);
                startActivity(uiIntentMain);
                break;
        }
    }

}
