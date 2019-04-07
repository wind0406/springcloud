package springcloud.test.order.web.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import springcloud.test.order.web.model.MallOrder;

public interface MallOrderMapper {
    int deleteByPrimaryKey(String moId);

    int insert(MallOrder record);

    int insertSelective(MallOrder record);

    MallOrder selectByPrimaryKey(String moId);

    int updateByPrimaryKeySelective(MallOrder record);

    int updateByPrimaryKey(MallOrder record);
    
    List<String> selectOrderByUserId(@Param("userId") String userId);
}