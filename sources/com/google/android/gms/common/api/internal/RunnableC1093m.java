package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.m */
/* loaded from: classes.dex */
public final class RunnableC1093m implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ p184k6.C3698b f5618Y;

    /* renamed from: Z */
    public final /* synthetic */ com.google.android.gms.common.api.internal.C1082b.c f5619Z;

    public RunnableC1093m(com.google.android.gms.common.api.internal.C1082b.c r1, p184k6.C3698b r2) {
            r0 = this;
            r0.f5619Z = r1
            r0.f5618Y = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            com.google.android.gms.common.api.internal.b$c r0 = r5.f5619Z
            com.google.android.gms.common.api.internal.b r1 = r0.f5595f
            java.util.Map<m6.b<?>, com.google.android.gms.common.api.internal.b$a<?>> r1 = r1.f5570h0
            m6.b<?> r0 = r0.f5591b
            java.lang.Object r0 = r1.get(r0)
            com.google.android.gms.common.api.internal.b$a r0 = (com.google.android.gms.common.api.internal.C1082b.a) r0
            if (r0 != 0) goto L11
            return
        L11:
            k6.b r1 = r5.f5618Y
            boolean r1 = r1.m8161X()
            r2 = 0
            if (r1 == 0) goto L61
            com.google.android.gms.common.api.internal.b$c r1 = r5.f5619Z
            r3 = 1
            r1.f5594e = r3
            l6.a$e r1 = r1.f5590a
            boolean r1 = r1.mo9323o()
            if (r1 == 0) goto L39
            com.google.android.gms.common.api.internal.b$c r0 = r5.f5619Z
            boolean r1 = r0.f5594e
            if (r1 == 0) goto L38
            o6.k r1 = r0.f5592c
            if (r1 == 0) goto L38
            l6.a$e r2 = r0.f5590a
            java.util.Set<com.google.android.gms.common.api.Scope> r0 = r0.f5593d
            r2.mo9316c(r1, r0)
        L38:
            return
        L39:
            com.google.android.gms.common.api.internal.b$c r1 = r5.f5619Z     // Catch: java.lang.SecurityException -> L45
            l6.a$e r1 = r1.f5590a     // Catch: java.lang.SecurityException -> L45
            java.util.Set r3 = r1.mo9315b()     // Catch: java.lang.SecurityException -> L45
            r1.mo9316c(r2, r3)     // Catch: java.lang.SecurityException -> L45
            return
        L45:
            r1 = move-exception
            java.lang.String r3 = "GoogleApiManager"
            java.lang.String r4 = "Failed to get service from broker. "
            android.util.Log.e(r3, r4, r1)
            com.google.android.gms.common.api.internal.b$c r1 = r5.f5619Z
            l6.a$e r1 = r1.f5590a
            java.lang.String r3 = "Failed to get service from broker."
            r1.mo9317d(r3)
            k6.b r1 = new k6.b
            r3 = 10
            r1.<init>(r3)
        L5d:
            r0.m3068g(r1, r2)
            return
        L61:
            k6.b r1 = r5.f5618Y
            goto L5d
    }
}
