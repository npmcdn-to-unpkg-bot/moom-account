/**
 * @author chotoxautinh
 *
 * Mar 23, 2016 - http://chotoxautinh.com/
 */
package com.chotoxautinh.server.model;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Entity
@Document(indexName = "faccounts", type = "article")
public class FaceAccount {
	@Id
	private String id;

	private String email;
	private String phone;
	private String password;
	private String group;

	public FaceAccount() {
	}

	public FaceAccount(String email, String password, String phone) {
		this.email = email;
		this.password = password;
		this.phone = phone;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof FaceAccount)) {
			return false;
		}
		final FaceAccount other = (FaceAccount) obj;
		return this.id.equals(other.id);
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}
}
