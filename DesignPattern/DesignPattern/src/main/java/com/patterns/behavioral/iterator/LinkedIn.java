package com.patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 领英
 */
public class LinkedIn implements SocialNetwork {
    private final List<Profile> contacts;

    public LinkedIn(List<Profile> cache) {
        if (cache != null) {
            contacts = cache;
        } else {
            contacts = new ArrayList<>();
        }
    }

    public Profile requestContactInfoFromLinkInAPI(String profileEmail) {
        simulateNetworkLatency();
        System.out.println("LinkIn: Loading profile '" + profileEmail + "' over the network...");

        return findContact(profileEmail);
    }

    public List<String> requestRelatedContactsFromLinkInAPI(String profileEmail, String contactType) {
        simulateNetworkLatency();
        System.out.println("LindIn: Loading '" + contactType + "' list of '" + profileEmail + "' over the network...");
        Profile profile = findContact(profileEmail);
        if (profile != null) {
            return profile.getContacts(contactType);
        }
        return null;
    }

    private Profile findContact(String profileEmail) {
        for (Profile profile : contacts) {
            if (profile.getEmail().equals(profileEmail)) {
                return profile;
            }
        }
        return null;
    }

    private void simulateNetworkLatency() {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public ProfileIterator createFriendsIterator(String profileEmail) {
        return new LinkedInIterator(this, "friends", profileEmail);
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileEmail) {
        return new LinkedInIterator(this, "coworkers", profileEmail);
    }
}
