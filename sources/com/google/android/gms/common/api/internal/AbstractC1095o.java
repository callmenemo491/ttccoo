package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.o */
/* loaded from: classes.dex */
public abstract class AbstractC1095o<T> extends com.google.android.gms.common.api.internal.AbstractC1097q {

    /* renamed from: b */
    public final p327s7.C5986j<T> f5624b;

    public AbstractC1095o(int r1, p327s7.C5986j<T> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.f5624b = r2
            return
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1087g
    /* renamed from: b */
    public void mo3087b(com.google.android.gms.common.api.Status r3) {
            r2 = this;
            s7.j<T> r0 = r2.f5624b
            l6.b r1 = new l6.b
            r1.<init>(r3)
            r0.m12458a(r1)
            return
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1087g
    /* renamed from: c */
    public final void mo3088c(com.google.android.gms.common.api.internal.C1082b.a<?> r4) {
            r3 = this;
            r3.mo3093h(r4)     // Catch: java.lang.RuntimeException -> L4 android.os.RemoteException -> Lb android.os.DeadObjectException -> L1b
            return
        L4:
            r4 = move-exception
            s7.j<T> r0 = r3.f5624b
            r0.m12458a(r4)
            return
        Lb:
            r4 = move-exception
            com.google.android.gms.common.api.Status r4 = com.google.android.gms.common.api.internal.AbstractC1087g.m3086a(r4)
            s7.j<T> r0 = r3.f5624b
            l6.b r1 = new l6.b
            r1.<init>(r4)
            r0.m12458a(r1)
            return
        L1b:
            r4 = move-exception
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.internal.AbstractC1087g.m3086a(r4)
            s7.j<T> r1 = r3.f5624b
            l6.b r2 = new l6.b
            r2.<init>(r0)
            r1.m12458a(r2)
            throw r4
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1087g
    /* renamed from: d */
    public void mo3089d(java.lang.Exception r2) {
            r1 = this;
            s7.j<T> r0 = r1.f5624b
            r0.m12458a(r2)
            return
    }

    /* renamed from: h */
    public abstract void mo3093h(com.google.android.gms.common.api.internal.C1082b.a<?> r1);
}
