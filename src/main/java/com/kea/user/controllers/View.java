package com.kea.user.controllers;

public class View {
    public static class Public { }
    static class ExtendedPublic extends Public { }
    public static class Internal extends ExtendedPublic { }
}