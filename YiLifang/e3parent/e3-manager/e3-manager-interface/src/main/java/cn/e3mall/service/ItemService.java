package cn.e3mall.service;

import cn.e3mall.common.pojo.EasyUIDataGridResult;
import pojo.TbItem;

public interface ItemService {

    public TbItem getItemById(Long itemId);

    public EasyUIDataGridResult getItemList(int page, int rows);

}
