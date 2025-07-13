package com.eclipsesource.p043v8;

/* loaded from: classes.dex */
public interface Releasable extends java.io.Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void release();
}
