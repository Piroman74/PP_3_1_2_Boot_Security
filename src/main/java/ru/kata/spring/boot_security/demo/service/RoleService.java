package ru.kata.spring.boot_security.demo.service;


import ru.kata.spring.boot_security.demo.models.Role;

import java.util.List;
import java.util.Set;

public interface RoleService {
    List<Role> findAll();
     Set<Role> getSetRoles(String[] roleNames);
     Role getRoleByName(String name);
   // void addRole(Role role);
}
