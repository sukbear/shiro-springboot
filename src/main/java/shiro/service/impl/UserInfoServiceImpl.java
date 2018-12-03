package shiro.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import shiro.dao.UserInfoDao;
import shiro.entity.UserInfo;
import shiro.service.UserInfoService;
@Service
public class UserInfoServiceImpl implements UserInfoService{
	@Resource
	private UserInfoDao userInfoDao;
	@Override
	public UserInfo findByUsername(String username) {
		System.out.println("UserInfoServiceImpl.findByUsername()");
		return userInfoDao.findByUsername(username);
	}

}
