package p346u;

/* renamed from: u.l */
/* loaded from: classes.dex */
public class C6267l implements java.lang.Comparable<p346u.C6267l> {

    /* renamed from: Y */
    public float f24351Y;

    /* renamed from: Z */
    public int f24352Z;

    /* renamed from: a0 */
    public int f24353a0;

    /* renamed from: b0 */
    public float f24354b0;

    /* renamed from: c0 */
    public float f24355c0;

    /* renamed from: d0 */
    public float f24356d0;

    /* renamed from: e0 */
    public float f24357e0;

    /* renamed from: f0 */
    public float f24358f0;

    /* renamed from: g0 */
    public float f24359g0;

    /* renamed from: h0 */
    public float f24360h0;

    /* renamed from: i0 */
    public float f24361i0;

    /* renamed from: j0 */
    public float f24362j0;

    /* renamed from: k0 */
    public float f24363k0;

    /* renamed from: l0 */
    public float f24364l0;

    /* renamed from: m0 */
    public float f24365m0;

    /* renamed from: n0 */
    public float f24366n0;

    /* renamed from: o0 */
    public java.util.LinkedHashMap<java.lang.String, p422y.C7091a> f24367o0;

    public C6267l() {
            r2 = this;
            r2.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.f24351Y = r0
            r1 = 0
            r2.f24352Z = r1
            r1 = 0
            r2.f24354b0 = r1
            r2.f24355c0 = r1
            r2.f24356d0 = r1
            r2.f24357e0 = r1
            r2.f24358f0 = r0
            r2.f24359g0 = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r2.f24360h0 = r0
            r2.f24361i0 = r0
            r2.f24362j0 = r1
            r2.f24363k0 = r1
            r2.f24364l0 = r1
            r2.f24365m0 = r0
            r2.f24366n0 = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r2.f24367o0 = r0
            return
    }

    @Override // java.lang.Comparable
    public int compareTo(p346u.C6267l r1) {
            r0 = this;
            u.l r1 = (p346u.C6267l) r1
            java.util.Objects.requireNonNull(r1)
            r1 = 0
            int r1 = java.lang.Float.compare(r1, r1)
            return r1
    }

