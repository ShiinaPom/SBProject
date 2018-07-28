package com.cpfmat.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.cpfmat.entity.SystemParam;

/**
 * <p>
 * Mapper接口
 * </p>
 *
 * @author ChenMeng
 * @since 2018-07-11
 */
public interface SystemParamMapper extends BaseMapper<SystemParam> {
	boolean customUpdateById(SystemParam systemParam);
}