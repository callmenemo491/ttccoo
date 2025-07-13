package p212m0;

/* renamed from: m0.d */
/* loaded from: classes.dex */
public class C4314d<T> extends p365v.C6478e {

    /* renamed from: d */
    public final java.lang.Object f17584d;

    public C4314d(int r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r1.f17584d = r2
            return
    }

    @Override // p365v.C6478e, p212m0.InterfaceC4313c
    /* renamed from: a */
    public boolean mo6230a(T r2) {
            r1 = this;
            java.lang.Object r0 = r1.f17584d
            monitor-enter(r0)
            boolean r2 = super.mo6230a(r2)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return r2
        L9:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    @Override // p365v.C6478e, p212m0.InterfaceC4313c
    /* renamed from: b */
    public T mo6231b() {
            r2 = this;
            java.lang.Object r0 = r2.f17584d
            monitor-enter(r0)
            java.lang.Object r1 = super.mo6231b()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return r1
        L9:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }
}
