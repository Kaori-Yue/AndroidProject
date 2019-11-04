package com.example.androidproject.viewModel;

import androidx.databinding.ObservableArrayList;

import com.example.androidproject.model.Gameplay;

public class GameplayViewModel {
	public Gameplay game;
	public ObservableArrayList<String> tmp;

	public GameplayViewModel() {
		game = new Gameplay();
		tmp = new ObservableArrayList<>();
		tmp.add("SASDAS");
		tmp.add("ASD");
	}
}
