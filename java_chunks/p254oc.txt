package p254oc;

/* renamed from: oc.a */
/* loaded from: classes.dex */
public final class C5190a {

    /* renamed from: a */
    public static final int[] f20338a = null;

    /* renamed from: b */
    public static final int[] f20339b = null;

    /* renamed from: c */
    public static final int[] f20340c = null;

    /* renamed from: d */
    public static final int[] f20341d = null;

    static {
            r0 = 4
            int[] r1 = new int[r0]
            r1 = {x0022: FILL_ARRAY_DATA , data: [0, 4, 1, 5} // fill-array
            p254oc.C5190a.f20338a = r1
            int[] r0 = new int[r0]
            r0 = {x002e: FILL_ARRAY_DATA , data: [6, 2, 7, 3} // fill-array
            p254oc.C5190a.f20339b = r0
            r0 = 8
            int[] r0 = new int[r0]
            r0 = {x003a: FILL_ARRAY_DATA , data: [8, 1, 1, 1, 1, 1, 1, 3} // fill-array
            p254oc.C5190a.f20340c = r0
            r0 = 9
            int[] r0 = new int[r0]
            r0 = {x004e: FILL_ARRAY_DATA , data: [7, 1, 1, 3, 1, 1, 1, 2, 1} // fill-array
            p254oc.C5190a.f20341d = r0
            return
    }

    /* renamed from: a */
    public static java.util.List<com.google.zxing.ResultPoint[]> m11505a(boolean r17, p453zb.C7270b r18) {
            r6 = r18
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r8 = 1
            r9 = 0
            r10 = 0
        La:
            r11 = 0
            r12 = 0
        Lc:
            int r13 = r6.f27903Z
            if (r10 >= r13) goto Lba
            int r14 = r6.f27902Y
            r0 = 8
            sb.q[] r15 = new sb.C6023q[r0]
            int[] r5 = p254oc.C5190a.f20340c
            r0 = r18
            r1 = r13
            r2 = r14
            r3 = r10
            r4 = r11
            sb.q[] r0 = m11507c(r0, r1, r2, r3, r4, r5)
            int[] r1 = p254oc.C5190a.f20338a
            r2 = 0
        L25:
            int r3 = r1.length
            if (r2 >= r3) goto L31
            r3 = r1[r2]
            r4 = r0[r2]
            r15[r3] = r4
            int r2 = r2 + 1
            goto L25
        L31:
            r16 = 4
            r0 = r15[r16]
            if (r0 == 0) goto L44
            r0 = r15[r16]
            float r0 = r0.f23222a
            int r0 = (int) r0
            r1 = r15[r16]
            float r1 = r1.f23223b
            int r1 = (int) r1
            r4 = r0
            r3 = r1
            goto L46
        L44:
            r3 = r10
            r4 = r11
        L46:
            int[] r5 = p254oc.C5190a.f20341d
            r0 = r18
            r1 = r13
            r2 = r14
            sb.q[] r0 = m11507c(r0, r1, r2, r3, r4, r5)
            int[] r1 = p254oc.C5190a.f20339b
            r2 = 0
        L53:
            int r3 = r1.length
            if (r2 >= r3) goto L5f
            r3 = r1[r2]
            r4 = r0[r2]
            r15[r3] = r4
            int r2 = r2 + 1
            goto L53
        L5f:
            r0 = r15[r9]
            if (r0 != 0) goto L9b
            r0 = 3
            r1 = r15[r0]
            if (r1 != 0) goto L9b
            if (r12 == 0) goto Lba
            java.util.Iterator r1 = r7.iterator()
        L6e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L97
            java.lang.Object r2 = r1.next()
            sb.q[] r2 = (sb.C6023q[]) r2
            r3 = r2[r8]
            if (r3 == 0) goto L88
            float r3 = (float) r10
            r4 = r2[r8]
            float r4 = r4.f23223b
            float r3 = java.lang.Math.max(r3, r4)
            int r10 = (int) r3
        L88:
            r3 = r2[r0]
            if (r3 == 0) goto L6e
            r2 = r2[r0]
            float r2 = r2.f23223b
            int r2 = (int) r2
            int r2 = java.lang.Math.max(r10, r2)
            r10 = r2
            goto L6e
        L97:
            int r10 = r10 + 5
            goto La
        L9b:
            r7.add(r15)
            if (r17 == 0) goto Lba
            r0 = 2
            r1 = r15[r0]
            if (r1 == 0) goto Lad
            r1 = r15[r0]
            float r1 = r1.f23222a
            int r11 = (int) r1
            r0 = r15[r0]
            goto Lb4
        Lad:
            r0 = r15[r16]
            float r0 = r0.f23222a
            int r11 = (int) r0
            r0 = r15[r16]
        Lb4:
            float r0 = r0.f23223b
            int r10 = (int) r0
            r12 = 1
            goto Lc
        Lba:
            return r7
    }

    /* renamed from: b */
    public static int[] m11506b(p453zb.C7270b r9, int r10, int r11, int r12, boolean r13, int[] r14, int[] r15) {
            int r0 = r15.length
            r1 = 0
            java.util.Arrays.fill(r15, r1, r0, r1)
            r0 = 0
        L6:
            boolean r2 = r9.m14372b(r10, r11)
            if (r2 == 0) goto L17
            if (r10 <= 0) goto L17
            int r2 = r0 + 1
            r3 = 3
            if (r0 >= r3) goto L17
            int r10 = r10 + (-1)
            r0 = r2
            goto L6
        L17:
            int r0 = r14.length
            r2 = r13
            r3 = 0
            r13 = r10
        L1b:
            r4 = 1054280253(0x3ed70a3d, float:0.42)
            r5 = 1061997773(0x3f4ccccd, float:0.8)
            r6 = 2
            r7 = 1
            if (r10 >= r12) goto L60
            boolean r8 = r9.m14372b(r10, r11)
            r8 = r8 ^ r2
            if (r8 == 0) goto L32
            r4 = r15[r3]
            int r4 = r4 + r7
            r15[r3] = r4
            goto L5d
        L32:
            int r8 = r0 + (-1)
            if (r3 != r8) goto L57
            float r5 = m11508d(r15, r14, r5)
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 >= 0) goto L45
            int[] r9 = new int[r6]
            r9[r1] = r13
            r9[r7] = r10
            return r9
        L45:
            r4 = r15[r1]
            r5 = r15[r7]
            int r4 = r4 + r5
            int r13 = r13 + r4
            int r4 = r0 + (-2)
            java.lang.System.arraycopy(r15, r6, r15, r1, r4)
            r15[r4] = r1
            r15[r8] = r1
            int r3 = r3 + (-1)
            goto L59
        L57:
            int r3 = r3 + 1
        L59:
            r15[r3] = r7
            r2 = r2 ^ 1
        L5d:
            int r10 = r10 + 1
            goto L1b
        L60:
            int r0 = r0 - r7
            if (r3 != r0) goto L73
            float r9 = m11508d(r15, r14, r5)
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 >= 0) goto L73
            int[] r9 = new int[r6]
            r9[r1] = r13
            int r10 = r10 - r7
            r9[r7] = r10
            return r9
        L73:
            r9 = 0
            return r9
    }

    /* renamed from: c */
    public static sb.C6023q[] m11507c(p453zb.C7270b r19, int r20, int r21, int r22, int r23, int[] r24) {
            r0 = r20
            r1 = 4
            sb.q[] r2 = new sb.C6023q[r1]
            r10 = r24
            int r3 = r10.length
            int[] r11 = new int[r3]
            r12 = r22
        Lc:
            r13 = 0
            r14 = 1
            if (r12 >= r0) goto L5c
            r7 = 0
            r3 = r19
            r4 = r23
            r5 = r12
            r6 = r21
            r8 = r24
            r9 = r11
            int[] r3 = m11506b(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L59
            r18 = r12
            r12 = r3
            r3 = r18
        L26:
            if (r3 <= 0) goto L40
            int r15 = r3 + (-1)
            r7 = 0
            r3 = r19
            r4 = r23
            r5 = r15
            r6 = r21
            r8 = r24
            r9 = r11
            int[] r3 = m11506b(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L3e
            r12 = r3
            r3 = r15
            goto L26
        L3e:
            int r15 = r15 + r14
            goto L41
        L40:
            r15 = r3
        L41:
            sb.q r3 = new sb.q
            r4 = r12[r13]
            float r4 = (float) r4
            float r5 = (float) r15
            r3.<init>(r4, r5)
            r2[r13] = r3
            sb.q r3 = new sb.q
            r4 = r12[r14]
            float r4 = (float) r4
            r3.<init>(r4, r5)
            r2[r14] = r3
            r12 = r15
            r3 = 1
            goto L5d
        L59:
            int r12 = r12 + 5
            goto Lc
        L5c:
            r3 = 0
        L5d:
            int r4 = r12 + 1
            if (r3 == 0) goto Lce
            r15 = 2
            int[] r3 = new int[r15]
            r5 = r2[r13]
            float r5 = r5.f23222a
            int r5 = (int) r5
            r3[r13] = r5
            r5 = r2[r14]
            float r5 = r5.f23222a
            int r5 = (int) r5
            r3[r14] = r5
            r16 = r3
            r9 = r4
            r8 = 0
        L76:
            if (r9 >= r0) goto Lb1
            r4 = r16[r13]
            r7 = 0
            r3 = r19
            r5 = r9
            r6 = r21
            r1 = r8
            r8 = r24
            r17 = r9
            r9 = r11
            int[] r3 = m11506b(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto La7
            r4 = r16[r13]
            r5 = r3[r13]
            int r4 = r4 - r5
            int r4 = java.lang.Math.abs(r4)
            r5 = 5
            if (r4 >= r5) goto La7
            r4 = r16[r14]
            r6 = r3[r14]
            int r4 = r4 - r6
            int r4 = java.lang.Math.abs(r4)
            if (r4 >= r5) goto La7
            r16 = r3
            r8 = 0
            goto Lad
        La7:
            r3 = 25
            if (r1 > r3) goto Lb4
            int r8 = r1 + 1
        Lad:
            int r9 = r17 + 1
            r1 = 4
            goto L76
        Lb1:
            r1 = r8
            r17 = r9
        Lb4:
            int r8 = r1 + 1
            int r4 = r17 - r8
            sb.q r0 = new sb.q
            r1 = r16[r13]
            float r1 = (float) r1
            float r3 = (float) r4
            r0.<init>(r1, r3)
            r2[r15] = r0
            r0 = 3
            sb.q r1 = new sb.q
            r5 = r16[r14]
            float r5 = (float) r5
            r1.<init>(r5, r3)
            r2[r0] = r1
        Lce:
            int r4 = r4 - r12
            r0 = 10
            if (r4 >= r0) goto Ldc
            r0 = 4
        Ld4:
            if (r13 >= r0) goto Ldc
            r1 = 0
            r2[r13] = r1
            int r13 = r13 + 1
            goto Ld4
        Ldc:
            return r2
    }

    /* renamed from: d */
    public static float m11508d(int[] r9, int[] r10, float r11) {
            int r0 = r9.length
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
        L5:
            if (r2 >= r0) goto L10
            r5 = r9[r2]
            int r3 = r3 + r5
            r5 = r10[r2]
            int r4 = r4 + r5
            int r2 = r2 + 1
            goto L5
        L10:
            r2 = 2139095040(0x7f800000, float:Infinity)
            if (r3 >= r4) goto L15
            return r2
        L15:
            float r3 = (float) r3
            float r4 = (float) r4
            float r4 = r3 / r4
            float r11 = r11 * r4
            r5 = 0
        L1c:
            if (r1 >= r0) goto L37
            r6 = r9[r1]
            r7 = r10[r1]
            float r7 = (float) r7
            float r7 = r7 * r4
            float r6 = (float) r6
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 <= 0) goto L2c
            float r6 = r6 - r7
            goto L2e
        L2c:
            float r6 = r7 - r6
        L2e:
            int r7 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r7 <= 0) goto L33
            return r2
        L33:
            float r5 = r5 + r6
            int r1 = r1 + 1
            goto L1c
        L37:
            float r5 = r5 / r3
            return r5
    }
}
