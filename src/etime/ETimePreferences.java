package etime;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * User: dpayne2
 * Date: 1/3/12
 * Time: 9:07 PM
 */
public class ETimePreferences extends PreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }
}