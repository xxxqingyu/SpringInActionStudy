package spittr.data;

import spittr.data.model.Spitter;

public interface SpitterRepository {
	Spitter save(Spitter spitter);
	Spitter findByUsername(String username);
}
