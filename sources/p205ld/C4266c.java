package p205ld;

/* renamed from: ld.c */
/* loaded from: classes.dex */
public class C4266c extends com.bumptech.glide.ComponentCallbacks2C1006j {
    public C4266c(com.bumptech.glide.ComponentCallbacks2C0999c r1, p445z2.InterfaceC7234h r2, p445z2.InterfaceC7239m r3, android.content.Context r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // com.bumptech.glide.ComponentCallbacks2C1006j
    /* renamed from: a */
    public com.bumptech.glide.ComponentCallbacks2C1006j mo2763a(p033c3.C0862h r1) {
            r0 = this;
            monitor-enter(r0)
            super.mo2763a(r1)     // Catch: java.lang.Throwable -> L6
            monitor-exit(r0)
            return r0
        L6:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // com.bumptech.glide.ComponentCallbacks2C1006j
    /* renamed from: h */
    public com.bumptech.glide.C1005i mo2764h(java.lang.Class r4) {
            r3 = this;
            ld.b r0 = new ld.b
            com.bumptech.glide.c r1 = r3.f5166Y
            android.content.Context r2 = r3.f5167Z
            r0.<init>(r1, r3, r4, r2)
            return r0
    }

    @Override // com.bumptech.glide.ComponentCallbacks2C1006j
    /* renamed from: n */
    public com.bumptech.glide.C1005i mo2765n() {
            r1 = this;
            com.bumptech.glide.i r0 = super.mo2765n()
            ld.b r0 = (p205ld.C4265b) r0
            return r0
    }

    @Override // com.bumptech.glide.ComponentCallbacks2C1006j
    /* renamed from: o */
    public com.bumptech.glide.C1005i mo2766o() {
            r1 = this;
            com.bumptech.glide.i r0 = super.mo2766o()
            ld.b r0 = (p205ld.C4265b) r0
            return r0
    }

    @Override // com.bumptech.glide.ComponentCallbacks2C1006j
    /* renamed from: p */
    public com.bumptech.glide.C1005i mo2767p() {
            r1 = this;
            com.bumptech.glide.i r0 = super.mo2767p()
            ld.b r0 = (p205ld.C4265b) r0
            return r0
    }

    @Override // com.bumptech.glide.ComponentCallbacks2C1006j
    /* renamed from: q */
    public com.bumptech.glide.C1005i mo2768q() {
            r2 = this;
            java.lang.Class<x2.c> r0 = p404x2.C6914c.class
            com.bumptech.glide.i r0 = r2.mo2764h(r0)
            c3.h r1 = com.bumptech.glide.ComponentCallbacks2C1006j.f5165j0
            com.bumptech.glide.i r0 = r0.mo2748I(r1)
            ld.b r0 = (p205ld.C4265b) r0
            return r0
    }

    @Override // com.bumptech.glide.ComponentCallbacks2C1006j
    /* renamed from: s */
    public com.bumptech.glide.C1005i mo2770s(android.net.Uri r2) {
            r1 = this;
            com.bumptech.glide.i r0 = r1.mo2766o()
            com.bumptech.glide.i r2 = r0.mo2756S(r2)
            ld.b r2 = (p205ld.C4265b) r2
            return r2
    }

    @Override // com.bumptech.glide.ComponentCallbacks2C1006j
    /* renamed from: t */
    public com.bumptech.glide.C1005i mo2771t(java.lang.String r2) {
            r1 = this;
            com.bumptech.glide.i r0 = r1.mo2766o()
            com.bumptech.glide.i r2 = r0.mo2758U(r2)
            ld.b r2 = (p205ld.C4265b) r2
            return r2
    }

    @Override // com.bumptech.glide.ComponentCallbacks2C1006j
    /* renamed from: v */
    public void mo2773v(p033c3.C0862h r2) {
            r1 = this;
            boolean r0 = r2 instanceof p205ld.C4264a
            if (r0 == 0) goto L5
            goto Le
        L5:
            ld.a r0 = new ld.a
            r0.<init>()
            ld.a r2 = r0.m9571I(r2)
        Le:
            super.mo2773v(r2)
            return
    }
}
