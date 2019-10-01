package com.javaegitimleri.petclinic.service;

import com.javaegitimleri.petclinic.model.UserPreferences;

public class UserPreferencesService {
	private UserPreferences userPreferences;

	public UserPreferencesService(UserPreferences userPreferences) {
		super();
		this.userPreferences = userPreferences;
	}
	
	public UserPreferences getUserPreferences() {
		return userPreferences;
	}
}
