package p386w4;

/* renamed from: w4.b */
/* loaded from: classes.dex */
public final class C6795b {

    /* renamed from: a */
    public final int f26382a;

    /* renamed from: b */
    public final int f26383b;

    /* renamed from: c */
    public final int f26384c;

    /* renamed from: d */
    public final int f26385d;

    /* renamed from: e */
    public final int f26386e;

    /* renamed from: f */
    public final int f26387f;

    /* renamed from: g */
    public final java.lang.Object f26388g;

    public C6795b(int r1, int r2, int r3, int r4, int r5, int r6, byte[] r7) {
            r0 = this;
            r0.<init>()
            r0.f26382a = r1
            r0.f26383b = r2
            r0.f26384c = r3
            r0.f26385d = r4
            r0.f26386e = r5
            r0.f26387f = r6
            r0.f26388g = r7
            return
    }

    public C6795b(p453zb.C7270b r4, int r5, int r6, int r7) {
            r3 = this;
            r3.<init>()
            r3.f26388g = r4
            int r0 = r4.f27903Z
            r3.f26382a = r0
            int r4 = r4.f27902Y
            r3.f26383b = r4
            int r5 = r5 / 2
            int r1 = r6 - r5
            r3.f26384c = r1
            int r6 = r6 + r5
            r3.f26385d = r6
            int r2 = r7 - r5
            r3.f26387f = r2
            int r7 = r7 + r5
            r3.f26386e = r7
            if (r2 < 0) goto L26
            if (r1 < 0) goto L26
            if (r7 >= r0) goto L26
            if (r6 >= r4) goto L26
            return
        L26:
            sb.k r4 = sb.C6017k.f23200a0
            throw r4
    }

