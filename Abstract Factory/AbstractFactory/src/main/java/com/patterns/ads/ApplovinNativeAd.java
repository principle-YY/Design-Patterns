package com.patterns.ads;

public class ApplovinNativeAd implements NativeAd{

    @Override
    public void init(String adId) {
        System.out.println("applovin native ad init.");
    }
}
