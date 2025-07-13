package p158j0;

/* renamed from: j0.b */
/* loaded from: classes.dex */
public final class C3380b {

    /* renamed from: a */
    public boolean f14534a;

    /* renamed from: b */
    public p158j0.C3380b.a f14535b;

    /* renamed from: c */
    public boolean f14536c;

    /* renamed from: j0.b$a */
    public interface a {
        /* renamed from: a */
        void mo1106a();
    }

    public C3380b() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public void m7755a() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f14534a     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L7
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            return
        L7:
            r0 = 1
            r2.f14534a = r0     // Catch: java.lang.Throwable -> L2d
            r2.f14536c = r0     // Catch: java.lang.Throwable -> L2d
            j0.b$a r0 = r2.f14535b     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            r1 = 0
            if (r0 == 0) goto L22
            r0.mo1106a()     // Catch: java.lang.Throwable -> L16
            goto L22
        L16:
            r0 = move-exception
            monitor-enter(r2)
            r2.f14536c = r1     // Catch: java.lang.Throwable -> L1f
            r2.notifyAll()     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1f
            throw r0
        L1f:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1f
            throw r0
        L22:
            monitor-enter(r2)
            r2.f14536c = r1     // Catch: java.lang.Throwable -> L2a
            r2.notifyAll()     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
            return
        L2a:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
            throw r0
        L2d:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            throw r0
    }

    /* renamed from: b */
    public void m7756b(p158j0.C3380b.a r2) {
            r1 = this;
            monitor-enter(r1)
        L1:
            boolean r0 = r1.f14536c     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L9
            r1.wait()     // Catch: java.lang.InterruptedException -> L1 java.lang.Throwable -> L1c
            goto L1
        L9:
            j0.b$a r0 = r1.f14535b     // Catch: java.lang.Throwable -> L1c
            if (r0 != r2) goto Lf
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1c
            return
        Lf:
            r1.f14535b = r2     // Catch: java.lang.Throwable -> L1c
            boolean r0 = r1.f14534a     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1c
            r2.mo1106a()
            return
        L1a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1c
            return
        L1c:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1c
            throw r2
    }
}
