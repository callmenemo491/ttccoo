package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.l */
/* loaded from: classes.dex */
public final class RunnableC1092l implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ com.google.android.gms.common.api.internal.C1091k f5617Y;

    public RunnableC1092l(com.google.android.gms.common.api.internal.C1091k r1) {
            r0 = this;
            r0.f5617Y = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            com.google.android.gms.common.api.internal.k r0 = r3.f5617Y
            com.google.android.gms.common.api.internal.b$a r0 = r0.f5616a
            l6.a$e r0 = r0.f5576b
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = " disconnecting because it was signed out."
            java.lang.String r1 = r1.concat(r2)
            r0.mo9317d(r1)
            return
    }
}
