package p317ri;

/* renamed from: ri.f */
/* loaded from: classes.dex */
public class C5873f extends p317ri.AbstractC5912s {

    /* renamed from: Z */
    public static p317ri.C5873f[] f22688Z;

    /* renamed from: Y */
    public final byte[] f22689Y;

    static {
            r0 = 12
            ri.f[] r0 = new p317ri.C5873f[r0]
            p317ri.C5873f.f22688Z = r0
            return
    }

    public C5873f(byte[] r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "org.bouncycastle.asn1.allow_unsafe_integer"
            boolean r0 = p400wj.C6891d.m13957a(r0)
            if (r0 != 0) goto L1a
            boolean r0 = p317ri.C5888k.m12241F(r2)
            if (r0 != 0) goto L12
            goto L1a
        L12:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "malformed enumerated"
            r2.<init>(r0)
            throw r2
        L1a:
            byte[] r2 = p400wj.C6888a.m13951c(r2)
            r1.f22689Y = r2
            return
    }

    @Override // p317ri.AbstractC5894m
    public int hashCode() {
            r1 = this;
            byte[] r0 = r1.f22689Y
            int r0 = p400wj.C6888a.m13952d(r0)
            return r0
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: n */
    public boolean mo12203n(p317ri.AbstractC5912s r2) {
            r1 = this;
            boolean r0 = r2 instanceof p317ri.C5873f
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            ri.f r2 = (p317ri.C5873f) r2
            byte[] r0 = r1.f22689Y
            byte[] r2 = r2.f22689Y
            boolean r2 = p400wj.C6888a.m13949a(r0, r2)
            return r2
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: p */
    public void mo12204p(p317ri.C5906q r3) {
            r2 = this;
            byte[] r0 = r2.f22689Y
            r1 = 10
            r3.m12266e(r1, r0)
            return
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: q */
    public int mo12205q() {
            r2 = this;
            byte[] r0 = r2.f22689Y
            int r0 = r0.length
            int r0 = p317ri.C5923v1.m12290a(r0)
            int r0 = r0 + 1
            byte[] r1 = r2.f22689Y
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
