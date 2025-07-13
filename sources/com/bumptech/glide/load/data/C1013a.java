package com.bumptech.glide.load.data;

/* renamed from: com.bumptech.glide.load.data.a */
/* loaded from: classes.dex */
public final class C1013a extends com.bumptech.glide.load.data.AbstractC1024l<android.content.res.AssetFileDescriptor> {
    public C1013a(android.content.ContentResolver r1, android.net.Uri r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1016d
    /* renamed from: a */
    public java.lang.Class<android.content.res.AssetFileDescriptor> mo2786a() {
            r1 = this;
            java.lang.Class<android.content.res.AssetFileDescriptor> r0 = android.content.res.AssetFileDescriptor.class
            return r0
    }

    @Override // com.bumptech.glide.load.data.AbstractC1024l
    /* renamed from: c */
    public void mo2787c(android.content.res.AssetFileDescriptor r1) {
            r0 = this;
            android.content.res.AssetFileDescriptor r1 = (android.content.res.AssetFileDescriptor) r1
            r1.close()
            return
    }

    @Override // com.bumptech.glide.load.data.AbstractC1024l
    /* renamed from: d */
    public android.content.res.AssetFileDescriptor mo2788d(android.net.Uri r2, android.content.ContentResolver r3) {
            r1 = this;
            java.lang.String r0 = "r"
            android.content.res.AssetFileDescriptor r3 = r3.openAssetFileDescriptor(r2, r0)
            if (r3 == 0) goto L9
            return r3
        L9:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException
            java.lang.String r0 = "FileDescriptor is null for: "
            java.lang.String r2 = androidx.appcompat.widget.C0298q0.m776a(r0, r2)
            r3.<init>(r2)
            throw r3
    }
}
