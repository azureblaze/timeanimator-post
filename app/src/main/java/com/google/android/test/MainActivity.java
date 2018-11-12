package com.google.android.test;

import android.animation.TimeAnimator;
import android.animation.TimeAnimator.TimeListener;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements TimeListener {

  private final TimeAnimator timeAnimator = new TimeAnimator();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    timeAnimator.setTimeListener(this);
  }

  public void start(){
    timeAnimator.start();
  }

  @Override
  public void onTimeUpdate(TimeAnimator animation, long totalTime, long deltaTime) {
    Log.i("MainActivity", "onTimeUpdate");
  }
}
