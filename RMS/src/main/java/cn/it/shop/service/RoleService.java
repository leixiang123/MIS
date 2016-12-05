package cn.it.shop.service;

import java.util.List;

import cn.it.shop.model.Role;

public interface RoleService extends BaseService<Role>{

	List<Role> queryAllRole(String string, int page, int rows);
	Long count();
}
