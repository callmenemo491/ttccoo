package p317ri;

/* renamed from: ri.g1 */
/* loaded from: classes.dex */
public class C5878g1 extends p317ri.AbstractC5912s implements p317ri.InterfaceC5926x {

    /* renamed from: Y */
    public final byte[] f22696Y;

    public C5878g1(byte[] r1) {
            r0 = this;
            r0.<init>()
            byte[] r1 = p400wj.C6888a.m13951c(r1)
            r0.f22696Y = r1
            return
    }

    @Override // p317ri.InterfaceC5926x
    /* renamed from: h */
    public java.lang.String mo12211h() {
            r1 = this;
            byte[] r0 = r1.f22696Y
            java.lang.String r0 = p400wj.C6892e.m13958a(r0)
            return r0
    }

    @Override // p317ri.AbstractC5894m
    public int hashCode() {
            r1 = this;
            byte[] r0 = r1.f22696Y
            int r0 = p400wj.C6888a.m13952d(r0)
            return r0
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: n */
    public boolean mo12203n(p317ri.AbstractC5912s r2) {
            r1 = this;
            boolean r0 = r2 instanceof p317ri.C5878g1
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            ri.g1 r2 = (p317ri.C5878g1) r2
            byte[] r0 = r1.f22696Y
            byte[] r2 = r2.f22696Y
            boolean r2 = p400wj.C6888a.m13949a(r0, r2)
            return r2
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: p */
    public void mo12204p(p317ri.C5906q r3) {
            r2 = this;
            byte[] r0 = r2.f22696Y
            r1 = 21
            r3.m12266e(r1, r0)
            return
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: q */
    public int mo12205q() {
            r2 = this;
            byte[] r0 = r2.f22696Y
            int r0 = r0.length
            int r0 = p317ri.C5923v1.m12290a(r0)
            int r0 = r0 + 1
            byte[] r1 = r2.f22696Y
            int r1 = r1.length
            int r0 = r0 + r1
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
