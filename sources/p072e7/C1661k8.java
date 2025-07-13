package p072e7;

/* renamed from: e7.k8 */
/* loaded from: classes.dex */
public final class C1661k8 {
    public C1661k8(int r1) {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public boolean m4320a(byte[] r7, int r8, int r9) {
            r6 = this;
            r8 = 0
            r0 = 0
        L2:
            if (r0 >= r9) goto Lb
            r1 = r7[r0]
            if (r1 < 0) goto Lb
            int r0 = r0 + 1
            goto L2
        Lb:
            if (r0 < r9) goto Le
            goto L10
        Le:
            if (r0 < r9) goto L12
        L10:
            r0 = 0
            goto L72
        L12:
            int r1 = r0 + 1
            r0 = r7[r0]
            if (r0 >= 0) goto L76
            r2 = -32
            r3 = -65
            if (r0 >= r2) goto L2b
            if (r1 >= r9) goto L72
            r2 = -62
            if (r0 < r2) goto L71
            int r0 = r1 + 1
            r1 = r7[r1]
            if (r1 <= r3) goto Le
            goto L71
        L2b:
            r4 = -16
            if (r0 >= r4) goto L4d
            int r4 = r9 + (-1)
            if (r1 < r4) goto L34
            goto L51
        L34:
            int r4 = r1 + 1
            r1 = r7[r1]
            if (r1 > r3) goto L71
            r5 = -96
            if (r0 != r2) goto L40
            if (r1 < r5) goto L71
        L40:
            r2 = -19
            if (r0 != r2) goto L46
            if (r1 >= r5) goto L71
        L46:
            int r0 = r4 + 1
            r1 = r7[r4]
            if (r1 <= r3) goto Le
            goto L71
        L4d:
            int r2 = r9 + (-2)
            if (r1 < r2) goto L56
        L51:
            int r0 = p072e7.C1681m8.m4348a(r7, r1, r9)
            goto L72
        L56:
            int r2 = r1 + 1
            r1 = r7[r1]
            if (r1 > r3) goto L71
            int r0 = r0 << 28
            int r1 = r1 + 112
            int r1 = r1 + r0
            int r0 = r1 >> 30
            if (r0 != 0) goto L71
            int r0 = r2 + 1
            r1 = r7[r2]
            if (r1 > r3) goto L71
            int r1 = r0 + 1
            r0 = r7[r0]
            if (r0 <= r3) goto L76
        L71:
            r0 = -1
        L72:
            if (r0 != 0) goto L75
            r8 = 1
        L75:
            return r8
        L76:
            r0 = r1
            goto Le
    }
}
