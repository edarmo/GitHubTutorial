package edarmoneit.githubtutorial;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    
    private static final String TAG = "MainActivity";
    RecyclerView mRecyclerView;
    RecyclerView.Adapter mAdapter;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    
        mRecyclerView = findViewById(R.id.recycler_view);
        
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
    
        User ed = new User("Ed", "Armoneit", "ed19701@yahoo.com");
        Log.d(TAG, "onCreate: " + ed.getEmail());
    }
}
