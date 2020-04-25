package com.ruoyi.project.app.controller;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.app.domain.AppAllWord;
import com.ruoyi.project.app.service.IAppAllWordService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 全部单词Controller
 * 
 * @author ruoyi
 * @date 2020-04-19
 */
@RestController
@RequestMapping("/app/word")
public class AppAllWordController extends BaseController
{
    @Autowired
    private IAppAllWordService appAllWordService;

    /**
     * 查询全部单词列表
     */
    @PreAuthorize("@ss.hasPermi('app:word:list')")
    @GetMapping("/list")
    public TableDataInfo list(AppAllWord appAllWord)
    {
        startPage();
        List<AppAllWord> list = appAllWordService.selectAppAllWordList(appAllWord);
        return getDataTable(list);
    }

    /**
     * 导出全部单词列表
     */
    @PreAuthorize("@ss.hasPermi('app:word:export')")
    @Log(title = "全部单词", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(AppAllWord appAllWord)
    {
        List<AppAllWord> list = appAllWordService.selectAppAllWordList(appAllWord);
        ExcelUtil<AppAllWord> util = new ExcelUtil<AppAllWord>(AppAllWord.class);
        return util.exportExcel(list, "word");
    }

    /**
     * 获取全部单词详细信息
     */
    @PreAuthorize("@ss.hasPermi('app:word:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(appAllWordService.selectAppAllWordById(id));
    }

    /**
     * 新增全部单词
     */
    @PreAuthorize("@ss.hasPermi('app:word:add')")
    @Log(title = "全部单词", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AppAllWord appAllWord)
    {
        return toAjax(appAllWordService.insertAppAllWord(appAllWord));
    }

    /**
     * 修改全部单词
     */
    @PreAuthorize("@ss.hasPermi('app:word:edit')")
    @Log(title = "全部单词", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AppAllWord appAllWord)
    {
        return toAjax(appAllWordService.updateAppAllWord(appAllWord));
    }

    /**
     * 删除全部单词
     */
    @PreAuthorize("@ss.hasPermi('app:word:remove')")
    @Log(title = "全部单词", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(appAllWordService.deleteAppAllWordByIds(ids));
    }
}
