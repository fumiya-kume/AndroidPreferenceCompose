package sushi.nagoya.android_preference.main

import android.content.Context
import androidx.preference.CheckBoxPreference
import androidx.preference.DialogPreference
import androidx.preference.DropDownPreference
import androidx.preference.EditTextPreference
import androidx.preference.ListPreference
import androidx.preference.MultiSelectListPreference
import androidx.preference.Preference
import androidx.preference.PreferenceScreen

private inline fun <reified T : Preference> PreferenceScreen.preferenceBase(
    lambda: T.() -> Unit,
    key: String? = null
) {
    val preference = T::class.java.getConstructor(Context::class.java).newInstance(context)
        .apply {
            this.key = key ?: this.hashCode().toString()
            lambda(this)
        }

    this.addPreference(preference)
}

fun PreferenceScreen.preference(lambda: Preference.() -> Unit) =
    this.preferenceBase(lambda)

fun PreferenceScreen.checkBoxPreference(lambda: CheckBoxPreference.() -> Unit) =
    this.preferenceBase(lambda)

fun PreferenceScreen.dialogPreference(lambda: DialogPreference.() -> Unit) =
    this.preferenceBase(lambda)

fun PreferenceScreen.dropdownPreference(lambda: DropDownPreference.() -> Unit) =
    this.preferenceBase(lambda)

fun PreferenceScreen.editTextPreference(lambda: EditTextPreference.() -> Unit) =
    this.preferenceBase(lambda)

fun PreferenceScreen.listPreferencePreference(lambda: ListPreference.() -> Unit) =
    this.preferenceBase(lambda)

fun PreferenceScreen.multiSelectListPreference(lambda: MultiSelectListPreference.() -> Unit) =
    this.preferenceBase(lambda)