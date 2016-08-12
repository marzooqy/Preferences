import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;

import java.util.Map;
import java.util.Set;

public class Preferences {

    SharedPreferences preferences;
    SharedPreferences.Editor editor;
	
	public Preferences(String fileName, int mode, Context context) {
        preferences = context.getSharedPreferences(fileName, mode);
        editor = preferences.edit();
    }
	
	public Map<String, ?> getAll() {
        return preferences.getAll();
    }
	
    public String getString(String key, String defaultValue) {
        return preferences.getString(key, defaultValue);
    }
	
    public boolean getBoolean(String key, boolean defaultValue) {
        return preferences.getBoolean(key, defaultValue);
    }
	
    public int getInt(String key, int defaultValue) {
        return preferences.getInt(key, defaultValue);
    }
	
    public long getLong(String key, long defaultValue) {
        return preferences.getLong(key, defaultValue);
    }
	
	public float getFloat(String key, float defaultValue) {
		return preferences.getFloat(key, defaultValue);
	}

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public Set<String> getStringSet(String key, Set<String> defaultValue) {
        return preferences.getStringSet(key, defaultValue);
    }

    public void putString(String key, String value) {
        editor.putString(key, value).apply();
    }

    public void putBoolean(String key, boolean value) {
        editor.putBoolean(key, value).apply();
    }

    public void putInt(String key, int value) {
        editor.putInt(key, value).apply();
    }

    public void putLong(String key, long value) {
        editor.putLong(key, value).apply();
    }
	
    public void putFloat(String key, float value) {
		editor.putFloat(key, value).apply();
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public void putStringSet(String key, Set<String> values) {
        editor.putStringSet(key, values).apply();
    }
	
	public void remove(String key) {
        editor.remove(key).apply();
    }

    public void clear() {
        editor.clear().apply();
    }

    public boolean contains(String key) {
        return preferences.contains(key);
    }
}