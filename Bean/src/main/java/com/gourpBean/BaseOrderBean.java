package com.gourpBean;

import com.bean.model.DbOrder;
import com.bean.model.DbSell;
import lombok.Data;

import java.util.ArrayList;
@Data
public class BaseOrderBean {
    private DbOrder order;
    private ArrayList<DbSell> selllist;

}
