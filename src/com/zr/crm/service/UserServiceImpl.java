package com.zr.crm.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zr.crm.dao.UserMapper;
import com.zr.crm.model.User;
import com.zr.crm.utils.PageBean;
 

/**
 * @ClassName: UserServiceImpl
 * @Description: 鐢ㄦ埛鎿嶄綔 
 * 
 */
@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserMapper userDao;

	/**
	 * @Title: addUser 鏂板鐢ㄦ埛
	 * @param user
	 *            鏂板鐨勭敤鎴峰璞� void 杩斿洖绫诲瀷
	 * @throws
	 */
	@Override
	public void addUser(User user) {

		userDao.addUser(user);
	}

	/**
	 * @Title: delUser
	 * @Description: 鎸夋潯浠跺垹闄ょ敤鎴�
	 * @param param
	 *            鍒犻櫎鍙傛暟 void 杩斿洖绫诲瀷
	 * @throws
	 */
	@Override
	public void delUser(Map<String, Object> param) {
		userDao.delUser(param);
	}

	/**
	 * @Title: updUser 淇敼鐢ㄦ埛
	 * @param user
	 *            闇�瑕佷慨鏀圭殑鐢ㄦ埛瀵硅薄 void 杩斿洖绫诲瀷
	 * @throws
	 */
	@Override
	public void updUser(User user) {
		userDao.updUser(user);
	}

	/**
	 * @Title: findUser
	 * @Description: 鎸夋潯浠惰繑鍥炵敤鎴峰垪琛�,涓嶅垎椤�
	 * @param param
	 *            鏌ヨ鏉′欢
	 * @return List<User> 杩斿洖绫诲瀷 鐢ㄦ埛鍒楄〃
	 * @throws
	 */
	@Override
	public List<User> findUser(Map<String, Object> param) {
		return userDao.findUser(param);
	}

	/**
	 * @Title: findUserPage
	 * @Description: 鎸夋潯浠惰繑鍥炵敤鎴峰垪琛�,鍒嗛〉
	 * @param param
	 *            鏌ヨ鏉′欢
	 * @param pageBean
	 *            鍒嗛〉瀵硅薄
	 * @return List<User> 杩斿洖绫诲瀷 鐢ㄦ埛鍒楄〃
	 * @throws
	 */
	@Override
	public List<User> findUserPage(Map<String, Object> param, PageBean pageBean) {
		pageBean.initMap(param);
		int total = userDao.countUserNums(param);
		
		if(total>0){
			pageBean.setTotalRows(userDao.countUserNums(param));
			pageBean.repaginate();
			return userDao.findUserPage(param);
		}
		
		return new ArrayList<>();
	}
}
