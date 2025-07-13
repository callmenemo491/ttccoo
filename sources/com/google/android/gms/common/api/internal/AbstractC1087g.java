package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.g */
/* loaded from: classes.dex */
public abstract class AbstractC1087g {

    /* renamed from: a */
    public final int f5611a;

    public AbstractC1087g(int r1) {
            r0 = this;
            r0.<init>()
            r0.f5611a = r1
            return
    }

    /* renamed from: a */
    public static com.google.android.gms.common.api.Status m3086a(android.os.RemoteException r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            java.lang.String r2 = r2.getLocalizedMessage()
            r0.append(r2)
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status
            java.lang.String r0 = r0.toString()
            r1 = 19
            r2.<init>(r1, r0)
            return r2
    }

    /* renamed from: b */
    public abstract void mo3087b(com.google.android.gms.common.api.Status r1);

    /* renamed from: c */
    public abstract void mo3088c(com.google.android.gms.common.api.internal.C1082b.a<?> r1);

    /* renamed from: d */
    public abstract void mo3089d(java.lang.Exception r1);

    /* renamed from: e */
    public abstract void mo3090e(p218m6.C4413z r1, boolean r2);
}
