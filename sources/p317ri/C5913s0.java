package p317ri;

/* renamed from: ri.s0 */
/* loaded from: classes.dex */
public class C5913s0 extends p317ri.C5882i {
    public C5913s0(byte[] r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    /* renamed from: P */
    public final byte[] m12272P() {
            r6 = this;
            byte[] r0 = r6.f22703Y
            int r1 = r0.length
            int r1 = r1 + (-1)
            r1 = r0[r1]
            r2 = 90
            if (r1 != r2) goto L8a
            boolean r0 = r6.m12230K()
            r1 = 0
            if (r0 != 0) goto L2f
            byte[] r0 = r6.f22703Y
            int r2 = r0.length
            int r2 = r2 + 4
            byte[] r2 = new byte[r2]
            int r3 = r0.length
            int r3 = r3 + (-1)
            java.lang.System.arraycopy(r0, r1, r2, r1, r3)
            java.lang.String r0 = "0000Z"
            byte[] r0 = p400wj.C6892e.m13959b(r0)
            byte[] r3 = r6.f22703Y
            int r3 = r3.length
            int r3 = r3 + (-1)
            r4 = 5
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            return r2
        L2f:
            boolean r0 = r6.m12231L()
            if (r0 != 0) goto L52
            byte[] r0 = r6.f22703Y
            int r2 = r0.length
            int r2 = r2 + 2
            byte[] r2 = new byte[r2]
            int r3 = r0.length
            int r3 = r3 + (-1)
            java.lang.System.arraycopy(r0, r1, r2, r1, r3)
            java.lang.String r0 = "00Z"
            byte[] r0 = p400wj.C6892e.m13959b(r0)
            byte[] r3 = r6.f22703Y
            int r3 = r3.length
            int r3 = r3 + (-1)
            r4 = 3
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            return r2
        L52:
            boolean r0 = r6.m12229I()
            if (r0 == 0) goto L88
            byte[] r0 = r6.f22703Y
            int r0 = r0.length
            int r0 = r0 + (-2)
        L5d:
            if (r0 <= 0) goto L6a
            byte[] r3 = r6.f22703Y
            r3 = r3[r0]
            r4 = 48
            if (r3 != r4) goto L6a
            int r0 = r0 + (-1)
            goto L5d
        L6a:
            byte[] r3 = r6.f22703Y
            r4 = r3[r0]
            r5 = 46
            if (r4 != r5) goto L7c
            int r4 = r0 + 1
            byte[] r4 = new byte[r4]
            java.lang.System.arraycopy(r3, r1, r4, r1, r0)
            r4[r0] = r2
            return r4
        L7c:
            int r4 = r0 + 2
            byte[] r4 = new byte[r4]
            int r0 = r0 + 1
            java.lang.System.arraycopy(r3, r1, r4, r1, r0)
            r4[r0] = r2
            return r4
        L88:
            byte[] r0 = r6.f22703Y
        L8a:
            return r0
    }

    @Override // p317ri.C5882i, p317ri.AbstractC5912s
    /* renamed from: p */
    public void mo12204p(p317ri.C5906q r3) {
            r2 = this;
            byte[] r0 = r2.m12272P()
            r1 = 24
            r3.m12266e(r1, r0)
            return
    }

    @Override // p317ri.C5882i, p317ri.AbstractC5912s
    /* renamed from: q */
    public int mo12205q() {
            r2 = this;
            byte[] r0 = r2.m12272P()
            int r0 = r0.length
            int r1 = p317ri.C5923v1.m12290a(r0)
            int r1 = r1 + 1
            int r1 = r1 + r0
            return r1
    }
}
