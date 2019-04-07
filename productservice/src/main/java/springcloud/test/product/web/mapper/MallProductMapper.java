package springcloud.test.product.web.mapper;

import java.util.List;

import springcloud.test.product.web.model.MallProduct;

public interface MallProductMapper {
    int deleteByPrimaryKey(String mpId);

    int insert(MallProduct record);

    int insertSelective(MallProduct record);

    MallProduct selectByPrimaryKey(String mpId);

    int updateByPrimaryKeySelective(MallProduct record);

    int updateByPrimaryKey(MallProduct record);
    List<MallProduct> selectByIdSet(List<String> idList);
}