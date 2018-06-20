package com.gourpBean;

import com.bean.model.DbOrder;
import com.bean.model.DbSell;
import lombok.Data;

import java.util.ArrayList;
@Data
public class BaseOrderIncludeSellBean extends DbOrder {

    private ArrayList<DbSell> sellList;

}
