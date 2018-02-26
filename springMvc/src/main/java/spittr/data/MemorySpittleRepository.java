package spittr.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.mockito.internal.matchers.VarargCapturingMatcher;

import spittr.data.model.Spitter;
import spittr.data.model.Spittle;

public class MemorySpittleRepository implements SpittleRepository {

	private static List<Spittle> spittles;
	
	static{
		spittles= new ArrayList<Spittle>();
		for (int i = 0; i < 100; i++) {
			spittles.add(new Spittle(i,"Spittle "+i, new Date(),0.0,0.1*i));
		}
	}
	
	public List<Spittle> findSpittles(long max, int count) {
		List<Spittle> tempSpittles = new ArrayList<Spittle>();
		
		int itemCount=0;
		for (Spittle spittle : spittles) {
			if (max==Long.MAX_VALUE|| spittle.getId()>max) {
				tempSpittles.add(spittle);
				itemCount++;
			}
			if(itemCount>=count) {
				break;
			}
		}
		return tempSpittles;
	}
	
	public Spittle findOne(long spittleId){
		return spittles.stream()
		        .filter(spittle -> spittle.getId()==spittleId)
		        .findFirst().get();	    
	}
	
}
