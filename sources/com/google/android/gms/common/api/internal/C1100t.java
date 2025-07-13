package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.t */
/* loaded from: classes.dex */
public final class C1100t<ResultT> extends com.google.android.gms.common.api.internal.AbstractC1097q {

    /* renamed from: b */
    public final p218m6.AbstractC4398k<java.lang.Object, ResultT> f5628b;

    /* renamed from: c */
    public final p327s7.C5986j<ResultT> f5629c;

    /* renamed from: d */
    public final p218m6.InterfaceC4397j f5630d;

    public C1100t(int r1, p218m6.AbstractC4398k<java.lang.Object, ResultT> r2, p327s7.C5986j<ResultT> r3, p218m6.InterfaceC4397j r4) {
            r0 = this;
            r0.<init>(r1)
            r0.f5629c = r3
            r0.f5628b = r2
            r0.f5630d = r4
            r3 = 2
            if (r1 != r3) goto L19
            boolean r1 = r2.f17959b
            if (r1 != 0) goto L11
            goto L19
        L11:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Best-effort write calls cannot pass methods that should auto-resolve missing features."
            r1.<init>(r2)
            throw r1
        L19:
            return
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1087g
    /* renamed from: b */
    public final void mo3087b(com.google.android.gms.common.api.Status r3) {
            r2 = this;
            s7.j<ResultT> r0 = r2.f5629c
            m6.j r1 = r2.f5630d
            java.lang.Exception r3 = r1.mo9832a(r3)
            r0.m12458a(r3)
            return
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1087g
    /* renamed from: c */
    public final void mo3088c(com.google.android.gms.common.api.internal.C1082b.a<?> r3) {
            r2 = this;
            m6.k<java.lang.Object, ResultT> r0 = r2.f5628b     // Catch: java.lang.RuntimeException -> L10 android.os.RemoteException -> L17 android.os.DeadObjectException -> L28
            l6.a$e r3 = r3.f5576b     // Catch: java.lang.RuntimeException -> L10 android.os.RemoteException -> L17 android.os.DeadObjectException -> L28
            s7.j<ResultT> r1 = r2.f5629c     // Catch: java.lang.RuntimeException -> L10 android.os.RemoteException -> L17 android.os.DeadObjectException -> L28
            m6.v r0 = (p218m6.C4409v) r0     // Catch: java.lang.RuntimeException -> L10 android.os.RemoteException -> L17 android.os.DeadObjectException -> L28
            m6.k$a r0 = r0.f17986d     // Catch: java.lang.RuntimeException -> L10 android.os.RemoteException -> L17 android.os.DeadObjectException -> L28
            m6.i<A, s7.j<ResultT>> r0 = r0.f17961a     // Catch: java.lang.RuntimeException -> L10 android.os.RemoteException -> L17 android.os.DeadObjectException -> L28
            r0.mo813c(r3, r1)     // Catch: java.lang.RuntimeException -> L10 android.os.RemoteException -> L17 android.os.DeadObjectException -> L28
            return
        L10:
            r3 = move-exception
            s7.j<ResultT> r0 = r2.f5629c
            r0.m12458a(r3)
            return
        L17:
            r3 = move-exception
            com.google.android.gms.common.api.Status r3 = com.google.android.gms.common.api.internal.AbstractC1087g.m3086a(r3)
            s7.j<ResultT> r0 = r2.f5629c
            m6.j r1 = r2.f5630d
            java.lang.Exception r3 = r1.mo9832a(r3)
            r0.m12458a(r3)
            return
        L28:
            r3 = move-exception
            throw r3
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1087g
    /* renamed from: d */
    public final void mo3089d(java.lang.Exception r2) {
            r1 = this;
            s7.j<ResultT> r0 = r1.f5629c
            r0.m12458a(r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1087g
    /* renamed from: e */
    public final void mo3090e(p218m6.C4413z r3, boolean r4) {
            r2 = this;
            s7.j<ResultT> r0 = r2.f5629c
            java.util.Map<s7.j<?>, java.lang.Boolean> r1 = r3.f17989b
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1.put(r0, r4)
            s7.q<TResult> r4 = r0.f23075a
            m6.a0 r1 = new m6.a0
            r1.<init>(r3, r0)
            java.util.Objects.requireNonNull(r4)
            java.util.concurrent.Executor r3 = p327s7.C5987k.f23076a
            r4.m12471p(r3, r1)
            return
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1097q
    /* renamed from: f */
    public final com.google.android.gms.common.Feature[] mo3094f(com.google.android.gms.common.api.internal.C1082b.a<?> r1) {
            r0 = this;
            m6.k<java.lang.Object, ResultT> r1 = r0.f5628b
            k6.d[] r1 = r1.f17958a
            return r1
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1097q
    /* renamed from: g */
    public final boolean mo3095g(com.google.android.gms.common.api.internal.C1082b.a<?> r1) {
            r0 = this;
            m6.k<java.lang.Object, ResultT> r1 = r0.f5628b
            boolean r1 = r1.f17959b
            return r1
    }
}
