package p419xh;

/* renamed from: xh.e */
/* loaded from: classes.dex */
public final /* synthetic */ class C7077e {
    /* renamed from: a */
    public static final java.lang.Object m14182a(p419xh.InterfaceC7074b r4, mh.InterfaceC4625q r5, java.lang.Throwable r6, p101fh.InterfaceC2172d r7) {
            boolean r0 = r7 instanceof p419xh.C7075c
            if (r0 == 0) goto L13
            r0 = r7
            xh.c r0 = (p419xh.C7075c) r0
            int r1 = r0.f27397d0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27397d0 = r1
            goto L18
        L13:
            xh.c r0 = new xh.c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f27396c0
            gh.a r1 = gh.EnumC2389a.f10764Y
            int r2 = r0.f27397d0
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r4 = r0.f27395b0
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            p074e9.C1805a.m4540y(r7)     // Catch: java.lang.Throwable -> L45
            goto L42
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            p074e9.C1805a.m4540y(r7)
            r0.f27395b0 = r6     // Catch: java.lang.Throwable -> L45
            r0.f27397d0 = r3     // Catch: java.lang.Throwable -> L45
            java.lang.Object r4 = r5.mo115i(r4, r6, r0)     // Catch: java.lang.Throwable -> L45
            if (r4 != r1) goto L42
            goto L44
        L42:
            ch.l r1 = ch.C0985l.f5061a
        L44:
            return r1
        L45:
            r4 = move-exception
            if (r6 == 0) goto L4d
            if (r6 == r4) goto L4d
            p185k7.C3836i.m8616a(r4, r6)
        L4d:
            throw r4
    }
}
