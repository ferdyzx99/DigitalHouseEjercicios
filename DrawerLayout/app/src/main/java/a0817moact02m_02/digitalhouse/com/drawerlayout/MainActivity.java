package a0817moact02m_02.digitalhouse.com.drawerlayout;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private NavigationView navigationView;
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(new ListenerMenu());

    }

    private class ListenerMenu implements NavigationView.OnNavigationItemSelectedListener{

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            String itemID = item.getTitle().toString();
            switch (itemID) {
                case "Acción 1":
                    Toast.makeText(MainActivity.this, "Hacer la cosa 1", Toast.LENGTH_SHORT).show();
                    break;
                case "Acción 2":
                    Toast.makeText(MainActivity.this, "Hacer la cosa 2", Toast.LENGTH_SHORT).show();
                    break;
                case "Acción 3":
                    Toast.makeText(MainActivity.this, "Hacer la cosa 3", Toast.LENGTH_SHORT).show();
                    break;
                default: break;
            }

            drawerLayout.closeDrawers();

            return false;
        }
    }
}
