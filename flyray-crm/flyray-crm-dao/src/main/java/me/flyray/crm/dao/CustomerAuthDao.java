package me.flyray.crm.dao;

import java.util.List;
import java.util.Map;

import me.flyray.crm.model.CustomerAuth;

/** 
* @author: bolei
* @date：2017年4月6日 下午10:25:52 
* @description：客户授权
*/

public interface CustomerAuthDao {

	CustomerAuth queryObject(Long customerNo);
	
	List<CustomerAuth> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(CustomerAuth customerAuth);
	
	void update(CustomerAuth customerAuth);
	
}