    /* renamed from: e */
    public void m12884e(java.util.HashMap<java.lang.String, p346u.AbstractC6273r> r8, int r9) {
            r7 = this;
            java.util.Set r0 = r8.keySet()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20e
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r8.get(r1)
            u.r r2 = (p346u.AbstractC6273r) r2
            java.util.Objects.requireNonNull(r1)
            r3 = -1
            int r4 = r1.hashCode()
            r5 = 1
            switch(r4) {
                case -1249320806: goto Lc9;
                case -1249320805: goto Lbe;
                case -1225497657: goto Lb3;
                case -1225497656: goto La8;
                case -1225497655: goto L9d;
                case -1001078227: goto L92;
                case -908189618: goto L87;
                case -908189617: goto L7c;
                case -760884510: goto L6e;
                case -760884509: goto L60;
                case -40300674: goto L52;
                case -4379043: goto L44;
                case 37232917: goto L36;
                case 92909918: goto L28;
                default: goto L26;
            }
        L26:
            goto Ld3
        L28:
            java.lang.String r4 = "alpha"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L32
            goto Ld3
        L32:
            r3 = 13
            goto Ld3
        L36:
            java.lang.String r4 = "transitionPathRotate"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L40
            goto Ld3
        L40:
            r3 = 12
            goto Ld3
        L44:
            java.lang.String r4 = "elevation"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L4e
            goto Ld3
        L4e:
            r3 = 11
            goto Ld3
        L52:
            java.lang.String r4 = "rotation"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L5c
            goto Ld3
        L5c:
            r3 = 10
            goto Ld3
        L60:
            java.lang.String r4 = "transformPivotY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L6a
            goto Ld3
        L6a:
            r3 = 9
            goto Ld3
        L6e:
            java.lang.String r4 = "transformPivotX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L78
            goto Ld3
        L78:
            r3 = 8
            goto Ld3
        L7c:
            java.lang.String r4 = "scaleY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L85
            goto Ld3
        L85:
            r3 = 7
            goto Ld3
        L87:
            java.lang.String r4 = "scaleX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L90
            goto Ld3
        L90:
            r3 = 6
            goto Ld3
        L92:
            java.lang.String r4 = "progress"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L9b
            goto Ld3
        L9b:
            r3 = 5
            goto Ld3
        L9d:
            java.lang.String r4 = "translationZ"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto La6
            goto Ld3
        La6:
            r3 = 4
            goto Ld3
        La8:
            java.lang.String r4 = "translationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Lb1
            goto Ld3
        Lb1:
            r3 = 3
            goto Ld3
        Lb3:
            java.lang.String r4 = "translationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Lbc
            goto Ld3
        Lbc:
            r3 = 2
            goto Ld3
        Lbe:
            java.lang.String r4 = "rotationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Lc7
            goto Ld3
        Lc7:
            r3 = 1
            goto Ld3
        Lc9:
            java.lang.String r4 = "rotationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Ld2
            goto Ld3
        Ld2:
            r3 = 0
        Ld3:
            r4 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            switch(r3) {
                case 0: goto L1b0;
                case 1: goto L1a4;
                case 2: goto L198;
                case 3: goto L18c;
                case 4: goto L180;
                case 5: goto L174;
                case 6: goto L164;
                case 7: goto L158;
                case 8: goto L14a;
                case 9: goto L13c;
                case 10: goto L12e;
                case 11: goto L120;
                case 12: goto L112;
                case 13: goto L106;
                default: goto Ld9;
            }
        Ld9:
            java.lang.String r3 = "CUSTOM"
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L1f6
            java.lang.String r3 = ","
            java.lang.String[] r3 = r1.split(r3)
            r3 = r3[r5]
            java.util.LinkedHashMap<java.lang.String, y.a> r4 = r7.f24367o0
            boolean r4 = r4.containsKey(r3)
            if (r4 == 0) goto L1e4
            java.util.LinkedHashMap<java.lang.String, y.a> r4 = r7.f24367o0
            java.lang.Object r3 = r4.get(r3)
            y.a r3 = (p422y.C7091a) r3
            boolean r4 = r2 instanceof p346u.AbstractC6273r.b
            if (r4 == 0) goto L1c0
            u.r$b r2 = (p346u.AbstractC6273r.b) r2
            android.util.SparseArray<y.a> r1 = r2.f24414f
            r1.append(r9, r3)
            goto L8
        L106:
            float r1 = r7.f24351Y
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L10f
            goto L16f
        L10f:
            float r4 = r7.f24351Y
            goto L16f
        L112:
            float r1 = r7.f24365m0
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L11c
            goto L1bb
        L11c:
            float r6 = r7.f24365m0
            goto L1bb
        L120:
            float r1 = r7.f24354b0
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L12a
            goto L1bb
        L12a:
            float r6 = r7.f24354b0
            goto L1bb
        L12e:
            float r1 = r7.f24355c0
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L138
            goto L1bb
        L138:
            float r6 = r7.f24355c0
            goto L1bb
        L13c:
            float r1 = r7.f24361i0
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L146
            goto L1bb
        L146:
            float r6 = r7.f24361i0
            goto L1bb
        L14a:
            float r1 = r7.f24360h0
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L154
            goto L1bb
        L154:
            float r6 = r7.f24360h0
            goto L1bb
        L158:
            float r1 = r7.f24359g0
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L161
            goto L16f
        L161:
            float r4 = r7.f24359g0
            goto L16f
        L164:
            float r1 = r7.f24358f0
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L16d
            goto L16f
        L16d:
            float r4 = r7.f24358f0
        L16f:
            r2.mo12900b(r9, r4)
            goto L8
        L174:
            float r1 = r7.f24366n0
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L17d
            goto L1bb
        L17d:
            float r6 = r7.f24366n0
            goto L1bb
        L180:
            float r1 = r7.f24364l0
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L189
            goto L1bb
        L189:
            float r6 = r7.f24364l0
            goto L1bb
        L18c:
            float r1 = r7.f24363k0
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L195
            goto L1bb
        L195:
            float r6 = r7.f24363k0
            goto L1bb
        L198:
            float r1 = r7.f24362j0
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L1a1
            goto L1bb
        L1a1:
            float r6 = r7.f24362j0
            goto L1bb
        L1a4:
            float r1 = r7.f24357e0
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L1ad
            goto L1bb
        L1ad:
            float r6 = r7.f24357e0
            goto L1bb
        L1b0:
            float r1 = r7.f24356d0
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L1b9
            goto L1bb
        L1b9:
            float r6 = r7.f24356d0
        L1bb:
            r2.mo12900b(r9, r6)
            goto L8
        L1c0:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = " splineSet not a CustomSet frame = "
            r4.append(r1)
            r4.append(r9)
            java.lang.String r1 = ", value"
            r4.append(r1)
            float r1 = r3.m14201b()
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            goto L207
        L1e4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "UNKNOWN customName "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            goto L207
        L1f6:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "UNKNOWN spline "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L207:
            java.lang.String r2 = "MotionPaths"
            android.util.Log.e(r2, r1)
            goto L8
        L20e:
            return
    }

