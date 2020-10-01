package anton.ryaby_belstu.stpmslab_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import anton.ryaby_belstu.stpmslab_01.MyPackage.TextFunction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int count = 0; count < 10; count++) {
            Log.d("STPMSLab_001", "Counter " + count);
        }
        displayText();
    }

    private void displayText() {
        //TODO text function
        TextFunction textFunction = new TextFunction();
        TextView textView = findViewById(R.id.tv_text);
        textView.setText(textFunction.getValue());
    }

}