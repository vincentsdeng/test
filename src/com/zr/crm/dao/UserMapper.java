package com.zr.crm.dao;

import java.util.List;
import java.util.Map;

import com.zr.crm.model.User;

 

/**
* @ClassName: UserDao 
* @Description: 鐢ㄦ埛鐨勬暟鎹簱鎿嶄綔绫� 
*
 */
public interface UserMapper {

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
	* @param param 鏌ヨ鏉′欢
	* @return List<User>  杩斿洖绫诲瀷  鐢ㄦ埛鍒楄〃
	* @throws
	 */
	List<User> findUserPage(Map<String, Object> param);
	
	
	/**
	* @Title: countUserNums 
	* @Description: 鎸夋潯浠剁粺璁＄敤鎴锋暟閲�
	* @param param 缁熻鏉′欢
	* @return    鍙傛暟 
	* int  杩斿洖鐢ㄦ埛鏁伴噺
	* @throws
	 */
	int countUserNums(Map<String, Object> param);
	
	
	User findById(Long id);
}
