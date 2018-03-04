package water

import android.content.Context
import com.google.gson.GsonBuilder

class Water(c: Context) {

    private val preferences = c.getSharedPreferences("W", Context.MODE_PRIVATE)
    private val editor = preferences.edit()
    private val gson = GsonBuilder().create()

    /**
     * Saves object into the Preferences.
     * Only the fields are stored. Methods, Inner classes, Nested classes and inner interfaces are not stored.
     **/
    fun <T> putObject(key: String, y: T) {
        val inString = gson.toJson(y)
        editor.putString(key, inString).commit()
    }

    /**
     * Saves collection of objects into the Preferences.
     * Only the fields are stored. Methods, Inner classes, Nested classes and inner interfaces are not stored.
     **/

    fun <T> getObject(key: String, c: Class<T>): T? {
        val value = preferences.getString(key, null)
        if (value != null) {
            return gson.fromJson(value, c)
        } else {
            throw IllegalArgumentException("No object with key: $key was saved")
        }
    }
}