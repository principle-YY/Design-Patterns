package com.patterns.structural.proxy;

import java.util.HashMap;

/**
 * 远程服务接口
 */
public interface ThirdPartyYouTubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
