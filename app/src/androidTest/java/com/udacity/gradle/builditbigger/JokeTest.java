package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;

/**
 * Created by Vlad
 */

public class JokeTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void jokeTest() throws Exception {

        MainActivity activity = mActivityRule.getActivity();
        activity.setJokeResponse(new MainActivity.onJokeRetrieved() {
            @Override
            public void jokeRetrieved(String response) {
                assertTrue(!response.isEmpty());
            }
        });

    }
}
