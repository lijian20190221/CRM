package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.TbItem;
import pojo.TbItemExample;
import java.util.List;

public interface TbItemMapper {
    public int countByExample(TbItemExample example);

    public int deleteByExample(TbItemExample example);

    public int deleteByPrimaryKey(Long id);

    public int insert(TbItem record);

    public int insertSelective(TbItem record);

    public List<TbItem> selectByExample(TbItemExample example);

    public TbItem selectByPrimaryKey(Long id);

    public int updateByExampleSelective(@Param("record") TbItem record, @Param("example") TbItemExample example);

    public int updateByExample(@Param("record") TbItem record, @Param("example") TbItemExample example);

    public int updateByPrimaryKeySelective(TbItem record);

    public int updateByPrimaryKey(TbItem record);
}