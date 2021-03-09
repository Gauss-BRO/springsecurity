package org.example.service;

import org.example.models.Role;

import java.util.List;

public interface RoleService {
    List<Role> listRoles();
    Role getRole(Long id);
    Role getRoleByName(String role);
}
