package org.example.dao;

import org.example.models.Role;

import java.util.List;

public interface RoleDao {

    List<Role> listRoles();
    Role getRole(Long id);
    Role getRoleByName(String role);
}
