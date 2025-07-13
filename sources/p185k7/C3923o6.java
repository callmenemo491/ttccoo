package p185k7;

/* renamed from: k7.o6 */
/* loaded from: classes.dex */
public class C3923o6 {

    /* renamed from: a */
    public volatile p185k7.InterfaceC3802f7 f16807a;

    /* renamed from: b */
    public volatile p185k7.AbstractC3842i5 f16808b;

    static {
            p185k7.C3948q5.m8909a()
            return
    }

    public C3923o6() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public final int m8865a() {
            r1 = this;
            k7.i5 r0 = r1.f16808b
            if (r0 == 0) goto Lc
            k7.i5 r0 = r1.f16808b
            k7.f5 r0 = (p185k7.C3800f5) r0
            byte[] r0 = r0.f16633a0
            int r0 = r0.length
            return r0
        Lc:
            k7.f7 r0 = r1.f16807a
            if (r0 == 0) goto L17
            k7.f7 r0 = r1.f16807a
            int r0 = r0.mo8495c()
            return r0
        L17:
            r0 = 0
            return r0
    }

    /* renamed from: b */
    public final p185k7.AbstractC3842i5 m8866b() {
            r1 = this;
            k7.i5 r0 = r1.f16808b
            if (r0 == 0) goto L7
            k7.i5 r0 = r1.f16808b
            return r0
        L7:
            monitor-enter(r1)
            k7.i5 r0 = r1.f16808b     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L10
            k7.i5 r0 = r1.f16808b     // Catch: java.lang.Throwable -> L24
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            return r0
        L10:
            k7.f7 r0 = r1.f16807a     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L19
            k7.i5 r0 = p185k7.AbstractC3842i5.f16678Z     // Catch: java.lang.Throwable -> L24
        L16:
            r1.f16808b = r0     // Catch: java.lang.Throwable -> L24
            goto L20
        L19:
            k7.f7 r0 = r1.f16807a     // Catch: java.lang.Throwable -> L24
            k7.i5 r0 = r0.mo8541b()     // Catch: java.lang.Throwable -> L24
            goto L16
        L20:
            k7.i5 r0 = r1.f16808b     // Catch: java.lang.Throwable -> L24
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            return r0
        L24:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            throw r0
    }

    /* renamed from: c */
    public final void m8867c(p185k7.InterfaceC3802f7 r2) {
            r1 = this;
            k7.f7 r0 = r1.f16807a
            if (r0 == 0) goto L5
            return
        L5:
            monitor-enter(r1)
            k7.f7 r0 = r1.f16807a     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L19
            r1.f16807a = r2     // Catch: p185k7.C3897m6 -> L11 java.lang.Throwable -> L1b
            k7.i5 r0 = p185k7.AbstractC3842i5.f16678Z     // Catch: p185k7.C3897m6 -> L11 java.lang.Throwable -> L1b
            r1.f16808b = r0     // Catch: p185k7.C3897m6 -> L11 java.lang.Throwable -> L1b
            goto L17
        L11:
            r1.f16807a = r2     // Catch: java.lang.Throwable -> L1b
            k7.i5 r2 = p185k7.AbstractC3842i5.f16678Z     // Catch: java.lang.Throwable -> L1b
            r1.f16808b = r2     // Catch: java.lang.Throwable -> L1b
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
            boolean r0 = r3 instanceof p185k7.C3923o6
            if (r0 != 0) goto La
            r3 = 0
            return r3
        La:
            k7.o6 r3 = (p185k7.C3923o6) r3
            k7.f7 r0 = r2.f16807a
            k7.f7 r1 = r3.f16807a
            if (r0 != 0) goto L22
            if (r1 == 0) goto L15
            goto L22
        L15:
            k7.i5 r0 = r2.m8866b()
            k7.i5 r3 = r3.m8866b()
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
            k7.f7 r1 = r0.mo8200d()
            r3.m8867c(r1)
            k7.f7 r3 = r3.f16807a
            boolean r3 = r0.equals(r3)
            return r3
        L3c:
            k7.f7 r3 = r1.mo8200d()
            r2.m8867c(r3)
            k7.f7 r3 = r2.f16807a
            boolean r3 = r3.equals(r1)
            return r3
    }

    public int hashCode() {
            r1 = this;
            r0 = 1
            return r0
    }
}
