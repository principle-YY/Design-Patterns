package com.patterns.ads;

public class ApplovinBannerAd implements BannerAd{
    @Override
    public void init(String adId) {
        System.out.println("applovin banner ad init.");
    }
}
