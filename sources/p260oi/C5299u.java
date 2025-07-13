package p260oi;

/* renamed from: oi.u */
/* loaded from: classes.dex */
public final class C5299u {

    /* renamed from: a */
    public final byte[] f20536a;

    /* renamed from: b */
    public int f20537b;

    /* renamed from: c */
    public int f20538c;

    /* renamed from: d */
    public boolean f20539d;

    /* renamed from: e */
    public boolean f20540e;

    /* renamed from: f */
    public p260oi.C5299u f20541f;

    /* renamed from: g */
    public p260oi.C5299u f20542g;

    public C5299u() {
            r1 = this;
            r1.<init>()
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = new byte[r0]
            r1.f20536a = r0
            r0 = 1
            r1.f20540e = r0
            r0 = 0
            r1.f20539d = r0
            return
    }

    public C5299u(byte[] r2, int r3, int r4, boolean r5, boolean r6) {
            r1 = this;
            java.lang.String r0 = "data"
            p214m2.C4339q.m9706k(r2, r0)
            r1.<init>()
            r1.f20536a = r2
            r1.f20537b = r3
            r1.f20538c = r4
            r1.f20539d = r5
            r1.f20540e = r6
            return
    }

    /* renamed from: a */
    public final p260oi.C5299u m11604a() {
            r4 = this;
            oi.u r0 = r4.f20541f
            r1 = 0
            if (r0 == r4) goto L6
            goto L7
        L6:
            r0 = r1
        L7:
            oi.u r2 = r4.f20542g
            p214m2.C4339q.m9704i(r2)
            oi.u r3 = r4.f20541f
            r2.f20541f = r3
            oi.u r2 = r4.f20541f
            p214m2.C4339q.m9704i(r2)
            oi.u r3 = r4.f20542g
            r2.f20542g = r3
            r4.f20541f = r1
            r4.f20542g = r1
            return r0
    }

    /* renamed from: b */
    public final p260oi.C5299u m11605b(p260oi.C5299u r2) {
            r1 = this;
            r2.f20542g = r1
            oi.u r0 = r1.f20541f
            r2.f20541f = r0
            oi.u r0 = r1.f20541f
            p214m2.C4339q.m9704i(r0)
            r0.f20542g = r2
            r1.f20541f = r2
            return r2
    }

    /* renamed from: c */
    public final p260oi.C5299u m11606c() {
            r7 = this;
            r0 = 1
            r7.f20539d = r0
            oi.u r0 = new oi.u
            byte[] r2 = r7.f20536a
            int r3 = r7.f20537b
            int r4 = r7.f20538c
            r5 = 1
            r6 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
    }

    /* renamed from: d */
    public final void m11607d(p260oi.C5299u r8, int r9) {
            r7 = this;
            boolean r0 = r8.f20540e
            if (r0 == 0) goto L4c
            int r5 = r8.f20538c
            int r0 = r5 + r9
            r1 = 8192(0x2000, float:1.148E-41)
            if (r0 <= r1) goto L34
            boolean r2 = r8.f20539d
            if (r2 != 0) goto L2e
            int r4 = r8.f20537b
            int r0 = r0 - r4
            if (r0 > r1) goto L28
            byte[] r2 = r8.f20536a
            r3 = 0
            r6 = 2
            r1 = r2
            p062dh.C1468d.m3984F(r1, r2, r3, r4, r5, r6)
            int r0 = r8.f20538c
            int r1 = r8.f20537b
            int r0 = r0 - r1
            r8.f20538c = r0
            r0 = 0
            r8.f20537b = r0
            goto L34
        L28:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>()
            throw r8
        L2e:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>()
            throw r8
        L34:
            byte[] r0 = r7.f20536a
            byte[] r1 = r8.f20536a
            int r2 = r8.f20538c
            int r3 = r7.f20537b
            int r4 = r3 + r9
            p062dh.C1468d.m3983E(r0, r1, r2, r3, r4)
            int r0 = r8.f20538c
            int r0 = r0 + r9
            r8.f20538c = r0
            int r8 = r7.f20537b
            int r8 = r8 + r9
            r7.f20537b = r8
            return
        L4c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "only owner can write"
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
    }
}
