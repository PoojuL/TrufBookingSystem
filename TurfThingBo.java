package com.bo;

import java.util.List;

public class TurfThingBo {
	private Integer id;
	private String coustmerName;
	private String truf_id;
	private String booking_date;
	private String Start_time;
	private String end_time;
	/**
	 * @return the coustmerName
	 */


	public TurfThingBo(String coustmerName, String truf_id, String booking_date, String start_time, String end_time) {
		super();
		this.coustmerName = coustmerName;
		this.truf_id = truf_id;
		this.booking_date = booking_date;
		Start_time = start_time;
		this.end_time = end_time;
	}
	/**
	 * @return the id
	 */


	/**
	 * @return the coustmerName
	 */
	public String getCoustmerName() {
		return coustmerName;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}


	/**
	 * @param coustmerName the coustmerName to set
	 */
	public void setCoustmerName(String coustmerName) {
		this.coustmerName = coustmerName;
	}
	/**
	 * @return the truf_id
	 */
	public String getTruf_id() {
		return truf_id;
	}
	/**
	 * @param truf_id the truf_id to set
	 */
	public void setTruf_id(String truf_id) {
		this.truf_id = truf_id;
	}
	/**
	 * @return the booking_date
	 */
	public String getBooking_date() {
		return booking_date;
	}
	/**
	 * @param booking_date the booking_date to set
	 */
	public void setBooking_date(String booking_date) {
		this.booking_date = booking_date;
	}
	/**
	 * @return the start_time
	 */
	public String getStart_time() {
		return Start_time;
	}
	/**
	 * @param start_time the start_time to set
	 */
	public void setStart_time(String start_time) {
		Start_time = start_time;
	}
	/**
	 * @return the end_time
	 */
	public String getEnd_time() {
		return end_time;
	}
	/**
	 * @param end_time the end_time to set
	 */
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public TurfThingBo(Integer id, String coustmerName, String truf_id, String booking_date, String start_time,
			String end_time) {
		super();
		this.id = id;
		this.coustmerName = coustmerName;
		this.truf_id = truf_id;
		this.booking_date = booking_date;
		this.Start_time = start_time;
		this.end_time = end_time;
	}
	public TurfThingBo() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
	
	

}
