package com.patterns.creational.abstract_factory.ads;

public class ApplovinNativeAd implements NativeAd{

    @Override
    public void init(String adId) {
        System.out.println("applovin native ad init.");
    }
}
