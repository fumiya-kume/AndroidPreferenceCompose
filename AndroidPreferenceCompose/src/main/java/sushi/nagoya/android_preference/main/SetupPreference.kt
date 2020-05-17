package sushi.nagoya.android_preference.main

import androidx.preference.PreferenceScreen

fun PreferenceScreen.setUpPreference(
    lambda: PreferenceScreen.() -> Unit
) {
    this.apply(lambda)
}