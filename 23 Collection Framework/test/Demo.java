package test;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Demo implements Serializable{


		private Integer ducatId;
		private String name;
		private String course;
		private Float fees;
		private List<String> skill;
		private Map<String,String> address;
		private Map<String,Long> contact;
		
		public Integer getDucatId() {
			return ducatId;
		}
		public void setDucatId(Integer ducatId) {
			this.ducatId = ducatId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCourse() {
			return course;
		}
		public void setCourse(String course) {
			this.course = course;
		}
		public Float getFees() {
			return fees;
		}
		public void setFees(Float fees) {
			this.fees = fees;
		}
		public List<String> getSkill() {
			return skill;
		}
		public void setSkill(List<String> skill) {
			this.skill = skill;
		}
		public Map<String, String> getAddress() {
			return address;
		}
		public void setAddress(Map<String, String> address) {
			this.address = address;
		}
		public Map<String, Long> getContact() {
			return contact;
		}
		public void setContact(Map<String, Long> contact) {
			this.contact = contact;
		}
		@Override
		public String toString() {
			return "Demo [ducatId=" + ducatId + ", name=" + name + ", course=" + course + ", fees=" + fees + ", skill="
					+ skill + ", address=" + address + ", contact=" + contact + "]";
		}
		
				}

	}


