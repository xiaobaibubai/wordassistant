package com.ruoyi.project.app.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 全部单词对象 app_all_word
 * 
 * @author ruoyi
 * @date 2020-04-19
 */
public class AppAllWord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 单词 */
    @Excel(name = "单词")
    private String word;

    /** 英式发音 */
    @Excel(name = "英式发音")
    private String pronunciationBs;

    /** 美式发音 */
    @Excel(name = "美式发音")
    private String pronunciationAs;

    /** 中文释译 */
    @Excel(name = "中文释译")
    private String interpretation;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setWord(String word) 
    {
        this.word = word;
    }

    public String getWord() 
    {
        return word;
    }
    public void setPronunciationBs(String pronunciationBs) 
    {
        this.pronunciationBs = pronunciationBs;
    }

    public String getPronunciationBs() 
    {
        return pronunciationBs;
    }
    public void setPronunciationAs(String pronunciationAs) 
    {
        this.pronunciationAs = pronunciationAs;
    }

    public String getPronunciationAs() 
    {
        return pronunciationAs;
    }
    public void setInterpretation(String interpretation) 
    {
        this.interpretation = interpretation;
    }

    public String getInterpretation() 
    {
        return interpretation;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("word", getWord())
            .append("pronunciationBs", getPronunciationBs())
            .append("pronunciationAs", getPronunciationAs())
            .append("interpretation", getInterpretation())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
