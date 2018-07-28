package com.cpfmat.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cpfmat.entity.SystemParam;
import com.cpfmat.mapper.SystemParamMapper;
import com.cpfmat.service.ISystemParam;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author ChenMeng
 * @since 2018-07-11
 */
@Service("systemParamService")
public class SystemParamServiceImpl extends ServiceImpl<SystemParamMapper, SystemParam>
		implements ISystemParam {
	@Autowired
	private SystemParamMapper systemParamMapper;
	
	@Override
	public boolean customUpdate(SystemParam systemParam) {
		if(systemParam == null || systemParam.getSeqId() == null) {
			return false;
		}
		else {
			return systemParamMapper.customUpdateById(systemParam);
		}
	}
	
}
