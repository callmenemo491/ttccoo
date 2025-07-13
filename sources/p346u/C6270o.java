package p346u;

/* renamed from: u.o */
/* loaded from: classes.dex */
public class C6270o {

    /* renamed from: a */
    public android.view.View f24368a;

    /* renamed from: b */
    public int f24369b;

    /* renamed from: c */
    public int f24370c;

    /* renamed from: d */
    public p346u.C6272q f24371d;

    /* renamed from: e */
    public p346u.C6272q f24372e;

    /* renamed from: f */
    public p346u.C6267l f24373f;

    /* renamed from: g */
    public p346u.C6267l f24374g;

    /* renamed from: h */
    public p331t.AbstractC6087b[] f24375h;

    /* renamed from: i */
    public p331t.AbstractC6087b f24376i;

    /* renamed from: j */
    public float f24377j;

    /* renamed from: k */
    public float f24378k;

    /* renamed from: l */
    public float f24379l;

    /* renamed from: m */
    public int[] f24380m;

    /* renamed from: n */
    public double[] f24381n;

    /* renamed from: o */
    public double[] f24382o;

    /* renamed from: p */
    public java.lang.String[] f24383p;

    /* renamed from: q */
    public int[] f24384q;

    /* renamed from: r */
    public float[] f24385r;

    /* renamed from: s */
    public java.util.ArrayList<p346u.C6272q> f24386s;

    /* renamed from: t */
    public float[] f24387t;

    /* renamed from: u */
    public java.util.ArrayList<p346u.AbstractC6258c> f24388u;

    /* renamed from: v */
    public java.util.HashMap<java.lang.String, p346u.AbstractC6274s> f24389v;

    /* renamed from: w */
    public java.util.HashMap<java.lang.String, p346u.AbstractC6273r> f24390w;

    /* renamed from: x */
    public java.util.HashMap<java.lang.String, p346u.AbstractC6261f> f24391x;

    /* renamed from: y */
    public p346u.C6266k[] f24392y;

    /* renamed from: z */
    public int f24393z;

