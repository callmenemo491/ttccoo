package p365v;

/* renamed from: v.a */
/* loaded from: classes.dex */
public class C6474a implements p365v.C6475b.a {

    /* renamed from: a */
    public int f25060a;

    /* renamed from: b */
    public final p365v.C6475b f25061b;

    /* renamed from: c */
    public final p365v.C6476c f25062c;

    /* renamed from: d */
    public int f25063d;

    /* renamed from: e */
    public int[] f25064e;

    /* renamed from: f */
    public int[] f25065f;

    /* renamed from: g */
    public float[] f25066g;

    /* renamed from: h */
    public int f25067h;

    /* renamed from: i */
    public int f25068i;

    /* renamed from: j */
    public boolean f25069j;

    public C6474a(p365v.C6475b r4, p365v.C6476c r5) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f25060a = r0
            r1 = 8
            r3.f25063d = r1
            int[] r2 = new int[r1]
            r3.f25064e = r2
            int[] r2 = new int[r1]
            r3.f25065f = r2
            float[] r1 = new float[r1]
            r3.f25066g = r1
            r1 = -1
            r3.f25067h = r1
            r3.f25068i = r1
            r3.f25069j = r0
            r3.f25061b = r4
            r3.f25062c = r5
            return
    }

    @Override // p365v.C6475b.a
    /* renamed from: a */
    public float mo13089a(int r4) {
            r3 = this;
            int r0 = r3.f25067h
            r1 = 0
        L3:
            r2 = -1
            if (r0 == r2) goto L18
            int r2 = r3.f25060a
            if (r1 >= r2) goto L18
            if (r1 != r4) goto L11
            float[] r4 = r3.f25066g
            r4 = r4[r0]
            return r4
        L11:
            int[] r2 = r3.f25065f
            r0 = r2[r0]
            int r1 = r1 + 1
            goto L3
        L18:
            r4 = 0
            return r4
    }

    @Override // p365v.C6475b.a
    /* renamed from: b */
    public float mo13090b(p365v.C6475b r6, boolean r7) {
            r5 = this;
            v.h r0 = r6.f25070a
            float r0 = r5.mo13095g(r0)
            v.h r1 = r6.f25070a
            r5.mo13093e(r1, r7)
            v.b$a r6 = r6.f25073d
            int r1 = r6.mo13092d()
            r2 = 0
        L12:
            if (r2 >= r1) goto L24
            v.h r3 = r6.mo13096h(r2)
            float r4 = r6.mo13095g(r3)
            float r4 = r4 * r0
            r5.mo13094f(r3, r4, r7)
            int r2 = r2 + 1
            goto L12
        L24:
            return r0
    }

    @Override // p365v.C6475b.a
    /* renamed from: c */
    public final void mo13091c(p365v.C6481h r10, float r11) {
            r9 = this;
            r0 = 1
            r1 = 0
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 != 0) goto La
            r9.mo13093e(r10, r0)
            return
        La:
            int r1 = r9.f25067h
            r2 = 0
            r3 = -1
            if (r1 != r3) goto L44
            r9.f25067h = r2
            float[] r1 = r9.f25066g
            r1[r2] = r11
            int[] r11 = r9.f25064e
            int r1 = r10.f25108b
            r11[r2] = r1
            int[] r11 = r9.f25065f
            r11[r2] = r3
            int r11 = r10.f25118l
            int r11 = r11 + r0
            r10.f25118l = r11
            v.b r11 = r9.f25061b
            r10.m13155a(r11)
            int r10 = r9.f25060a
            int r10 = r10 + r0
            r9.f25060a = r10
            boolean r10 = r9.f25069j
            if (r10 != 0) goto L43
            int r10 = r9.f25068i
            int r10 = r10 + r0
            r9.f25068i = r10
            int[] r11 = r9.f25064e
            int r1 = r11.length
            if (r10 < r1) goto L43
            r9.f25069j = r0
            int r10 = r11.length
            int r10 = r10 - r0
            r9.f25068i = r10
        L43:
            return
        L44:
            r4 = 0
            r5 = -1
        L46:
            if (r1 == r3) goto L65
            int r6 = r9.f25060a
            if (r4 >= r6) goto L65
            int[] r6 = r9.f25064e
            r7 = r6[r1]
            int r8 = r10.f25108b
            if (r7 != r8) goto L59
            float[] r10 = r9.f25066g
            r10[r1] = r11
            return
        L59:
            r6 = r6[r1]
            if (r6 >= r8) goto L5e
            r5 = r1
        L5e:
            int[] r6 = r9.f25065f
            r1 = r6[r1]
            int r4 = r4 + 1
            goto L46
        L65:
            int r1 = r9.f25068i
            int r4 = r1 + 1
            boolean r6 = r9.f25069j
            if (r6 == 0) goto L76
            int[] r4 = r9.f25064e
            r6 = r4[r1]
            if (r6 != r3) goto L74
            goto L77
        L74:
            int r1 = r4.length
            goto L77
        L76:
            r1 = r4
        L77:
            int[] r4 = r9.f25064e
            int r6 = r4.length
            if (r1 < r6) goto L90
            int r6 = r9.f25060a
            int r4 = r4.length
            if (r6 >= r4) goto L90
            r4 = 0
        L82:
            int[] r6 = r9.f25064e
            int r7 = r6.length
            if (r4 >= r7) goto L90
            r6 = r6[r4]
            if (r6 != r3) goto L8d
            r1 = r4
            goto L90
        L8d:
            int r4 = r4 + 1
            goto L82
        L90:
            int[] r4 = r9.f25064e
            int r6 = r4.length
            if (r1 < r6) goto Lbe
            int r1 = r4.length
            int r4 = r9.f25063d
            int r4 = r4 * 2
            r9.f25063d = r4
            r9.f25069j = r2
            int r2 = r1 + (-1)
            r9.f25068i = r2
            float[] r2 = r9.f25066g
            float[] r2 = java.util.Arrays.copyOf(r2, r4)
            r9.f25066g = r2
            int[] r2 = r9.f25064e
            int r4 = r9.f25063d
            int[] r2 = java.util.Arrays.copyOf(r2, r4)
            r9.f25064e = r2
            int[] r2 = r9.f25065f
            int r4 = r9.f25063d
            int[] r2 = java.util.Arrays.copyOf(r2, r4)
            r9.f25065f = r2
        Lbe:
            int[] r2 = r9.f25064e
            int r4 = r10.f25108b
            r2[r1] = r4
            float[] r2 = r9.f25066g
            r2[r1] = r11
            int[] r11 = r9.f25065f
            if (r5 == r3) goto Ld3
            r2 = r11[r5]
            r11[r1] = r2
            r11[r5] = r1
            goto Ld9
        Ld3:
            int r2 = r9.f25067h
            r11[r1] = r2
            r9.f25067h = r1
        Ld9:
            int r11 = r10.f25118l
            int r11 = r11 + r0
            r10.f25118l = r11
            v.b r11 = r9.f25061b
            r10.m13155a(r11)
            int r10 = r9.f25060a
            int r10 = r10 + r0
            r9.f25060a = r10
            boolean r11 = r9.f25069j
            if (r11 != 0) goto Lf1
            int r11 = r9.f25068i
            int r11 = r11 + r0
            r9.f25068i = r11
        Lf1:
            int[] r11 = r9.f25064e
            int r1 = r11.length
            if (r10 < r1) goto Lf8
            r9.f25069j = r0
        Lf8:
            int r10 = r9.f25068i
            int r1 = r11.length
            if (r10 < r1) goto L103
            r9.f25069j = r0
            int r10 = r11.length
            int r10 = r10 - r0
            r9.f25068i = r10
        L103:
            return
    }

    @Override // p365v.C6475b.a
    public final void clear() {
            r5 = this;
            int r0 = r5.f25067h
            r1 = 0
            r2 = 0
        L4:
            r3 = -1
            if (r0 == r3) goto L25
            int r4 = r5.f25060a
            if (r2 >= r4) goto L25
            v.c r3 = r5.f25062c
            java.lang.Object r3 = r3.f25078b0
            v.h[] r3 = (p365v.C6481h[]) r3
            int[] r4 = r5.f25064e
            r4 = r4[r0]
            r3 = r3[r4]
            if (r3 == 0) goto L1e
            v.b r4 = r5.f25061b
            r3.m13156b(r4)
        L1e:
            int[] r3 = r5.f25065f
            r0 = r3[r0]
            int r2 = r2 + 1
            goto L4
        L25:
            r5.f25067h = r3
            r5.f25068i = r3
            r5.f25069j = r1
            r5.f25060a = r1
            return
    }

    @Override // p365v.C6475b.a
    /* renamed from: d */
    public int mo13092d() {
            r1 = this;
            int r0 = r1.f25060a
            return r0
    }

    @Override // p365v.C6475b.a
    /* renamed from: e */
    public final float mo13093e(p365v.C6481h r9, boolean r10) {
            r8 = this;
            int r0 = r8.f25067h
            r1 = 0
            r2 = -1
            if (r0 != r2) goto L7
            return r1
        L7:
            r3 = 0
            r4 = -1
        L9:
            if (r0 == r2) goto L52
            int r5 = r8.f25060a
            if (r3 >= r5) goto L52
            int[] r5 = r8.f25064e
            r5 = r5[r0]
            int r6 = r9.f25108b
            if (r5 != r6) goto L48
            int r1 = r8.f25067h
            if (r0 != r1) goto L22
            int[] r1 = r8.f25065f
            r1 = r1[r0]
            r8.f25067h = r1
            goto L28
        L22:
            int[] r1 = r8.f25065f
            r3 = r1[r0]
            r1[r4] = r3
        L28:
            if (r10 == 0) goto L2f
            v.b r10 = r8.f25061b
            r9.m13156b(r10)
        L2f:
            int r10 = r9.f25118l
            int r10 = r10 + r2
            r9.f25118l = r10
            int r9 = r8.f25060a
            int r9 = r9 + r2
            r8.f25060a = r9
            int[] r9 = r8.f25064e
            r9[r0] = r2
            boolean r9 = r8.f25069j
            if (r9 == 0) goto L43
            r8.f25068i = r0
        L43:
            float[] r9 = r8.f25066g
            r9 = r9[r0]
            return r9
        L48:
            int[] r4 = r8.f25065f
            r4 = r4[r0]
            int r3 = r3 + 1
            r7 = r4
            r4 = r0
            r0 = r7
            goto L9
        L52:
            return r1
    }

    @Override // p365v.C6475b.a
    /* renamed from: f */
    public void mo13094f(p365v.C6481h r12, float r13, boolean r14) {
            r11 = this;
            r0 = 981668463(0x3a83126f, float:0.001)
            r1 = -1165815185(0xffffffffba83126f, float:-0.001)
            int r2 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r2 <= 0) goto Lf
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 >= 0) goto Lf
            return
        Lf:
            int r2 = r11.f25067h
            r3 = 0
            r4 = -1
            r5 = 1
            if (r2 != r4) goto L4a
            r11.f25067h = r3
            float[] r14 = r11.f25066g
            r14[r3] = r13
            int[] r13 = r11.f25064e
            int r14 = r12.f25108b
            r13[r3] = r14
            int[] r13 = r11.f25065f
            r13[r3] = r4
            int r13 = r12.f25118l
            int r13 = r13 + r5
            r12.f25118l = r13
            v.b r13 = r11.f25061b
            r12.m13155a(r13)
            int r12 = r11.f25060a
            int r12 = r12 + r5
            r11.f25060a = r12
            boolean r12 = r11.f25069j
            if (r12 != 0) goto L49
            int r12 = r11.f25068i
            int r12 = r12 + r5
            r11.f25068i = r12
            int[] r13 = r11.f25064e
            int r14 = r13.length
            if (r12 < r14) goto L49
            r11.f25069j = r5
            int r12 = r13.length
            int r12 = r12 - r5
            r11.f25068i = r12
        L49:
            return
        L4a:
            r6 = 0
            r7 = -1
        L4c:
            if (r2 == r4) goto La4
            int r8 = r11.f25060a
            if (r6 >= r8) goto La4
            int[] r8 = r11.f25064e
            r9 = r8[r2]
            int r10 = r12.f25108b
            if (r9 != r10) goto L98
            float[] r3 = r11.f25066g
            r4 = r3[r2]
            float r4 = r4 + r13
            r13 = 0
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 <= 0) goto L69
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L69
            r4 = 0
        L69:
            r3[r2] = r4
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 != 0) goto L97
            int r13 = r11.f25067h
            if (r2 != r13) goto L7a
            int[] r13 = r11.f25065f
            r13 = r13[r2]
            r11.f25067h = r13
            goto L80
        L7a:
            int[] r13 = r11.f25065f
            r0 = r13[r2]
            r13[r7] = r0
        L80:
            if (r14 == 0) goto L87
            v.b r13 = r11.f25061b
            r12.m13156b(r13)
        L87:
            boolean r13 = r11.f25069j
            if (r13 == 0) goto L8d
            r11.f25068i = r2
        L8d:
            int r13 = r12.f25118l
            int r13 = r13 - r5
            r12.f25118l = r13
            int r12 = r11.f25060a
            int r12 = r12 - r5
            r11.f25060a = r12
        L97:
            return
        L98:
            r8 = r8[r2]
            if (r8 >= r10) goto L9d
            r7 = r2
        L9d:
            int[] r8 = r11.f25065f
            r2 = r8[r2]
            int r6 = r6 + 1
            goto L4c
        La4:
            int r14 = r11.f25068i
            int r0 = r14 + 1
            boolean r1 = r11.f25069j
            if (r1 == 0) goto Lb5
            int[] r0 = r11.f25064e
            r1 = r0[r14]
            if (r1 != r4) goto Lb3
            goto Lb6
        Lb3:
            int r14 = r0.length
            goto Lb6
        Lb5:
            r14 = r0
        Lb6:
            int[] r0 = r11.f25064e
            int r1 = r0.length
            if (r14 < r1) goto Lcf
            int r1 = r11.f25060a
            int r0 = r0.length
            if (r1 >= r0) goto Lcf
            r0 = 0
        Lc1:
            int[] r1 = r11.f25064e
            int r2 = r1.length
            if (r0 >= r2) goto Lcf
            r1 = r1[r0]
            if (r1 != r4) goto Lcc
            r14 = r0
            goto Lcf
        Lcc:
            int r0 = r0 + 1
            goto Lc1
        Lcf:
            int[] r0 = r11.f25064e
            int r1 = r0.length
            if (r14 < r1) goto Lfd
            int r14 = r0.length
            int r0 = r11.f25063d
            int r0 = r0 * 2
            r11.f25063d = r0
            r11.f25069j = r3
            int r1 = r14 + (-1)
            r11.f25068i = r1
            float[] r1 = r11.f25066g
            float[] r0 = java.util.Arrays.copyOf(r1, r0)
            r11.f25066g = r0
            int[] r0 = r11.f25064e
            int r1 = r11.f25063d
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            r11.f25064e = r0
            int[] r0 = r11.f25065f
            int r1 = r11.f25063d
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            r11.f25065f = r0
        Lfd:
            int[] r0 = r11.f25064e
            int r1 = r12.f25108b
            r0[r14] = r1
            float[] r0 = r11.f25066g
            r0[r14] = r13
            int[] r13 = r11.f25065f
            if (r7 == r4) goto L112
            r0 = r13[r7]
            r13[r14] = r0
            r13[r7] = r14
            goto L118
        L112:
            int r0 = r11.f25067h
            r13[r14] = r0
            r11.f25067h = r14
        L118:
            int r13 = r12.f25118l
            int r13 = r13 + r5
            r12.f25118l = r13
            v.b r13 = r11.f25061b
            r12.m13155a(r13)
            int r12 = r11.f25060a
            int r12 = r12 + r5
            r11.f25060a = r12
            boolean r12 = r11.f25069j
            if (r12 != 0) goto L130
            int r12 = r11.f25068i
            int r12 = r12 + r5
            r11.f25068i = r12
        L130:
            int r12 = r11.f25068i
            int[] r13 = r11.f25064e
            int r14 = r13.length
            if (r12 < r14) goto L13d
            r11.f25069j = r5
            int r12 = r13.length
            int r12 = r12 - r5
            r11.f25068i = r12
        L13d:
            return
    }

    @Override // p365v.C6475b.a
    /* renamed from: g */
    public final float mo13095g(p365v.C6481h r5) {
            r4 = this;
            int r0 = r4.f25067h
            r1 = 0
        L3:
            r2 = -1
            if (r0 == r2) goto L1e
            int r2 = r4.f25060a
            if (r1 >= r2) goto L1e
            int[] r2 = r4.f25064e
            r2 = r2[r0]
            int r3 = r5.f25108b
            if (r2 != r3) goto L17
            float[] r5 = r4.f25066g
            r5 = r5[r0]
            return r5
        L17:
            int[] r2 = r4.f25065f
            r0 = r2[r0]
            int r1 = r1 + 1
            goto L3
        L1e:
            r5 = 0
            return r5
    }

    @Override // p365v.C6475b.a
    /* renamed from: h */
    public p365v.C6481h mo13096h(int r4) {
            r3 = this;
            int r0 = r3.f25067h
            r1 = 0
        L3:
            r2 = -1
            if (r0 == r2) goto L20
            int r2 = r3.f25060a
            if (r1 >= r2) goto L20
            if (r1 != r4) goto L19
            v.c r4 = r3.f25062c
            java.lang.Object r4 = r4.f25078b0
            v.h[] r4 = (p365v.C6481h[]) r4
            int[] r1 = r3.f25064e
            r0 = r1[r0]
            r4 = r4[r0]
            return r4
        L19:
            int[] r2 = r3.f25065f
            r0 = r2[r0]
            int r1 = r1 + 1
            goto L3
        L20:
            r4 = 0
            return r4
    }

    @Override // p365v.C6475b.a
    /* renamed from: i */
    public boolean mo13097i(p365v.C6481h r7) {
            r6 = this;
            int r0 = r6.f25067h
            r1 = -1
            r2 = 0
            if (r0 != r1) goto L7
            return r2
        L7:
            r3 = 0
        L8:
            if (r0 == r1) goto L1f
            int r4 = r6.f25060a
            if (r3 >= r4) goto L1f
            int[] r4 = r6.f25064e
            r4 = r4[r0]
            int r5 = r7.f25108b
            if (r4 != r5) goto L18
            r7 = 1
            return r7
        L18:
            int[] r4 = r6.f25065f
            r0 = r4[r0]
            int r3 = r3 + 1
            goto L8
        L1f:
            return r2
    }

    @Override // p365v.C6475b.a
    /* renamed from: j */
    public void mo13098j(float r5) {
            r4 = this;
            int r0 = r4.f25067h
            r1 = 0
        L3:
            r2 = -1
            if (r0 == r2) goto L18
            int r2 = r4.f25060a
            if (r1 >= r2) goto L18
            float[] r2 = r4.f25066g
            r3 = r2[r0]
            float r3 = r3 / r5
            r2[r0] = r3
            int[] r2 = r4.f25065f
            r0 = r2[r0]
            int r1 = r1 + 1
            goto L3
        L18:
            return
    }

    @Override // p365v.C6475b.a
    /* renamed from: k */
    public void mo13099k() {
            r5 = this;
            int r0 = r5.f25067h
            r1 = 0
        L3:
            r2 = -1
            if (r0 == r2) goto L1b
            int r2 = r5.f25060a
            if (r1 >= r2) goto L1b
            float[] r2 = r5.f25066g
            r3 = r2[r0]
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r3 = r3 * r4
            r2[r0] = r3
            int[] r2 = r5.f25065f
            r0 = r2[r0]
            int r1 = r1 + 1
            goto L3
        L1b:
            return
    }

    public java.lang.String toString() {
            r5 = this;
            int r0 = r5.f25067h
            java.lang.String r1 = ""
            r2 = 0
        L5:
            r3 = -1
            if (r0 == r3) goto L44
            int r3 = r5.f25060a
            if (r2 >= r3) goto L44
            java.lang.String r3 = " -> "
            java.lang.String r1 = p064e.C1493g.m4049a(r1, r3)
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            float[] r3 = r5.f25066g
            r3 = r3[r0]
            r1.append(r3)
            java.lang.String r3 = " : "
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            v.c r3 = r5.f25062c
            java.lang.Object r3 = r3.f25078b0
            v.h[] r3 = (p365v.C6481h[]) r3
            int[] r4 = r5.f25064e
            r4 = r4[r0]
            r3 = r3[r4]
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            int[] r3 = r5.f25065f
            r0 = r3[r0]
            int r2 = r2 + 1
            goto L5
        L44:
            return r1
    }
}
