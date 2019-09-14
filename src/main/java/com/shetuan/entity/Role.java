package com.shetuan.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name="sk_role")
public class Role {
	@Id
	@Column(name="id")
	private Long id;
	
	@Column(name="rolename")
	private String roleName;
	
	@ManyToMany
    @JoinTable(name = "sk_user_role",
    joinColumns = {@JoinColumn(name = "roleId")},
    inverseJoinColumns = {@JoinColumn(name = "userId")})
	private List<User> users;
	
	@ManyToMany
    @JoinTable(name = "sk_role_permission",
            joinColumns = {@JoinColumn(name = "roleId")},
            inverseJoinColumns = {@JoinColumn(name = "permissionId")})
	private List<Permission> permissions;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}
	
	
}
