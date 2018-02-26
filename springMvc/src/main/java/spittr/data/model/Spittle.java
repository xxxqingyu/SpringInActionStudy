package spittr.data.model;

import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;   
import org.apache.commons.lang.builder.HashCodeBuilder;  

public class Spittle {
	private final long id;
	private final String message;
	private final Date time;
	private double latitude;
	private double longitude;

	public Spittle(long id, String message, Date time) {
		this(id,message, time, 0, 0);
	}

	public Spittle(long id,String message, Date time, double longitude, double latitude) {
		this.id = id;
		this.message = message;
		this.time = time;
		this.longitude = longitude;
		this.latitude = latitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Long getId() {
		return id;
	}

	public String getMessage() {
		return message;
	}

	public Date getTime() {
		return time;
	}
	
	@Override
	public boolean equals(Object that){
		return  EqualsBuilder.reflectionEquals(this, that,new String[]{ "id","time"});
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return HashCodeBuilder.reflectionHashCode(this, new String[]{"id","time"});
	}
	
	
}
