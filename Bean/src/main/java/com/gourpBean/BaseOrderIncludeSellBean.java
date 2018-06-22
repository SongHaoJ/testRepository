package com.gourpBean;

import com.bean.model.DbOrder;
import com.bean.model.DbSell;
import lombok.Data;

import java.util.ArrayList;
@Data
public class BaseOrderIncludeSellBean extends DbOrder {

    private ArrayList<DbSell> sellList;

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(super.toString());
        sb.append(",sellList=[");
        if(sellList!=null&&!sellList.isEmpty()){
            for(DbSell sell: sellList){
                sb.append(sell.toString()).append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
