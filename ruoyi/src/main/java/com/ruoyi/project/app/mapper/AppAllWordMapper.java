package com.ruoyi.project.app.mapper;

import java.util.List;
import com.ruoyi.project.app.domain.AppAllWord;

/**
 * 全部单词Mapper接口
 * 
 * @author ruoyi
 * @date 2020-04-19
 */
public interface AppAllWordMapper 
{
    /**
     * 查询全部单词
     * 
     * @param id 全部单词ID
     * @return 全部单词
     */
    public AppAllWord selectAppAllWordById(Long id);

    /**
     * 查询全部单词列表
     * 
     * @param appAllWord 全部单词
     * @return 全部单词集合
     */
    public List<AppAllWord> selectAppAllWordList(AppAllWord appAllWord);

    /**
     * 新增全部单词
     * 
     * @param appAllWord 全部单词
     * @return 结果
     */
    public int insertAppAllWord(AppAllWord appAllWord);

    /**
     * 修改全部单词
     * 
     * @param appAllWord 全部单词
     * @return 结果
     */
    public int updateAppAllWord(AppAllWord appAllWord);

    /**
     * 删除全部单词
     * 
     * @param id 全部单词ID
     * @return 结果
     */
    public int deleteAppAllWordById(Long id);

    /**
     * 批量删除全部单词
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteAppAllWordByIds(Long[] ids);
}
