package com.zr.crm.service;

import java.util.List;
import java.util.Map;

import com.zr.crm.model.User;
import com.zr.crm.utils.PageBean;
 

/**
* @ClassName: IUserService 
* @Description: 鐢ㄦ埛鎿嶄綔 
*
 */
public interface IUserService {

	/**
	* @Title: addUser 鏂板鐢ㄦ埛
	* @param user    鏂板鐨勭敤鎴峰璞�
	* void  杩斿洖绫诲瀷 
	* @throws
	 */
	void addUser(User user);
	
	/**
	* @Title: delUser 
	* @Description: 鎸夋潯浠跺垹闄ょ敤鎴�
	* @param param    鍒犻櫎鍙傛暟
	* void  杩斿洖绫诲瀷 
	* @throws
	 */
	void delUser(Map<String, Object> param);
	
	/**
	* @Title: updUser 淇敼鐢ㄦ埛
	* @param user    闇�瑕佷慨鏀圭殑鐢ㄦ埛瀵硅薄
	* void  杩斿洖绫诲瀷 
	* @throws
	 */
	void updUser(User user);
	
	/**
	* @Title: findUser 
	* @Description: 鎸夋潯浠惰繑鍥炵敤鎴峰垪琛�,涓嶅垎椤�
	* @param param 鏌ヨ鏉′欢
	* @return List<User>  杩斿洖绫诲瀷  鐢ㄦ埛鍒楄〃
	* @throws
	 */
	List<User> findUser(Map<String, Object> param);
	
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
	List<User> findUserPage(Map<String, Object> param, PageBean pageBean);
	
}
