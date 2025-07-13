package com.bumptech.glide;

/* loaded from: classes.dex */
final class GeneratedAppGlideModuleImpl extends com.bumptech.glide.GeneratedAppGlideModule {

    /* renamed from: a */
    public final io.tacocrypto.app.glide.MyImageGlideModule f5094a;

    public GeneratedAppGlideModuleImpl(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            io.tacocrypto.app.glide.MyImageGlideModule r2 = new io.tacocrypto.app.glide.MyImageGlideModule
            r2.<init>()
            r1.f5094a = r2
            java.lang.String r2 = "Glide"
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r2, r0)
            if (r0 == 0) goto L18
            java.lang.String r0 = "Discovered AppGlideModule from annotation: io.tacocrypto.app.glide.MyImageGlideModule"
            android.util.Log.d(r2, r0)
        L18:
            return
    }

    @Override // p004a3.AbstractC0006a, p004a3.InterfaceC0007b
    /* renamed from: a */
    public void mo16a(android.content.Context r1, com.bumptech.glide.C1000d r2) {
            r0 = this;
            io.tacocrypto.app.glide.MyImageGlideModule r1 = r0.f5094a
            java.util.Objects.requireNonNull(r1)
            return
    }

    @Override // p004a3.AbstractC0009d, p004a3.InterfaceC0011f
    /* renamed from: b */
    public void mo18b(android.content.Context r2, com.bumptech.glide.ComponentCallbacks2C0999c r3, com.bumptech.glide.C1004h r4) {
            r1 = this;
            io.tacocrypto.app.glide.MyImageGlideModule r0 = r1.f5094a
            r0.mo18b(r2, r3, r4)
            return
    }

    @Override // p004a3.AbstractC0006a
    /* renamed from: c */
    public boolean mo17c() {
            r1 = this;
            io.tacocrypto.app.glide.MyImageGlideModule r0 = r1.f5094a
            java.util.Objects.requireNonNull(r0)
            r0 = 0
            return r0
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    /* renamed from: d */
    public java.util.Set<java.lang.Class<?>> mo2730d() {
            r1 = this;
            java.util.Set r0 = java.util.Collections.emptySet()
            return r0
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    /* renamed from: e */
    public p445z2.C7238l.b mo2731e() {
            r1 = this;
            com.bumptech.glide.a r0 = new com.bumptech.glide.a
            r0.<init>()
            return r0
    }
}
