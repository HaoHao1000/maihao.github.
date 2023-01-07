package IteratorExercises.pseudocode;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileId);

    ProfileIterator createCoworkersIterator(String profileId);
}

