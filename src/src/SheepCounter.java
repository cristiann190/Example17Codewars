package src;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SheepCounter {
	protected static int countSheeps(Boolean[] sheeps) {
		if (sheeps == null || sheeps.length == 0) {
			return 0;
		}
		return Arrays.stream(sheeps)
                .filter(s -> s instanceof Boolean).filter(s -> s == true)
                .collect(Collectors.toList()).size();
	}
}