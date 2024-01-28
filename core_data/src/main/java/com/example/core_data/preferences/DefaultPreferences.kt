package com.example.core_data.preferences

import android.content.SharedPreferences
import com.example.core_domain.model.ActivityLevel
import com.example.core_domain.model.Gender
import com.example.core_domain.model.GoalType
import com.example.core_domain.model.UserInfo
import com.example.core_domain.preferences.Preferences

class DefaultPreferences(
    private val sharedPref: SharedPreferences,
) : Preferences {
    override fun saveGender(gender: Gender) {
        sharedPref
            .edit()
            .putString(
                Preferences.KEY_GENDER,
                gender.name
            )
            .apply()
    }

    override fun saveAge(age: Int) {
        sharedPref
            .edit()
            .putInt(
                Preferences.KEY_AGE,
                age
            )
            .apply()
    }

    override fun saveWeight(weight: Float) {
        sharedPref
            .edit()
            .putFloat(
                Preferences.KEY_WEIGHT,
                weight
            )
            .apply()
    }

    override fun saveHeight(height: Int) {
        sharedPref
            .edit()
            .putInt(
                Preferences.KEY_HEIGHT,
                height
            )
            .apply()
    }

    override fun saveActivityLevel(level: ActivityLevel) {
        sharedPref
            .edit()
            .putString(
                Preferences.KEY_ACTIVITY_LEVEL,
                level.name
            )
            .apply()
    }

    override fun saveGoalType(goal: GoalType) {
        sharedPref
            .edit()
            .putString(
                Preferences.KEY_GOAL_TYPE,
                goal.name
            )
            .apply()
    }

    override fun saveCarbRatio(ratio: Float) {
        sharedPref
            .edit()
            .putFloat(
                Preferences.KEY_CARB_RATIO,
                ratio
            )
            .apply()
    }

    override fun saveProteinRatio(ratio: Float) {
        sharedPref
            .edit()
            .putFloat(
                Preferences.KEY_PROTEIN_RATIO,
                ratio
            )
            .apply()
    }

    override fun saveFatRatio(ratio: Float) {
        sharedPref
            .edit()
            .putFloat(
                Preferences.KEY_FAT_RATIO,
                ratio
            )
            .apply()
    }

    override fun loadUserInfo(): UserInfo {
        val gender = sharedPref.getString(Preferences.KEY_GENDER, null)
        val age = sharedPref.getInt(Preferences.KEY_AGE, -1)
        val weight = sharedPref.getFloat(Preferences.KEY_WEIGHT, -1f)
        val height = sharedPref.getInt(Preferences.KEY_HEIGHT, -1)
        val level = sharedPref.getString(Preferences.KEY_ACTIVITY_LEVEL, null)
        val goal = sharedPref.getString(Preferences.KEY_GOAL_TYPE, null)
        val carb = sharedPref.getFloat(Preferences.KEY_CARB_RATIO, -1f)
        val protein = sharedPref.getFloat(Preferences.KEY_PROTEIN_RATIO, -1f)
        val fat = sharedPref.getFloat(Preferences.KEY_FAT_RATIO, -1f)

        return UserInfo(
            gender = Gender.fromString(gender ?: "male"),
            age = age,
            weight = weight,
            height = height,
            activityLevel = ActivityLevel.fromString(level ?: "medium"),
            goalType = GoalType.fromString(goal ?: "keep_weight"),
            carbRatio = carb,
            proteinRatio = protein,
            fatRatio = fat
        )
    }
}