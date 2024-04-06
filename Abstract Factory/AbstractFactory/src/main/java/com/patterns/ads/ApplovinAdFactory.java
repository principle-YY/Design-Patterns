package com.patterns.ads;

public class ApplovinAdFactory implements AdFactory{
    @Override
    public BannerAd createBannerAd() {
        return new ApplovinBannerAd();
    }

    @Override
    public InterstitialAd createInterstitialAd() {
        return new ApplovinInterstitialAd();
    }

    @Override
    public NativeAd createNativeAd() {
        return new ApplovinNativeAd();
    }

    @Override
    public RewardedAd createRewardedAd() {
        return new ApplovinRewardedAd();
    }
}
