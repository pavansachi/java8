package com.lambda;

interface MovieFactory<M extends Movie> {
    M create(String moviename, int year);
}