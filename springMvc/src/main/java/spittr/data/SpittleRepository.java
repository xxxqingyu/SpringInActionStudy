package spittr.data;


import java.util.List;

import spittr.data.model.*;

public interface SpittleRepository {
	List<Spittle> findSpittles(long max,int count);
	Spittle findOne(long spittleId);
}
