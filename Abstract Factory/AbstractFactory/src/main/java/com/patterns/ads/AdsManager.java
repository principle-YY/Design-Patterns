package com.patterns.ads;

public class AdsManager {
    private BannerAd bannerAd;
    private NativeAd nativeAd;
    private InterstitialAd interstitialAd;
    private RewardedAd rewardedAd;

    public AdsManager(AdFactory factory){
        bannerAd = factory.createBannerAd();
        nativeAd = factory.createNativeAd();
        interstitialAd = factory.createInterstitialAd();
        rewardedAd = factory.createRewardedAd();
    }

    public void init(){
        bannerAd.init("");
        nativeAd.init("");
        interstitialAd.init("");
        rewardedAd.init("");
    }
}
