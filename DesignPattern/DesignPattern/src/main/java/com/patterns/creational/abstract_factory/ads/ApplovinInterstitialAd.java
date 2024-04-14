package com.patterns.creational.abstract_factory.ads;

public class ApplovinInterstitialAd implements InterstitialAd{
    @Override
    public void init(String adId) {
        System.out.println("applovin interstitial ad init");
    }
}
