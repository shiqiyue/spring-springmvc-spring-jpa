package cn.wuwenyao.test.hhhh.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import cn.wuwenyao.test.hhhh.entity.interfaces.IdEntity;

@Entity
@Table(name = "user")
public class User extends IdEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4640602039979081594L;
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
