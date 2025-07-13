package com.google.firebase.auth;

/* renamed from: com.google.firebase.auth.b */
/* loaded from: classes.dex */
public final class RunnableC1243b implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ com.google.firebase.auth.FirebaseAuth f6594Y;

    public RunnableC1243b(com.google.firebase.auth.FirebaseAuth r1) {
            r0 = this;
            r0.f6594Y = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            com.google.firebase.auth.FirebaseAuth r0 = r3.f6594Y
            java.util.List<com.google.firebase.auth.FirebaseAuth$a> r0 = r0.f6582d
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            com.google.firebase.auth.FirebaseAuth$a r1 = (com.google.firebase.auth.FirebaseAuth.InterfaceC1240a) r1
            com.google.firebase.auth.FirebaseAuth r2 = r3.f6594Y
            r1.m3635a(r2)
            goto L8
        L1a:
            return
    }
}
