package cn.it.shop.dao;

import java.util.List;

import cn.it.shop.model.Privilege;
import net.sf.json.JSONArray;

public interface PrivilegeDao extends BaseDao<Privilege>{

	List<Privilege> queryPrivilege(int oldParentId);

	JSONArray getMenu(int parentId);

	Privilege findByMKR(String priMaster, int priKey, String recordStatus, String type);

    boolean savePrivilege(Privilege privi);

}
