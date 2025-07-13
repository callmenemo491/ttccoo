package com.bumptech.glide.load.data;

/* renamed from: com.bumptech.glide.load.data.h */
/* loaded from: classes.dex */
public class C1020h extends com.bumptech.glide.load.data.AbstractC1014b<android.os.ParcelFileDescriptor> {
    public C1020h(android.content.res.AssetManager r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1016d
    /* renamed from: a */
    public java.lang.Class<android.os.ParcelFileDescriptor> mo2786a() {
            r1 = this;
            java.lang.Class<android.os.ParcelFileDescriptor> r0 = android.os.ParcelFileDescriptor.class
            return r0
    }

    @Override // com.bumptech.glide.load.data.AbstractC1014b
    /* renamed from: c */
    public void mo2790c(android.os.ParcelFileDescriptor r1) {
            r0 = this;
            android.os.ParcelFileDescriptor r1 = (android.os.ParcelFileDescriptor) r1
            r1.close()
            return
    }

    @Override // com.bumptech.glide.load.data.AbstractC1014b
    /* renamed from: d */
    public android.os.ParcelFileDescriptor mo2791d(android.content.res.AssetManager r1, java.lang.String r2) {
            r0 = this;
            android.content.res.AssetFileDescriptor r1 = r1.openFd(r2)
            android.os.ParcelFileDescriptor r1 = r1.getParcelFileDescriptor()
            return r1
    }
}
