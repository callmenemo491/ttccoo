package com.bumptech.glide.load.data;

/* renamed from: com.bumptech.glide.load.data.m */
/* loaded from: classes.dex */
public class C1025m extends com.bumptech.glide.load.data.AbstractC1014b<java.io.InputStream> {
    public C1025m(android.content.res.AssetManager r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1016d
    /* renamed from: a */
    public java.lang.Class<java.io.InputStream> mo2786a() {
            r1 = this;
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            return r0
    }

    @Override // com.bumptech.glide.load.data.AbstractC1014b
    /* renamed from: c */
    public void mo2790c(java.io.InputStream r1) {
            r0 = this;
            java.io.InputStream r1 = (java.io.InputStream) r1
            r1.close()
            return
    }

    @Override // com.bumptech.glide.load.data.AbstractC1014b
    /* renamed from: d */
    public java.io.InputStream mo2791d(android.content.res.AssetManager r1, java.lang.String r2) {
            r0 = this;
            java.io.InputStream r1 = r1.open(r2)
            return r1
    }
}
