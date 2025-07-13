package p317ri;

/* renamed from: ri.f1 */
/* loaded from: classes.dex */
public class C5875f1 extends p317ri.AbstractC5912s implements p317ri.InterfaceC5926x {

    /* renamed from: Z */
    public static final char[] f22690Z = null;

    /* renamed from: Y */
    public final byte[] f22691Y;

    static {
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70} // fill-array
            p317ri.C5875f1.f22690Z = r0
            return
    }

    public C5875f1(byte[] r1) {
            r0 = this;
            r0.<init>()
            byte[] r1 = p400wj.C6888a.m13951c(r1)
            r0.f22691Y = r1
            return
    }

    @Override // p317ri.InterfaceC5926x
    /* renamed from: h */
    public java.lang.String mo12211h() {
            r5 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            java.lang.String r1 = "#"
            r0.<init>(r1)
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            ri.q r2 = new ri.q
            r2.<init>(r1)
            r2.mo12244h(r5)     // Catch: java.io.IOException -> L3a
            byte[] r1 = r1.toByteArray()
            r2 = 0
        L19:
            int r3 = r1.length
            if (r2 == r3) goto L35
            char[] r3 = p317ri.C5875f1.f22690Z
            r4 = r1[r2]
            int r4 = r4 >>> 4
            r4 = r4 & 15
            char r4 = r3[r4]
            r0.append(r4)
            r4 = r1[r2]
            r4 = r4 & 15
            char r3 = r3[r4]
            r0.append(r3)
            int r2 = r2 + 1
            goto L19
        L35:
            java.lang.String r0 = r0.toString()
            return r0
        L3a:
            ri.r r0 = new ri.r
            java.lang.String r1 = "internal error encoding UniversalString"
            r0.<init>(r1)
            throw r0
    }

    @Override // p317ri.AbstractC5894m
    public int hashCode() {
            r1 = this;
            byte[] r0 = r1.f22691Y
            int r0 = p400wj.C6888a.m13952d(r0)
            return r0
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: n */
    public boolean mo12203n(p317ri.AbstractC5912s r2) {
            r1 = this;
            boolean r0 = r2 instanceof p317ri.C5875f1
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            byte[] r0 = r1.f22691Y
            ri.f1 r2 = (p317ri.C5875f1) r2
            byte[] r2 = r2.f22691Y
            boolean r2 = p400wj.C6888a.m13949a(r0, r2)
            return r2
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: p */
    public void mo12204p(p317ri.C5906q r3) {
            r2 = this;
            byte[] r0 = r2.f22691Y
            byte[] r0 = p400wj.C6888a.m13951c(r0)
            r1 = 28
            r3.m12266e(r1, r0)
            return
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: q */
    public int mo12205q() {
            r2 = this;
            byte[] r0 = r2.f22691Y
            int r0 = r0.length
            int r0 = p317ri.C5923v1.m12290a(r0)
            int r0 = r0 + 1
            byte[] r1 = r2.f22691Y
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
