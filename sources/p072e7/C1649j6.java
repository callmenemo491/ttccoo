package p072e7;

/* renamed from: e7.j6 */
/* loaded from: classes.dex */
public class C1649j6 {

    /* renamed from: a */
    public volatile p072e7.InterfaceC1560a7 f7661a;

    /* renamed from: b */
    public volatile p072e7.AbstractC1638i5 f7662b;

    static {
            e7.n5 r0 = p072e7.C1688n5.f7700b
            if (r0 != 0) goto L14
            java.lang.Class<e7.n5> r0 = p072e7.C1688n5.class
            monitor-enter(r0)
            e7.n5 r1 = p072e7.C1688n5.f7700b     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto Lf
            e7.n5 r1 = p072e7.C1688n5.f7701c     // Catch: java.lang.Throwable -> L11
            p072e7.C1688n5.f7700b = r1     // Catch: java.lang.Throwable -> L11
        Lf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            goto L14
        L11:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
        L14:
            return
    }

    public C1649j6() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public final int m4290a() {
            r1 = this;
            e7.i5 r0 = r1.f7662b
            if (r0 == 0) goto Lc
            e7.i5 r0 = r1.f7662b
            e7.h5 r0 = (p072e7.C1628h5) r0
            byte[] r0 = r0.f7581a0
            int r0 = r0.length
            return r0
        Lc:
            e7.a7 r0 = r1.f7661a
            if (r0 == 0) goto L17
            e7.a7 r0 = r1.f7661a
            int r0 = r0.mo4123j()
            return r0
        L17:
            r0 = 0
            return r0
    }

    /* renamed from: b */
    public final p072e7.AbstractC1638i5 m4291b() {
            r1 = this;
            e7.i5 r0 = r1.f7662b
            if (r0 == 0) goto L7
            e7.i5 r0 = r1.f7662b
            return r0
        L7:
            monitor-enter(r1)
            e7.i5 r0 = r1.f7662b     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L10
            e7.i5 r0 = r1.f7662b     // Catch: java.lang.Throwable -> L24
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            return r0
        L10:
            e7.a7 r0 = r1.f7661a     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L19
            e7.i5 r0 = p072e7.AbstractC1638i5.f7635Z     // Catch: java.lang.Throwable -> L24
        L16:
            r1.f7662b = r0     // Catch: java.lang.Throwable -> L24
            goto L20
        L19:
            e7.a7 r0 = r1.f7661a     // Catch: java.lang.Throwable -> L24
            e7.i5 r0 = r0.mo4122m()     // Catch: java.lang.Throwable -> L24
            goto L16
        L20:
            e7.i5 r0 = r1.f7662b     // Catch: java.lang.Throwable -> L24
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            return r0
        L24:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            throw r0
    }

    /* renamed from: c */
    public final void m4292c(p072e7.InterfaceC1560a7 r2) {
            r1 = this;
            e7.a7 r0 = r1.f7661a
            if (r0 == 0) goto L5
            return
        L5:
            monitor-enter(r1)
            e7.a7 r0 = r1.f7661a     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L19
            r1.f7661a = r2     // Catch: p072e7.C1629h6 -> L11 java.lang.Throwable -> L1b
            e7.i5 r0 = p072e7.AbstractC1638i5.f7635Z     // Catch: p072e7.C1629h6 -> L11 java.lang.Throwable -> L1b
            r1.f7662b = r0     // Catch: p072e7.C1629h6 -> L11 java.lang.Throwable -> L1b
            goto L17
        L11:
            r1.f7661a = r2     // Catch: java.lang.Throwable -> L1b
            e7.i5 r2 = p072e7.AbstractC1638i5.f7635Z     // Catch: java.lang.Throwable -> L1b
            r1.f7662b = r2     // Catch: java.lang.Throwable -> L1b
        L17:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            return
        L19:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            return
        L1b:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            throw r2
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            boolean r0 = r3 instanceof p072e7.C1649j6
            if (r0 != 0) goto La
            r3 = 0
            return r3
        La:
            e7.j6 r3 = (p072e7.C1649j6) r3
            e7.a7 r0 = r2.f7661a
            e7.a7 r1 = r3.f7661a
            if (r0 != 0) goto L22
            if (r1 == 0) goto L15
            goto L22
        L15:
            e7.i5 r0 = r2.m4291b()
            e7.i5 r3 = r3.m4291b()
            boolean r3 = r0.equals(r3)
            return r3
        L22:
            if (r0 == 0) goto L2c
            if (r1 != 0) goto L27
            goto L2c
        L27:
            boolean r3 = r0.equals(r1)
            return r3
        L2c:
            if (r0 == 0) goto L3c
            e7.a7 r1 = r0.mo4130k()
            r3.m4292c(r1)
            e7.a7 r3 = r3.f7661a
            boolean r3 = r0.equals(r3)
            return r3
        L3c:
            e7.a7 r3 = r1.mo4130k()
            r2.m4292c(r3)
            e7.a7 r3 = r2.f7661a
            boolean r3 = r3.equals(r1)
            return r3
    }

    public int hashCode() {
            r1 = this;
            r0 = 1
            return r0
    }
}