    public C6270o(android.view.View r3) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.f24370c = r0
            u.q r1 = new u.q
            r1.<init>()
            r2.f24371d = r1
            u.q r1 = new u.q
            r1.<init>()
            r2.f24372e = r1
            u.l r1 = new u.l
            r1.<init>()
            r2.f24373f = r1
            u.l r1 = new u.l
            r1.<init>()
            r2.f24374g = r1
            r1 = 2143289344(0x7fc00000, float:NaN)
            r2.f24377j = r1
            r1 = 0
            r2.f24378k = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r2.f24379l = r1
            r1 = 4
            float[] r1 = new float[r1]
            r2.f24385r = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.f24386s = r1
            r1 = 1
            float[] r1 = new float[r1]
            r2.f24387t = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.f24388u = r1
            r2.f24393z = r0
            r2.f24368a = r3
            int r0 = r3.getId()
            r2.f24369b = r0
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            boolean r0 = r3 instanceof androidx.constraintlayout.widget.ConstraintLayout.C0330a
            if (r0 == 0) goto L5c
            androidx.constraintlayout.widget.ConstraintLayout$a r3 = (androidx.constraintlayout.widget.ConstraintLayout.C0330a) r3
            java.util.Objects.requireNonNull(r3)
        L5c:
            return
    }

    /* renamed from: a */
    public final float m12889a(float r11, float[] r12) {
            r10 = this;
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            if (r12 == 0) goto L9
            r12[r2] = r1
            goto L25
        L9:
            float r3 = r10.f24379l
            double r4 = (double) r3
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L25
            float r4 = r10.f24378k
            int r5 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r5 >= 0) goto L19
            r11 = 0
        L19:
            int r5 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r5 <= 0) goto L25
            double r8 = (double) r11
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 >= 0) goto L25
            float r11 = r11 - r4
            float r11 = r11 * r3
        L25:
            u.q r3 = r10.f24371d
            t.c r3 = r3.f24395Y
            r4 = 2143289344(0x7fc00000, float:NaN)
            java.util.ArrayList<u.q> r5 = r10.f24386s
            java.util.Iterator r5 = r5.iterator()
        L31:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L53
            java.lang.Object r6 = r5.next()
            u.q r6 = (p346u.C6272q) r6
            t.c r7 = r6.f24395Y
            if (r7 == 0) goto L31
            float r8 = r6.f24397a0
            int r9 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r9 >= 0) goto L4a
            r3 = r7
            r0 = r8
            goto L31
        L4a:
            boolean r7 = java.lang.Float.isNaN(r4)
            if (r7 == 0) goto L31
            float r4 = r6.f24397a0
            goto L31
        L53:
            if (r3 == 0) goto L72
            boolean r5 = java.lang.Float.isNaN(r4)
            if (r5 == 0) goto L5c
            goto L5d
        L5c:
            r1 = r4
        L5d:
            float r11 = r11 - r0
            float r1 = r1 - r0
            float r11 = r11 / r1
            double r4 = (double) r11
            double r6 = r3.mo12543a(r4)
            float r11 = (float) r6
            float r11 = r11 * r1
            float r11 = r11 + r0
            if (r12 == 0) goto L72
            double r0 = r3.mo12544b(r4)
            float r0 = (float) r0
            r12[r2] = r0
        L72:
            return r11
    }

    /* renamed from: b */
    public final float m12890b() {
            r21 = this;
            r0 = r21
            r1 = 2
            float[] r1 = new float[r1]
            r2 = 99
            float r2 = (float) r2
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r3 / r2
            r4 = 0
            r8 = r4
            r10 = 0
            r11 = 0
        L11:
            r12 = 100
            if (r10 >= r12) goto La2
            float r12 = (float) r10
            float r12 = r12 * r2
            double r13 = (double) r12
            u.q r15 = r0.f24371d
            t.c r15 = r15.f24395Y
            r16 = 2143289344(0x7fc00000, float:NaN)
            java.util.ArrayList<u.q> r3 = r0.f24386s
            java.util.Iterator r3 = r3.iterator()
            r17 = 0
        L27:
            boolean r18 = r3.hasNext()
            if (r18 == 0) goto L52
            java.lang.Object r18 = r3.next()
            r6 = r18
            u.q r6 = (p346u.C6272q) r6
            t.c r7 = r6.f24395Y
            r19 = r2
            if (r7 == 0) goto L4f
            float r2 = r6.f24397a0
            int r20 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r20 >= 0) goto L45
            r17 = r2
            r15 = r7
            goto L4f
        L45:
            boolean r2 = java.lang.Float.isNaN(r16)
            if (r2 == 0) goto L4f
            float r2 = r6.f24397a0
            r16 = r2
        L4f:
            r2 = r19
            goto L27
        L52:
            r19 = r2
            if (r15 == 0) goto L6f
            boolean r2 = java.lang.Float.isNaN(r16)
            if (r2 == 0) goto L5e
            r16 = 1065353216(0x3f800000, float:1.0)
        L5e:
            float r12 = r12 - r17
            float r16 = r16 - r17
            float r12 = r12 / r16
            double r2 = (double) r12
            double r2 = r15.mo12543a(r2)
            float r2 = (float) r2
            float r2 = r2 * r16
            float r2 = r2 + r17
            double r13 = (double) r2
        L6f:
            t.b[] r2 = r0.f24375h
            r3 = 0
            r2 = r2[r3]
            double[] r6 = r0.f24381n
            r2.mo12532c(r13, r6)
            u.q r2 = r0.f24371d
            int[] r6 = r0.f24380m
            double[] r7 = r0.f24381n
            r2.m12896h(r6, r7, r1, r3)
            r2 = 1
            if (r10 <= 0) goto L94
            double r6 = (double) r11
            r11 = r1[r2]
            double r11 = (double) r11
            double r8 = r8 - r11
            r11 = r1[r3]
            double r11 = (double) r11
            double r4 = r4 - r11
            double r4 = java.lang.Math.hypot(r8, r4)
            double r4 = r4 + r6
            float r11 = (float) r4
        L94:
            r4 = r1[r3]
            double r4 = (double) r4
            r2 = r1[r2]
            double r8 = (double) r2
            int r10 = r10 + 1
            r2 = r19
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L11
        La2:
            return r11
    }

    /* renamed from: c */
    public boolean m12891c(android.view.View r24, float r25, long r26, p083f.C1933t r28) {
            r23 = this;
            r0 = r23
            r7 = r24
            r1 = 0
            r2 = r25
            float r8 = r0.m12889a(r2, r1)
            java.util.HashMap<java.lang.String, u.r> r2 = r0.f24390w
            if (r2 == 0) goto L27
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L17:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L27
            java.lang.Object r3 = r2.next()
            u.r r3 = (p346u.AbstractC6273r) r3
            r3.mo12901c(r7, r8)
            goto L17
        L27:
            java.util.HashMap<java.lang.String, u.s> r2 = r0.f24389v
            r9 = 0
            if (r2 == 0) goto L58
            java.util.Collection r2 = r2.values()
            java.util.Iterator r10 = r2.iterator()
            r2 = 0
            r11 = r1
            r12 = 0
        L37:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L5a
            java.lang.Object r1 = r10.next()
            u.s r1 = (p346u.AbstractC6274s) r1
            boolean r2 = r1 instanceof p346u.AbstractC6274s.d
            if (r2 == 0) goto L4b
            r11 = r1
            u.s$d r11 = (p346u.AbstractC6274s.d) r11
            goto L37
        L4b:
            r2 = r24
            r3 = r8
            r4 = r26
            r6 = r28
            boolean r1 = r1.mo12906d(r2, r3, r4, r6)
            r12 = r12 | r1
            goto L37
        L58:
            r12 = 0
            r11 = r1
        L5a:
            t.b[] r1 = r0.f24375h
            if (r1 == 0) goto L515
            r1 = r1[r9]
            double r13 = (double) r8
            double[] r2 = r0.f24381n
            r1.mo12532c(r13, r2)
            t.b[] r1 = r0.f24375h
            r1 = r1[r9]
            double[] r2 = r0.f24382o
            r1.mo12534e(r13, r2)
            t.b r1 = r0.f24376i
            if (r1 == 0) goto L82
            double[] r2 = r0.f24381n
            int r3 = r2.length
            if (r3 <= 0) goto L82
            r1.mo12532c(r13, r2)
            t.b r1 = r0.f24376i
            double[] r2 = r0.f24382o
            r1.mo12534e(r13, r2)
        L82:
            u.q r1 = r0.f24371d
            int[] r2 = r0.f24380m
            double[] r3 = r0.f24381n
            double[] r4 = r0.f24382o
            float r5 = r1.f24399c0
            float r6 = r1.f24400d0
            float r9 = r1.f24401e0
            float r10 = r1.f24402f0
            int r15 = r2.length
            if (r15 == 0) goto Lb1
            double[] r15 = r1.f24407k0
            int r15 = r15.length
            r25 = r5
            int r5 = r2.length
            int r5 = r5 + (-1)
            r5 = r2[r5]
            if (r15 > r5) goto Lb3
            int r5 = r2.length
            int r5 = r5 + (-1)
            r5 = r2[r5]
            int r5 = r5 + 1
            double[] r15 = new double[r5]
            r1.f24407k0 = r15
            double[] r5 = new double[r5]
            r1.f24408l0 = r5
            goto Lb3
        Lb1:
            r25 = r5
        Lb3:
            double[] r5 = r1.f24407k0
            r15 = r9
            r16 = r10
            r9 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            java.util.Arrays.fill(r5, r9)
            r5 = 0
        Lbe:
            int r9 = r2.length
            if (r5 >= r9) goto Ld4
            double[] r9 = r1.f24407k0
            r10 = r2[r5]
            r17 = r3[r5]
            r9[r10] = r17
            double[] r9 = r1.f24408l0
            r10 = r2[r5]
            r17 = r4[r5]
            r9[r10] = r17
            int r5 = r5 + 1
            goto Lbe
        Ld4:
            r2 = 0
            r3 = 2143289344(0x7fc00000, float:NaN)
            r4 = 0
            r5 = 0
            r9 = 0
            r10 = 0
            r9 = r6
            r17 = r16
            r10 = 0
            r16 = 0
            r6 = r25
            r25 = r12
        Le5:
            double[] r12 = r1.f24407k0
            r18 = r8
            int r8 = r12.length
            if (r2 >= r8) goto L13d
            r19 = r12[r2]
            boolean r8 = java.lang.Double.isNaN(r19)
            if (r8 == 0) goto Lf6
            r8 = r11
            goto L137
        Lf6:
            r19 = 0
            double[] r8 = r1.f24407k0
            r21 = r8[r2]
            boolean r8 = java.lang.Double.isNaN(r21)
            if (r8 == 0) goto L103
            goto L109
        L103:
            double[] r8 = r1.f24407k0
            r21 = r8[r2]
            double r19 = r21 + r19
        L109:
            r8 = r11
            r11 = r19
            float r11 = (float) r11
            double[] r12 = r1.f24408l0
            r19 = r11
            r11 = r12[r2]
            float r11 = (float) r11
            r12 = 1
            if (r2 == r12) goto L134
            r12 = 2
            if (r2 == r12) goto L130
            r12 = 3
            if (r2 == r12) goto L12c
            r12 = 4
            if (r2 == r12) goto L127
            r11 = 5
            if (r2 == r11) goto L124
            goto L137
        L124:
            r3 = r19
            goto L137
        L127:
            r16 = r11
            r17 = r19
            goto L137
        L12c:
            r5 = r11
            r15 = r19
            goto L137
        L130:
            r10 = r11
            r9 = r19
            goto L137
        L134:
            r4 = r11
            r6 = r19
        L137:
            int r2 = r2 + 1
            r11 = r8
            r8 = r18
            goto Le5
        L13d:
            r8 = r11
            boolean r1 = java.lang.Float.isNaN(r3)
            if (r1 == 0) goto L154
            r1 = 2143289344(0x7fc00000, float:NaN)
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L151
            r1 = 2143289344(0x7fc00000, float:NaN)
            r19 = r13
            goto L179
        L151:
            r19 = r13
            goto L17c
        L154:
            r1 = 2143289344(0x7fc00000, float:NaN)
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L15e
            r1 = 0
            goto L160
        L15e:
            r1 = 2143289344(0x7fc00000, float:NaN)
        L160:
            r2 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r2
            float r5 = r5 + r4
            float r16 = r16 / r2
            float r2 = r16 + r10
            double r10 = (double) r1
            double r3 = (double) r3
            double r1 = (double) r2
            r19 = r13
            double r12 = (double) r5
            double r1 = java.lang.Math.atan2(r1, r12)
            double r1 = java.lang.Math.toDegrees(r1)
            double r1 = r1 + r3
            double r1 = r1 + r10
            float r1 = (float) r1
        L179:
            r7.setRotation(r1)
        L17c:
            r1 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 + r1
            int r2 = (int) r6
            float r9 = r9 + r1
            int r1 = (int) r9
            float r6 = r6 + r15
            int r3 = (int) r6
            float r9 = r9 + r17
            int r4 = (int) r9
            int r5 = r3 - r2
            int r6 = r4 - r1
            int r9 = r24.getMeasuredWidth()
            if (r5 != r9) goto L19a
            int r9 = r24.getMeasuredHeight()
            if (r6 == r9) goto L198
            goto L19a
        L198:
            r9 = 0
            goto L19b
        L19a:
            r9 = 1
        L19b:
            if (r9 == 0) goto L1aa
            r9 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r9)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
            r7.measure(r5, r6)
        L1aa:
            r7.layout(r2, r1, r3, r4)
            java.util.HashMap<java.lang.String, u.r> r1 = r0.f24390w
            if (r1 == 0) goto L1ea
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L1b9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1ea
            java.lang.Object r2 = r1.next()
            u.r r2 = (p346u.AbstractC6273r) r2
            boolean r3 = r2 instanceof p346u.AbstractC6273r.d
            if (r3 == 0) goto L1b9
            u.r$d r2 = (p346u.AbstractC6273r.d) r2
            double[] r3 = r0.f24382o
            r4 = 0
            r5 = r3[r4]
            r9 = 1
            r9 = r3[r9]
            t.b r2 = r2.f24409a
            r11 = r19
            double r2 = r2.mo12531b(r11, r4)
            float r2 = (float) r2
            double r3 = java.lang.Math.atan2(r9, r5)
            double r3 = java.lang.Math.toDegrees(r3)
            float r3 = (float) r3
            float r2 = r2 + r3
            r7.setRotation(r2)
            goto L1b9
        L1ea:
            r11 = r19
            if (r8 == 0) goto L215
            double[] r1 = r0.f24382o
            r2 = 0
            r9 = r1[r2]
            r2 = 1
            r13 = r1[r2]
            r1 = r8
            r2 = r18
            r3 = r26
            r5 = r24
            r6 = r28
            float r1 = r1.m12904b(r2, r3, r5, r6)
            double r2 = java.lang.Math.atan2(r13, r9)
            double r2 = java.lang.Math.toDegrees(r2)
            float r2 = (float) r2
            float r1 = r1 + r2
            r7.setRotation(r1)
            boolean r1 = r8.f24424h
            r1 = r1 | r25
            goto L217
        L215:
            r1 = r25
        L217:
            r2 = 1
        L218:
            t.b[] r3 = r0.f24375h
            int r4 = r3.length
            if (r2 >= r4) goto L23c
            r3 = r3[r2]
            float[] r4 = r0.f24385r
            r3.mo12533d(r11, r4)
            u.q r3 = r0.f24371d
            java.util.LinkedHashMap<java.lang.String, y.a> r3 = r3.f24405i0
            java.lang.String[] r4 = r0.f24383p
            int r5 = r2 + (-1)
            r4 = r4[r5]
            java.lang.Object r3 = r3.get(r4)
            y.a r3 = (p422y.C7091a) r3
            float[] r4 = r0.f24385r
            r3.m14204g(r7, r4)
            int r2 = r2 + 1
            goto L218
        L23c:
            u.l r2 = r0.f24373f
            int r3 = r2.f24352Z
            if (r3 != 0) goto L25f
            r3 = 0
            int r3 = (r18 > r3 ? 1 : (r18 == r3 ? 0 : -1))
            if (r3 > 0) goto L248
            goto L250
        L248:
            r3 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r18 > r3 ? 1 : (r18 == r3 ? 0 : -1))
            if (r3 < 0) goto L253
            u.l r2 = r0.f24374g
        L250:
            int r2 = r2.f24353a0
            goto L25c
        L253:
            u.l r3 = r0.f24374g
            int r3 = r3.f24353a0
            int r2 = r2.f24353a0
            if (r3 == r2) goto L25f
            r2 = 0
        L25c:
            r7.setVisibility(r2)
        L25f:
            u.k[] r2 = r0.f24392y
            if (r2 == 0) goto L510
            r2 = 0
        L264:
            u.k[] r3 = r0.f24392y
            int r4 = r3.length
            if (r2 >= r4) goto L510
            r3 = r3[r2]
            int r4 = r3.f24336j
            r5 = -1
            if (r4 == r5) goto L2d2
            android.view.View r4 = r3.f24337k
            if (r4 != 0) goto L282
            android.view.ViewParent r4 = r24.getParent()
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r6 = r3.f24336j
            android.view.View r4 = r4.findViewById(r6)
            r3.f24337k = r4
        L282:
            android.graphics.RectF r4 = r3.f24348v
            android.view.View r6 = r3.f24337k
            boolean r8 = r3.f24347u
            r3.m12883e(r4, r6, r8)
            android.graphics.RectF r4 = r3.f24349w
            boolean r6 = r3.f24347u
            r3.m12883e(r4, r7, r6)
            android.graphics.RectF r4 = r3.f24348v
            android.graphics.RectF r6 = r3.f24349w
            boolean r4 = r4.intersect(r6)
            if (r4 == 0) goto L2b9
            boolean r4 = r3.f24339m
            if (r4 == 0) goto L2a5
            r4 = 0
            r3.f24339m = r4
            r6 = 1
            goto L2a7
        L2a5:
            r4 = 0
            r6 = 0
        L2a7:
            boolean r8 = r3.f24341o
            if (r8 == 0) goto L2b0
            r3.f24341o = r4
            r4 = 1
            r8 = 1
            goto L2b2
        L2b0:
            r4 = 1
            r8 = 0
        L2b2:
            r3.f24340n = r4
            r4 = 0
        L2b5:
            r9 = r18
            goto L35a
        L2b9:
            r4 = 1
            boolean r6 = r3.f24339m
            if (r6 != 0) goto L2c2
            r3.f24339m = r4
            r6 = 1
            goto L2c3
        L2c2:
            r6 = 0
        L2c3:
            boolean r8 = r3.f24340n
            if (r8 == 0) goto L2cc
            r8 = 0
            r3.f24340n = r8
            r8 = 1
            goto L2cd
        L2cc:
            r8 = 0
        L2cd:
            r3.f24341o = r4
            r4 = r8
            goto L357
        L2d2:
            boolean r4 = r3.f24339m
            if (r4 == 0) goto L2ea
            float r4 = r3.f24342p
            float r8 = r18 - r4
            float r6 = r3.f24346t
            float r6 = r6 - r4
            float r6 = r6 * r8
            r4 = 0
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 >= 0) goto L2fb
            r4 = 0
            r3.f24339m = r4
            r4 = 1
            r6 = 1
            goto L2fd
        L2ea:
            float r4 = r3.f24342p
            float r8 = r18 - r4
            float r4 = java.lang.Math.abs(r8)
            float r6 = r3.f24338l
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L2fb
            r4 = 1
            r3.f24339m = r4
        L2fb:
            r4 = 0
            r6 = 0
        L2fd:
            boolean r4 = r3.f24340n
            if (r4 == 0) goto L318
            float r4 = r3.f24342p
            float r8 = r18 - r4
            float r9 = r3.f24346t
            float r9 = r9 - r4
            float r9 = r9 * r8
            r4 = 0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 >= 0) goto L329
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 >= 0) goto L329
            r4 = 0
            r3.f24340n = r4
            r4 = 1
            goto L32a
        L318:
            float r4 = r3.f24342p
            float r8 = r18 - r4
            float r4 = java.lang.Math.abs(r8)
            float r8 = r3.f24338l
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 <= 0) goto L329
            r4 = 1
            r3.f24340n = r4
        L329:
            r4 = 0
        L32a:
            boolean r8 = r3.f24341o
            if (r8 == 0) goto L346
            float r8 = r3.f24342p
            float r9 = r18 - r8
            float r10 = r3.f24346t
            float r10 = r10 - r8
            float r10 = r10 * r9
            r8 = 0
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 >= 0) goto L357
            int r8 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r8 <= 0) goto L357
            r8 = 0
            r3.f24341o = r8
            r8 = 1
            goto L2b5
        L346:
            float r8 = r3.f24342p
            float r8 = r18 - r8
            float r8 = java.lang.Math.abs(r8)
            float r9 = r3.f24338l
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 <= 0) goto L357
            r8 = 1
            r3.f24341o = r8
        L357:
            r8 = 0
            goto L2b5
        L35a:
            r3.f24346t = r9
            if (r4 != 0) goto L362
            if (r6 != 0) goto L362
            if (r8 == 0) goto L389
        L362:
            android.view.ViewParent r10 = r24.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r10 = (androidx.constraintlayout.motion.widget.MotionLayout) r10
            int r11 = r3.f24335i
            androidx.constraintlayout.motion.widget.MotionLayout$h r12 = r10.f1531J0
            if (r12 == 0) goto L371
            r12.mo898c(r10, r11, r8, r9)
        L371:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionLayout$h> r12 = r10.f1548a1
            if (r12 == 0) goto L389
            java.util.Iterator r12 = r12.iterator()
        L379:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L389
            java.lang.Object r13 = r12.next()
            androidx.constraintlayout.motion.widget.MotionLayout$h r13 = (androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0325h) r13
            r13.mo898c(r10, r11, r8, r9)
            goto L379
        L389:
            int r10 = r3.f24332f
            if (r10 != r5) goto L38f
            r5 = r7
            goto L39b
        L38f:
            android.view.ViewParent r5 = r24.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r5 = (androidx.constraintlayout.motion.widget.MotionLayout) r5
            int r10 = r3.f24332f
            android.view.View r5 = r5.findViewById(r10)
        L39b:
            java.lang.String r10 = "Could not find method \""
            java.lang.String r11 = "Exception in call \""
            java.lang.String r12 = " "
            java.lang.String r13 = "\"on class "
            java.lang.String r14 = "KeyTrigger"
            if (r4 == 0) goto L420
            java.lang.String r4 = r3.f24333g
            if (r4 == 0) goto L420
            java.lang.reflect.Method r4 = r3.f24344r
            if (r4 != 0) goto L3ec
            java.lang.Class r4 = r5.getClass()     // Catch: java.lang.NoSuchMethodException -> L3c1
            java.lang.String r15 = r3.f24333g     // Catch: java.lang.NoSuchMethodException -> L3c1
            r25 = r1
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchMethodException -> L3c3
            java.lang.reflect.Method r1 = r4.getMethod(r15, r1)     // Catch: java.lang.NoSuchMethodException -> L3c3
            r3.f24344r = r1     // Catch: java.lang.NoSuchMethodException -> L3c3
            goto L3ee
        L3c1:
            r25 = r1
        L3c3:
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r10)
            java.lang.String r4 = r3.f24333g
            r1.append(r4)
            r1.append(r13)
            java.lang.Class r4 = r5.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r1.append(r4)
            r1.append(r12)
            java.lang.String r4 = p346u.C6256a.m12872c(r5)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r14, r1)
            goto L3ee
        L3ec:
            r25 = r1
        L3ee:
            java.lang.reflect.Method r1 = r3.f24344r     // Catch: java.lang.Exception -> L3f7
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L3f7
            r1.invoke(r5, r4)     // Catch: java.lang.Exception -> L3f7
            goto L422
        L3f7:
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r11)
            java.lang.String r4 = r3.f24333g
            r1.append(r4)
            r1.append(r13)
            java.lang.Class r4 = r5.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r1.append(r4)
            r1.append(r12)
            java.lang.String r4 = p346u.C6256a.m12872c(r5)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r14, r1)
            goto L422
        L420:
            r25 = r1
        L422:
            if (r8 == 0) goto L495
            java.lang.String r1 = r3.f24334h
            if (r1 == 0) goto L495
            java.lang.reflect.Method r1 = r3.f24345s
            if (r1 != 0) goto L464
            java.lang.Class r1 = r5.getClass()     // Catch: java.lang.NoSuchMethodException -> L43c
            java.lang.String r4 = r3.f24334h     // Catch: java.lang.NoSuchMethodException -> L43c
            r8 = 0
            java.lang.Class[] r8 = new java.lang.Class[r8]     // Catch: java.lang.NoSuchMethodException -> L43c
            java.lang.reflect.Method r1 = r1.getMethod(r4, r8)     // Catch: java.lang.NoSuchMethodException -> L43c
            r3.f24345s = r1     // Catch: java.lang.NoSuchMethodException -> L43c
            goto L464
        L43c:
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r10)
            java.lang.String r4 = r3.f24334h
            r1.append(r4)
            r1.append(r13)
            java.lang.Class r4 = r5.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r1.append(r4)
            r1.append(r12)
            java.lang.String r4 = p346u.C6256a.m12872c(r5)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r14, r1)
        L464:
            java.lang.reflect.Method r1 = r3.f24345s     // Catch: java.lang.Exception -> L46d
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L46d
            r1.invoke(r5, r4)     // Catch: java.lang.Exception -> L46d
            goto L495
        L46d:
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r11)
            java.lang.String r4 = r3.f24334h
            r1.append(r4)
            r1.append(r13)
            java.lang.Class r4 = r5.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r1.append(r4)
            r1.append(r12)
            java.lang.String r4 = p346u.C6256a.m12872c(r5)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r14, r1)
        L495:
            if (r6 == 0) goto L508
            java.lang.String r1 = r3.f24331e
            if (r1 == 0) goto L508
            java.lang.reflect.Method r1 = r3.f24343q
            if (r1 != 0) goto L4d7
            java.lang.Class r1 = r5.getClass()     // Catch: java.lang.NoSuchMethodException -> L4af
            java.lang.String r4 = r3.f24331e     // Catch: java.lang.NoSuchMethodException -> L4af
            r6 = 0
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch: java.lang.NoSuchMethodException -> L4af
            java.lang.reflect.Method r1 = r1.getMethod(r4, r6)     // Catch: java.lang.NoSuchMethodException -> L4af
            r3.f24343q = r1     // Catch: java.lang.NoSuchMethodException -> L4af
            goto L4d7
        L4af:
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r10)
            java.lang.String r4 = r3.f24331e
            r1.append(r4)
            r1.append(r13)
            java.lang.Class r4 = r5.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r1.append(r4)
            r1.append(r12)
            java.lang.String r4 = p346u.C6256a.m12872c(r5)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r14, r1)
        L4d7:
            java.lang.reflect.Method r1 = r3.f24343q     // Catch: java.lang.Exception -> L4e0
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L4e0
            r1.invoke(r5, r4)     // Catch: java.lang.Exception -> L4e0
            goto L508
        L4e0:
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r11)
            java.lang.String r3 = r3.f24331e
            r1.append(r3)
            r1.append(r13)
            java.lang.Class r3 = r5.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r1.append(r3)
            r1.append(r12)
            java.lang.String r3 = p346u.C6256a.m12872c(r5)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r14, r1)
        L508:
            int r2 = r2 + 1
            r1 = r25
            r18 = r9
            goto L264
        L510:
            r25 = r1
            r9 = r18
            goto L562
        L515:
            r9 = r8
            r25 = r12
            u.q r1 = r0.f24371d
            float r2 = r1.f24399c0
            u.q r3 = r0.f24372e
            float r4 = r3.f24399c0
            float r2 = p346u.C6268m.m12887a(r4, r2, r9, r2)
            float r4 = r1.f24400d0
            float r5 = r3.f24400d0
            float r4 = p346u.C6268m.m12887a(r5, r4, r9, r4)
            float r5 = r1.f24401e0
            float r6 = r3.f24401e0
            float r8 = p346u.C6268m.m12887a(r6, r5, r9, r5)
            float r1 = r1.f24402f0
            float r3 = r3.f24402f0
            float r10 = p346u.C6268m.m12887a(r3, r1, r9, r1)
            r11 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r11
            int r12 = (int) r2
            float r4 = r4 + r11
            int r11 = (int) r4
            float r2 = r2 + r8
            int r2 = (int) r2
            float r4 = r4 + r10
            int r4 = (int) r4
            int r8 = r2 - r12
            int r10 = r4 - r11
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 != 0) goto L552
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 == 0) goto L55f
        L552:
            r1 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r1)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r1)
            r7.measure(r3, r1)
        L55f:
            r7.layout(r12, r11, r2, r4)
        L562:
            r12 = r25
            java.util.HashMap<java.lang.String, u.f> r1 = r0.f24391x
            if (r1 == 0) goto L5a0
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L570:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5a0
            java.lang.Object r2 = r1.next()
            u.f r2 = (p346u.AbstractC6261f) r2
            boolean r3 = r2 instanceof p346u.AbstractC6261f.f
            if (r3 == 0) goto L59c
            u.f$f r2 = (p346u.AbstractC6261f.f) r2
            double[] r3 = r0.f24382o
            r4 = 0
            r4 = r3[r4]
            r6 = 1
            r10 = r3[r6]
            float r2 = r2.m12878a(r9)
            double r3 = java.lang.Math.atan2(r10, r4)
            double r3 = java.lang.Math.toDegrees(r3)
            float r3 = (float) r3
            float r2 = r2 + r3
            r7.setRotation(r2)
            goto L570
        L59c:
            r2.mo12879b(r7, r9)
            goto L570
        L5a0:
            return r12
    }

    /* renamed from: d */
    public final void m12892d(p346u.C6272q r5) {
            r4 = this;
            android.view.View r0 = r4.f24368a
            float r0 = r0.getX()
            int r0 = (int) r0
            float r0 = (float) r0
            android.view.View r1 = r4.f24368a
            float r1 = r1.getY()
            int r1 = (int) r1
            float r1 = (float) r1
            android.view.View r2 = r4.f24368a
            int r2 = r2.getWidth()
            float r2 = (float) r2
            android.view.View r3 = r4.f24368a
            int r3 = r3.getHeight()
            float r3 = (float) r3
            r5.m12897k(r0, r1, r2, r3)
            return
    }

    /* renamed from: e */
    public void m12893e(int r39, int r40, long r41) {
            r38 = this;
            r0 = r38
            java.lang.Class<double> r1 = double.class
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            int r6 = r0.f24393z
            r7 = -1
            if (r6 == r7) goto L26
            u.q r7 = r0.f24371d
            r7.f24404h0 = r6
        L26:
            u.l r6 = r0.f24373f
            u.l r7 = r0.f24374g
            float r8 = r6.f24351Y
            float r9 = r7.f24351Y
            boolean r8 = r6.m12885g(r8, r9)
            java.lang.String r9 = "alpha"
            if (r8 == 0) goto L39
            r3.add(r9)
        L39:
            float r8 = r6.f24354b0
            float r10 = r7.f24354b0
            boolean r8 = r6.m12885g(r8, r10)
            java.lang.String r10 = "elevation"
            if (r8 == 0) goto L48
            r3.add(r10)
        L48:
            int r8 = r6.f24353a0
            int r11 = r7.f24353a0
            if (r8 == r11) goto L59
            int r12 = r6.f24352Z
            if (r12 != 0) goto L59
            if (r8 == 0) goto L56
            if (r11 != 0) goto L59
        L56:
            r3.add(r9)
        L59:
            float r8 = r6.f24355c0
            float r11 = r7.f24355c0
            boolean r8 = r6.m12885g(r8, r11)
            java.lang.String r11 = "rotation"
            if (r8 == 0) goto L68
            r3.add(r11)
        L68:
            float r8 = r6.f24365m0
            boolean r8 = java.lang.Float.isNaN(r8)
            java.lang.String r12 = "transitionPathRotate"
            if (r8 == 0) goto L7a
            float r8 = r7.f24365m0
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 != 0) goto L7d
        L7a:
            r3.add(r12)
        L7d:
            float r8 = r6.f24366n0
            boolean r8 = java.lang.Float.isNaN(r8)
            java.lang.String r13 = "progress"
            if (r8 == 0) goto L8f
            float r8 = r7.f24366n0
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 != 0) goto L92
        L8f:
            r3.add(r13)
        L92:
            float r8 = r6.f24356d0
            float r14 = r7.f24356d0
            boolean r8 = r6.m12885g(r8, r14)
            java.lang.String r14 = "rotationX"
            if (r8 == 0) goto La1
            r3.add(r14)
        La1:
            float r8 = r6.f24357e0
            float r15 = r7.f24357e0
            boolean r8 = r6.m12885g(r8, r15)
            java.lang.String r15 = "rotationY"
            if (r8 == 0) goto Lb0
            r3.add(r15)
        Lb0:
            float r8 = r6.f24360h0
            r16 = r1
            float r1 = r7.f24360h0
            boolean r1 = r6.m12885g(r8, r1)
            java.lang.String r8 = "transformPivotX"
            if (r1 == 0) goto Lc1
            r3.add(r8)
        Lc1:
            float r1 = r6.f24361i0
            r17 = r14
            float r14 = r7.f24361i0
            boolean r1 = r6.m12885g(r1, r14)
            java.lang.String r14 = "transformPivotY"
            if (r1 == 0) goto Ld2
            r3.add(r14)
        Ld2:
            float r1 = r6.f24358f0
            r18 = r15
            float r15 = r7.f24358f0
            boolean r1 = r6.m12885g(r1, r15)
            java.lang.String r15 = "scaleX"
            if (r1 == 0) goto Le3
            r3.add(r15)
        Le3:
            float r1 = r6.f24359g0
            r19 = r13
            float r13 = r7.f24359g0
            boolean r1 = r6.m12885g(r1, r13)
            java.lang.String r13 = "scaleY"
            if (r1 == 0) goto Lf4
            r3.add(r13)
        Lf4:
            float r1 = r6.f24362j0
            r20 = r15
            float r15 = r7.f24362j0
            boolean r1 = r6.m12885g(r1, r15)
            java.lang.String r15 = "translationX"
            if (r1 == 0) goto L105
            r3.add(r15)
        L105:
            float r1 = r6.f24363k0
            r21 = r15
            float r15 = r7.f24363k0
            boolean r1 = r6.m12885g(r1, r15)
            java.lang.String r15 = "translationY"
            if (r1 == 0) goto L116
            r3.add(r15)
        L116:
            float r1 = r6.f24364l0
            float r7 = r7.f24364l0
            boolean r1 = r6.m12885g(r1, r7)
            java.lang.String r6 = "translationZ"
            if (r1 == 0) goto L125
            r3.add(r6)
        L125:
            java.util.ArrayList<u.c> r1 = r0.f24388u
            if (r1 == 0) goto L1d6
            java.util.Iterator r1 = r1.iterator()
            r7 = 0
        L12e:
            boolean r22 = r1.hasNext()
            if (r22 == 0) goto L1cd
            java.lang.Object r22 = r1.next()
            r23 = r1
            r1 = r22
            u.c r1 = (p346u.AbstractC6258c) r1
            r22 = r15
            boolean r15 = r1 instanceof p346u.C6263h
            if (r15 == 0) goto L194
            u.h r1 = (p346u.C6263h) r1
            u.q r15 = new u.q
            r30 = r6
            u.q r6 = r0.f24371d
            r31 = r13
            u.q r13 = r0.f24372e
            r24 = r15
            r25 = r39
            r26 = r40
            r27 = r1
            r28 = r6
            r29 = r13
            r24.<init>(r25, r26, r27, r28, r29)
            java.util.ArrayList<u.q> r6 = r0.f24386s
            int r6 = java.util.Collections.binarySearch(r6, r15)
            if (r6 != 0) goto L183
            java.lang.String r13 = " KeyPath positon \""
            java.lang.StringBuilder r13 = android.support.v4.media.C0144c.m256a(r13)
            r24 = r8
            float r8 = r15.f24398b0
            r13.append(r8)
            java.lang.String r8 = "\" outside of range"
            r13.append(r8)
            java.lang.String r8 = r13.toString()
            java.lang.String r13 = "MotionController"
            android.util.Log.e(r13, r8)
            goto L185
        L183:
            r24 = r8
        L185:
            java.util.ArrayList<u.q> r8 = r0.f24386s
            int r6 = -r6
            r13 = -1
            int r6 = r6 + r13
            r8.add(r6, r15)
            int r1 = r1.f24313e
            if (r1 == r13) goto L1c1
            r0.f24370c = r1
            goto L1c1
        L194:
            r30 = r6
            r24 = r8
            r31 = r13
            boolean r6 = r1 instanceof p346u.C6260e
            if (r6 == 0) goto L1a2
            r1.mo12875b(r4)
            goto L1c1
        L1a2:
            boolean r6 = r1 instanceof p346u.C6265j
            if (r6 == 0) goto L1aa
            r1.mo12875b(r2)
            goto L1c1
        L1aa:
            boolean r6 = r1 instanceof p346u.C6266k
            if (r6 == 0) goto L1bb
            if (r7 != 0) goto L1b5
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L1b5:
            u.k r1 = (p346u.C6266k) r1
            r7.add(r1)
            goto L1c1
        L1bb:
            r1.mo12877d(r5)
            r1.mo12875b(r3)
        L1c1:
            r15 = r22
            r1 = r23
            r8 = r24
            r6 = r30
            r13 = r31
            goto L12e
        L1cd:
            r30 = r6
            r24 = r8
            r31 = r13
            r22 = r15
            goto L1df
        L1d6:
            r30 = r6
            r24 = r8
            r31 = r13
            r22 = r15
            r7 = 0
        L1df:
            r1 = 0
            if (r7 == 0) goto L1ec
            u.k[] r1 = new p346u.C6266k[r1]
            java.lang.Object[] r1 = r7.toArray(r1)
            u.k[] r1 = (p346u.C6266k[]) r1
            r0.f24392y = r1
        L1ec:
            boolean r1 = r3.isEmpty()
            java.lang.String r6 = ","
            java.lang.String r7 = "waveOffset"
            java.lang.String r8 = "CUSTOM,"
            r23 = 4
            if (r1 != 0) goto L5f2
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.f24390w = r1
            java.util.Iterator r1 = r3.iterator()
        L205:
            boolean r25 = r1.hasNext()
            if (r25 == 0) goto L577
            java.lang.Object r25 = r1.next()
            r13 = r25
            java.lang.String r13 = (java.lang.String) r13
            boolean r25 = r13.startsWith(r8)
            if (r25 == 0) goto L275
            android.util.SparseArray r15 = new android.util.SparseArray
            r15.<init>()
            java.lang.String[] r25 = r13.split(r6)
            r26 = 1
            r27 = r1
            r1 = r25[r26]
            r25 = r4
            java.util.ArrayList<u.c> r4 = r0.f24388u
            java.util.Iterator r4 = r4.iterator()
        L230:
            boolean r26 = r4.hasNext()
            if (r26 == 0) goto L259
            java.lang.Object r26 = r4.next()
            r28 = r4
            r4 = r26
            u.c r4 = (p346u.AbstractC6258c) r4
            r26 = r3
            java.util.HashMap<java.lang.String, y.a> r3 = r4.f24248d
            if (r3 != 0) goto L247
            goto L254
        L247:
            java.lang.Object r3 = r3.get(r1)
            y.a r3 = (p422y.C7091a) r3
            if (r3 == 0) goto L254
            int r4 = r4.f24245a
            r15.append(r4, r3)
        L254:
            r3 = r26
            r4 = r28
            goto L230
        L259:
            r26 = r3
            u.r$b r1 = new u.r$b
            r1.<init>(r13, r15)
            r15 = r19
            r4 = r20
            r3 = r31
            r20 = r14
            r19 = r18
            r14 = r22
            r22 = r7
            r18 = r17
            r7 = r1
            r1 = r30
            goto L538
        L275:
            r27 = r1
            r26 = r3
            r25 = r4
            int r1 = r13.hashCode()
            switch(r1) {
                case -1249320806: goto L4b0;
                case -1249320805: goto L48d;
                case -1225497657: goto L468;
                case -1225497656: goto L449;
                case -1225497655: goto L429;
                case -1001078227: goto L3fb;
                case -908189618: goto L3c8;
                case -908189617: goto L39d;
                case -797520672: goto L375;
                case -760884510: goto L352;
                case -760884509: goto L332;
                case -40300674: goto L312;
                case -4379043: goto L2f3;
                case 37232917: goto L2d4;
                case 92909918: goto L2b5;
                case 156108012: goto L296;
                default: goto L282;
            }
        L282:
            r15 = r19
            r4 = r20
            r1 = r30
            r3 = r31
        L28a:
            r20 = r14
            r19 = r18
            r14 = r22
        L290:
            r22 = r7
        L292:
            r7 = r17
            goto L4cc
        L296:
            boolean r1 = r13.equals(r7)
            if (r1 != 0) goto L29d
            goto L282
        L29d:
            r1 = 15
            r15 = r19
            r4 = r20
            r1 = r30
            r3 = r31
            r20 = r14
            r19 = r18
            r14 = r22
            r22 = r7
            r7 = r17
            r17 = 15
            goto L4ce
        L2b5:
            boolean r1 = r13.equals(r9)
            if (r1 != 0) goto L2bc
            goto L282
        L2bc:
            r1 = 14
            r15 = r19
            r4 = r20
            r1 = r30
            r3 = r31
            r20 = r14
            r19 = r18
            r14 = r22
            r22 = r7
            r7 = r17
            r17 = 14
            goto L4ce
        L2d4:
            boolean r1 = r13.equals(r12)
            if (r1 != 0) goto L2db
            goto L282
        L2db:
            r1 = 13
            r15 = r19
            r4 = r20
            r1 = r30
            r3 = r31
            r20 = r14
            r19 = r18
            r14 = r22
            r22 = r7
            r7 = r17
            r17 = 13
            goto L4ce
        L2f3:
            boolean r1 = r13.equals(r10)
            if (r1 != 0) goto L2fa
            goto L282
        L2fa:
            r1 = 12
            r15 = r19
            r4 = r20
            r1 = r30
            r3 = r31
            r20 = r14
            r19 = r18
            r14 = r22
            r22 = r7
            r7 = r17
            r17 = 12
            goto L4ce
        L312:
            boolean r1 = r13.equals(r11)
            if (r1 != 0) goto L31a
            goto L282
        L31a:
            r1 = 11
            r15 = r19
            r4 = r20
            r1 = r30
            r3 = r31
            r20 = r14
            r19 = r18
            r14 = r22
            r22 = r7
            r7 = r17
            r17 = 11
            goto L4ce
        L332:
            boolean r1 = r13.equals(r14)
            if (r1 != 0) goto L33a
            goto L282
        L33a:
            r1 = 10
            r15 = r19
            r4 = r20
            r1 = r30
            r3 = r31
            r20 = r14
            r19 = r18
            r14 = r22
            r22 = r7
            r7 = r17
            r17 = 10
            goto L4ce
        L352:
            r1 = r24
            boolean r3 = r13.equals(r1)
            if (r3 != 0) goto L35b
            goto L37f
        L35b:
            r3 = 9
            r24 = r1
            r15 = r19
            r4 = r20
            r1 = r30
            r3 = r31
            r20 = r14
            r19 = r18
            r14 = r22
            r22 = r7
            r7 = r17
            r17 = 9
            goto L4ce
        L375:
            r1 = r24
            java.lang.String r3 = "waveVariesBy"
            boolean r3 = r13.equals(r3)
            if (r3 != 0) goto L383
        L37f:
            r24 = r1
            goto L282
        L383:
            r3 = 8
            r24 = r1
            r15 = r19
            r4 = r20
            r1 = r30
            r3 = r31
            r20 = r14
            r19 = r18
            r14 = r22
            r22 = r7
            r7 = r17
            r17 = 8
            goto L4ce
        L39d:
            r1 = r24
            r3 = r31
            boolean r4 = r13.equals(r3)
            if (r4 != 0) goto L3b1
            r24 = r1
            r15 = r19
            r4 = r20
            r1 = r30
            goto L28a
        L3b1:
            r4 = 7
            r24 = r1
            r15 = r19
            r4 = r20
            r1 = r30
            r20 = r14
            r19 = r18
            r14 = r22
            r22 = r7
            r7 = r17
            r17 = 7
            goto L4ce
        L3c8:
            r4 = r20
            r1 = r24
            r3 = r31
            boolean r15 = r13.equals(r4)
            if (r15 != 0) goto L3e6
            r24 = r1
            r20 = r14
            r15 = r19
            r14 = r22
            r1 = r30
        L3de:
            r22 = r7
        L3e0:
            r7 = r17
            r19 = r18
            goto L4cc
        L3e6:
            r15 = 6
            r24 = r1
            r20 = r14
            r15 = r19
            r14 = r22
            r1 = r30
            r22 = r7
            r7 = r17
            r19 = r18
            r17 = 6
            goto L4ce
        L3fb:
            r15 = r19
            r4 = r20
            r1 = r24
            r3 = r31
            boolean r19 = r13.equals(r15)
            if (r19 != 0) goto L415
            r24 = r1
            r20 = r14
            r19 = r18
            r14 = r22
            r1 = r30
            goto L290
        L415:
            r19 = 5
            r24 = r1
            r20 = r14
            r19 = r18
            r14 = r22
            r1 = r30
            r22 = r7
            r7 = r17
            r17 = 5
            goto L4ce
        L429:
            r15 = r19
            r4 = r20
            r1 = r30
            r3 = r31
            boolean r19 = r13.equals(r1)
            if (r19 != 0) goto L439
            goto L28a
        L439:
            r19 = 4
            r20 = r14
            r19 = r18
            r14 = r22
            r22 = r7
            r7 = r17
            r17 = 4
            goto L4ce
        L449:
            r15 = r19
            r4 = r20
            r1 = r30
            r3 = r31
            r20 = r14
            r14 = r22
            boolean r19 = r13.equals(r14)
            if (r19 != 0) goto L45c
            goto L3de
        L45c:
            r19 = 3
            r22 = r7
            r7 = r17
            r19 = r18
            r17 = 3
            goto L4ce
        L468:
            r15 = r19
            r4 = r20
            r1 = r30
            r3 = r31
            r20 = r14
            r14 = r22
            r22 = r7
            r7 = r21
            boolean r19 = r13.equals(r7)
            if (r19 != 0) goto L482
            r21 = r7
            goto L3e0
        L482:
            r19 = 2
            r21 = r7
            r7 = r17
            r19 = r18
            r17 = 2
            goto L4ce
        L48d:
            r15 = r19
            r4 = r20
            r1 = r30
            r3 = r31
            r20 = r14
            r14 = r22
            r22 = r7
            r7 = r18
            boolean r18 = r13.equals(r7)
            if (r18 != 0) goto L4a7
            r19 = r7
            goto L292
        L4a7:
            r18 = 1
            r19 = r7
            r7 = r17
            r17 = 1
            goto L4ce
        L4b0:
            r15 = r19
            r4 = r20
            r1 = r30
            r3 = r31
            r20 = r14
            r19 = r18
            r14 = r22
            r22 = r7
            r7 = r17
            boolean r17 = r13.equals(r7)
            if (r17 != 0) goto L4c9
            goto L4cc
        L4c9:
            r17 = 0
            goto L4ce
        L4cc:
            r17 = -1
        L4ce:
            switch(r17) {
                case 0: goto L52f;
                case 1: goto L529;
                case 2: goto L523;
                case 3: goto L51d;
                case 4: goto L517;
                case 5: goto L511;
                case 6: goto L50b;
                case 7: goto L505;
                case 8: goto L4ff;
                case 9: goto L4f9;
                case 10: goto L4f3;
                case 11: goto L4ed;
                case 12: goto L4e7;
                case 13: goto L4e1;
                case 14: goto L4db;
                case 15: goto L4d5;
                default: goto L4d1;
            }
        L4d1:
            r17 = 0
            goto L534
        L4d5:
            u.r$a r17 = new u.r$a
            r17.<init>()
            goto L534
        L4db:
            u.r$a r17 = new u.r$a
            r17.<init>()
            goto L534
        L4e1:
            u.r$d r17 = new u.r$d
            r17.<init>()
            goto L534
        L4e7:
            u.r$c r17 = new u.r$c
            r17.<init>()
            goto L534
        L4ed:
            u.r$h r17 = new u.r$h
            r17.<init>()
            goto L534
        L4f3:
            u.r$f r17 = new u.r$f
            r17.<init>()
            goto L534
        L4f9:
            u.r$e r17 = new u.r$e
            r17.<init>()
            goto L534
        L4ff:
            u.r$a r17 = new u.r$a
            r17.<init>()
            goto L534
        L505:
            u.r$l r17 = new u.r$l
            r17.<init>()
            goto L534
        L50b:
            u.r$k r17 = new u.r$k
            r17.<init>()
            goto L534
        L511:
            u.r$g r17 = new u.r$g
            r17.<init>()
            goto L534
        L517:
            u.r$o r17 = new u.r$o
            r17.<init>()
            goto L534
        L51d:
            u.r$n r17 = new u.r$n
            r17.<init>()
            goto L534
        L523:
            u.r$m r17 = new u.r$m
            r17.<init>()
            goto L534
        L529:
            u.r$j r17 = new u.r$j
            r17.<init>()
            goto L534
        L52f:
            u.r$i r17 = new u.r$i
            r17.<init>()
        L534:
            r18 = r7
            r7 = r17
        L538:
            if (r7 != 0) goto L554
            r30 = r1
            r31 = r3
            r17 = r18
            r18 = r19
            r7 = r22
            r3 = r26
            r1 = r27
            r22 = r14
            r19 = r15
            r14 = r20
            r20 = r4
            r4 = r25
            goto L205
        L554:
            r7.f24413e = r13
            r17 = r14
            java.util.HashMap<java.lang.String, u.r> r14 = r0.f24390w
            r14.put(r13, r7)
            r30 = r1
            r31 = r3
            r14 = r20
            r7 = r22
            r3 = r26
            r1 = r27
            r20 = r4
            r22 = r17
            r17 = r18
            r18 = r19
            r4 = r25
            r19 = r15
            goto L205
        L577:
            r26 = r3
            r25 = r4
            r15 = r19
            r4 = r20
            r1 = r30
            r3 = r31
            r19 = r18
            r18 = r17
            r17 = r22
            r22 = r7
            java.util.ArrayList<u.c> r7 = r0.f24388u
            if (r7 == 0) goto L5a9
            java.util.Iterator r7 = r7.iterator()
        L593:
            boolean r13 = r7.hasNext()
            if (r13 == 0) goto L5a9
            java.lang.Object r13 = r7.next()
            u.c r13 = (p346u.AbstractC6258c) r13
            boolean r14 = r13 instanceof p346u.C6259d
            if (r14 == 0) goto L593
            java.util.HashMap<java.lang.String, u.r> r14 = r0.f24390w
            r13.mo12874a(r14)
            goto L593
        L5a9:
            u.l r7 = r0.f24373f
            java.util.HashMap<java.lang.String, u.r> r13 = r0.f24390w
            r14 = 0
            r7.m12884e(r13, r14)
            u.l r7 = r0.f24374g
            java.util.HashMap<java.lang.String, u.r> r13 = r0.f24390w
            r14 = 100
            r7.m12884e(r13, r14)
            java.util.HashMap<java.lang.String, u.r> r7 = r0.f24390w
            java.util.Set r7 = r7.keySet()
            java.util.Iterator r7 = r7.iterator()
        L5c4:
            boolean r13 = r7.hasNext()
            if (r13 == 0) goto L606
            java.lang.Object r13 = r7.next()
            java.lang.String r13 = (java.lang.String) r13
            boolean r14 = r5.containsKey(r13)
            if (r14 == 0) goto L5e1
            java.lang.Object r14 = r5.get(r13)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            goto L5e2
        L5e1:
            r14 = 0
        L5e2:
            r20 = r7
            java.util.HashMap<java.lang.String, u.r> r7 = r0.f24390w
            java.lang.Object r7 = r7.get(r13)
            u.r r7 = (p346u.AbstractC6273r) r7
            r7.mo12902d(r14)
            r7 = r20
            goto L5c4
        L5f2:
            r26 = r3
            r25 = r4
            r15 = r19
            r4 = r20
            r1 = r30
            r3 = r31
            r19 = r18
            r18 = r17
            r17 = r22
            r22 = r7
        L606:
            boolean r7 = r2.isEmpty()
            java.lang.String r13 = "CUSTOM"
            if (r7 != 0) goto Lb10
            java.util.HashMap<java.lang.String, u.s> r7 = r0.f24389v
            if (r7 != 0) goto L619
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            r0.f24389v = r7
        L619:
            java.util.Iterator r2 = r2.iterator()
        L61d:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L81a
            java.lang.Object r7 = r2.next()
            java.lang.String r7 = (java.lang.String) r7
            java.util.HashMap<java.lang.String, u.s> r14 = r0.f24389v
            boolean r14 = r14.containsKey(r7)
            if (r14 == 0) goto L632
            goto L61d
        L632:
            boolean r14 = r7.startsWith(r8)
            if (r14 == 0) goto L68e
            android.util.SparseArray r14 = new android.util.SparseArray
            r14.<init>()
            java.lang.String[] r20 = r7.split(r6)
            r24 = 1
            r27 = r2
            r2 = r20[r24]
            r20 = r6
            java.util.ArrayList<u.c> r6 = r0.f24388u
            java.util.Iterator r6 = r6.iterator()
        L64f:
            boolean r24 = r6.hasNext()
            if (r24 == 0) goto L678
            java.lang.Object r24 = r6.next()
            r28 = r6
            r6 = r24
            u.c r6 = (p346u.AbstractC6258c) r6
            r24 = r8
            java.util.HashMap<java.lang.String, y.a> r8 = r6.f24248d
            if (r8 != 0) goto L666
            goto L673
        L666:
            java.lang.Object r8 = r8.get(r2)
            y.a r8 = (p422y.C7091a) r8
            if (r8 == 0) goto L673
            int r6 = r6.f24245a
            r14.append(r6, r8)
        L673:
            r8 = r24
            r6 = r28
            goto L64f
        L678:
            r24 = r8
            u.s$b r2 = new u.s$b
            r2.<init>(r7, r14)
            r30 = r1
            r14 = r18
            r8 = r19
            r6 = r21
            r18 = r5
            r5 = r2
            r1 = r41
            goto L7fe
        L68e:
            r27 = r2
            r20 = r6
            r24 = r8
            int r2 = r7.hashCode()
            switch(r2) {
                case -1249320806: goto L78a;
                case -1249320805: goto L775;
                case -1225497657: goto L75e;
                case -1225497656: goto L74a;
                case -1225497655: goto L736;
                case -1001078227: goto L721;
                case -908189618: goto L70d;
                case -908189617: goto L6f9;
                case -40300674: goto L6e4;
                case -4379043: goto L6cf;
                case 37232917: goto L6ba;
                case 92909918: goto L6a5;
                default: goto L69b;
            }
        L69b:
            r2 = r17
        L69d:
            r14 = r18
            r8 = r19
            r6 = r21
            goto L79c
        L6a5:
            boolean r2 = r7.equals(r9)
            if (r2 != 0) goto L6ac
            goto L69b
        L6ac:
            r2 = 11
            r2 = r17
            r14 = r18
            r8 = r19
            r6 = r21
            r17 = 11
            goto L79e
        L6ba:
            boolean r2 = r7.equals(r12)
            if (r2 != 0) goto L6c1
            goto L69b
        L6c1:
            r2 = 10
            r2 = r17
            r14 = r18
            r8 = r19
            r6 = r21
            r17 = 10
            goto L79e
        L6cf:
            boolean r2 = r7.equals(r10)
            if (r2 != 0) goto L6d6
            goto L69b
        L6d6:
            r2 = 9
            r2 = r17
            r14 = r18
            r8 = r19
            r6 = r21
            r17 = 9
            goto L79e
        L6e4:
            boolean r2 = r7.equals(r11)
            if (r2 != 0) goto L6eb
            goto L69b
        L6eb:
            r2 = 8
            r2 = r17
            r14 = r18
            r8 = r19
            r6 = r21
            r17 = 8
            goto L79e
        L6f9:
            boolean r2 = r7.equals(r3)
            if (r2 != 0) goto L700
            goto L69b
        L700:
            r2 = 7
            r2 = r17
            r14 = r18
            r8 = r19
            r6 = r21
            r17 = 7
            goto L79e
        L70d:
            boolean r2 = r7.equals(r4)
            if (r2 != 0) goto L714
            goto L69b
        L714:
            r2 = 6
            r2 = r17
            r14 = r18
            r8 = r19
            r6 = r21
            r17 = 6
            goto L79e
        L721:
            boolean r2 = r7.equals(r15)
            if (r2 != 0) goto L729
            goto L69b
        L729:
            r2 = 5
            r2 = r17
            r14 = r18
            r8 = r19
            r6 = r21
            r17 = 5
            goto L79e
        L736:
            boolean r2 = r7.equals(r1)
            if (r2 != 0) goto L73e
            goto L69b
        L73e:
            r2 = 4
            r2 = r17
            r14 = r18
            r8 = r19
            r6 = r21
            r17 = 4
            goto L79e
        L74a:
            r2 = r17
            boolean r6 = r7.equals(r2)
            if (r6 != 0) goto L754
            goto L69d
        L754:
            r6 = 3
            r14 = r18
            r8 = r19
            r6 = r21
            r17 = 3
            goto L79e
        L75e:
            r2 = r17
            r6 = r21
            boolean r8 = r7.equals(r6)
            if (r8 != 0) goto L76d
            r14 = r18
            r8 = r19
            goto L79c
        L76d:
            r8 = 2
            r14 = r18
            r8 = r19
            r17 = 2
            goto L79e
        L775:
            r2 = r17
            r8 = r19
            r6 = r21
            boolean r14 = r7.equals(r8)
            if (r14 != 0) goto L784
            r14 = r18
            goto L79c
        L784:
            r14 = 1
            r14 = r18
            r17 = 1
            goto L79e
        L78a:
            r2 = r17
            r14 = r18
            r8 = r19
            r6 = r21
            boolean r17 = r7.equals(r14)
            if (r17 != 0) goto L799
            goto L79c
        L799:
            r17 = 0
            goto L79e
        L79c:
            r17 = -1
        L79e:
            switch(r17) {
                case 0: goto L7ed;
                case 1: goto L7e7;
                case 2: goto L7e1;
                case 3: goto L7db;
                case 4: goto L7d5;
                case 5: goto L7cf;
                case 6: goto L7c9;
                case 7: goto L7c3;
                case 8: goto L7bd;
                case 9: goto L7b7;
                case 10: goto L7b1;
                case 11: goto L7ab;
                default: goto L7a1;
            }
        L7a1:
            r30 = r1
            r17 = r2
            r18 = r5
            r1 = r41
            r5 = 0
            goto L7fe
        L7ab:
            u.s$a r17 = new u.s$a
            r17.<init>()
            goto L7f2
        L7b1:
            u.s$d r17 = new u.s$d
            r17.<init>()
            goto L7f2
        L7b7:
            u.s$c r17 = new u.s$c
            r17.<init>()
            goto L7f2
        L7bd:
            u.s$f r17 = new u.s$f
            r17.<init>()
            goto L7f2
        L7c3:
            u.s$j r17 = new u.s$j
            r17.<init>()
            goto L7f2
        L7c9:
            u.s$i r17 = new u.s$i
            r17.<init>()
            goto L7f2
        L7cf:
            u.s$e r17 = new u.s$e
            r17.<init>()
            goto L7f2
        L7d5:
            u.s$m r17 = new u.s$m
            r17.<init>()
            goto L7f2
        L7db:
            u.s$l r17 = new u.s$l
            r17.<init>()
            goto L7f2
        L7e1:
            u.s$k r17 = new u.s$k
            r17.<init>()
            goto L7f2
        L7e7:
            u.s$h r17 = new u.s$h
            r17.<init>()
            goto L7f2
        L7ed:
            u.s$g r17 = new u.s$g
            r17.<init>()
        L7f2:
            r30 = r1
            r18 = r5
            r5 = r17
            r17 = r2
            r1 = r41
            r5.f24425i = r1
        L7fe:
            if (r5 != 0) goto L801
            goto L808
        L801:
            r5.f24422f = r7
            java.util.HashMap<java.lang.String, u.s> r1 = r0.f24389v
            r1.put(r7, r5)
        L808:
            r21 = r6
            r19 = r8
            r5 = r18
            r6 = r20
            r8 = r24
            r2 = r27
            r1 = r30
            r18 = r14
            goto L61d
        L81a:
            r30 = r1
            r24 = r8
            r14 = r18
            r8 = r19
            r6 = r21
            r18 = r5
            java.util.ArrayList<u.c> r1 = r0.f24388u
            if (r1 == 0) goto Lac3
            java.util.Iterator r1 = r1.iterator()
        L82e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lac3
            java.lang.Object r2 = r1.next()
            u.c r2 = (p346u.AbstractC6258c) r2
            boolean r5 = r2 instanceof p346u.C6265j
            if (r5 == 0) goto Laad
            u.j r2 = (p346u.C6265j) r2
            java.util.HashMap<java.lang.String, u.s> r5 = r0.f24389v
            java.util.Objects.requireNonNull(r2)
            java.util.Set r7 = r5.keySet()
            java.util.Iterator r7 = r7.iterator()
        L84d:
            boolean r19 = r7.hasNext()
            if (r19 == 0) goto Laad
            java.lang.Object r19 = r7.next()
            r41 = r1
            r1 = r19
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r19 = r5.get(r1)
            r31 = r19
            u.s r31 = (p346u.AbstractC6274s) r31
            boolean r19 = r1.startsWith(r13)
            if (r19 == 0) goto L8c2
            r19 = r5
            r5 = 7
            java.lang.String r1 = r1.substring(r5)
            java.util.HashMap<java.lang.String, y.a> r5 = r2.f24248d
            java.lang.Object r1 = r5.get(r1)
            y.a r1 = (p422y.C7091a) r1
            if (r1 == 0) goto L8bb
            r5 = r31
            u.s$b r5 = (p346u.AbstractC6274s.b) r5
            r42 = r7
            int r7 = r2.f24245a
            r20 = r13
            float r13 = r2.f24328s
            int r0 = r2.f24327r
            r21 = r14
            float r14 = r2.f24329t
            r27 = r2
            android.util.SparseArray<y.a> r2 = r5.f24428l
            r2.append(r7, r1)
            android.util.SparseArray<float[]> r1 = r5.f24429m
            r2 = 2
            float[] r2 = new float[r2]
            r28 = 0
            r2[r28] = r13
            r13 = 1
            r2[r13] = r14
            r1.append(r7, r2)
            int r1 = r5.f24418b
            int r0 = java.lang.Math.max(r1, r0)
            r5.f24418b = r0
            r0 = r38
            r1 = r41
            r7 = r42
            r5 = r19
            r13 = r20
            r14 = r21
            r2 = r27
            goto L84d
        L8bb:
            r0 = r38
            r1 = r41
            r5 = r19
            goto L84d
        L8c2:
            r27 = r2
            r19 = r5
            r42 = r7
            r20 = r13
            r21 = r14
            int r0 = r1.hashCode()
            switch(r0) {
                case -1249320806: goto L99e;
                case -1249320805: goto L98c;
                case -1225497657: goto L97c;
                case -1225497656: goto L96c;
                case -1225497655: goto L95a;
                case -1001078227: goto L949;
                case -908189618: goto L938;
                case -908189617: goto L927;
                case -40300674: goto L914;
                case -4379043: goto L901;
                case 37232917: goto L8ee;
                case 92909918: goto L8db;
                default: goto L8d3;
            }
        L8d3:
            r2 = r17
            r5 = r21
            r0 = r30
            goto L9ad
        L8db:
            boolean r0 = r1.equals(r9)
            if (r0 != 0) goto L8e2
            goto L8d3
        L8e2:
            r0 = 11
            r2 = r17
            r5 = r21
            r0 = r30
            r7 = 11
            goto L9ae
        L8ee:
            boolean r0 = r1.equals(r12)
            if (r0 != 0) goto L8f5
            goto L94f
        L8f5:
            r0 = 10
            r2 = r17
            r5 = r21
            r0 = r30
            r7 = 10
            goto L9ae
        L901:
            boolean r0 = r1.equals(r10)
            if (r0 != 0) goto L908
            goto L8d3
        L908:
            r0 = 9
            r2 = r17
            r5 = r21
            r0 = r30
            r7 = 9
            goto L9ae
        L914:
            boolean r0 = r1.equals(r11)
            if (r0 != 0) goto L91b
            goto L94f
        L91b:
            r0 = 8
            r2 = r17
            r5 = r21
            r0 = r30
            r7 = 8
            goto L9ae
        L927:
            boolean r0 = r1.equals(r3)
            if (r0 != 0) goto L92e
            goto L8d3
        L92e:
            r0 = 7
            r2 = r17
            r5 = r21
            r0 = r30
            r7 = 7
            goto L9ae
        L938:
            boolean r0 = r1.equals(r4)
            if (r0 != 0) goto L93f
            goto L94f
        L93f:
            r0 = 6
            r2 = r17
            r5 = r21
            r0 = r30
            r7 = 6
            goto L9ae
        L949:
            boolean r0 = r1.equals(r15)
            if (r0 != 0) goto L950
        L94f:
            goto L8d3
        L950:
            r0 = 5
            r2 = r17
            r5 = r21
            r0 = r30
            r7 = 5
            goto L9ae
        L95a:
            r0 = r30
            boolean r2 = r1.equals(r0)
            if (r2 != 0) goto L965
            r2 = r17
            goto L986
        L965:
            r2 = 4
            r2 = r17
            r5 = r21
            r7 = 4
            goto L9ae
        L96c:
            r2 = r17
            r0 = r30
            boolean r5 = r1.equals(r2)
            if (r5 != 0) goto L977
            goto L986
        L977:
            r5 = 3
            r5 = r21
            r7 = 3
            goto L9ae
        L97c:
            r2 = r17
            r0 = r30
            boolean r5 = r1.equals(r6)
            if (r5 != 0) goto L987
        L986:
            goto L996
        L987:
            r5 = 2
            r5 = r21
            r7 = 2
            goto L9ae
        L98c:
            r2 = r17
            r0 = r30
            boolean r5 = r1.equals(r8)
            if (r5 != 0) goto L999
        L996:
            r5 = r21
            goto L9ad
        L999:
            r5 = 1
            r5 = r21
            r7 = 1
            goto L9ae
        L99e:
            r2 = r17
            r5 = r21
            r0 = r30
            boolean r7 = r1.equals(r5)
            if (r7 != 0) goto L9ab
            goto L9ad
        L9ab:
            r7 = 0
            goto L9ae
        L9ad:
            r7 = -1
        L9ae:
            switch(r7) {
                case 0: goto La7a;
                case 1: goto La6b;
                case 2: goto La5c;
                case 3: goto La4d;
                case 4: goto La3e;
                case 5: goto La2f;
                case 6: goto La20;
                case 7: goto La10;
                case 8: goto La00;
                case 9: goto L9f0;
                case 10: goto L9e0;
                case 11: goto L9d0;
                default: goto L9b1;
            }
        L9b1:
            r7 = r27
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "UNKNOWN addValues \""
            r13.append(r14)
            r13.append(r1)
            java.lang.String r1 = "\""
            r13.append(r1)
            java.lang.String r1 = r13.toString()
            java.lang.String r13 = "KeyTimeCycles"
            android.util.Log.e(r13, r1)
            goto La9b
        L9d0:
            r7 = r27
            float r1 = r7.f24315f
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto La9b
            int r1 = r7.f24245a
            float r13 = r7.f24315f
            goto La88
        L9e0:
            r7 = r27
            float r1 = r7.f24320k
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto La9b
            int r1 = r7.f24245a
            float r13 = r7.f24320k
            goto La88
        L9f0:
            r7 = r27
            float r1 = r7.f24316g
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto La9b
            int r1 = r7.f24245a
            float r13 = r7.f24316g
            goto La88
        La00:
            r7 = r27
            float r1 = r7.f24317h
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto La9b
            int r1 = r7.f24245a
            float r13 = r7.f24317h
            goto La88
        La10:
            r7 = r27
            float r1 = r7.f24322m
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto La9b
            int r1 = r7.f24245a
            float r13 = r7.f24322m
            goto La88
        La20:
            r7 = r27
            float r1 = r7.f24321l
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto La9b
            int r1 = r7.f24245a
            float r13 = r7.f24321l
            goto La88
        La2f:
            r7 = r27
            float r1 = r7.f24326q
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto La9b
            int r1 = r7.f24245a
            float r13 = r7.f24326q
            goto La88
        La3e:
            r7 = r27
            float r1 = r7.f24325p
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto La9b
            int r1 = r7.f24245a
            float r13 = r7.f24325p
            goto La88
        La4d:
            r7 = r27
            float r1 = r7.f24324o
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto La9b
            int r1 = r7.f24245a
            float r13 = r7.f24324o
            goto La88
        La5c:
            r7 = r27
            float r1 = r7.f24323n
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto La9b
            int r1 = r7.f24245a
            float r13 = r7.f24323n
            goto La88
        La6b:
            r7 = r27
            float r1 = r7.f24319j
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto La9b
            int r1 = r7.f24245a
            float r13 = r7.f24319j
            goto La88
        La7a:
            r7 = r27
            float r1 = r7.f24318i
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto La9b
            int r1 = r7.f24245a
            float r13 = r7.f24318i
        La88:
            r32 = r1
            r33 = r13
            float r1 = r7.f24328s
            int r13 = r7.f24327r
            float r14 = r7.f24329t
            r34 = r1
            r35 = r13
            r36 = r14
            r31.mo12905c(r32, r33, r34, r35, r36)
        La9b:
            r1 = r41
            r30 = r0
            r17 = r2
            r14 = r5
            r2 = r7
            r5 = r19
            r13 = r20
            r0 = r38
            r7 = r42
            goto L84d
        Laad:
            r41 = r1
            r20 = r13
            r5 = r14
            r2 = r17
            r0 = r30
            r1 = r41
            r30 = r0
            r17 = r2
            r14 = r5
            r13 = r20
            r0 = r38
            goto L82e
        Lac3:
            r20 = r13
            r5 = r14
            r2 = r17
            r0 = r30
            r1 = r38
            java.util.HashMap<java.lang.String, u.s> r7 = r1.f24389v
            java.util.Set r7 = r7.keySet()
            java.util.Iterator r7 = r7.iterator()
        Lad6:
            boolean r13 = r7.hasNext()
            if (r13 == 0) goto Lb21
            java.lang.Object r13 = r7.next()
            java.lang.String r13 = (java.lang.String) r13
            r14 = r18
            boolean r17 = r14.containsKey(r13)
            if (r17 == 0) goto Lafb
            java.lang.Object r17 = r14.get(r13)
            java.lang.Integer r17 = (java.lang.Integer) r17
            int r17 = r17.intValue()
            r41 = r7
            r18 = r14
            r7 = r17
            goto Lb02
        Lafb:
            r17 = 0
            r41 = r7
            r18 = r14
            r7 = 0
        Lb02:
            java.util.HashMap<java.lang.String, u.s> r14 = r1.f24389v
            java.lang.Object r13 = r14.get(r13)
            u.s r13 = (p346u.AbstractC6274s) r13
            r13.mo12907e(r7)
            r7 = r41
            goto Lad6
        Lb10:
            r24 = r8
            r20 = r13
            r2 = r17
            r5 = r18
            r8 = r19
            r6 = r21
            r37 = r1
            r1 = r0
            r0 = r37
        Lb21:
            java.util.ArrayList<u.q> r7 = r1.f24386s
            int r7 = r7.size()
            int r7 = r7 + 2
            u.q[] r13 = new p346u.C6272q[r7]
            u.q r14 = r1.f24371d
            r17 = 0
            r13[r17] = r14
            int r14 = r7 + (-1)
            r17 = r5
            u.q r5 = r1.f24372e
            r13[r14] = r5
            java.util.ArrayList<u.q> r5 = r1.f24386s
            int r5 = r5.size()
            if (r5 <= 0) goto Lb49
            int r5 = r1.f24370c
            r14 = -1
            if (r5 != r14) goto Lb49
            r5 = 0
            r1.f24370c = r5
        Lb49:
            java.util.ArrayList<u.q> r5 = r1.f24386s
            java.util.Iterator r5 = r5.iterator()
            r14 = 1
        Lb50:
            boolean r18 = r5.hasNext()
            if (r18 == 0) goto Lb63
            java.lang.Object r18 = r5.next()
            u.q r18 = (p346u.C6272q) r18
            int r19 = r14 + 1
            r13[r14] = r18
            r14 = r19
            goto Lb50
        Lb63:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            u.q r14 = r1.f24372e
            java.util.LinkedHashMap<java.lang.String, y.a> r14 = r14.f24405i0
            java.util.Set r14 = r14.keySet()
            java.util.Iterator r14 = r14.iterator()
        Lb74:
            boolean r18 = r14.hasNext()
            if (r18 == 0) goto Lbbc
            java.lang.Object r18 = r14.next()
            r41 = r14
            r14 = r18
            java.lang.String r14 = (java.lang.String) r14
            r18 = r8
            u.q r8 = r1.f24371d
            java.util.LinkedHashMap<java.lang.String, y.a> r8 = r8.f24405i0
            boolean r8 = r8.containsKey(r14)
            if (r8 == 0) goto Lbaf
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r21 = r6
            r6 = r24
            r8.append(r6)
            r8.append(r14)
            java.lang.String r8 = r8.toString()
            r6 = r26
            boolean r8 = r6.contains(r8)
            if (r8 != 0) goto Lbb3
            r5.add(r14)
            goto Lbb3
        Lbaf:
            r21 = r6
            r6 = r26
        Lbb3:
            r14 = r41
            r26 = r6
            r8 = r18
            r6 = r21
            goto Lb74
        Lbbc:
            r21 = r6
            r18 = r8
            r6 = 0
            java.lang.String[] r6 = new java.lang.String[r6]
            java.lang.Object[] r5 = r5.toArray(r6)
            java.lang.String[] r5 = (java.lang.String[]) r5
            r1.f24383p = r5
            int r5 = r5.length
            int[] r5 = new int[r5]
            r1.f24384q = r5
            r5 = 0
        Lbd1:
            java.lang.String[] r6 = r1.f24383p
            int r8 = r6.length
            if (r5 >= r8) goto Lc07
            r6 = r6[r5]
            int[] r8 = r1.f24384q
            r14 = 0
            r8[r5] = r14
            r8 = 0
        Lbde:
            if (r8 >= r7) goto Lc04
            r14 = r13[r8]
            java.util.LinkedHashMap<java.lang.String, y.a> r14 = r14.f24405i0
            boolean r14 = r14.containsKey(r6)
            if (r14 == 0) goto Lc01
            int[] r14 = r1.f24384q
            r19 = r14[r5]
            r8 = r13[r8]
            java.util.LinkedHashMap<java.lang.String, y.a> r8 = r8.f24405i0
            java.lang.Object r6 = r8.get(r6)
            y.a r6 = (p422y.C7091a) r6
            int r6 = r6.m14203d()
            int r6 = r6 + r19
            r14[r5] = r6
            goto Lc04
        Lc01:
            int r8 = r8 + 1
            goto Lbde
        Lc04:
            int r5 = r5 + 1
            goto Lbd1
        Lc07:
            r5 = 0
            r5 = r13[r5]
            int r5 = r5.f24404h0
            r8 = -1
            if (r5 == r8) goto Lc11
            r5 = 1
            goto Lc12
        Lc11:
            r5 = 0
        Lc12:
            int r6 = r6.length
            int r6 = r6 + 18
            boolean[] r8 = new boolean[r6]
            r14 = 1
        Lc18:
            if (r14 >= r7) goto Lc86
            r19 = r2
            r2 = r13[r14]
            int r24 = r14 + (-1)
            r30 = r0
            r0 = r13[r24]
            java.util.Objects.requireNonNull(r2)
            r24 = 0
            boolean r26 = r8[r24]
            r27 = r15
            float r15 = r2.f24398b0
            r28 = r4
            float r4 = r0.f24398b0
            boolean r4 = r2.m12895g(r15, r4)
            r4 = r26 | r4
            r8[r24] = r4
            r4 = 1
            boolean r4 = r8[r4]
            float r15 = r2.f24399c0
            r31 = r3
            float r3 = r0.f24399c0
            boolean r3 = r2.m12895g(r15, r3)
            r3 = r3 | r5
            r3 = r3 | r4
            r4 = 1
            r8[r4] = r3
            r3 = 2
            boolean r3 = r8[r3]
            float r4 = r2.f24400d0
            float r15 = r0.f24400d0
            boolean r4 = r2.m12895g(r4, r15)
            r4 = r4 | r5
            r3 = r3 | r4
            r4 = 2
            r8[r4] = r3
            r3 = 3
            boolean r4 = r8[r3]
            float r15 = r2.f24401e0
            float r3 = r0.f24401e0
            boolean r3 = r2.m12895g(r15, r3)
            r3 = r3 | r4
            r4 = 3
            r8[r4] = r3
            boolean r3 = r8[r23]
            float r4 = r2.f24402f0
            float r0 = r0.f24402f0
            boolean r0 = r2.m12895g(r4, r0)
            r0 = r0 | r3
            r8[r23] = r0
            int r14 = r14 + 1
            r2 = r19
            r15 = r27
            r4 = r28
            r0 = r30
            r3 = r31
            goto Lc18
        Lc86:
            r30 = r0
            r19 = r2
            r31 = r3
            r28 = r4
            r27 = r15
            r0 = 0
            r2 = 1
        Lc92:
            if (r2 >= r6) goto Lc9d
            boolean r3 = r8[r2]
            if (r3 == 0) goto Lc9a
            int r0 = r0 + 1
        Lc9a:
            int r2 = r2 + 1
            goto Lc92
        Lc9d:
            int[] r2 = new int[r0]
            r1.f24380m = r2
            double[] r2 = new double[r0]
            r1.f24381n = r2
            double[] r0 = new double[r0]
            r1.f24382o = r0
            r0 = 0
            r2 = 1
        Lcab:
            if (r2 >= r6) goto Lcbb
            boolean r3 = r8[r2]
            if (r3 == 0) goto Lcb8
            int[] r3 = r1.f24380m
            int r4 = r0 + 1
            r3[r0] = r2
            r0 = r4
        Lcb8:
            int r2 = r2 + 1
            goto Lcab
        Lcbb:
            int[] r0 = r1.f24380m
            int r0 = r0.length
            r2 = 2
            int[] r2 = new int[r2]
            r3 = 1
            r2[r3] = r0
            r0 = 0
            r2[r0] = r7
            r3 = r16
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r3, r2)
            double[][] r2 = (double[][]) r2
            double[] r4 = new double[r7]
            r5 = 0
        Lcd2:
            if (r5 >= r7) goto Ld2f
            r6 = r13[r5]
            r8 = r2[r5]
            int[] r14 = r1.f24380m
            r15 = 6
            float[] r15 = new float[r15]
            r16 = r11
            float r11 = r6.f24398b0
            r15[r0] = r11
            float r0 = r6.f24399c0
            r11 = 1
            r15[r11] = r0
            float r0 = r6.f24400d0
            r11 = 2
            r15[r11] = r0
            float r0 = r6.f24401e0
            r11 = 3
            r15[r11] = r0
            float r0 = r6.f24402f0
            r15[r23] = r0
            float r0 = r6.f24403g0
            r6 = 5
            r15[r6] = r0
            r0 = 0
            r24 = 0
        Lcfe:
            int r6 = r14.length
            if (r0 >= r6) goto Ld22
            r6 = r14[r0]
            r11 = 6
            if (r6 >= r11) goto Ld16
            int r6 = r24 + 1
            r11 = r14[r0]
            r11 = r15[r11]
            r26 = r14
            r29 = r15
            double r14 = (double) r11
            r8[r24] = r14
            r24 = r6
            goto Ld1a
        Ld16:
            r26 = r14
            r29 = r15
        Ld1a:
            int r0 = r0 + 1
            r14 = r26
            r15 = r29
            r11 = 3
            goto Lcfe
        Ld22:
            r0 = r13[r5]
            float r0 = r0.f24397a0
            double r14 = (double) r0
            r4[r5] = r14
            int r5 = r5 + 1
            r0 = 0
            r11 = r16
            goto Lcd2
        Ld2f:
            r16 = r11
            r0 = 0
        Ld32:
            int[] r5 = r1.f24380m
            int r6 = r5.length
            if (r0 >= r6) goto Ld67
            r5 = r5[r0]
            java.lang.String[] r6 = p346u.C6272q.f24394m0
            int r8 = r6.length
            if (r5 >= r8) goto Ld64
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int[] r8 = r1.f24380m
            r8 = r8[r0]
            r6 = r6[r8]
            java.lang.String r8 = " ["
            java.lang.String r5 = p346u.C6269n.m12888a(r5, r6, r8)
            r6 = 0
        Ld50:
            if (r6 >= r7) goto Ld64
            java.lang.StringBuilder r5 = android.support.v4.media.C0144c.m256a(r5)
            r8 = r2[r6]
            r14 = r8[r0]
            r5.append(r14)
            java.lang.String r5 = r5.toString()
            int r6 = r6 + 1
            goto Ld50
        Ld64:
            int r0 = r0 + 1
            goto Ld32
        Ld67:
            java.lang.String[] r0 = r1.f24383p
            int r0 = r0.length
            int r0 = r0 + 1
            t.b[] r0 = new p331t.AbstractC6087b[r0]
            r1.f24375h = r0
            r0 = 0
        Ld71:
            java.lang.String[] r5 = r1.f24383p
            int r6 = r5.length
            if (r0 >= r6) goto Le3b
            r5 = r5[r0]
            r6 = 0
            r8 = 0
            r11 = 0
            r14 = 0
        Ld7c:
            if (r6 >= r7) goto Le1b
            r15 = r13[r6]
            java.util.LinkedHashMap<java.lang.String, y.a> r15 = r15.f24405i0
            boolean r15 = r15.containsKey(r5)
            if (r15 == 0) goto Le07
            if (r14 != 0) goto Ldaa
            double[] r11 = new double[r7]
            r14 = r13[r6]
            java.util.LinkedHashMap<java.lang.String, y.a> r14 = r14.f24405i0
            java.lang.Object r14 = r14.get(r5)
            y.a r14 = (p422y.C7091a) r14
            int r14 = r14.m14203d()
            r15 = 2
            int[] r15 = new int[r15]
            r23 = 1
            r15[r23] = r14
            r14 = 0
            r15[r14] = r7
            java.lang.Object r14 = java.lang.reflect.Array.newInstance(r3, r15)
            double[][] r14 = (double[][]) r14
        Ldaa:
            r15 = r13[r6]
            float r15 = r15.f24397a0
            r23 = r9
            r24 = r10
            double r9 = (double) r15
            r11[r8] = r9
            r9 = r13[r6]
            r10 = r14[r8]
            java.util.LinkedHashMap<java.lang.String, y.a> r9 = r9.f24405i0
            java.lang.Object r9 = r9.get(r5)
            y.a r9 = (p422y.C7091a) r9
            int r15 = r9.m14203d()
            r39 = r5
            r5 = 1
            if (r15 != r5) goto Ldd9
            float r5 = r9.m14201b()
            r40 = r14
            double r14 = (double) r5
            r5 = 0
            r10[r5] = r14
        Ldd4:
            r42 = r11
            r29 = r12
            goto Le00
        Ldd9:
            r40 = r14
            int r5 = r9.m14203d()
            float[] r14 = new float[r5]
            r9.m14202c(r14)
            r9 = 0
            r15 = 0
        Lde6:
            if (r9 >= r5) goto Ldd4
            int r26 = r15 + 1
            r41 = r5
            r5 = r14[r9]
            r42 = r11
            r29 = r12
            double r11 = (double) r5
            r10[r15] = r11
            int r9 = r9 + 1
            r5 = r41
            r11 = r42
            r15 = r26
            r12 = r29
            goto Lde6
        Le00:
            int r8 = r8 + 1
            r14 = r40
            r11 = r42
            goto Le0f
        Le07:
            r39 = r5
            r23 = r9
            r24 = r10
            r29 = r12
        Le0f:
            int r6 = r6 + 1
            r5 = r39
            r9 = r23
            r10 = r24
            r12 = r29
            goto Ld7c
        Le1b:
            r23 = r9
            r24 = r10
            r29 = r12
            double[] r5 = java.util.Arrays.copyOf(r11, r8)
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r14, r8)
            double[][] r6 = (double[][]) r6
            t.b[] r8 = r1.f24375h
            int r0 = r0 + 1
            int r9 = r1.f24370c
            t.b r5 = p331t.AbstractC6087b.m12541a(r9, r5, r6)
            r8[r0] = r5
            r9 = r23
            goto Ld71
        Le3b:
            r23 = r9
            r24 = r10
            r29 = r12
            t.b[] r0 = r1.f24375h
            int r5 = r1.f24370c
            t.b r2 = p331t.AbstractC6087b.m12541a(r5, r4, r2)
            r4 = 0
            r0[r4] = r2
            r0 = r13[r4]
            int r0 = r0.f24404h0
            r2 = -1
            if (r0 == r2) goto Le93
            int[] r0 = new int[r7]
            double[] r2 = new double[r7]
            r5 = 2
            int[] r6 = new int[r5]
            r8 = 1
            r6[r8] = r5
            r6[r4] = r7
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r3, r6)
            double[][] r3 = (double[][]) r3
            r4 = 0
        Le66:
            if (r4 >= r7) goto Le8c
            r5 = r13[r4]
            int r5 = r5.f24404h0
            r0[r4] = r5
            r5 = r13[r4]
            float r5 = r5.f24397a0
            double r5 = (double) r5
            r2[r4] = r5
            r5 = r3[r4]
            r6 = r13[r4]
            float r6 = r6.f24399c0
            double r8 = (double) r6
            r6 = 0
            r5[r6] = r8
            r5 = r3[r4]
            r6 = r13[r4]
            float r6 = r6.f24400d0
            double r8 = (double) r6
            r6 = 1
            r5[r6] = r8
            int r4 = r4 + 1
            goto Le66
        Le8c:
            t.a r4 = new t.a
            r4.<init>(r0, r2, r3)
            r1.f24376i = r4
        Le93:
            r0 = 2143289344(0x7fc00000, float:NaN)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.f24391x = r2
            java.util.ArrayList<u.c> r2 = r1.f24388u
            if (r2 == 0) goto L153f
            java.util.Iterator r2 = r25.iterator()
        Lea4:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L120a
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            r4 = r20
            boolean r5 = r3.startsWith(r4)
            if (r5 == 0) goto Led8
            u.f$c r5 = new u.f$c
            r5.<init>()
            r39 = r2
            r2 = r5
            r9 = r16
            r14 = r19
            r15 = r21
            r5 = r22
            r6 = r23
            r8 = r24
            r12 = r27
            r11 = r28
            r7 = r29
            r13 = r30
            r10 = r31
            goto L11b3
        Led8:
            int r5 = r3.hashCode()
            switch(r5) {
                case -1249320806: goto L112f;
                case -1249320805: goto L1103;
                case -1225497657: goto L10df;
                case -1225497656: goto L10b2;
                case -1225497655: goto L1086;
                case -1001078227: goto L1055;
                case -908189618: goto L102d;
                case -908189617: goto Lffa;
                case -797520672: goto Lfd1;
                case -40300674: goto Lfaa;
                case -4379043: goto Lf7e;
                case 37232917: goto Lf55;
                case 92909918: goto Lf2c;
                case 156108012: goto Lefb;
                default: goto Ledf;
            }
        Ledf:
            r39 = r2
            r9 = r16
            r2 = r17
            r14 = r19
            r15 = r21
            r5 = r22
        Leeb:
            r6 = r23
            r8 = r24
            r12 = r27
            r11 = r28
            r7 = r29
            r13 = r30
            r10 = r31
            goto L1153
        Lefb:
            r5 = r22
            boolean r6 = r3.equals(r5)
            if (r6 != 0) goto Lf0e
            r39 = r2
            r9 = r16
            r2 = r17
            r14 = r19
            r15 = r21
            goto Leeb
        Lf0e:
            r6 = 13
            r39 = r2
            r9 = r16
            r2 = r17
            r14 = r19
            r15 = r21
            r6 = r23
            r8 = r24
            r12 = r27
            r11 = r28
            r7 = r29
            r13 = r30
            r10 = r31
            r16 = 13
            goto L1155
        Lf2c:
            r5 = r22
            r6 = r23
            boolean r7 = r3.equals(r6)
            if (r7 != 0) goto Lf39
            r7 = r29
            goto Lf61
        Lf39:
            r7 = 12
            r39 = r2
            r9 = r16
            r2 = r17
            r14 = r19
            r15 = r21
            r8 = r24
            r12 = r27
            r11 = r28
            r7 = r29
            r13 = r30
            r10 = r31
            r16 = 12
            goto L1155
        Lf55:
            r5 = r22
            r6 = r23
            r7 = r29
            boolean r8 = r3.equals(r7)
            if (r8 != 0) goto Lf64
        Lf61:
            r8 = r24
            goto Lf8c
        Lf64:
            r8 = 11
            r39 = r2
            r9 = r16
            r2 = r17
            r14 = r19
            r15 = r21
            r8 = r24
            r12 = r27
            r11 = r28
            r13 = r30
            r10 = r31
            r16 = 11
            goto L1155
        Lf7e:
            r5 = r22
            r6 = r23
            r8 = r24
            r7 = r29
            boolean r9 = r3.equals(r8)
            if (r9 != 0) goto Lf92
        Lf8c:
            r9 = r16
        Lf8e:
            r10 = r31
            goto L100c
        Lf92:
            r9 = 10
            r39 = r2
            r9 = r16
            r2 = r17
            r14 = r19
            r15 = r21
            r12 = r27
            r11 = r28
            r13 = r30
            r10 = r31
            r16 = 10
            goto L1155
        Lfaa:
            r9 = r16
            r5 = r22
            r6 = r23
            r8 = r24
            r7 = r29
            boolean r10 = r3.equals(r9)
            if (r10 != 0) goto Lfbb
            goto Lfe3
        Lfbb:
            r10 = 9
            r39 = r2
            r2 = r17
            r14 = r19
            r15 = r21
            r12 = r27
            r11 = r28
            r13 = r30
            r10 = r31
            r16 = 9
            goto L1155
        Lfd1:
            r9 = r16
            r5 = r22
            r6 = r23
            r8 = r24
            r7 = r29
            java.lang.String r10 = "waveVariesBy"
            boolean r10 = r3.equals(r10)
            if (r10 != 0) goto Lfe4
        Lfe3:
            goto Lf8e
        Lfe4:
            r10 = 8
            r39 = r2
            r2 = r17
            r14 = r19
            r15 = r21
            r12 = r27
            r11 = r28
            r13 = r30
            r10 = r31
            r16 = 8
            goto L1155
        Lffa:
            r9 = r16
            r5 = r22
            r6 = r23
            r8 = r24
            r7 = r29
            r10 = r31
            boolean r11 = r3.equals(r10)
            if (r11 != 0) goto L101a
        L100c:
            r39 = r2
            r2 = r17
            r14 = r19
            r15 = r21
            r12 = r27
            r11 = r28
            goto L1073
        L101a:
            r11 = 7
            r39 = r2
            r2 = r17
            r14 = r19
            r15 = r21
            r12 = r27
            r11 = r28
            r13 = r30
            r16 = 7
            goto L1155
        L102d:
            r9 = r16
            r5 = r22
            r6 = r23
            r8 = r24
            r11 = r28
            r7 = r29
            r10 = r31
            boolean r12 = r3.equals(r11)
            if (r12 != 0) goto L1044
            r12 = r27
            goto L106b
        L1044:
            r12 = 6
            r39 = r2
            r2 = r17
            r14 = r19
            r15 = r21
            r12 = r27
            r13 = r30
            r16 = 6
            goto L1155
        L1055:
            r9 = r16
            r5 = r22
            r6 = r23
            r8 = r24
            r12 = r27
            r11 = r28
            r7 = r29
            r10 = r31
            boolean r13 = r3.equals(r12)
            if (r13 != 0) goto L1077
        L106b:
            r39 = r2
            r2 = r17
            r14 = r19
            r15 = r21
        L1073:
            r13 = r30
            goto L1153
        L1077:
            r13 = 5
            r39 = r2
            r2 = r17
            r14 = r19
            r15 = r21
            r13 = r30
            r16 = 5
            goto L1155
        L1086:
            r9 = r16
            r5 = r22
            r6 = r23
            r8 = r24
            r12 = r27
            r11 = r28
            r7 = r29
            r13 = r30
            r10 = r31
            boolean r14 = r3.equals(r13)
            if (r14 != 0) goto L10a5
            r39 = r2
            r2 = r17
            r14 = r19
            goto L10d0
        L10a5:
            r14 = 4
            r39 = r2
            r2 = r17
            r14 = r19
            r15 = r21
            r16 = 4
            goto L1155
        L10b2:
            r9 = r16
            r14 = r19
            r5 = r22
            r6 = r23
            r8 = r24
            r12 = r27
            r11 = r28
            r7 = r29
            r13 = r30
            r10 = r31
            boolean r15 = r3.equals(r14)
            if (r15 != 0) goto L10d4
            r39 = r2
            r2 = r17
        L10d0:
            r15 = r21
            goto L1153
        L10d4:
            r15 = 3
            r39 = r2
            r2 = r17
            r15 = r21
            r16 = 3
            goto L1155
        L10df:
            r9 = r16
            r14 = r19
            r15 = r21
            r5 = r22
            r6 = r23
            r8 = r24
            r12 = r27
            r11 = r28
            r7 = r29
            r13 = r30
            r10 = r31
            boolean r16 = r3.equals(r15)
            if (r16 != 0) goto L10fe
            r39 = r2
            goto L1125
        L10fe:
            r16 = 2
            r39 = r2
            goto L112c
        L1103:
            r39 = r2
            r9 = r16
            r2 = r18
            r14 = r19
            r15 = r21
            r5 = r22
            r6 = r23
            r8 = r24
            r12 = r27
            r11 = r28
            r7 = r29
            r13 = r30
            r10 = r31
            boolean r16 = r3.equals(r2)
            if (r16 != 0) goto L1128
            r18 = r2
        L1125:
            r2 = r17
            goto L1153
        L1128:
            r16 = 1
            r18 = r2
        L112c:
            r2 = r17
            goto L1155
        L112f:
            r39 = r2
            r9 = r16
            r2 = r17
            r14 = r19
            r15 = r21
            r5 = r22
            r6 = r23
            r8 = r24
            r12 = r27
            r11 = r28
            r7 = r29
            r13 = r30
            r10 = r31
            boolean r16 = r3.equals(r2)
            if (r16 != 0) goto L1150
            goto L1153
        L1150:
            r16 = 0
            goto L1155
        L1153:
            r16 = -1
        L1155:
            switch(r16) {
                case 0: goto L11ad;
                case 1: goto L11a7;
                case 2: goto L11a1;
                case 3: goto L119b;
                case 4: goto L1195;
                case 5: goto L118f;
                case 6: goto L1189;
                case 7: goto L1183;
                case 8: goto L117d;
                case 9: goto L1177;
                case 10: goto L1171;
                case 11: goto L116b;
                case 12: goto L1165;
                case 13: goto L115f;
                default: goto L1158;
            }
        L1158:
            r16 = 0
        L115a:
            r17 = r2
            r2 = r16
            goto L11b3
        L115f:
            u.f$b r16 = new u.f$b
            r16.<init>()
            goto L115a
        L1165:
            u.f$b r16 = new u.f$b
            r16.<init>()
            goto L115a
        L116b:
            u.f$f r16 = new u.f$f
            r16.<init>()
            goto L115a
        L1171:
            u.f$e r16 = new u.f$e
            r16.<init>()
            goto L115a
        L1177:
            u.f$h r16 = new u.f$h
            r16.<init>()
            goto L115a
        L117d:
            u.f$b r16 = new u.f$b
            r16.<init>()
            goto L115a
        L1183:
            u.f$l r16 = new u.f$l
            r16.<init>()
            goto L115a
        L1189:
            u.f$k r16 = new u.f$k
            r16.<init>()
            goto L115a
        L118f:
            u.f$g r16 = new u.f$g
            r16.<init>()
            goto L115a
        L1195:
            u.f$o r16 = new u.f$o
            r16.<init>()
            goto L115a
        L119b:
            u.f$n r16 = new u.f$n
            r16.<init>()
            goto L115a
        L11a1:
            u.f$m r16 = new u.f$m
            r16.<init>()
            goto L115a
        L11a7:
            u.f$j r16 = new u.f$j
            r16.<init>()
            goto L115a
        L11ad:
            u.f$i r16 = new u.f$i
            r16.<init>()
            goto L115a
        L11b3:
            if (r2 != 0) goto L11d1
            r2 = r39
            r20 = r4
            r22 = r5
            r23 = r6
            r29 = r7
            r24 = r8
            r16 = r9
            r31 = r10
            r28 = r11
            r27 = r12
            r30 = r13
            r19 = r14
            r21 = r15
            goto Lea4
        L11d1:
            r21 = r15
            int r15 = r2.f24287e
            r22 = r14
            r14 = 1
            if (r15 != r14) goto L11dc
            r14 = 1
            goto L11dd
        L11dc:
            r14 = 0
        L11dd:
            if (r14 == 0) goto L11e9
            boolean r14 = java.lang.Float.isNaN(r0)
            if (r14 == 0) goto L11e9
            float r0 = r38.m12890b()
        L11e9:
            r2.f24285c = r3
            java.util.HashMap<java.lang.String, u.f> r14 = r1.f24391x
            r14.put(r3, r2)
            r2 = r39
            r20 = r4
            r23 = r6
            r29 = r7
            r24 = r8
            r16 = r9
            r31 = r10
            r28 = r11
            r27 = r12
            r30 = r13
            r19 = r22
            r22 = r5
            goto Lea4
        L120a:
            r9 = r16
            r4 = r20
            r5 = r22
            r6 = r23
            r8 = r24
            r12 = r27
            r11 = r28
            r7 = r29
            r13 = r30
            r10 = r31
            r22 = r19
            java.util.ArrayList<u.c> r2 = r1.f24388u
            java.util.Iterator r2 = r2.iterator()
        L1226:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1520
            java.lang.Object r3 = r2.next()
            u.c r3 = (p346u.AbstractC6258c) r3
            boolean r14 = r3 instanceof p346u.C6260e
            if (r14 == 0) goto L14ec
            u.e r3 = (p346u.C6260e) r3
            java.util.HashMap<java.lang.String, u.f> r14 = r1.f24391x
            java.util.Objects.requireNonNull(r3)
            java.util.Set r15 = r14.keySet()
            java.util.Iterator r15 = r15.iterator()
        L1245:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L14ec
            java.lang.Object r16 = r15.next()
            r39 = r2
            r2 = r16
            java.lang.String r2 = (java.lang.String) r2
            boolean r16 = r2.startsWith(r4)
            if (r16 == 0) goto L12c9
            r20 = r4
            r4 = 7
            java.lang.String r4 = r2.substring(r4)
            r40 = r15
            java.util.HashMap<java.lang.String, y.a> r15 = r3.f24248d
            java.lang.Object r4 = r15.get(r4)
            y.a r4 = (p422y.C7091a) r4
            if (r4 == 0) goto L12a7
            int r15 = r4.f27433b
            r41 = r0
            r0 = 2
            if (r15 != r0) goto L12a9
            java.lang.Object r0 = r14.get(r2)
            u.f r0 = (p346u.AbstractC6261f) r0
            int r2 = r3.f24245a
            int r15 = r3.f24266f
            int r1 = r3.f24270j
            r16 = r14
            float r14 = r3.f24267g
            r30 = r13
            float r13 = r3.f24268h
            r42 = r3
            float r3 = r4.m14201b()
            r19 = r12
            java.util.ArrayList<u.f$p> r12 = r0.f24288f
            r28 = r11
            u.f$p r11 = new u.f$p
            r11.<init>(r2, r14, r13, r3)
            r12.add(r11)
            r2 = -1
            if (r1 == r2) goto L12a2
            r0.f24287e = r1
        L12a2:
            r0.f24286d = r15
            r0.f24284b = r4
            goto L12b3
        L12a7:
            r41 = r0
        L12a9:
            r42 = r3
            r28 = r11
            r19 = r12
            r30 = r13
            r16 = r14
        L12b3:
            r1 = r38
            r2 = r39
            r15 = r40
            r0 = r41
            r3 = r42
            r14 = r16
            r12 = r19
            r4 = r20
            r11 = r28
        L12c5:
            r13 = r30
            goto L1245
        L12c9:
            r41 = r0
            r42 = r3
            r20 = r4
            r28 = r11
            r19 = r12
            r30 = r13
            r16 = r14
            r40 = r15
            int r0 = r2.hashCode()
            switch(r0) {
                case -1249320806: goto L1403;
                case -1249320805: goto L13e9;
                case -1225497657: goto L13cd;
                case -1225497656: goto L13ae;
                case -1225497655: goto L138c;
                case -1001078227: goto L1368;
                case -908189618: goto L1349;
                case -908189617: goto L1330;
                case -40300674: goto L1316;
                case -4379043: goto L130c;
                case 37232917: goto L1302;
                case 92909918: goto L12f8;
                case 156108012: goto L12ee;
                default: goto L12e0;
            }
        L12e0:
            r13 = r17
            r12 = r18
            r1 = r19
            r11 = r21
            r4 = r22
            r0 = r28
            goto L137a
        L12ee:
            boolean r0 = r2.equals(r5)
            if (r0 != 0) goto L12f5
            goto L12e0
        L12f5:
            r0 = 12
            goto L131f
        L12f8:
            boolean r0 = r2.equals(r6)
            if (r0 != 0) goto L12ff
            goto L12e0
        L12ff:
            r0 = 11
            goto L131f
        L1302:
            boolean r0 = r2.equals(r7)
            if (r0 != 0) goto L1309
            goto L12e0
        L1309:
            r0 = 10
            goto L131f
        L130c:
            boolean r0 = r2.equals(r8)
            if (r0 != 0) goto L1313
            goto L12e0
        L1313:
            r0 = 9
            goto L131f
        L1316:
            boolean r0 = r2.equals(r9)
            if (r0 != 0) goto L131d
            goto L12e0
        L131d:
            r0 = 8
        L131f:
            r14 = r0
            r13 = r17
            r12 = r18
            r1 = r19
            r11 = r21
            r4 = r22
            r0 = r28
            r3 = r30
            goto L141b
        L1330:
            boolean r0 = r2.equals(r10)
            if (r0 != 0) goto L1337
            goto L12e0
        L1337:
            r0 = 7
            r13 = r17
            r12 = r18
            r1 = r19
            r11 = r21
            r4 = r22
            r0 = r28
            r3 = r30
            r14 = 7
            goto L141b
        L1349:
            r0 = r28
            boolean r1 = r2.equals(r0)
            if (r1 != 0) goto L1358
            r13 = r17
            r12 = r18
            r1 = r19
            goto L1376
        L1358:
            r1 = 6
            r13 = r17
            r12 = r18
            r1 = r19
            r11 = r21
            r4 = r22
            r3 = r30
            r14 = 6
            goto L141b
        L1368:
            r1 = r19
            r0 = r28
            boolean r3 = r2.equals(r1)
            if (r3 != 0) goto L137e
            r13 = r17
            r12 = r18
        L1376:
            r11 = r21
            r4 = r22
        L137a:
            r3 = r30
            goto L141a
        L137e:
            r3 = 5
            r13 = r17
            r12 = r18
            r11 = r21
            r4 = r22
            r3 = r30
            r14 = 5
            goto L141b
        L138c:
            r1 = r19
            r0 = r28
            r3 = r30
            boolean r4 = r2.equals(r3)
            if (r4 != 0) goto L13a2
            r13 = r17
            r12 = r18
            r11 = r21
            r4 = r22
            goto L141a
        L13a2:
            r4 = 4
            r13 = r17
            r12 = r18
            r11 = r21
            r4 = r22
            r14 = 4
            goto L141b
        L13ae:
            r1 = r19
            r4 = r22
            r0 = r28
            r3 = r30
            boolean r11 = r2.equals(r4)
            if (r11 != 0) goto L13c4
            r13 = r17
            r12 = r18
            r11 = r21
            goto L141a
        L13c4:
            r11 = 3
            r13 = r17
            r12 = r18
            r11 = r21
            r14 = 3
            goto L141b
        L13cd:
            r1 = r19
            r11 = r21
            r4 = r22
            r0 = r28
            r3 = r30
            boolean r12 = r2.equals(r11)
            if (r12 != 0) goto L13e2
            r13 = r17
            r12 = r18
            goto L141a
        L13e2:
            r12 = 2
            r13 = r17
            r12 = r18
            r14 = 2
            goto L141b
        L13e9:
            r12 = r18
            r1 = r19
            r11 = r21
            r4 = r22
            r0 = r28
            r3 = r30
            boolean r13 = r2.equals(r12)
            if (r13 != 0) goto L13fe
            r13 = r17
            goto L141a
        L13fe:
            r13 = 1
            r13 = r17
            r14 = 1
            goto L141b
        L1403:
            r13 = r17
            r12 = r18
            r1 = r19
            r11 = r21
            r4 = r22
            r0 = r28
            r3 = r30
            boolean r14 = r2.equals(r13)
            if (r14 != 0) goto L1418
            goto L141a
        L1418:
            r14 = 0
            goto L141b
        L141a:
            r14 = -1
        L141b:
            switch(r14) {
                case 0: goto L1477;
                case 1: goto L1472;
                case 2: goto L146d;
                case 3: goto L1468;
                case 4: goto L1463;
                case 5: goto L145e;
                case 6: goto L1459;
                case 7: goto L1454;
                case 8: goto L144f;
                case 9: goto L144a;
                case 10: goto L1445;
                case 11: goto L1440;
                case 12: goto L143b;
                default: goto L141e;
            }
        L141e:
            r14 = r42
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r28 = r0
            java.lang.String r0 = "WARNING! KeyCycle UNKNOWN  "
            r15.append(r0)
            r15.append(r2)
            java.lang.String r0 = r15.toString()
            java.lang.String r15 = "KeyCycle"
            android.util.Log.v(r15, r0)
            r15 = 2143289344(0x7fc00000, float:NaN)
            goto L147d
        L143b:
            r14 = r42
            float r15 = r14.f24268h
            goto L147b
        L1440:
            r14 = r42
            float r15 = r14.f24271k
            goto L147b
        L1445:
            r14 = r42
            float r15 = r14.f24274n
            goto L147b
        L144a:
            r14 = r42
            float r15 = r14.f24272l
            goto L147b
        L144f:
            r14 = r42
            float r15 = r14.f24273m
            goto L147b
        L1454:
            r14 = r42
            float r15 = r14.f24278r
            goto L147b
        L1459:
            r14 = r42
            float r15 = r14.f24277q
            goto L147b
        L145e:
            r14 = r42
            float r15 = r14.f24269i
            goto L147b
        L1463:
            r14 = r42
            float r15 = r14.f24281u
            goto L147b
        L1468:
            r14 = r42
            float r15 = r14.f24280t
            goto L147b
        L146d:
            r14 = r42
            float r15 = r14.f24279s
            goto L147b
        L1472:
            r14 = r42
            float r15 = r14.f24276p
            goto L147b
        L1477:
            r14 = r42
            float r15 = r14.f24275o
        L147b:
            r28 = r0
        L147d:
            boolean r0 = java.lang.Float.isNaN(r15)
            if (r0 != 0) goto L14d1
            r0 = r16
            java.lang.Object r2 = r0.get(r2)
            u.f r2 = (p346u.AbstractC6261f) r2
            int r0 = r14.f24245a
            r19 = r1
            int r1 = r14.f24266f
            r30 = r3
            int r3 = r14.f24270j
            r22 = r4
            float r4 = r14.f24267g
            r17 = r5
            float r5 = r14.f24268h
            r23 = r6
            java.util.ArrayList<u.f$p> r6 = r2.f24288f
            r29 = r7
            u.f$p r7 = new u.f$p
            r7.<init>(r0, r4, r5, r15)
            r6.add(r7)
            r0 = -1
            if (r3 == r0) goto L14b0
            r2.f24287e = r3
        L14b0:
            r2.f24286d = r1
            r1 = r38
            r2 = r39
            r15 = r40
            r0 = r41
            r21 = r11
            r18 = r12
            r3 = r14
            r14 = r16
            r5 = r17
            r12 = r19
            r4 = r20
            r6 = r23
            r11 = r28
            r7 = r29
            r17 = r13
            goto L12c5
        L14d1:
            r2 = r39
            r15 = r40
            r0 = r41
            r22 = r4
            r21 = r11
            r18 = r12
            r17 = r13
            r4 = r20
            r11 = r28
            r12 = r1
            r13 = r3
            r3 = r14
            r14 = r16
            r1 = r38
            goto L1245
        L14ec:
            r41 = r0
            r39 = r2
            r20 = r4
            r23 = r6
            r29 = r7
            r28 = r11
            r19 = r12
            r30 = r13
            r13 = r17
            r12 = r18
            r11 = r21
            r17 = r5
            r1 = r38
            r2 = r39
            r0 = r41
            r21 = r11
            r18 = r12
            r5 = r17
            r12 = r19
            r4 = r20
            r6 = r23
            r11 = r28
            r7 = r29
            r17 = r13
            r13 = r30
            goto L1226
        L1520:
            r41 = r0
            r0 = r1
            java.util.HashMap<java.lang.String, u.f> r1 = r0.f24391x
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L152d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1540
            java.lang.Object r2 = r1.next()
            u.f r2 = (p346u.AbstractC6261f) r2
            r3 = r41
            r2.m12880c(r3)
            goto L152d
        L153f:
            r0 = r1
        L1540:
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = " start: x: "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            u.q r1 = r3.f24371d
            float r1 = r1.f24399c0
            r0.append(r1)
            java.lang.String r1 = " y: "
            r0.append(r1)
            u.q r2 = r3.f24371d
            float r2 = r2.f24400d0
            r0.append(r2)
            java.lang.String r2 = " end: x: "
            r0.append(r2)
            u.q r2 = r3.f24372e
            float r2 = r2.f24399c0
            r0.append(r2)
            r0.append(r1)
            u.q r1 = r3.f24372e
            float r1 = r1.f24400d0
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
