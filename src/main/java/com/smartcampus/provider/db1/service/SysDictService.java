package com.smartcampus.provider.db1.service;

import com.smartcampus.provider.db1.dao.SysDictMapper;
import com.smartcampus.provider.entity.SysDictEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SysDictService {

	@Autowired
	private SysDictMapper sysDictMapper;

	@Transactional
	public int insert(SysDictEntity sysDictEntity) {
		sysDictMapper.insert(sysDictEntity);
		return 1;
	}

	public List<SysDictEntity> selectByType(String dictType) {
		return  sysDictMapper.selectByType(dictType);
	}

	public Map<String,Object> selectByTypes(String[] dictTypes) {
		Map<String,Object> map = new HashMap<String,Object>();
		for(int i = 0;i<dictTypes.length;i++){
			String dictType = dictTypes[i];
			List<SysDictEntity>  ls =  sysDictMapper.selectByType(dictType);
			map.put(dictType,ls);
		}
		return map;
	}
}
