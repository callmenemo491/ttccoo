package p387w5;

/* renamed from: w5.f */
/* loaded from: classes.dex */
public final class C6803f {

    /* renamed from: a */
    public final java.util.List<byte[]> f26435a;

    /* renamed from: b */
    public final int f26436b;

    /* renamed from: c */
    public final float f26437c;

    /* renamed from: d */
    public final java.lang.String f26438d;

    public C6803f(java.util.List<byte[]> r1, int r2, int r3, int r4, float r5, java.lang.String r6) {
            r0 = this;
            r0.<init>()
            r0.f26435a = r1
            r0.f26436b = r2
            r0.f26437c = r5
            r0.f26438d = r6
            return
    }

    /* renamed from: a */
    public static p387w5.C6803f m13845a(p371v5.C6571u r26) {
            r0 = r26
            r1 = 21
            r0.m13397G(r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld1
            int r1 = r26.m13418u()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld1
            r1 = r1 & 3
            int r2 = r26.m13418u()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld1
            int r3 = r0.f25711b     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld1
            r4 = 0
            r5 = 0
            r6 = 0
        L16:
            r7 = 1
            if (r5 >= r2) goto L33
            r0.m13397G(r7)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld1
            int r7 = r26.m13423z()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld1
            r8 = 0
        L21:
            if (r8 >= r7) goto L30
            int r9 = r26.m13423z()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld1
            int r10 = r9 + 4
            int r6 = r6 + r10
            r0.m13397G(r9)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld1
            int r8 = r8 + 1
            goto L21
        L30:
            int r5 = r5 + 1
            goto L16
        L33:
            r0.m13396F(r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld1
            byte[] r3 = new byte[r6]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld1
            r5 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = -1
            r16 = r5
            r5 = 0
            r8 = 0
            r13 = -1
            r14 = -1
            r15 = 1065353216(0x3f800000, float:1.0)
        L44:
            if (r5 >= r2) goto Lbb
            int r9 = r26.m13418u()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld1
            r9 = r9 & 127(0x7f, float:1.78E-43)
            int r10 = r26.m13423z()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld1
            r11 = 0
        L51:
            if (r11 >= r10) goto Lb4
            int r12 = r26.m13423z()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld1
            byte[] r7 = p371v5.C6568r.f25674a     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld1
            r17 = r2
            int r2 = r7.length     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld1
            java.lang.System.arraycopy(r7, r4, r3, r8, r2)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld1
            int r2 = r7.length     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld1
            int r8 = r8 + r2
            byte[] r2 = r0.f25710a     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld1
            int r7 = r0.f25711b     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld1
            java.lang.System.arraycopy(r2, r7, r3, r8, r12)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld1
            r2 = 33
            if (r9 != r2) goto La1
            if (r11 != 0) goto La1
            int r2 = r8 + r12
            v5.r$a r2 = p371v5.C6568r.m13384c(r3, r8, r2)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld1
            int r13 = r2.f25684g     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld1
            int r14 = r2.f25685h     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld1
            float r15 = r2.f25686i     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld1
            int r7 = r2.f25678a     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld1
            boolean r4 = r2.f25679b     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld1
            r24 = r9
            int r9 = r2.f25680c     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld1
            r25 = r10
            int r10 = r2.f25681d     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld1
            r16 = r13
            int[] r13 = r2.f25682e     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld1
            int r2 = r2.f25683f     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld1
            r18 = r7
            r19 = r4
            r20 = r9
            r21 = r10
            r22 = r13
            r23 = r2
            java.lang.String r2 = p371v5.C6554d.m13339b(r18, r19, r20, r21, r22, r23)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld1
            r13 = r16
            r16 = r2
            goto La5
        La1:
            r24 = r9
            r25 = r10
        La5:
            int r8 = r8 + r12
            r0.m13397G(r12)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld1
            int r11 = r11 + 1
            r2 = r17
            r9 = r24
            r10 = r25
            r4 = 0
            r7 = 1
            goto L51
        Lb4:
            r17 = r2
            int r5 = r5 + 1
            r4 = 0
            r7 = 1
            goto L44
        Lbb:
            if (r6 != 0) goto Lc2
            java.util.List r0 = java.util.Collections.emptyList()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld1
            goto Lc6
        Lc2:
            java.util.List r0 = java.util.Collections.singletonList(r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld1
        Lc6:
            r11 = r0
            w5.f r0 = new w5.f     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld1
            r2 = 1
            int r12 = r1 + 1
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld1
            return r0
        Ld1:
            r0 = move-exception
            java.lang.String r1 = "Error parsing HEVC config"
            f4.s0 r0 = p088f4.C2044s0.m5407a(r1, r0)
            throw r0
    }
}