    /* renamed from: g */
    public final boolean m12885g(float r4, float r5) {
            r3 = this;
            boolean r0 = java.lang.Float.isNaN(r4)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L1e
            boolean r0 = java.lang.Float.isNaN(r5)
            if (r0 == 0) goto Lf
            goto L1e
        Lf:
            float r4 = r4 - r5
            float r4 = java.lang.Math.abs(r4)
            r5 = 897988541(0x358637bd, float:1.0E-6)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L1c
            goto L1d
        L1c:
            r1 = 0
        L1d:
            return r1
        L1e:
            boolean r4 = java.lang.Float.isNaN(r4)
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r4 == r5) goto L29
            goto L2a
        L29:
            r1 = 0
        L2a:
            return r1
    }

    /* renamed from: h */
    public void m12886h(p381w.C6765f r4, androidx.constraintlayout.widget.C0333b r5, int r6) {
            r3 = this;
            r4.m13722v()
            r4.m13723w()
            androidx.constraintlayout.widget.b$a r4 = r5.m950i(r6)
            androidx.constraintlayout.widget.b$d r5 = r4.f1792b
            int r6 = r5.f1870c
            r3.f24352Z = r6
            int r0 = r5.f1869b
            r3.f24353a0 = r0
            if (r0 == 0) goto L1a
            if (r6 != 0) goto L1a
            r5 = 0
            goto L1c
        L1a:
            float r5 = r5.f1871d
        L1c:
            r3.f24351Y = r5
            androidx.constraintlayout.widget.b$e r5 = r4.f1795e
            boolean r6 = r5.f1885l
            float r6 = r5.f1886m
            r3.f24354b0 = r6
            float r6 = r5.f1875b
            r3.f24355c0 = r6
            float r6 = r5.f1876c
            r3.f24356d0 = r6
            float r6 = r5.f1877d
            r3.f24357e0 = r6
            float r6 = r5.f1878e
            r3.f24358f0 = r6
            float r6 = r5.f1879f
            r3.f24359g0 = r6
            float r6 = r5.f1880g
            r3.f24360h0 = r6
            float r6 = r5.f1881h
            r3.f24361i0 = r6
            float r6 = r5.f1882i
            r3.f24362j0 = r6
            float r6 = r5.f1883j
            r3.f24363k0 = r6
            float r5 = r5.f1884k
            r3.f24364l0 = r5
            androidx.constraintlayout.widget.b$c r5 = r4.f1793c
            java.lang.String r5 = r5.f1863c
            p331t.C6088c.m12542c(r5)
            androidx.constraintlayout.widget.b$c r5 = r4.f1793c
            float r5 = r5.f1867g
            r3.f24365m0 = r5
            androidx.constraintlayout.widget.b$d r5 = r4.f1792b
            float r5 = r5.f1872e
            r3.f24366n0 = r5
            java.util.HashMap<java.lang.String, y.a> r5 = r4.f1796f
            java.util.Set r5 = r5.keySet()
            java.util.Iterator r5 = r5.iterator()
        L6b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L8a
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.util.HashMap<java.lang.String, y.a> r0 = r4.f1796f
            java.lang.Object r0 = r0.get(r6)
            y.a r0 = (p422y.C7091a) r0
            int r1 = r0.f27433b
            r2 = 5
            if (r1 == r2) goto L6b
            java.util.LinkedHashMap<java.lang.String, y.a> r1 = r3.f24367o0
            r1.put(r6, r0)
            goto L6b
        L8a:
            return
    }
}
