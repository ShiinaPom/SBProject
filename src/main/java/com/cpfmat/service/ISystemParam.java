package com.cpfmat.service;

import com.baomidou.mybatisplus.service.IService;
import com.cpfmat.entity.SystemParam;

/**
 * <p>
 * 系统参数服务类
 * </p>
 */
public interface ISystemParam extends IService<SystemParam> {
	/**
	 * 自定义更新系统参数
	 * @param systemParam
	 * @return
	 */
	boolean customUpdate(SystemParam systemParam);
}
