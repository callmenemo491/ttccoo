package p317ri;

/* renamed from: ri.e1 */
/* loaded from: classes.dex */
public class C5872e1 extends p317ri.AbstractC5912s implements p317ri.InterfaceC5926x {

    /* renamed from: Y */
    public final byte[] f22687Y;

    public C5872e1(byte[] r1) {
            r0 = this;
            r0.<init>()
            r0.f22687Y = r1
            return
    }

    @Override // p317ri.InterfaceC5926x
    /* renamed from: h */
    public java.lang.String mo12211h() {
            r10 = this;
            byte[] r0 = r10.f22687Y
            java.lang.String r1 = p400wj.C6892e.f26795a
            int r1 = r0.length
            char[] r2 = new char[r1]
            short[] r3 = p421xj.C7090f.f27430a
            r3 = 0
            r4 = 0
            r5 = 0
        Lc:
            int r6 = r0.length
            if (r4 >= r6) goto L74
            int r6 = r4 + 1
            r4 = r0[r4]
            if (r4 < 0) goto L20
            if (r5 < r1) goto L18
            goto L5a
        L18:
            int r7 = r5 + 1
            char r4 = (char) r4
            r2[r5] = r4
            r4 = r6
            r5 = r7
            goto Lc
        L20:
            short[] r7 = p421xj.C7090f.f27430a
            r4 = r4 & 127(0x7f, float:1.78E-43)
            short r4 = r7[r4]
            int r7 = r4 >>> 8
            byte r4 = (byte) r4
        L29:
            if (r4 < 0) goto L43
            int r8 = r0.length
            if (r6 < r8) goto L2f
            goto L5a
        L2f:
            int r8 = r6 + 1
            r6 = r0[r6]
            int r7 = r7 << 6
            r9 = r6 & 63
            r7 = r7 | r9
            byte[] r9 = p421xj.C7090f.f27431b
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 >>> 4
            int r4 = r4 + r6
            r4 = r9[r4]
            r6 = r8
            goto L29
        L43:
            r8 = -2
            if (r4 != r8) goto L47
            goto L5a
        L47:
            r4 = 65535(0xffff, float:9.1834E-41)
            if (r7 > r4) goto L56
            if (r5 < r1) goto L4f
            goto L5a
        L4f:
            int r4 = r5 + 1
            char r7 = (char) r7
            r2[r5] = r7
            r5 = r4
            goto L72
        L56:
            int r4 = r1 + (-1)
            if (r5 < r4) goto L5c
        L5a:
            r5 = -1
            goto L74
        L5c:
            int r4 = r5 + 1
            r8 = 55232(0xd7c0, float:7.7397E-41)
            int r9 = r7 >>> 10
            int r9 = r9 + r8
            char r8 = (char) r9
            r2[r5] = r8
            int r5 = r4 + 1
            r8 = 56320(0xdc00, float:7.8921E-41)
            r7 = r7 & 1023(0x3ff, float:1.434E-42)
            r7 = r7 | r8
            char r7 = (char) r7
            r2[r4] = r7
        L72:
            r4 = r6
            goto Lc
        L74:
            if (r5 < 0) goto L7c
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r3, r5)
            return r0
        L7c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid UTF-8 input"
            r0.<init>(r1)
            throw r0
    }

    @Override // p317ri.AbstractC5894m
    public int hashCode() {
            r1 = this;
            byte[] r0 = r1.f22687Y
            int r0 = p400wj.C6888a.m13952d(r0)
            return r0
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: n */
    public boolean mo12203n(p317ri.AbstractC5912s r2) {
            r1 = this;
            boolean r0 = r2 instanceof p317ri.C5872e1
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            ri.e1 r2 = (p317ri.C5872e1) r2
            byte[] r0 = r1.f22687Y
            byte[] r2 = r2.f22687Y
            boolean r2 = p400wj.C6888a.m13949a(r0, r2)
            return r2
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: p */
    public void mo12204p(p317ri.C5906q r3) {
            r2 = this;
            byte[] r0 = r2.f22687Y
            r1 = 12
            r3.m12266e(r1, r0)
            return
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: q */
    public int mo12205q() {
            r2 = this;
            byte[] r0 = r2.f22687Y
            int r0 = r0.length
            int r0 = p317ri.C5923v1.m12290a(r0)
            int r0 = r0 + 1
            byte[] r1 = r2.f22687Y
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
