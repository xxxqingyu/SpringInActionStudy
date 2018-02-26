package spittr.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import spittr.data.model.Spitter;

public class MemorySpitterRepository implements SpitterRepository {

	private static List<Spitter> spitters;
	
	static{
		spitters= new ArrayList<Spitter>();
	}
	
	@Override
	public Spitter save(Spitter spitter) {
		spitter.setId(spitters.size()*10);
		spitters.add(spitter);
		return spitter;
	}

	@Override
	public Spitter findByUsername(String username) {
		return spitters.stream()
		        .filter(spitter -> spitter.getUsername()==username)
		        .findFirst().get();	    
	}

}
