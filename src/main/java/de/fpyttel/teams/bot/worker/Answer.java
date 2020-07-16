package de.fpyttel.teams.bot.worker;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
public class Answer {

	@NonNull
	private String text;
	private int numberOfParams;

	public String getText(final Object... params) {
		if (numberOfParams > 0) {
			if (numberOfParams == params.length) {
				return String.format(text, params);
			} else {
				return null;
			}
		}
		return text;
	}

}
