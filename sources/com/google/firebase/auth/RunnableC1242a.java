package com.google.firebase.auth;

/* renamed from: com.google.firebase.auth.a */
/* loaded from: classes.dex */
public final class RunnableC1242a implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ com.google.firebase.auth.FirebaseAuth f6592Y;

    /* renamed from: Z */
    public final /* synthetic */ bb.C0731b f6593Z;

    public RunnableC1242a(com.google.firebase.auth.FirebaseAuth r1, bb.C0731b r2) {
            r0 = this;
            r0.f6592Y = r1
            r0.f6593Z = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            com.google.firebase.auth.FirebaseAuth r0 = r3.f6592Y
            java.util.List<x9.a> r0 = r0.f6581c
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            x9.a r1 = (p411x9.InterfaceC6974a) r1
            bb.b r2 = r3.f6593Z
            r1.m14138a(r2)
            goto L8
        L1a:
            com.google.firebase.auth.FirebaseAuth r0 = r3.f6592Y
            java.util.List<com.google.firebase.auth.FirebaseAuth$b> r0 = r0.f6580b
            java.util.Iterator r0 = r0.iterator()
        L22:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            com.google.firebase.auth.FirebaseAuth$b r1 = (com.google.firebase.auth.FirebaseAuth.InterfaceC1241b) r1
            com.google.firebase.auth.FirebaseAuth r2 = r3.f6592Y
            r1.m3636a(r2)
            goto L22
        L34:
            return
    }
}
