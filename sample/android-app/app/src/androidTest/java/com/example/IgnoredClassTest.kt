package com.example

import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.Ignore
import org.junit.runner.RunWith
import org.junit.Assert.assertTrue

@Ignore
@RunWith(AndroidJUnit4::class)
class IgnoredClassTest {

    @Rule
    @JvmField
    val rule = ActivityTestRule(MainActivity::class.java)

    val screen = MainScreen()

    @Test
    fun testAlwaysFailing() {
        assertTrue(false)
    }

    @Test
    fun testAlwaysPassing() {
        assertTrue(true)
    }
}
