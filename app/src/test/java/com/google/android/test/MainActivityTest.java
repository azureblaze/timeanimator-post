package com.google.android.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

  @Test
  public void test() {
    MainActivity activity = Robolectric.buildActivity(MainActivity.class).create().start().resume()
        .get();

    Robolectric.getForegroundThreadScheduler().post(activity::start);
  }
}