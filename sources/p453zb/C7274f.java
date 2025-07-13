package p453zb;

/* renamed from: zb.f */
/* loaded from: classes.dex */
public final class C7274f {

    /* renamed from: a */
    public static p453zb.C7274f f27924a;

    static {
            zb.f r0 = new zb.f
            r0.<init>()
            p453zb.C7274f.f27924a = r0
            return
    }

    public C7274f() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public p453zb.C7270b m14386a(p453zb.C7270b r23, int r24, int r25, p065e0.C1497b r26) {
            r22 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            if (r1 <= 0) goto L108
            if (r2 <= 0) goto L108
            zb.b r4 = new zb.b
            r4.<init>(r1, r2)
            int r1 = r1 * 2
            float[] r5 = new float[r1]
            r7 = 0
        L16:
            if (r7 >= r2) goto L107
            float r8 = (float) r7
            r9 = 1056964608(0x3f000000, float:0.5)
            float r8 = r8 + r9
            r10 = 0
        L1d:
            if (r10 >= r1) goto L2c
            int r11 = r10 / 2
            float r11 = (float) r11
            float r11 = r11 + r9
            r5[r10] = r11
            int r11 = r10 + 1
            r5[r11] = r8
            int r10 = r10 + 2
            goto L1d
        L2c:
            java.util.Objects.requireNonNull(r26)
            float r8 = r3.f7284a
            float r9 = r3.f7285b
            float r10 = r3.f7286c
            float r11 = r3.f7287d
            float r12 = r3.f7288e
            float r13 = r3.f7289f
            float r14 = r3.f7290g
            float r15 = r3.f7291h
            float r6 = r3.f7292i
            r2 = 0
        L42:
            if (r2 >= r1) goto L6d
            r16 = r5[r2]
            int r17 = r2 + 1
            r18 = r5[r17]
            float r19 = r10 * r16
            float r20 = r13 * r18
            float r20 = r20 + r19
            float r20 = r20 + r6
            float r19 = r8 * r16
            float r21 = r11 * r18
            float r21 = r21 + r19
            float r21 = r21 + r14
            float r21 = r21 / r20
            r5[r2] = r21
            float r16 = r16 * r9
            float r18 = r18 * r12
            float r18 = r18 + r16
            float r18 = r18 + r15
            float r18 = r18 / r20
            r5[r17] = r18
            int r2 = r2 + 2
            goto L42
        L6d:
            int r2 = r0.f27902Y
            int r6 = r0.f27903Z
            r8 = 1
            r9 = 0
            r10 = 1
        L74:
            r11 = 0
            r12 = -1
            if (r9 >= r1) goto Lac
            if (r10 == 0) goto Lac
            r10 = r5[r9]
            int r10 = (int) r10
            int r13 = r9 + 1
            r14 = r5[r13]
            int r14 = (int) r14
            if (r10 < r12) goto La9
            if (r10 > r2) goto La9
            if (r14 < r12) goto La9
            if (r14 > r6) goto La9
            if (r10 != r12) goto L8f
            r5[r9] = r11
            goto L96
        L8f:
            if (r10 != r2) goto L98
            int r10 = r2 + (-1)
            float r10 = (float) r10
            r5[r9] = r10
        L96:
            r10 = 1
            goto L99
        L98:
            r10 = 0
        L99:
            if (r14 != r12) goto L9e
            r5[r13] = r11
            goto La5
        L9e:
            if (r14 != r6) goto La6
            int r10 = r6 + (-1)
            float r10 = (float) r10
            r5[r13] = r10
        La5:
            r10 = 1
        La6:
            int r9 = r9 + 2
            goto L74
        La9:
            sb.k r0 = sb.C6017k.f23200a0
            throw r0
        Lac:
            int r9 = r1 + (-2)
            r10 = 1
        Laf:
            if (r9 < 0) goto Le5
            if (r10 == 0) goto Le5
            r10 = r5[r9]
            int r10 = (int) r10
            int r13 = r9 + 1
            r14 = r5[r13]
            int r14 = (int) r14
            if (r10 < r12) goto Le2
            if (r10 > r2) goto Le2
            if (r14 < r12) goto Le2
            if (r14 > r6) goto Le2
            if (r10 != r12) goto Lc8
            r5[r9] = r11
            goto Lcf
        Lc8:
            if (r10 != r2) goto Ld1
            int r10 = r2 + (-1)
            float r10 = (float) r10
            r5[r9] = r10
        Lcf:
            r10 = 1
            goto Ld2
        Ld1:
            r10 = 0
        Ld2:
            if (r14 != r12) goto Ld7
            r5[r13] = r11
            goto Lde
        Ld7:
            if (r14 != r6) goto Ldf
            int r10 = r6 + (-1)
            float r10 = (float) r10
            r5[r13] = r10
        Lde:
            r10 = 1
        Ldf:
            int r9 = r9 + (-2)
            goto Laf
        Le2:
            sb.k r0 = sb.C6017k.f23200a0
            throw r0
        Le5:
            r2 = 0
        Le6:
            if (r2 >= r1) goto L101
            r6 = r5[r2]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lfe
            int r6 = (int) r6     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lfe
            int r8 = r2 + 1
            r8 = r5[r8]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lfe
            int r8 = (int) r8     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lfe
            boolean r6 = r0.m14372b(r6, r8)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lfe
            if (r6 == 0) goto Lfb
            int r6 = r2 / 2
            r4.m14376f(r6, r7)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lfe
        Lfb:
            int r2 = r2 + 2
            goto Le6
        Lfe:
            sb.k r0 = sb.C6017k.f23200a0
            throw r0
        L101:
            int r7 = r7 + 1
            r2 = r25
            goto L16
        L107:
            return r4
        L108:
            sb.k r0 = sb.C6017k.f23200a0
            throw r0
    }
}
