package com.bumptech.glide.load.data;

/* renamed from: com.bumptech.glide.load.data.l */
/* loaded from: classes.dex */
public abstract class AbstractC1024l<T> implements com.bumptech.glide.load.data.InterfaceC1016d<T> {

    /* renamed from: Y */
    public final android.net.Uri f5217Y;

    /* renamed from: Z */
    public final android.content.ContentResolver f5218Z;

    /* renamed from: a0 */
    public T f5219a0;

    public AbstractC1024l(android.content.ContentResolver r1, android.net.Uri r2) {
            r0 = this;
            r0.<init>()
            r0.f5218Z = r1
            r0.f5217Y = r2
            return
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1016d
    /* renamed from: b */
    public void mo2789b() {
            r1 = this;
            T r0 = r1.f5219a0
            if (r0 == 0) goto L7
            r1.mo2787c(r0)     // Catch: java.io.IOException -> L7
        L7:
            return
    }

    /* renamed from: c */
    public abstract void mo2787c(T r1);

    @Override // com.bumptech.glide.load.data.InterfaceC1016d
    public void cancel() {
            r0 = this;
            return
    }

    /* renamed from: d */
    public abstract T mo2788d(android.net.Uri r1, android.content.ContentResolver r2);

    @Override // com.bumptech.glide.load.data.InterfaceC1016d
    /* renamed from: e */
    public com.bumptech.glide.load.EnumC1008a mo2792e() {
            r1 = this;
            com.bumptech.glide.load.a r0 = com.bumptech.glide.load.EnumC1008a.f5180Y
            return r0
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1016d
    /* renamed from: f */
    public final void mo2793f(com.bumptech.glide.EnumC1003g r3, com.bumptech.glide.load.data.InterfaceC1016d.a<? super T> r4) {
            r2 = this;
            android.net.Uri r3 = r2.f5217Y     // Catch: java.io.FileNotFoundException -> Le
            android.content.ContentResolver r0 = r2.f5218Z     // Catch: java.io.FileNotFoundException -> Le
            java.lang.Object r3 = r2.mo2788d(r3, r0)     // Catch: java.io.FileNotFoundException -> Le
            r2.f5219a0 = r3     // Catch: java.io.FileNotFoundException -> Le
            r4.mo2795d(r3)     // Catch: java.io.FileNotFoundException -> Le
            goto L20
        Le:
            r3 = move-exception
            r0 = 3
            java.lang.String r1 = "LocalUriFetcher"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L1d
            java.lang.String r0 = "Failed to open Uri"
            android.util.Log.d(r1, r0, r3)
        L1d:
            r4.mo2794c(r3)
        L20:
            return
    }
}
