package cn.it.shop.dao.impl;
import java.util.List;

import org.springframework.stereotype.Repository;

import cn.it.shop.dao.CategoryDao;
import cn.it.shop.dao.UserDao;
import cn.it.shop.model.Category;
import cn.it.shop.model.User;
@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<User> queryUser(String name, int page, int rows) {
		String hql="FROM User u WHERE u.RealName LIKE :name";
		return getSession().createQuery(hql)				
				.setString("name", "%" + name + "%")
				.setFirstResult((page-1)*rows)
				.setMaxResults(rows)
				.list();
	}
	
}