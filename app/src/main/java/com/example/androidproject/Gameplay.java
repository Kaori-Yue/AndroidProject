package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

import com.example.androidproject.databinding.ActivityGameplayBinding;
import com.example.androidproject.viewModel.GameplayViewModel;

public class Gameplay extends AppCompatActivity {

	private ActivityGameplayBinding binding;
	int totalScore = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_gameplay);
		binding = DataBindingUtil.setContentView(this, R.layout.activity_gameplay);

		createTimer();
		GameplayViewModel gameplayViewModel = new GameplayViewModel();
		binding.setGameplayViewModel(gameplayViewModel);
//		binding.
//		binding.question.setText("asasdsad");

		/*
		com.example.androidproject.model.Gameplay gameplay = new com.example.androidproject.model.Gameplay();
		gameplay.setScore(6000);
		binding.setGameplay(gameplay);
		*/
	}

	private void createTimer() {
		final TextView timerElement = findViewById(R.id.Timer);

		new CountDownTimer(10000, 100) {
			@Override
			public void onTick(long l) {
				String t = String.format("%.1f", (double)l / 1000);
				timerElement.setText(t);
			}

			@Override
			public void onFinish() {
				// Game Over
			}
		}.start();
	}
}
