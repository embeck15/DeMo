package ec327_final_project.demo;

/**
 * Created by chrisdelucia on 4/9/15.
 */
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class questions extends Activity {

    public TextView ask_quest;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.questions);

        ask_quest = (TextView) findViewById(R.id.quest);

    }

}
