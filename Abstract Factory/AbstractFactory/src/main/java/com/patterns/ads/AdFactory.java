package com.patterns.ads;

public interface AdFactory {
    BannerAd createBannerAd();
    InterstitialAd createInterstitialAd();
    NativeAd createNativeAd();
    RewardedAd createRewardedAd();
}
