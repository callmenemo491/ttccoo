package p260oi;

/* renamed from: oi.j */
/* loaded from: classes.dex */
public abstract class AbstractC5288j implements p260oi.InterfaceC5302x {

    /* renamed from: Y */
    public final p260oi.InterfaceC5302x f20509Y;

    public AbstractC5288j(p260oi.InterfaceC5302x r1) {
            r0 = this;
            r0.<init>()
            r0.f20509Y = r1
            return
    }

    @Override // p260oi.InterfaceC5302x
    /* renamed from: d */
    public p260oi.C5279a0 mo7464d() {
            r1 = this;
            oi.x r0 = r1.f20509Y
            oi.a0 r0 = r0.mo7464d()
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
            oi.x r1 = r2.f20509Y
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