    /* renamed from: a */
    public sb.C6023q[] m13818a(sb.C6023q r12, sb.C6023q r13, sb.C6023q r14, sb.C6023q r15) {
            r11 = this;
            float r0 = r12.f23222a
            float r12 = r12.f23223b
            float r1 = r13.f23222a
            float r13 = r13.f23223b
            float r2 = r14.f23222a
            float r14 = r14.f23223b
            float r3 = r15.f23222a
            float r15 = r15.f23223b
            int r4 = r11.f26383b
            float r4 = (float) r4
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r5
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            r9 = 4
            r10 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 >= 0) goto L48
            sb.q[] r4 = new sb.C6023q[r9]
            sb.q r9 = new sb.q
            float r3 = r3 - r10
            float r15 = r15 + r10
            r9.<init>(r3, r15)
            r4[r8] = r9
            sb.q r15 = new sb.q
            float r1 = r1 + r10
            float r13 = r13 + r10
            r15.<init>(r1, r13)
            r4[r7] = r15
            sb.q r13 = new sb.q
            float r2 = r2 - r10
            float r14 = r14 - r10
            r13.<init>(r2, r14)
            r4[r6] = r13
            sb.q r13 = new sb.q
            float r0 = r0 + r10
            float r12 = r12 - r10
            r13.<init>(r0, r12)
            r4[r5] = r13
            return r4
        L48:
            sb.q[] r4 = new sb.C6023q[r9]
            sb.q r9 = new sb.q
            float r3 = r3 + r10
            float r15 = r15 + r10
            r9.<init>(r3, r15)
            r4[r8] = r9
            sb.q r15 = new sb.q
            float r1 = r1 + r10
            float r13 = r13 - r10
            r15.<init>(r1, r13)
            r4[r7] = r15
            sb.q r13 = new sb.q
            float r2 = r2 - r10
            float r14 = r14 + r10
            r13.<init>(r2, r14)
            r4[r6] = r13
            sb.q r13 = new sb.q
            float r0 = r0 - r10
            float r12 = r12 - r10
            r13.<init>(r0, r12)
            r4[r5] = r13
            return r4
    }

    /* renamed from: b */
    public boolean m13819b(int r2, int r3, int r4, boolean r5) {
            r1 = this;
            r0 = 1
            if (r5 == 0) goto L13
        L3:
            if (r2 > r3) goto L23
            java.lang.Object r5 = r1.f26388g
            zb.b r5 = (p453zb.C7270b) r5
            boolean r5 = r5.m14372b(r2, r4)
            if (r5 == 0) goto L10
            return r0
        L10:
            int r2 = r2 + 1
            goto L3
        L13:
            if (r2 > r3) goto L23
            java.lang.Object r5 = r1.f26388g
            zb.b r5 = (p453zb.C7270b) r5
            boolean r5 = r5.m14372b(r4, r2)
            if (r5 == 0) goto L20
            return r0
        L20:
            int r2 = r2 + 1
            goto L13
        L23:
            r2 = 0
            return r2
    }

    /* renamed from: c */
    public sb.C6023q[] m13820c() {
            r13 = this;
            int r0 = r13.f26384c
            int r1 = r13.f26385d
            int r2 = r13.f26387f
            int r3 = r13.f26386e
            r4 = 0
            r5 = 1
            r6 = 1
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L10:
            if (r6 == 0) goto L8a
            r6 = 1
            r12 = 0
        L14:
            if (r6 != 0) goto L18
            if (r7 != 0) goto L2c
        L18:
            int r6 = r13.f26383b
            if (r1 >= r6) goto L2c
            boolean r6 = r13.m13819b(r2, r3, r1, r4)
            if (r6 == 0) goto L27
            int r1 = r1 + 1
            r7 = 1
            r12 = 1
            goto L14
        L27:
            if (r7 != 0) goto L14
            int r1 = r1 + 1
            goto L14
        L2c:
            int r6 = r13.f26383b
            if (r1 < r6) goto L33
        L30:
            r4 = 1
            goto L8a
        L33:
            r6 = 1
        L34:
            if (r6 != 0) goto L38
            if (r8 != 0) goto L4c
        L38:
            int r6 = r13.f26382a
            if (r3 >= r6) goto L4c
            boolean r6 = r13.m13819b(r0, r1, r3, r5)
            if (r6 == 0) goto L47
            int r3 = r3 + 1
            r8 = 1
            r12 = 1
            goto L34
        L47:
            if (r8 != 0) goto L34
            int r3 = r3 + 1
            goto L34
        L4c:
            int r6 = r13.f26382a
            if (r3 < r6) goto L51
            goto L30
        L51:
            r6 = 1
        L52:
            if (r6 != 0) goto L56
            if (r9 != 0) goto L68
        L56:
            if (r0 < 0) goto L68
            boolean r6 = r13.m13819b(r2, r3, r0, r4)
            if (r6 == 0) goto L63
            int r0 = r0 + (-1)
            r9 = 1
            r12 = 1
            goto L52
        L63:
            if (r9 != 0) goto L52
            int r0 = r0 + (-1)
            goto L52
        L68:
            if (r0 >= 0) goto L6b
            goto L30
        L6b:
            r6 = r12
            r12 = 1
        L6d:
            if (r12 != 0) goto L71
            if (r11 != 0) goto L83
        L71:
            if (r2 < 0) goto L83
            boolean r12 = r13.m13819b(r0, r1, r2, r5)
            if (r12 == 0) goto L7e
            int r2 = r2 + (-1)
            r6 = 1
            r11 = 1
            goto L6d
        L7e:
            if (r11 != 0) goto L6d
            int r2 = r2 + (-1)
            goto L6d
        L83:
            if (r2 >= 0) goto L86
            goto L30
        L86:
            if (r6 == 0) goto L10
            r10 = 1
            goto L10
        L8a:
            if (r4 != 0) goto Lfc
            if (r10 == 0) goto Lfc
            int r4 = r1 - r0
            r6 = 0
            r7 = r6
            r8 = 1
        L93:
            if (r7 != 0) goto La6
            if (r8 >= r4) goto La6
            float r7 = (float) r0
            int r9 = r3 - r8
            float r9 = (float) r9
            int r10 = r0 + r8
            float r10 = (float) r10
            float r11 = (float) r3
            sb.q r7 = r13.m13821d(r7, r9, r10, r11)
            int r8 = r8 + 1
            goto L93
        La6:
            if (r7 == 0) goto Lf9
            r8 = r6
            r9 = 1
        Laa:
            if (r8 != 0) goto Lbd
            if (r9 >= r4) goto Lbd
            float r8 = (float) r0
            int r10 = r2 + r9
            float r10 = (float) r10
            int r11 = r0 + r9
            float r11 = (float) r11
            float r12 = (float) r2
            sb.q r8 = r13.m13821d(r8, r10, r11, r12)
            int r9 = r9 + 1
            goto Laa
        Lbd:
            if (r8 == 0) goto Lf6
            r0 = r6
            r9 = 1
        Lc1:
            if (r0 != 0) goto Ld4
            if (r9 >= r4) goto Ld4
            float r0 = (float) r1
            int r10 = r2 + r9
            float r10 = (float) r10
            int r11 = r1 - r9
            float r11 = (float) r11
            float r12 = (float) r2
            sb.q r0 = r13.m13821d(r0, r10, r11, r12)
            int r9 = r9 + 1
            goto Lc1
        Ld4:
            if (r0 == 0) goto Lf3
        Ld6:
            if (r6 != 0) goto Le9
            if (r5 >= r4) goto Le9
            float r2 = (float) r1
            int r6 = r3 - r5
            float r6 = (float) r6
            int r9 = r1 - r5
            float r9 = (float) r9
            float r10 = (float) r3
            sb.q r6 = r13.m13821d(r2, r6, r9, r10)
            int r5 = r5 + 1
            goto Ld6
        Le9:
            if (r6 == 0) goto Lf0
            sb.q[] r0 = r13.m13818a(r6, r7, r0, r8)
            return r0
        Lf0:
            sb.k r0 = sb.C6017k.f23200a0
            throw r0
        Lf3:
            sb.k r0 = sb.C6017k.f23200a0
            throw r0
        Lf6:
            sb.k r0 = sb.C6017k.f23200a0
            throw r0
        Lf9:
            sb.k r0 = sb.C6017k.f23200a0
            throw r0
        Lfc:
            sb.k r0 = sb.C6017k.f23200a0
            throw r0
    }

    /* renamed from: d */
    public sb.C6023q m13821d(float r6, float r7, float r8, float r9) {
            r5 = this;
            float r0 = p185k7.C4038x4.m9091d(r6, r7, r8, r9)
            int r0 = p185k7.C4038x4.m9099l(r0)
            float r8 = r8 - r6
            float r1 = (float) r0
            float r8 = r8 / r1
            float r9 = r9 - r7
            float r9 = r9 / r1
            r1 = 0
        Le:
            if (r1 >= r0) goto L34
            float r2 = (float) r1
            float r3 = r2 * r8
            float r3 = r3 + r6
            int r3 = p185k7.C4038x4.m9099l(r3)
            float r2 = r2 * r9
            float r2 = r2 + r7
            int r2 = p185k7.C4038x4.m9099l(r2)
            java.lang.Object r4 = r5.f26388g
            zb.b r4 = (p453zb.C7270b) r4
            boolean r4 = r4.m14372b(r3, r2)
            if (r4 == 0) goto L31
            sb.q r6 = new sb.q
            float r7 = (float) r3
            float r8 = (float) r2
            r6.<init>(r7, r8)
            return r6
        L31:
            int r1 = r1 + 1
            goto Le
        L34:
            r6 = 0
            return r6
    }
}
