package com.orange.service;

import com.orange.bean.user.Buyer;


public interface BuyerService {
    static void updateUserPassword(String username, String password) {
        // TODO Auto-generated method stub

    }

    Buyer getBuyerByUserNameAndPassword(String userName, String password);

    /**
     * 添加
     *
     * @param buyer
     */
    void addBuyer(Buyer buyer);

}
