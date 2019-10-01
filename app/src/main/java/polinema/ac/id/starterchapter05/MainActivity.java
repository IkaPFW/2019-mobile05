package polinema.ac.id.starterchapter05;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.Fragments.dipsFragment;
import polinema.ac.id.starterchapter05.Fragments.handstandFragment;
import polinema.ac.id.starterchapter05.Fragments.pushupFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleLoadPushUp(View view) {
        Fragment checkPushUp = getSupportFragmentManager().findFragmentByTag("PUSH_UP_FRAGMENT");

        if(checkPushUp != null && checkPushUp.isVisible()){

        }
        else{
            FragmentTransaction ft =getSupportFragmentManager().beginTransaction();
            ft.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_from_left, R.anim.enter_from_right, R.anim.exit_from_right);
            ft.replace(R.id.frame_layout, new pushupFragment(), "PUSH_UP_FRAGMENT");
            ft.addToBackStack(null);
            ft.commit();
        }
    }

    public void handleLoadDips(View view) {
        Fragment checkDips = getSupportFragmentManager().findFragmentByTag("DIPS_FRAGMENT");

        if(checkDips != null && checkDips.isVisible()){

        }
        else{
            FragmentTransaction ft =getSupportFragmentManager().beginTransaction();
            ft.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_from_left, R.anim.enter_from_right, R.anim.exit_from_right);
            ft.replace(R.id.frame_layout, new dipsFragment(), "DIPS_FRAGMENT");
            ft.addToBackStack(null);
            ft.commit();
        }
    }

    public void handleLoadHandstand(View view) {
        Fragment checkHandstand = getSupportFragmentManager().findFragmentByTag("HANDSTAND_FRAGMENT");

        if(checkHandstand != null && checkHandstand.isVisible()){

        }
        else{
            FragmentTransaction ft =getSupportFragmentManager().beginTransaction();
            ft.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_from_left, R.anim.enter_from_right, R.anim.exit_from_right);
            ft.replace(R.id.frame_layout, new handstandFragment(), "HANDSTAND_FRAGMENT");
            ft.addToBackStack(null);
            ft.commit();
        }
    }
}
