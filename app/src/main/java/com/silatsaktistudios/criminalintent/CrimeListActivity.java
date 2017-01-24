package com.silatsaktistudios.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by SilatJedi on 1/24/17.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
