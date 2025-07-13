package p185k7;

/* renamed from: k7.k8 */
/* loaded from: classes.dex */
public final class C3873k8 {
    public C3873k8(int r2) {
            r1 = this;
            r0 = 1
            if (r2 == r0) goto L7
            r1.<init>()
            return
        L7:
            r1.<init>()
            java.lang.Object r2 = p185k7.AbstractC3921o4.f16797f
            return
    }

    /* renamed from: a */
    public boolean m8784a(byte[] r7, int r8, int r9) {
            r6 = this;
        L0:
            if (r8 >= r9) goto L9
            r0 = r7[r8]
            if (r0 < 0) goto L9
            int r8 = r8 + 1
            goto L0
        L9:
            r0 = 0
            if (r8 < r9) goto Ld
            goto Lf
        Ld:
            if (r8 < r9) goto L11
        Lf:
            r8 = 0
            goto L71
        L11:
            int r1 = r8 + 1
            r8 = r7[r8]
            if (r8 >= 0) goto L75
            r2 = -32
            r3 = -65
            if (r8 >= r2) goto L2a
            if (r1 >= r9) goto L71
            r2 = -62
            if (r8 < r2) goto L70
            int r8 = r1 + 1
            r1 = r7[r1]
            if (r1 <= r3) goto Ld
            goto L70
        L2a:
            r4 = -16
            if (r8 >= r4) goto L4c
            int r4 = r9 + (-1)
            if (r1 < r4) goto L33
            goto L50
        L33:
            int r4 = r1 + 1
            r1 = r7[r1]
            if (r1 > r3) goto L70
            r5 = -96
            if (r8 != r2) goto L3f
            if (r1 < r5) goto L70
        L3f:
            r2 = -19
            if (r8 != r2) goto L45
            if (r1 >= r5) goto L70
        L45:
            int r8 = r4 + 1
            r1 = r7[r4]
            if (r1 <= r3) goto Ld
            goto L70
        L4c:
            int r2 = r9 + (-2)
            if (r1 < r2) goto L55
        L50:
            int r8 = p185k7.C3899m8.m8830a(r7, r1, r9)
            goto L71
        L55:
            int r2 = r1 + 1
            r1 = r7[r1]
            if (r1 > r3) goto L70
            int r8 = r8 << 28
            int r1 = r1 + 112
            int r1 = r1 + r8
            int r8 = r1 >> 30
            if (r8 != 0) goto L70
            int r8 = r2 + 1
            r1 = r7[r2]
            if (r1 > r3) goto L70
            int r1 = r8 + 1
            r8 = r7[r8]
            if (r8 <= r3) goto L75
        L70:
            r8 = -1
        L71:
            if (r8 != 0) goto L74
            r0 = 1
        L74:
            return r0
        L75:
            r8 = r1
            goto Ld
    }
}
