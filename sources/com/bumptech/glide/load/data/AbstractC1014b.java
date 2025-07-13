package com.bumptech.glide.load.data;

/* renamed from: com.bumptech.glide.load.data.b */
/* loaded from: classes.dex */
public abstract class AbstractC1014b<T> implements com.bumptech.glide.load.data.InterfaceC1016d<T> {

    /* renamed from: Y */
    public final java.lang.String f5195Y;

    /* renamed from: Z */
    public final android.content.res.AssetManager f5196Z;

    /* renamed from: a0 */
    public T f5197a0;

    public AbstractC1014b(android.content.res.AssetManager r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.f5196Z = r1
            r0.f5195Y = r2
            return
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1016d
    /* renamed from: b */
    public void mo2789b() {
            r1 = this;
            T r0 = r1.f5197a0
            if (r0 != 0) goto L5
            return
        L5:
            r1.mo2790c(r0)     // Catch: java.io.IOException -> L8
        L8:
            return
    }

    /* renamed from: c */
    public abstract void mo2790c(T r1);

    @Override // com.bumptech.glide.load.data.InterfaceC1016d
    public void cancel() {
            r0 = this;
            return
    }

    /* renamed from: d */
    public abstract T mo2791d(android.content.res.AssetManager r1, java.lang.String r2);

    @Override // com.bumptech.glide.load.data.InterfaceC1016d
    /* renamed from: e */
    public com.bumptech.glide.load.EnumC1008a mo2792e() {
            r1 = this;
            com.bumptech.glide.load.a r0 = com.bumptech.glide.load.EnumC1008a.f5180Y
            return r0
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1016d
    /* renamed from: f */
    public void mo2793f(com.bumptech.glide.EnumC1003g r3, com.bumptech.glide.load.data.InterfaceC1016d.a<? super T> r4) {
            r2 = this;
            android.content.res.AssetManager r3 = r2.f5196Z     // Catch: java.io.IOException -> Le
            java.lang.String r0 = r2.f5195Y     // Catch: java.io.IOException -> Le
            java.lang.Object r3 = r2.mo2791d(r3, r0)     // Catch: java.io.IOException -> Le
            r2.f5197a0 = r3     // Catch: java.io.IOException -> Le
            r4.mo2795d(r3)     // Catch: java.io.IOException -> Le
            goto L20
        Le:
            r3 = move-exception
            r0 = 3
            java.lang.String r1 = "AssetPathFetcher"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L1d
            java.lang.String r0 = "Failed to load data from asset manager"
            android.util.Log.d(r1, r0, r3)
        L1d:
            r4.mo2794c(r3)
        L20:
            return
    }
}
