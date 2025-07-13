package p317ri;

/* renamed from: ri.u1 */
/* loaded from: classes.dex */
public abstract class AbstractC5920u1 extends java.io.InputStream {

    /* renamed from: Y */
    public final java.io.InputStream f22747Y;

    /* renamed from: Z */
    public int f22748Z;

    public AbstractC5920u1(java.io.InputStream r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f22747Y = r1
            r0.f22748Z = r2
            return
    }

    /* renamed from: a */
    public int mo12260a() {
            r1 = this;
            int r0 = r1.f22748Z
            return r0
    }

    /* renamed from: h */
    public void m12283h(boolean r3) {
            r2 = this;
            java.io.InputStream r0 = r2.f22747Y
            boolean r1 = r0 instanceof p317ri.C5911r1
            if (r1 == 0) goto Ld
            ri.r1 r0 = (p317ri.C5911r1) r0
            r0.f22740d0 = r3
            r0.m12270i()
        Ld:
            return
    }
}
