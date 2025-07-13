package p221m9;

/* renamed from: m9.d0 */
/* loaded from: classes.dex */
public class C4443d0 {

    /* renamed from: a */
    public volatile p221m9.InterfaceC4482q0 f18120a;

    /* renamed from: b */
    public volatile p221m9.AbstractC4454h f18121b;

    static {
            p221m9.C4478p.m10222a()
            return
    }

    public C4443d0() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public p221m9.InterfaceC4482q0 m9916a(p221m9.InterfaceC4482q0 r2) {
            r1 = this;
            m9.q0 r0 = r1.f18120a
            if (r0 == 0) goto L5
            goto L1a
        L5:
            monitor-enter(r1)
            m9.q0 r0 = r1.f18120a     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto Lc
        La:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1d
            goto L1a
        Lc:
            r1.f18120a = r2     // Catch: p221m9.C4434a0 -> L13 java.lang.Throwable -> L1d
            m9.h r0 = p221m9.AbstractC4454h.f18139Z     // Catch: p221m9.C4434a0 -> L13 java.lang.Throwable -> L1d
            r1.f18121b = r0     // Catch: p221m9.C4434a0 -> L13 java.lang.Throwable -> L1d
            goto La
        L13:
            r1.f18120a = r2     // Catch: java.lang.Throwable -> L1d
            m9.h r2 = p221m9.AbstractC4454h.f18139Z     // Catch: java.lang.Throwable -> L1d
            r1.f18121b = r2     // Catch: java.lang.Throwable -> L1d
            goto La
        L1a:
            m9.q0 r2 = r1.f18120a
            return r2
        L1d:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1d
            throw r2
    }

    /* renamed from: b */
    public p221m9.AbstractC4454h m9917b() {
            r1 = this;
            m9.h r0 = r1.f18121b
            if (r0 == 0) goto L7
            m9.h r0 = r1.f18121b
            return r0
        L7:
            monitor-enter(r1)
            m9.h r0 = r1.f18121b     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L10
            m9.h r0 = r1.f18121b     // Catch: java.lang.Throwable -> L24
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            return r0
        L10:
            m9.q0 r0 = r1.f18120a     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L19
            m9.h r0 = p221m9.AbstractC4454h.f18139Z     // Catch: java.lang.Throwable -> L24
        L16:
            r1.f18121b = r0     // Catch: java.lang.Throwable -> L24
            goto L20
        L19:
            m9.q0 r0 = r1.f18120a     // Catch: java.lang.Throwable -> L24
            m9.h r0 = r0.mo9890g()     // Catch: java.lang.Throwable -> L24
            goto L16
        L20:
            m9.h r0 = r1.f18121b     // Catch: java.lang.Throwable -> L24
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            return r0
        L24:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            throw r0
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            boolean r0 = r3 instanceof p221m9.C4443d0
            if (r0 != 0) goto La
            r3 = 0
            return r3
        La:
            m9.d0 r3 = (p221m9.C4443d0) r3
            m9.q0 r0 = r2.f18120a
            m9.q0 r1 = r3.f18120a
            if (r0 != 0) goto L21
            if (r1 != 0) goto L21
            m9.h r0 = r2.m9917b()
            m9.h r3 = r3.m9917b()
            boolean r3 = r0.equals(r3)
            return r3
        L21:
            if (r0 == 0) goto L2a
            if (r1 == 0) goto L2a
            boolean r3 = r0.equals(r1)
            return r3
        L2a:
            if (r0 == 0) goto L39
            m9.q0 r1 = r0.mo10279b()
            m9.q0 r3 = r3.m9916a(r1)
            boolean r3 = r0.equals(r3)
            return r3
        L39:
            m9.q0 r3 = r1.mo10279b()
            m9.q0 r3 = r2.m9916a(r3)
            boolean r3 = r3.equals(r1)
            return r3
    }

    public int hashCode() {
            r1 = this;
            r0 = 1
            return r0
    }
}
