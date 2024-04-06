package com.patterns.ads;

public class ApplovinRewardedAd implements RewardedAd{
    @Override
    public void init(String adId) {
        System.out.println("applovin rewarded ad init.");
    }
}
