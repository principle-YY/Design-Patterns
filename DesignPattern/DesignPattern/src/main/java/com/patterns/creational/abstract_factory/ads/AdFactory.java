package com.patterns.creational.abstract_factory.ads;

public interface AdFactory {
    BannerAd createBannerAd();
    InterstitialAd createInterstitialAd();
    NativeAd createNativeAd();
    RewardedAd createRewardedAd();
}
