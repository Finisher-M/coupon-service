package com.manmohan.springcloud.repository;

import com.manmohan.springcloud.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepo extends JpaRepository<Coupon,Long> {

    Coupon findByCode(String code);
}
