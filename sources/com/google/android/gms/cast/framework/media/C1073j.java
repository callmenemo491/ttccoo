package com.google.android.gms.cast.framework.media;

/* renamed from: com.google.android.gms.cast.framework.media.j */
/* loaded from: classes.dex */
public final class C1073j {

    /* renamed from: a */
    public final java.util.Set<com.google.android.gms.cast.framework.media.C1065b.d> f5507a;

    /* renamed from: b */
    public final long f5508b;

    /* renamed from: c */
    public final java.lang.Runnable f5509c;

    /* renamed from: d */
    public boolean f5510d;

    /* renamed from: e */
    public final /* synthetic */ com.google.android.gms.cast.framework.media.C1065b f5511e;

    public C1073j(com.google.android.gms.cast.framework.media.C1065b r2, long r3) {
            r1 = this;
            r1.f5511e = r2
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.f5507a = r0
            r1.f5508b = r3
            e6.r r3 = new e6.r
            r3.<init>(r1, r2)
            r1.f5509c = r3
            return
    }

    /* renamed from: a */
    public final void m3038a() {
            r4 = this;
            com.google.android.gms.cast.framework.media.b r0 = r4.f5511e
            android.os.Handler r0 = r0.f5489b
            java.lang.Runnable r1 = r4.f5509c
            r0.removeCallbacks(r1)
            r0 = 1
            r4.f5510d = r0
            com.google.android.gms.cast.framework.media.b r0 = r4.f5511e
            android.os.Handler r0 = r0.f5489b
            java.lang.Runnable r1 = r4.f5509c
            long r2 = r4.f5508b
            r0.postDelayed(r1, r2)
            return
    }
}
