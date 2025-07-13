package p371v5;

/* renamed from: v5.g */
/* loaded from: classes.dex */
public class C6557g {

    /* renamed from: a */
    public final java.lang.Object f25642a;

    /* renamed from: b */
    public boolean f25643b;

    public C6557g(p190kc.C4093n r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f25643b = r2
            r0.f25642a = r1
            return
    }

    public C6557g(p371v5.InterfaceC6553c r1) {
            r0 = this;
            r0.<init>()
            r0.f25642a = r1
            return
    }

    /* renamed from: a */
    public synchronized boolean m13342a() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f25643b     // Catch: java.lang.Throwable -> L8
            r1 = 0
            r2.f25643b = r1     // Catch: java.lang.Throwable -> L8
            monitor-exit(r2)
            return r0
        L8:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    /* renamed from: b */
    public synchronized boolean m13343b() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f25643b     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L8
            r0 = 0
            monitor-exit(r1)
            return r0
        L8:
            r0 = 1
            r1.f25643b = r0     // Catch: java.lang.Throwable -> L10
            r1.notifyAll()     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            return r0
        L10:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }
}
