package com.bumptech.glide.load.data;

/* renamed from: com.bumptech.glide.load.data.i */
/* loaded from: classes.dex */
public class C1021i extends com.bumptech.glide.load.data.AbstractC1024l<android.os.ParcelFileDescriptor> {
    public C1021i(android.content.ContentResolver r1, android.net.Uri r2) {
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

    @Override // com.bumptech.glide.load.data.AbstractC1024l
    /* renamed from: c */
    public void mo2787c(android.os.ParcelFileDescriptor r1) {
            r0 = this;
            android.os.ParcelFileDescriptor r1 = (android.os.ParcelFileDescriptor) r1
            r1.close()
            return
    }

    @Override // com.bumptech.glide.load.data.AbstractC1024l
    /* renamed from: d */
    public android.os.ParcelFileDescriptor mo2788d(android.net.Uri r2, android.content.ContentResolver r3) {
            r1 = this;
            java.lang.String r0 = "r"
            android.content.res.AssetFileDescriptor r3 = r3.openAssetFileDescriptor(r2, r0)
            if (r3 == 0) goto Ld
            android.os.ParcelFileDescriptor r2 = r3.getParcelFileDescriptor()
            return r2
        Ld:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException
            java.lang.String r0 = "FileDescriptor is null for: "
            java.lang.String r2 = androidx.appcompat.widget.C0298q0.m776a(r0, r2)
            r3.<init>(r2)
            throw r3
    }
}
