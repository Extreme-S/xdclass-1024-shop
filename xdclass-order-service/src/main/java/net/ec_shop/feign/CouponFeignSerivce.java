package net.ec_shop.feign;

import net.ec_shop.util.JsonData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ec-coupon-service")
public interface CouponFeignSerivce {

    /**
     * 查询用户的优惠券是否可用，防止水平权限
     *
     * @param recordId
     * @return
     */
    @GetMapping("/api/coupon_record/v1/detail/{record_id}")
    JsonData findUserCouponRecordById(@PathVariable("record_id") long recordId);

}
