package p317ri;

/* renamed from: ri.a */
/* loaded from: classes.dex */
public abstract class AbstractC5858a extends p317ri.AbstractC5912s {

    /* renamed from: Y */
    public final boolean f22663Y;

    /* renamed from: Z */
    public final int f22664Z;

    /* renamed from: a0 */
    public final byte[] f22665a0;

    public AbstractC5858a(boolean r1, int r2, byte[] r3) {
            r0 = this;
            r0.<init>()
            r0.f22663Y = r1
            r0.f22664Z = r2
            byte[] r1 = p400wj.C6888a.m13951c(r3)
            r0.f22665a0 = r1
            return
    }

    @Override // p317ri.AbstractC5894m
    public int hashCode() {
            r2 = this;
            boolean r0 = r2.f22663Y
            int r1 = r2.f22664Z
            r0 = r0 ^ r1
            byte[] r1 = r2.f22665a0
            int r1 = p400wj.C6888a.m13952d(r1)
            r0 = r0 ^ r1
            return r0
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: n */
    public boolean mo12203n(p317ri.AbstractC5912s r4) {
            r3 = this;
            boolean r0 = r4 instanceof p317ri.AbstractC5858a
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            ri.a r4 = (p317ri.AbstractC5858a) r4
            boolean r0 = r3.f22663Y
            boolean r2 = r4.f22663Y
            if (r0 != r2) goto L1f
            int r0 = r3.f22664Z
            int r2 = r4.f22664Z
            if (r0 != r2) goto L1f
            byte[] r0 = r3.f22665a0
            byte[] r4 = r4.f22665a0
            boolean r4 = p400wj.C6888a.m13949a(r0, r4)
            if (r4 == 0) goto L1f
            r1 = 1
        L1f:
            return r1
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: p */
    public void mo12204p(p317ri.C5906q r4) {
            r3 = this;
            boolean r0 = r3.f22663Y
            if (r0 == 0) goto L7
            r0 = 96
            goto L9
        L7:
            r0 = 64
        L9:
            int r1 = r3.f22664Z
            byte[] r2 = r3.f22665a0
            r4.m12265d(r0, r1, r2)
            return
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: q */
    public int mo12205q() {
            r2 = this;
            int r0 = r2.f22664Z
            int r0 = p317ri.C5923v1.m12291b(r0)
            byte[] r1 = r2.f22665a0
            int r1 = r1.length
            int r1 = p317ri.C5923v1.m12290a(r1)
            int r1 = r1 + r0
            byte[] r0 = r2.f22665a0
            int r0 = r0.length
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            boolean r1 = r2.f22663Y
            if (r1 == 0) goto L13
            java.lang.String r1 = "CONSTRUCTED "
            r0.append(r1)
        L13:
            java.lang.String r1 = "APPLICATION "
            r0.append(r1)
            int r1 = r2.f22664Z
            java.lang.String r1 = java.lang.Integer.toString(r1)
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            byte[] r1 = r2.f22665a0
            if (r1 == 0) goto L36
            java.lang.String r1 = " #"
            r0.append(r1)
            byte[] r1 = r2.f22665a0
            java.lang.String r1 = p421xj.C7089e.m14196c(r1)
            goto L38
        L36:
            java.lang.String r1 = " #null"
        L38:
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: w */
    public boolean mo12206w() {
            r1 = this;
            boolean r0 = r1.f22663Y
            return r0
    }
}
