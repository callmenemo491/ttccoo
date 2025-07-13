package androidx.lifecycle;

/* renamed from: androidx.lifecycle.g */
/* loaded from: classes.dex */
public final class C0442g implements java.io.Closeable, p379vh.InterfaceC6686b0 {

    /* renamed from: Y */
    public final p101fh.InterfaceC2175g f2496Y;

    public C0442g(p101fh.InterfaceC2175g r2) {
            r1 = this;
            java.lang.String r0 = "context"
            p214m2.C4339q.m9706k(r2, r0)
            r1.<init>()
            r1.f2496Y = r2
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r3 = this;
            fh.g r0 = r3.f2496Y
            r1 = 1
            r2 = 0
            p209lh.C4304a.m9612f(r0, r2, r1, r2)
            return
    }

    @Override // p379vh.InterfaceC6686b0
    /* renamed from: l */
    public p101fh.InterfaceC2175g mo1407l() {
            r1 = this;
            fh.g r0 = r1.f2496Y
            return r0
    }
}
