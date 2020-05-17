package sushi.nagoya.android_preference.main

import androidx.preference.PreferenceCategory
import androidx.preference.PreferenceScreen

fun PreferenceScreen.preferenceCategory(
    lambda: PreferenceCategory.() -> Unit
) {
    val preferenceCategory = PreferenceCategory(context)
    this.addPreference(preferenceCategory)
    preferenceCategory.apply(lambda)
}