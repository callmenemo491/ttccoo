package com.google.android.gms.cast.framework.media;

/* renamed from: com.google.android.gms.cast.framework.media.g */
/* loaded from: classes.dex */
public abstract class AbstractC1070g extends com.google.android.gms.common.api.internal.BasePendingResult<com.google.android.gms.cast.framework.media.C1065b.c> {

    /* renamed from: l */
    public p123h6.InterfaceC2509p f5501l;

    /* renamed from: m */
    public final boolean f5502m;

    /* renamed from: n */
    public final /* synthetic */ com.google.android.gms.cast.framework.media.C1065b f5503n;

    public AbstractC1070g(com.google.android.gms.cast.framework.media.C1065b r1, boolean r2) {
            r0 = this;
            r0.f5503n = r1
            r1 = 0
            r0.<init>(r1)
            r0.f5502m = r2
            return
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* renamed from: c */
    public final /* synthetic */ p201l6.InterfaceC4188h mo3031c(com.google.android.gms.common.api.Status r2) {
            r1 = this;
            com.google.android.gms.cast.framework.media.f r0 = new com.google.android.gms.cast.framework.media.f
            r0.<init>(r2)
            return r0
    }

    /* renamed from: j */
    public abstract void mo3034j();

    /* renamed from: k */
    public final p123h6.InterfaceC2509p m3035k() {
            r1 = this;
            h6.p r0 = r1.f5501l
            if (r0 != 0) goto Lb
            com.google.android.gms.cast.framework.media.e r0 = new com.google.android.gms.cast.framework.media.e
            r0.<init>(r1)
            r1.f5501l = r0
        Lb:
            h6.p r0 = r1.f5501l
            return r0
    }

    /* renamed from: l */
    public final void m3036l() {
            r3 = this;
            boolean r0 = r3.f5502m
            if (r0 != 0) goto L34
            com.google.android.gms.cast.framework.media.b r0 = r3.f5503n
            java.util.List<com.google.android.gms.cast.framework.media.b$b> r0 = r0.f5494g
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            com.google.android.gms.cast.framework.media.b$b r1 = (com.google.android.gms.cast.framework.media.C1065b.b) r1
            r1.mo3027d()
            goto Lc
        L1c:
            com.google.android.gms.cast.framework.media.b r0 = r3.f5503n
            java.util.List<com.google.android.gms.cast.framework.media.b$a> r0 = r0.f5495h
            java.util.Iterator r0 = r0.iterator()
        L24:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            com.google.android.gms.cast.framework.media.b$a r1 = (com.google.android.gms.cast.framework.media.C1065b.a) r1
            r1.mo2878l()
            goto L24
        L34:
            com.google.android.gms.cast.framework.media.b r0 = r3.f5503n     // Catch: p123h6.C2505l -> L41
            java.lang.Object r0 = r0.f5488a     // Catch: p123h6.C2505l -> L41
            monitor-enter(r0)     // Catch: p123h6.C2505l -> L41
            r3.mo3034j()     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            return
        L3e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r1     // Catch: p123h6.C2505l -> L41
        L41:
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 2100(0x834, float:2.943E-42)
            r2 = 0
            r0.<init>(r1, r2)
            com.google.android.gms.cast.framework.media.f r1 = new com.google.android.gms.cast.framework.media.f
            r1.<init>(r0)
            r3.m3047f(r1)
            return
    }
}
