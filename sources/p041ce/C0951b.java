package p041ce;

/* renamed from: ce.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0951b implements androidx.activity.result.InterfaceC0194b, p454zc.InterfaceC7278b {

    /* renamed from: Y */
    public final /* synthetic */ p041ce.C0953d f4944Y;

    public /* synthetic */ C0951b(p041ce.C0953d r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f4944Y = r1
            return
    }

    @Override // p454zc.InterfaceC7278b
    /* renamed from: a */
    public void mo2673a(p454zc.C7279c r7) {
            r6 = this;
            ce.d r0 = r6.f4944Y
            int r1 = p041ce.C0953d.f4946q1
            java.lang.String r1 = "this$0"
            p214m2.C4339q.m9706k(r0, r1)
            if (r7 == 0) goto L10
            sb.o r1 = r7.f27931a
            java.lang.String r1 = r1.f23206a
            goto L11
        L10:
            r1 = 0
        L11:
            if (r1 != 0) goto L14
            goto L5c
        L14:
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r3 = r0.f4949o1
            long r1 = r1 - r3
            r3 = 1000(0x3e8, double:4.94E-321)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L22
            goto L5c
        L22:
            long r1 = android.os.SystemClock.elapsedRealtime()
            r0.f4949o1 = r1
            sb.o r7 = r7.f27931a
            java.lang.String r7 = r7.f23206a
            java.lang.String r1 = "this"
            p214m2.C4339q.m9705j(r7, r1)     // Catch: java.lang.Throwable -> L36
            ce.f r7 = p185k7.C3836i.m8622g(r7)     // Catch: java.lang.Throwable -> L36
            goto L3b
        L36:
            r7 = move-exception
            java.lang.Object r7 = p074e9.C1805a.m4520e(r7)
        L3b:
            boolean r1 = r7 instanceof ch.C0979f.a
            r1 = r1 ^ 1
            if (r1 == 0) goto L4e
            r1 = r7
            ce.f r1 = (p041ce.C0955f) r1
            ce.e r2 = r0.f4948n1
            if (r2 == 0) goto L4b
            r2.mo2676m(r1)
        L4b:
            r0.mo1222D0()
        L4e:
            java.lang.Throwable r7 = ch.C0979f.m2690b(r7)
            if (r7 == 0) goto L5c
            ce.c r1 = new ce.c
            r1.<init>(r7)
            p458zg.C7331c.m14405d(r0, r1)
        L5c:
            return
    }

    @Override // p454zc.InterfaceC7278b
    /* renamed from: b */
    public /* synthetic */ void mo2674b(java.util.List r1) {
            r0 = this;
            p454zc.C7277a.m14389a(r0, r1)
            return
    }

    @Override // androidx.activity.result.InterfaceC0194b
    /* renamed from: d */
    public void mo448d(java.lang.Object r3) {
            r2 = this;
            ce.d r0 = r2.f4944Y
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            int r1 = p041ce.C0953d.f4946q1
            java.lang.String r1 = "this$0"
            p214m2.C4339q.m9706k(r0, r1)
            java.lang.String r1 = "isGranted"
            p214m2.C4339q.m9705j(r3, r1)
            boolean r1 = r3.booleanValue()
            r0.m2675P0(r1)
            r3.booleanValue()
            return
    }
}
