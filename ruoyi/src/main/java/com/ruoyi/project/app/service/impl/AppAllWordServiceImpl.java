package com.ruoyi.project.app.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.SecurityUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.app.mapper.AppAllWordMapper;
import com.ruoyi.project.app.domain.AppAllWord;
import com.ruoyi.project.app.service.IAppAllWordService;

/**
 * 全部单词Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-04-19
 */
@Service
public class AppAllWordServiceImpl implements IAppAllWordService 
{
    @Autowired
    private AppAllWordMapper appAllWordMapper;

    /**
     * 查询全部单词
     * 
     * @param id 全部单词ID
     * @return 全部单词
     */
    @Override
    public AppAllWord selectAppAllWordById(Long id)
    {
        return appAllWordMapper.selectAppAllWordById(id);
    }

    /**
     * 查询全部单词列表
     * 
     * @param appAllWord 全部单词
     * @return 全部单词
     */
    @Override
    public List<AppAllWord> selectAppAllWordList(AppAllWord appAllWord)
    {
        return appAllWordMapper.selectAppAllWordList(appAllWord);
    }

    /**
     * 新增全部单词
     * 
     * @param appAllWord 全部单词
     * @return 结果
     */
    @Override
    public int insertAppAllWord(AppAllWord appAllWord)
    {
    	appAllWord.setCreateBy(SecurityUtils.getUsername());
        appAllWord.setCreateTime(DateUtils.getNowDate());
        return appAllWordMapper.insertAppAllWord(appAllWord);
    }

    /**
     * 修改全部单词
     * 
     * @param appAllWord 全部单词
     * @return 结果
     */
    @Override
    public int updateAppAllWord(AppAllWord appAllWord)
    {
    	appAllWord.setUpdateBy(SecurityUtils.getUsername());
        appAllWord.setUpdateTime(DateUtils.getNowDate());
        return appAllWordMapper.updateAppAllWord(appAllWord);
    }

    /**
     * 批量删除全部单词
     * 
     * @param ids 需要删除的全部单词ID
     * @return 结果
     */
    @Override
    public int deleteAppAllWordByIds(Long[] ids)
    {
        return appAllWordMapper.deleteAppAllWordByIds(ids);
    }

    /**
     * 删除全部单词信息
     * 
     * @param id 全部单词ID
     * @return 结果
     */
    @Override
    public int deleteAppAllWordById(Long id)
    {
        return appAllWordMapper.deleteAppAllWordById(id);
    }
}
