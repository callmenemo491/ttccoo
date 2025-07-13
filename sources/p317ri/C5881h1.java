package p317ri;

/* renamed from: ri.h1 */
/* loaded from: classes.dex */
public class C5881h1 extends p317ri.AbstractC5912s implements p317ri.InterfaceC5926x {

    /* renamed from: Y */
    public final byte[] f22702Y;

    public C5881h1(byte[] r1) {
            r0 = this;
            r0.<init>()
            r0.f22702Y = r1
            return
    }

    @Override // p317ri.InterfaceC5926x
    /* renamed from: h */
    public java.lang.String mo12211h() {
            r1 = this;
            byte[] r0 = r1.f22702Y
            java.lang.String r0 = p400wj.C6892e.m13958a(r0)
            return r0
    }

    @Override // p317ri.AbstractC5894m
    public int hashCode() {
            r1 = this;
            byte[] r0 = r1.f22702Y
            int r0 = p400wj.C6888a.m13952d(r0)
            return r0
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: n */
    public boolean mo12203n(p317ri.AbstractC5912s r2) {
            r1 = this;
            boolean r0 = r2 instanceof p317ri.C5881h1
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            byte[] r0 = r1.f22702Y
            ri.h1 r2 = (p317ri.C5881h1) r2
            byte[] r2 = r2.f22702Y
            boolean r2 = p400wj.C6888a.m13949a(r0, r2)
            return r2
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: p */
    public void mo12204p(p317ri.C5906q r3) {
            r2 = this;
            byte[] r0 = r2.f22702Y
            r1 = 26
            r3.m12266e(r1, r0)
            return
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: q */
    public int mo12205q() {
            r2 = this;
            byte[] r0 = r2.f22702Y
            int r0 = r0.length
            int r0 = p317ri.C5923v1.m12290a(r0)
            int r0 = r0 + 1
            byte[] r1 = r2.f22702Y
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
