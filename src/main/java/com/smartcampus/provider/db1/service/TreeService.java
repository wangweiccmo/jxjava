package com.smartcampus.provider.db1.service;

import com.smartcampus.provider.db1.dao.TreeMapper;
import com.smartcampus.provider.entity.TreeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TreeService {

    @Autowired
    private TreeMapper treeMapper;

    @Transactional
    public void insert(TreeEntity treeEntity) {
        treeMapper.insert(treeEntity);
    }

    @Transactional
    public void updateById(TreeEntity treeEntity) {
        treeMapper.updateById(treeEntity);
    }

    public List<TreeEntity> selectAll() {
        List<TreeEntity> lt = treeMapper.selectAll();
        return lt;
    }

    public TreeEntity selectById(int id) {
        TreeEntity lt = treeMapper.selectById(id);
        return lt;
    }

    public TreeEntity selectByBindId(int bindId) {
        TreeEntity lt = treeMapper.selectByBindId(bindId);
        return lt;
    }

}
