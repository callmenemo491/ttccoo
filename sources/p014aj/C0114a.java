package p014aj;

/* renamed from: aj.a */
/* loaded from: classes.dex */
public class C0114a extends p317ri.AbstractC5894m {

    /* renamed from: Y */
    public p317ri.AbstractC5915t f382Y;

    public C0114a(p317ri.AbstractC5915t r1) {
            r0 = this;
            r0.<init>()
            r0.f382Y = r1
            return
    }

    @Override // p317ri.AbstractC5894m, p317ri.InterfaceC5870e
    /* renamed from: e */
    public p317ri.AbstractC5912s mo168e() {
            r1 = this;
            ri.t r0 = r1.f382Y
            return r0
    }

    /* renamed from: n */
    public final p317ri.AbstractC5912s m169n(int r4) {
            r3 = this;
            ri.t r0 = r3.f382Y
            java.util.Enumeration r0 = r0.mo12278H()
        L6:
            boolean r1 = r0.hasMoreElements()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.nextElement()
            ri.e r1 = (p317ri.InterfaceC5870e) r1
            boolean r2 = r1 instanceof p317ri.AbstractC5928y
            if (r2 == 0) goto L6
            ri.y r1 = (p317ri.AbstractC5928y) r1
            int r2 = r1.f22755Y
            if (r2 != r4) goto L6
            ri.s r4 = r1.m12294D()
            java.util.Objects.requireNonNull(r4)
            return r4
        L24:
            r4 = 0
            return r4
    }
}
