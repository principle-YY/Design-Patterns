package com.patterns.behavioral.iterator;

/**
 * 定义通用社交网络接口
 */
public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
