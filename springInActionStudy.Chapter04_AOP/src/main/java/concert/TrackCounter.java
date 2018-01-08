package concert;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackCounter {

	private Map<Integer, Integer> trackCounts = new HashMap<Integer, Integer>();

	@Pointcut("execution(* soundsystem.CompactDisc.playTrack(int)) && args(track)")
	public void trackPlayed(int track) {

	}

	@Before("trackPlayed(track)")
	public void countTrack(int track) {
		int currentCount = getPlayCount(track);
		trackCounts.put(track, currentCount + 1);
	}

	public int getPlayCount(int track) {
		return trackCounts.containsKey(track) ? trackCounts.get(track) : 0;
	}
}
