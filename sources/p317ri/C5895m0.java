package p317ri;

/* renamed from: ri.m0 */
/* loaded from: classes.dex */
public class C5895m0 extends p317ri.AbstractC5912s implements p317ri.InterfaceC5926x {

    /* renamed from: Y */
    public final char[] f22716Y;

    public C5895m0(char[] r1) {
            r0 = this;
            r0.<init>()
            r0.f22716Y = r1
            return
    }

    @Override // p317ri.InterfaceC5926x
    /* renamed from: h */
    public java.lang.String mo12211h() {
            r2 = this;
            java.lang.String r0 = new java.lang.String
            char[] r1 = r2.f22716Y
            r0.<init>(r1)
            return r0
    }

    @Override // p317ri.AbstractC5894m
    public int hashCode() {
            r4 = this;
            char[] r0 = r4.f22716Y
            if (r0 != 0) goto L6
            r0 = 0
            goto L14
        L6:
            int r1 = r0.length
            int r2 = r1 + 1
        L9:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L13
            int r2 = r2 * 257
            char r3 = r0[r1]
            r2 = r2 ^ r3
            goto L9
        L13:
            r0 = r2
        L14:
            return r0
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: n */
    public boolean mo12203n(p317ri.AbstractC5912s r7) {
            r6 = this;
            boolean r0 = r7 instanceof p317ri.C5895m0
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            ri.m0 r7 = (p317ri.C5895m0) r7
            char[] r0 = r6.f22716Y
            char[] r7 = r7.f22716Y
            r2 = 1
            if (r0 != r7) goto L11
        Lf:
            r1 = 1
            goto L29
        L11:
            if (r0 == 0) goto L29
            if (r7 != 0) goto L16
            goto L29
        L16:
            int r3 = r0.length
            int r4 = r7.length
            if (r3 == r4) goto L1b
            goto L29
        L1b:
            r3 = 0
        L1c:
            int r4 = r0.length
            if (r3 == r4) goto Lf
            char r4 = r0[r3]
            char r5 = r7[r3]
            if (r4 == r5) goto L26
            goto L29
        L26:
            int r3 = r3 + 1
            goto L1c
        L29:
            return r1
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: p */
    public void mo12204p(p317ri.C5906q r4) {
            r3 = this;
            r0 = 30
            r4.mo12264c(r0)
            char[] r0 = r3.f22716Y
            int r0 = r0.length
            int r0 = r0 * 2
            r4.m12268g(r0)
            r0 = 0
        Le:
            char[] r1 = r3.f22716Y
            int r2 = r1.length
            if (r0 == r2) goto L22
            char r1 = r1[r0]
            int r2 = r1 >> 8
            byte r2 = (byte) r2
            r4.mo12264c(r2)
            byte r1 = (byte) r1
            r4.mo12264c(r1)
            int r0 = r0 + 1
            goto Le
        L22:
            return
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: q */
    public int mo12205q() {
            r2 = this;
            char[] r0 = r2.f22716Y
            int r0 = r0.length
            int r0 = r0 * 2
            int r0 = p317ri.C5923v1.m12290a(r0)
            int r0 = r0 + 1
            char[] r1 = r2.f22716Y
            int r1 = r1.length
            int r1 = r1 * 2
            int r1 = r1 + r0
            return r1
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
