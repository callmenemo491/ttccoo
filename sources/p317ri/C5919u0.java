package p317ri;

/* renamed from: ri.u0 */
/* loaded from: classes.dex */
public class C5919u0 extends p317ri.AbstractC5912s implements p317ri.InterfaceC5926x {

    /* renamed from: Y */
    public final byte[] f22746Y;

    public C5919u0(byte[] r1) {
            r0 = this;
            r0.<init>()
            r0.f22746Y = r1
            return
    }

    /* renamed from: C */
    public static p317ri.C5919u0 m12281C(java.lang.Object r2) {
            if (r2 == 0) goto L40
            boolean r0 = r2 instanceof p317ri.C5919u0
            if (r0 == 0) goto L7
            goto L40
        L7:
            boolean r0 = r2 instanceof byte[]
            if (r0 == 0) goto L25
            byte[] r2 = (byte[]) r2     // Catch: java.lang.Exception -> L14
            ri.s r2 = p317ri.AbstractC5912s.m12271u(r2)     // Catch: java.lang.Exception -> L14
            ri.u0 r2 = (p317ri.C5919u0) r2     // Catch: java.lang.Exception -> L14
            return r2
        L14:
            r2 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "encoding error in getInstance: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r2 = androidx.fragment.app.C0390k0.m1221a(r2, r1)
            r0.<init>(r2)
            throw r0
        L25:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "illegal object in getInstance: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
        L40:
            ri.u0 r2 = (p317ri.C5919u0) r2
            return r2
    }

    /* renamed from: D */
    public static p317ri.C5919u0 m12282D(p317ri.AbstractC5928y r0, boolean r1) {
            ri.s r0 = r0.m12294D()
            if (r1 != 0) goto L17
            boolean r1 = r0 instanceof p317ri.C5919u0
            if (r1 == 0) goto Lb
            goto L17
        Lb:
            ri.u0 r1 = new ri.u0
            ri.o r0 = (p317ri.AbstractC5900o) r0
            byte[] r0 = r0.mo12219E()
            r1.<init>(r0)
            return r1
        L17:
            ri.u0 r0 = m12281C(r0)
            return r0
    }

    @Override // p317ri.InterfaceC5926x
    /* renamed from: h */
    public java.lang.String mo12211h() {
            r1 = this;
            byte[] r0 = r1.f22746Y
            java.lang.String r0 = p400wj.C6892e.m13958a(r0)
            return r0
    }

    @Override // p317ri.AbstractC5894m
    public int hashCode() {
            r1 = this;
            byte[] r0 = r1.f22746Y
            int r0 = p400wj.C6888a.m13952d(r0)
            return r0
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: n */
    public boolean mo12203n(p317ri.AbstractC5912s r2) {
            r1 = this;
            boolean r0 = r2 instanceof p317ri.C5919u0
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            ri.u0 r2 = (p317ri.C5919u0) r2
            byte[] r0 = r1.f22746Y
            byte[] r2 = r2.f22746Y
            boolean r2 = p400wj.C6888a.m13949a(r0, r2)
            return r2
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: p */
    public void mo12204p(p317ri.C5906q r3) {
            r2 = this;
            byte[] r0 = r2.f22746Y
            r1 = 22
            r3.m12266e(r1, r0)
            return
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: q */
    public int mo12205q() {
            r2 = this;
            byte[] r0 = r2.f22746Y
            int r0 = r0.length
            int r0 = p317ri.C5923v1.m12290a(r0)
            int r0 = r0 + 1
            byte[] r1 = r2.f22746Y
            int r1 = r1.length
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.mo12211h()
            return r0
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: w */
    public boolean mo12206w() {
            r1 = this;
            r0 = 0
            return r0
    }
}
