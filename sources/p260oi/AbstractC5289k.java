package p260oi;

/* renamed from: oi.k */
/* loaded from: classes.dex */
public abstract class AbstractC5289k implements p260oi.InterfaceC5304z {

    /* renamed from: Y */
    public final p260oi.InterfaceC5304z f20510Y;

    public AbstractC5289k(p260oi.InterfaceC5304z r2) {
            r1 = this;
            java.lang.String r0 = "delegate"
            p214m2.C4339q.m9706k(r2, r0)
            r1.<init>()
            r1.f20510Y = r2
            return
    }

    @Override // p260oi.InterfaceC5304z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            oi.z r0 = r1.f20510Y
            r0.close()
            return
    }

    @Override // p260oi.InterfaceC5304z
    /* renamed from: d */
    public p260oi.C5279a0 mo7463d() {
            r1 = this;
            oi.z r0 = r1.f20510Y
            oi.a0 r0 = r0.mo7463d()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            oi.z r1 = r2.f20510Y
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
