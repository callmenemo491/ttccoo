package com.bumptech.glide;

import com.bumptech.glide.AbstractC1007k;

/* renamed from: com.bumptech.glide.k */
/* loaded from: classes.dex */
public abstract class AbstractC1007k<CHILD extends com.bumptech.glide.AbstractC1007k<CHILD, TranscodeType>, TranscodeType> implements java.lang.Cloneable {
    public AbstractC1007k() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public final CHILD m2775a() {
            r2 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L7
            com.bumptech.glide.k r0 = (com.bumptech.glide.AbstractC1007k) r0     // Catch: java.lang.CloneNotSupportedException -> L7
            return r0
        L7:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    public java.lang.Object clone() {
            r2 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L7
            com.bumptech.glide.k r0 = (com.bumptech.glide.AbstractC1007k) r0     // Catch: java.lang.CloneNotSupportedException -> L7
            return r0
        L7:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }
}
