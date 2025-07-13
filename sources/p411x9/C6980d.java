package p411x9;

/* renamed from: x9.d */
/* loaded from: classes.dex */
public final class C6980d implements p327s7.InterfaceC5981e {

    /* renamed from: Y */
    public final java.lang.Object f27257Y;

    public C6980d(p123h6.RunnableC2488a0 r1) {
            r0 = this;
            r0.f27257Y = r1
            r0.<init>()
            return
    }

    public C6980d(p411x9.C6985f0 r1) {
            r0 = this;
            r0.<init>()
            r0.f27257Y = r1
            return
    }

    /* renamed from: a */
    public java.util.List<p375v9.AbstractC6621s> m14140a() {
            r3 = this;
            java.lang.Object r0 = r3.f27257Y
            x9.f0 r0 = (p411x9.C6985f0) r0
            x9.n r0 = r0.f27274j0
            if (r0 == 0) goto L23
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List<v9.w> r0 = r0.f27289Y
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L28
            java.lang.Object r2 = r0.next()
            v9.w r2 = (p375v9.C6625w) r2
            r1.add(r2)
            goto L13
        L23:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L28:
            return r1
    }

    @Override // p327s7.InterfaceC5981e
    /* renamed from: c */
    public void mo4109c(java.lang.Exception r9) {
            r8 = this;
            boolean r9 = r9 instanceof p251o9.C5183g
            if (r9 == 0) goto L6e
            r6.a r9 = p411x9.C6990i.f27280f
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "Failure to refresh token; scheduling refresh after failure"
            r9.m12163d(r2, r1)
            java.lang.Object r1 = r8.f27257Y
            h6.a0 r1 = (p123h6.RunnableC2488a0) r1
            java.lang.Object r1 = r1.f11252a0
            x9.i r1 = (p411x9.C6990i) r1
            long r2 = r1.f27282b
            int r3 = (int) r2
            r2 = 30
            if (r3 == r2) goto L37
            r2 = 60
            if (r3 == r2) goto L37
            r2 = 120(0x78, float:1.68E-43)
            if (r3 == r2) goto L37
            r2 = 240(0xf0, float:3.36E-43)
            if (r3 == r2) goto L37
            r2 = 480(0x1e0, float:6.73E-43)
            if (r3 == r2) goto L37
            r2 = 960(0x3c0, float:1.345E-42)
            if (r3 == r2) goto L34
            r2 = 30
            goto L3a
        L34:
            r2 = 960(0x3c0, double:4.743E-321)
            goto L3a
        L37:
            long r2 = r1.f27282b
            long r2 = r2 + r2
        L3a:
            r1.f27282b = r2
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r1.f27282b
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r6
            long r4 = r4 + r2
            r1.f27281a = r4
            long r2 = r1.f27281a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 43
            r4.<init>(r5)
            java.lang.String r5 = "Scheduling refresh for "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r9.m12163d(r2, r0)
            android.os.Handler r9 = r1.f27284d
            java.lang.Runnable r0 = r1.f27285e
            long r1 = r1.f27282b
            long r1 = r1 * r6
            r9.postDelayed(r0, r1)
        L6e:
            return
    }
}
