package com.liu.knowledgebasex.mapper;

import java.util.List;

import com.liu.knowledgebasex.domain.Ebook;
import com.liu.knowledgebasex.domain.EbookExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface EbookMapper {

    List<Ebook> selectByExample(EbookExample example);

    List<Ebook> selectAll();

    int deleteByPrimaryKey(Long id);

    int insert(Ebook record);

    int insertSelective(Ebook record);


    Ebook selectByPrimaryKey(Long id);


    int updateByPrimaryKeySelective(Ebook record);

    int updateByPrimaryKey(Ebook record);
}