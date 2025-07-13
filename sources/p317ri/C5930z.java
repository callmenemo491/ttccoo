package p317ri;

/* renamed from: ri.z */
/* loaded from: classes.dex */
public class C5930z extends p317ri.AbstractC5912s {

    /* renamed from: Y */
    public byte[] f22758Y;

    public C5930z(byte[] r1) {
            r0 = this;
            r0.<init>()
            r0.f22758Y = r1
            return
    }

    @Override // p317ri.AbstractC5894m
    public int hashCode() {
            r1 = this;
            byte[] r0 = r1.f22758Y
            int r0 = p400wj.C6888a.m13952d(r0)
            return r0
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: n */
    public boolean mo12203n(p317ri.AbstractC5912s r2) {
            r1 = this;
            boolean r0 = r2 instanceof p317ri.C5930z
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            byte[] r0 = r1.f22758Y
            ri.z r2 = (p317ri.C5930z) r2
            byte[] r2 = r2.f22758Y
            boolean r2 = p400wj.C6888a.m13949a(r0, r2)
            return r2
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: p */
    public void mo12204p(p317ri.C5906q r4) {
            r3 = this;
            r0 = 23
            r4.mo12264c(r0)
            byte[] r0 = r3.f22758Y
            int r0 = r0.length
            r4.m12268g(r0)
            r1 = 0
        Lc:
            if (r1 == r0) goto L18
            byte[] r2 = r3.f22758Y
            r2 = r2[r1]
            r4.mo12264c(r2)
            int r1 = r1 + 1
            goto Lc
        L18:
            return
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: q */
    public int mo12205q() {
            r2 = this;
            byte[] r0 = r2.f22758Y
            int r0 = r0.length
            int r1 = p317ri.C5923v1.m12290a(r0)
            int r1 = r1 + 1
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r1 = this;
            byte[] r0 = r1.f22758Y
            java.lang.String r0 = p400wj.C6892e.m13958a(r0)
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
