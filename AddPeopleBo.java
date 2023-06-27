package com.bo;

import java.util.List;

public class AddPeopleBo {
	 private int id;
		private String fullName;
		private String email;
		private String location;
	
		private String PriceList;
		private String Visits;
		private String phone;
		private String Services;
		private String idType;
		private String idNumber;
		
		
		
		/**
		 * @return the id
		 */
		public int getId() {
			return id;
		}
		/**
		 * @param id the id to set
		 */
		public void setId(int id) {
			this.id = id;
		}
		/**
		 * @return the fullName
		 */
		public String getFullName() {
			return fullName;
		}
		/**
		 * @param fullName the fullName to set
		 */
		public void setFullName(String fullName) {
			this.fullName = fullName;
		}
		/**
		 * @return the email
		 */
		public String getEmail() {
			return email;
		}
		/**
		 * @param email the email to set
		 */
		public void setEmail(String email) {
			this.email = email;
		}
		/**
		 * @return the location
		 */
		public String getLocation() {
			return location;
		}
		/**
		 * @param location the location to set
		 */
		public void setLocation(String location) {
			this.location = location;
		}
		/**
		 * @return the manager
		 */
		
		
		public String getPriceList() {
			return PriceList;
		}
		/**
		 * @param priceList the priceList to set
		 */
		public void setPriceList(String priceList) {
			PriceList = priceList;
		}
		/**
		 * @return the visits
		 */
		public String getVisits() {
			return Visits;
		}
		/**
		 * @param visits the visits to set
		 */
		public void setVisits(String visits) {
			Visits = visits;
		}
		/**
		 * @return the phone
		 */
		public String getPhone() {
			return phone;
		}
		/**
		 * @param phone the phone to set
		 */
		public void setPhone(String phone) {
			this.phone = phone;
		}
		/**
		 * @return the services
		 */
		public String getServices() {
			return Services;
		}
		/**
		 * @param services the services to set
		 */
		public void setServices(String services) {
			Services = services;
		}
		/**
		 * @return the idType
		 */
		public String getIdType() {
			return idType;
		}
		/**
		 * @param idType the idType to set
		 */
		public void setIdType(String idType) {
			this.idType = idType;
		}
		/**
		 * @return the idNumber
		 */
		public String getIdNumber() {
			return idNumber;
		}
		/**
		 * @param idNumber the idNumber to set
		 */
		public void setIdNumber(String idNumber) {
			this.idNumber = idNumber;
		}
		public AddPeopleBo(int id, String fullName, String email, String location, String priceList,
				String visits, String phone, String services, String idType, String idNumber) {
			super();
			this.id = id;
			this.fullName = fullName;
			this.email = email;
			this.location = location;
			this.PriceList = priceList;
			this.Visits = visits;
			this.phone = phone;
			this.Services = services;
			this.idType = idType;
			this.idNumber = idNumber;
		}
		
		
		public AddPeopleBo(String fullName, String email, String location, String priceList, String visits,
				String phone, String services, String idType, String idNumber) {
			super();
			this.fullName = fullName;
			this.email = email;
			this.location = location;
			this.PriceList = priceList;
			this.Visits = visits;
			this.phone = phone;
			this.Services = services;
			this.idType = idType;
			this.idNumber = idNumber;
		}
		public AddPeopleBo() {
			super();
			// TODO Auto-generated constructor stub
		}
		public static List<AddPeopleBo> getPeopleData() {
			// TODO Auto-generated method stub
			return null;
		}
		
		


}
