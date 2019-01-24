/*
package com.gourpBean;

import com.bean.model.DbBindlist;
import com.bean.model.DbProduct;
import lombok.Data;

import java.util.List;

@Data
public class BindListIncludeProduct extends DbBindlist {

    private List<DbProduct> productList;



    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(super.toString());
        sb.append(",productList=[");
        if(productList!=null&&!productList.isEmpty()){
            for(DbProduct product: productList){
                sb.append(product.toString()).append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }


}
*/
