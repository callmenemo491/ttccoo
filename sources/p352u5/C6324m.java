package p352u5;

/* renamed from: u5.m */
/* loaded from: classes.dex */
public final class C6324m {

    /* renamed from: a */
    public final boolean f24714a;

    /* renamed from: b */
    public final int f24715b;

    /* renamed from: c */
    public final p352u5.C6304a[] f24716c;

    /* renamed from: d */
    public int f24717d;

    /* renamed from: e */
    public int f24718e;

    /* renamed from: f */
    public int f24719f;

    /* renamed from: g */
    public p352u5.C6304a[] f24720g;

    public C6324m(boolean r4, int r5) {
            r3 = this;
            r3.<init>()
            r0 = 1
            r1 = 0
            if (r5 <= 0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            p371v5.C6549a.m13288b(r2)
            r3.f24714a = r4
            r3.f24715b = r5
            r3.f24719f = r1
            r4 = 100
            u5.a[] r4 = new p352u5.C6304a[r4]
            r3.f24720g = r4
            u5.a[] r4 = new p352u5.C6304a[r0]
            r3.f24716c = r4
            return
    }

    /* renamed from: a */
    public synchronized void m12966a(p352u5.C6304a[] r7) {
            r6 = this;
            monitor-enter(r6)
            int r0 = r6.f24719f     // Catch: java.lang.Throwable -> L39
            int r1 = r7.length     // Catch: java.lang.Throwable -> L39
            int r1 = r1 + r0
            u5.a[] r2 = r6.f24720g     // Catch: java.lang.Throwable -> L39
            int r3 = r2.length     // Catch: java.lang.Throwable -> L39
            if (r1 < r3) goto L1b
            int r1 = r2.length     // Catch: java.lang.Throwable -> L39
            int r1 = r1 * 2
            int r3 = r7.length     // Catch: java.lang.Throwable -> L39
            int r0 = r0 + r3
            int r0 = java.lang.Math.max(r1, r0)     // Catch: java.lang.Throwable -> L39
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)     // Catch: java.lang.Throwable -> L39
            u5.a[] r0 = (p352u5.C6304a[]) r0     // Catch: java.lang.Throwable -> L39
            r6.f24720g = r0     // Catch: java.lang.Throwable -> L39
        L1b:
            int r0 = r7.length     // Catch: java.lang.Throwable -> L39
            r1 = 0
        L1d:
            if (r1 >= r0) goto L2e
            r2 = r7[r1]     // Catch: java.lang.Throwable -> L39
            u5.a[] r3 = r6.f24720g     // Catch: java.lang.Throwable -> L39
            int r4 = r6.f24719f     // Catch: java.lang.Throwable -> L39
            int r5 = r4 + 1
            r6.f24719f = r5     // Catch: java.lang.Throwable -> L39
            r3[r4] = r2     // Catch: java.lang.Throwable -> L39
            int r1 = r1 + 1
            goto L1d
        L2e:
            int r0 = r6.f24718e     // Catch: java.lang.Throwable -> L39
            int r7 = r7.length     // Catch: java.lang.Throwable -> L39
            int r0 = r0 - r7
            r6.f24718e = r0     // Catch: java.lang.Throwable -> L39
            r6.notifyAll()     // Catch: java.lang.Throwable -> L39
            monitor-exit(r6)
            return
        L39:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    /* renamed from: b */
    public synchronized void m12967b(int r2) {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.f24717d     // Catch: java.lang.Throwable -> L11
            if (r2 >= r0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            r1.f24717d = r2     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto Lf
            r1.m12968c()     // Catch: java.lang.Throwable -> L11
        Lf:
            monitor-exit(r1)
            return
        L11:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    /* renamed from: c */
    public synchronized void m12968c() {
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.f24717d     // Catch: java.lang.Throwable -> L21
            int r1 = r4.f24715b     // Catch: java.lang.Throwable -> L21
            int r0 = p371v5.C6552b0.m13313f(r0, r1)     // Catch: java.lang.Throwable -> L21
            int r1 = r4.f24718e     // Catch: java.lang.Throwable -> L21
            int r0 = r0 - r1
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)     // Catch: java.lang.Throwable -> L21
            int r1 = r4.f24719f     // Catch: java.lang.Throwable -> L21
            if (r0 < r1) goto L17
            monitor-exit(r4)
            return
        L17:
            u5.a[] r2 = r4.f24720g     // Catch: java.lang.Throwable -> L21
            r3 = 0
            java.util.Arrays.fill(r2, r0, r1, r3)     // Catch: java.lang.Throwable -> L21
            r4.f24719f = r0     // Catch: java.lang.Throwable -> L21
            monitor-exit(r4)
            return
        L21:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }
}
