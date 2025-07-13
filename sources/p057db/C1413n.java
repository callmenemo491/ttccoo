package p057db;

/* renamed from: db.n */
/* loaded from: classes.dex */
public final /* synthetic */ class C1413n implements va.InterfaceC6629a.a, p327s7.InterfaceC5982f {

    /* renamed from: Y */
    public final com.google.firebase.messaging.FirebaseMessaging f7081Y;

    public C1413n(com.google.firebase.messaging.FirebaseMessaging r2, int r3) {
            r1 = this;
            r0 = 1
            if (r3 == r0) goto L9
            r1.<init>()
            r1.f7081Y = r2
            return
        L9:
            r1.<init>()
            r1.f7081Y = r2
            return
    }

    @Override // p327s7.InterfaceC5982f
    /* renamed from: d */
    public void mo1270d(java.lang.Object r3) {
            r2 = this;
            com.google.firebase.messaging.FirebaseMessaging r0 = r2.f7081Y
            db.g0 r3 = (p057db.C1400g0) r3
            com.google.firebase.messaging.FirebaseMessaging$a r0 = r0.f6613g
            boolean r0 = r0.m3663b()
            if (r0 == 0) goto L28
            db.e0 r0 = r3.f7047i
            db.d0 r0 = r0.m3916a()
            if (r0 == 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            if (r0 == 0) goto L28
            monitor-enter(r3)
            boolean r0 = r3.f7046h     // Catch: java.lang.Throwable -> L25
            monitor-exit(r3)
            if (r0 != 0) goto L28
            r0 = 0
            r3.m3924g(r0)
            goto L28
        L25:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L28:
            return
    }
}
