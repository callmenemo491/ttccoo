package p346u;

/* renamed from: u.s */
/* loaded from: classes.dex */
public abstract class AbstractC6274s {

    /* renamed from: a */
    public p331t.AbstractC6087b f24417a;

    /* renamed from: b */
    public int f24418b;

    /* renamed from: c */
    public int[] f24419c;

    /* renamed from: d */
    public float[][] f24420d;

    /* renamed from: e */
    public int f24421e;

    /* renamed from: f */
    public java.lang.String f24422f;

    /* renamed from: g */
    public float[] f24423g;

    /* renamed from: h */
    public boolean f24424h;

    /* renamed from: i */
    public long f24425i;

    /* renamed from: j */
    public float f24426j;

    /* renamed from: u.s$a */
    public static class a extends p346u.AbstractC6274s {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p346u.AbstractC6274s
        /* renamed from: d */
        public boolean mo12906d(android.view.View r7, float r8, long r9, p083f.C1933t r11) {
                r6 = this;
                r0 = r6
                r1 = r8
                r2 = r9
                r4 = r7
                r5 = r11
                float r8 = r0.m12904b(r1, r2, r4, r5)
                r7.setAlpha(r8)
                boolean r7 = r6.f24424h
                return r7
        }
    }

    /* renamed from: u.s$b */
    public static class b extends p346u.AbstractC6274s {

        /* renamed from: k */
        public java.lang.String f24427k;

        /* renamed from: l */
        public android.util.SparseArray<p422y.C7091a> f24428l;

        /* renamed from: m */
        public android.util.SparseArray<float[]> f24429m;

        /* renamed from: n */
        public float[] f24430n;

        /* renamed from: o */
        public float[] f24431o;

        public b(java.lang.String r2, android.util.SparseArray<p422y.C7091a> r3) {
                r1 = this;
                r1.<init>()
                android.util.SparseArray r0 = new android.util.SparseArray
                r0.<init>()
                r1.f24429m = r0
                java.lang.String r0 = ","
                java.lang.String[] r2 = r2.split(r0)
                r0 = 1
                r2 = r2[r0]
                r1.f24427k = r2
                r1.f24428l = r3
                return
        }

        @Override // p346u.AbstractC6274s
        /* renamed from: c */
        public void mo12905c(int r1, float r2, float r3, int r4, float r5) {
                r0 = this;
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)"
                r1.<init>(r2)
                throw r1
        }

        @Override // p346u.AbstractC6274s
        /* renamed from: d */
        public boolean mo12906d(android.view.View r18, float r19, long r20, p083f.C1933t r22) {
                r17 = this;
                r0 = r17
                r1 = r18
                r2 = r20
                t.b r4 = r0.f24417a
                r5 = r19
                double r5 = (double) r5
                float[] r7 = r0.f24430n
                r4.mo12533d(r5, r7)
                float[] r4 = r0.f24430n
                int r5 = r4.length
                int r5 = r5 + (-2)
                r5 = r4[r5]
                int r6 = r4.length
                r7 = 1
                int r6 = r6 - r7
                r4 = r4[r6]
                long r8 = r0.f24425i
                long r8 = r2 - r8
                float r6 = r0.f24426j
                boolean r6 = java.lang.Float.isNaN(r6)
                r10 = 0
                r11 = 0
                if (r6 == 0) goto L3c
                java.lang.String r6 = r0.f24427k
                r12 = r22
                float r6 = r12.m4790v(r1, r6, r11)
                r0.f24426j = r6
                boolean r6 = java.lang.Float.isNaN(r6)
                if (r6 == 0) goto L3c
                r0.f24426j = r10
            L3c:
                float r6 = r0.f24426j
                double r12 = (double) r6
                double r8 = (double) r8
                r14 = 4472406533629990549(0x3e112e0be826d695, double:1.0E-9)
                double r8 = r8 * r14
                double r14 = (double) r5
                double r8 = r8 * r14
                double r8 = r8 + r12
                r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r8 = r8 % r12
                float r6 = (float) r8
                r0.f24426j = r6
                r0.f24425i = r2
                float r2 = r0.m12903a(r6)
                r0.f24424h = r11
                r3 = 0
            L5a:
                float[] r6 = r0.f24431o
                int r8 = r6.length
                if (r3 >= r8) goto L7c
                boolean r8 = r0.f24424h
                float[] r9 = r0.f24430n
                r12 = r9[r3]
                double r12 = (double) r12
                r14 = 0
                int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r16 == 0) goto L6e
                r12 = 1
                goto L6f
            L6e:
                r12 = 0
            L6f:
                r8 = r8 | r12
                r0.f24424h = r8
                r8 = r9[r3]
                float r8 = r8 * r2
                float r8 = r8 + r4
                r6[r3] = r8
                int r3 = r3 + 1
                goto L5a
            L7c:
                android.util.SparseArray<y.a> r2 = r0.f24428l
                java.lang.Object r2 = r2.valueAt(r11)
                y.a r2 = (p422y.C7091a) r2
                float[] r3 = r0.f24431o
                r2.m14204g(r1, r3)
                int r1 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
                if (r1 == 0) goto L8f
                r0.f24424h = r7
            L8f:
                boolean r1 = r0.f24424h
                return r1
        }

        @Override // p346u.AbstractC6274s
        /* renamed from: e */
        public void mo12907e(int r15) {
                r14 = this;
                android.util.SparseArray<y.a> r0 = r14.f24428l
                int r0 = r0.size()
                android.util.SparseArray<y.a> r1 = r14.f24428l
                r2 = 0
                java.lang.Object r1 = r1.valueAt(r2)
                y.a r1 = (p422y.C7091a) r1
                int r1 = r1.m14203d()
                double[] r3 = new double[r0]
                int r4 = r1 + 2
                float[] r5 = new float[r4]
                r14.f24430n = r5
                float[] r5 = new float[r1]
                r14.f24431o = r5
                r5 = 2
                int[] r5 = new int[r5]
                r6 = 1
                r5[r6] = r4
                r5[r2] = r0
                java.lang.Class<double> r4 = double.class
                java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r5)
                double[][] r4 = (double[][]) r4
                r5 = 0
            L30:
                if (r5 >= r0) goto L7a
                android.util.SparseArray<y.a> r7 = r14.f24428l
                int r7 = r7.keyAt(r5)
                android.util.SparseArray<y.a> r8 = r14.f24428l
                java.lang.Object r8 = r8.valueAt(r5)
                y.a r8 = (p422y.C7091a) r8
                android.util.SparseArray<float[]> r9 = r14.f24429m
                java.lang.Object r9 = r9.valueAt(r5)
                float[] r9 = (float[]) r9
                double r10 = (double) r7
                r12 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
                double r10 = r10 * r12
                r3[r5] = r10
                float[] r7 = r14.f24430n
                r8.m14202c(r7)
                r7 = 0
            L58:
                float[] r8 = r14.f24430n
                int r10 = r8.length
                if (r7 >= r10) goto L67
                r10 = r4[r5]
                r8 = r8[r7]
                double r11 = (double) r8
                r10[r7] = r11
                int r7 = r7 + 1
                goto L58
            L67:
                r7 = r4[r5]
                r8 = r9[r2]
                double r10 = (double) r8
                r7[r1] = r10
                r7 = r4[r5]
                int r8 = r1 + 1
                r9 = r9[r6]
                double r9 = (double) r9
                r7[r8] = r9
                int r5 = r5 + 1
                goto L30
            L7a:
                t.b r15 = p331t.AbstractC6087b.m12541a(r15, r3, r4)
                r14.f24417a = r15
                return
        }
    }

    /* renamed from: u.s$c */
    public static class c extends p346u.AbstractC6274s {
        public c() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p346u.AbstractC6274s
        /* renamed from: d */
        public boolean mo12906d(android.view.View r7, float r8, long r9, p083f.C1933t r11) {
                r6 = this;
                r0 = r6
                r1 = r8
                r2 = r9
                r4 = r7
                r5 = r11
                float r8 = r0.m12904b(r1, r2, r4, r5)
                r7.setElevation(r8)
                boolean r7 = r6.f24424h
                return r7
        }
    }

    /* renamed from: u.s$d */
    public static class d extends p346u.AbstractC6274s {
        public d() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p346u.AbstractC6274s
        /* renamed from: d */
        public boolean mo12906d(android.view.View r1, float r2, long r3, p083f.C1933t r5) {
                r0 = this;
                boolean r1 = r0.f24424h
                return r1
        }
    }

    /* renamed from: u.s$e */
    public static class e extends p346u.AbstractC6274s {

        /* renamed from: k */
        public boolean f24432k;

        public e() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f24432k = r0
                return
        }

        @Override // p346u.AbstractC6274s
        /* renamed from: d */
        public boolean mo12906d(android.view.View r14, float r15, long r16, p083f.C1933t r18) {
                r13 = this;
                r7 = r13
                r0 = r14
                java.lang.String r8 = "unable to setProgress"
                java.lang.String r9 = "SplineSet"
                boolean r1 = r0 instanceof androidx.constraintlayout.motion.widget.MotionLayout
                if (r1 == 0) goto L1c
                r8 = r0
                androidx.constraintlayout.motion.widget.MotionLayout r8 = (androidx.constraintlayout.motion.widget.MotionLayout) r8
                r1 = r13
                r2 = r15
                r3 = r16
                r5 = r14
                r6 = r18
                float r0 = r1.m12904b(r2, r3, r5, r6)
                r8.setProgress(r0)
                goto L57
            L1c:
                boolean r1 = r7.f24432k
                r10 = 0
                if (r1 == 0) goto L22
                return r10
            L22:
                r1 = 0
                r2 = 1
                java.lang.Class r3 = r14.getClass()     // Catch: java.lang.NoSuchMethodException -> L35
                java.lang.String r4 = "setProgress"
                java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L35
                java.lang.Class r6 = java.lang.Float.TYPE     // Catch: java.lang.NoSuchMethodException -> L35
                r5[r10] = r6     // Catch: java.lang.NoSuchMethodException -> L35
                java.lang.reflect.Method r1 = r3.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L35
                goto L37
            L35:
                r7.f24432k = r2
            L37:
                r11 = r1
                if (r11 == 0) goto L57
                java.lang.Object[] r12 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L51 java.lang.IllegalAccessException -> L53
                r1 = r13
                r2 = r15
                r3 = r16
                r5 = r14
                r6 = r18
                float r1 = r1.m12904b(r2, r3, r5, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L51 java.lang.IllegalAccessException -> L53
                java.lang.Float r1 = java.lang.Float.valueOf(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L51 java.lang.IllegalAccessException -> L53
                r12[r10] = r1     // Catch: java.lang.reflect.InvocationTargetException -> L51 java.lang.IllegalAccessException -> L53
                r11.invoke(r14, r12)     // Catch: java.lang.reflect.InvocationTargetException -> L51 java.lang.IllegalAccessException -> L53
                goto L57
            L51:
                r0 = move-exception
                goto L54
            L53:
                r0 = move-exception
            L54:
                android.util.Log.e(r9, r8, r0)
            L57:
                boolean r0 = r7.f24424h
                return r0
        }
    }

    /* renamed from: u.s$f */
    public static class f extends p346u.AbstractC6274s {
        public f() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p346u.AbstractC6274s
        /* renamed from: d */
        public boolean mo12906d(android.view.View r7, float r8, long r9, p083f.C1933t r11) {
                r6 = this;
                r0 = r6
                r1 = r8
                r2 = r9
                r4 = r7
                r5 = r11
                float r8 = r0.m12904b(r1, r2, r4, r5)
                r7.setRotation(r8)
                boolean r7 = r6.f24424h
                return r7
        }
    }

    /* renamed from: u.s$g */
    public static class g extends p346u.AbstractC6274s {
        public g() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p346u.AbstractC6274s
        /* renamed from: d */
        public boolean mo12906d(android.view.View r7, float r8, long r9, p083f.C1933t r11) {
                r6 = this;
                r0 = r6
                r1 = r8
                r2 = r9
                r4 = r7
                r5 = r11
                float r8 = r0.m12904b(r1, r2, r4, r5)
                r7.setRotationX(r8)
                boolean r7 = r6.f24424h
                return r7
        }
    }

    /* renamed from: u.s$h */
    public static class h extends p346u.AbstractC6274s {
        public h() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p346u.AbstractC6274s
        /* renamed from: d */
        public boolean mo12906d(android.view.View r7, float r8, long r9, p083f.C1933t r11) {
                r6 = this;
                r0 = r6
                r1 = r8
                r2 = r9
                r4 = r7
                r5 = r11
                float r8 = r0.m12904b(r1, r2, r4, r5)
                r7.setRotationY(r8)
                boolean r7 = r6.f24424h
                return r7
        }
    }

    /* renamed from: u.s$i */
    public static class i extends p346u.AbstractC6274s {
        public i() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p346u.AbstractC6274s
        /* renamed from: d */
        public boolean mo12906d(android.view.View r7, float r8, long r9, p083f.C1933t r11) {
                r6 = this;
                r0 = r6
                r1 = r8
                r2 = r9
                r4 = r7
                r5 = r11
                float r8 = r0.m12904b(r1, r2, r4, r5)
                r7.setScaleX(r8)
                boolean r7 = r6.f24424h
                return r7
        }
    }

    /* renamed from: u.s$j */
    public static class j extends p346u.AbstractC6274s {
        public j() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p346u.AbstractC6274s
        /* renamed from: d */
        public boolean mo12906d(android.view.View r7, float r8, long r9, p083f.C1933t r11) {
                r6 = this;
                r0 = r6
                r1 = r8
                r2 = r9
                r4 = r7
                r5 = r11
                float r8 = r0.m12904b(r1, r2, r4, r5)
                r7.setScaleY(r8)
                boolean r7 = r6.f24424h
                return r7
        }
    }

    /* renamed from: u.s$k */
    public static class k extends p346u.AbstractC6274s {
        public k() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p346u.AbstractC6274s
        /* renamed from: d */
        public boolean mo12906d(android.view.View r7, float r8, long r9, p083f.C1933t r11) {
                r6 = this;
                r0 = r6
                r1 = r8
                r2 = r9
                r4 = r7
                r5 = r11
                float r8 = r0.m12904b(r1, r2, r4, r5)
                r7.setTranslationX(r8)
                boolean r7 = r6.f24424h
                return r7
        }
    }

    /* renamed from: u.s$l */
    public static class l extends p346u.AbstractC6274s {
        public l() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p346u.AbstractC6274s
        /* renamed from: d */
        public boolean mo12906d(android.view.View r7, float r8, long r9, p083f.C1933t r11) {
                r6 = this;
                r0 = r6
                r1 = r8
                r2 = r9
                r4 = r7
                r5 = r11
                float r8 = r0.m12904b(r1, r2, r4, r5)
                r7.setTranslationY(r8)
                boolean r7 = r6.f24424h
                return r7
        }
    }

    /* renamed from: u.s$m */
    public static class m extends p346u.AbstractC6274s {
        public m() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p346u.AbstractC6274s
        /* renamed from: d */
        public boolean mo12906d(android.view.View r7, float r8, long r9, p083f.C1933t r11) {
                r6 = this;
                r0 = r6
                r1 = r8
                r2 = r9
                r4 = r7
                r5 = r11
                float r8 = r0.m12904b(r1, r2, r4, r5)
                r7.setTranslationZ(r8)
                boolean r7 = r6.f24424h
                return r7
        }
    }

    public AbstractC6274s() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f24418b = r0
            r1 = 10
            int[] r1 = new int[r1]
            r3.f24419c = r1
            r1 = 2
            int[] r1 = new int[r1]
            r1 = {x0028: FILL_ARRAY_DATA , data: [10, 3} // fill-array
            java.lang.Class<float> r2 = float.class
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r2, r1)
            float[][] r1 = (float[][]) r1
            r3.f24420d = r1
            r1 = 3
            float[] r1 = new float[r1]
            r3.f24423g = r1
            r3.f24424h = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r3.f24426j = r0
            return
    }

    /* renamed from: a */
    public float m12903a(float r5) {
            r4 = this;
            int r0 = r4.f24418b
            r1 = 1086918619(0x40c90fdb, float:6.2831855)
            r2 = 1073741824(0x40000000, float:2.0)
            r3 = 1065353216(0x3f800000, float:1.0)
            switch(r0) {
                case 1: goto L3e;
                case 2: goto L39;
                case 3: goto L33;
                case 4: goto L2e;
                case 5: goto L25;
                case 6: goto L15;
                default: goto Lc;
            }
        Lc:
            float r5 = r5 * r1
            double r0 = (double) r5
            double r0 = java.lang.Math.sin(r0)
            float r5 = (float) r0
            return r5
        L15:
            r0 = 1082130432(0x40800000, float:4.0)
            float r5 = r5 * r0
            float r5 = r5 % r0
            float r5 = r5 - r2
            float r5 = java.lang.Math.abs(r5)
            float r5 = r3 - r5
            float r5 = r5 * r5
        L23:
            float r3 = r3 - r5
            return r3
        L25:
            float r5 = r5 * r1
            double r0 = (double) r5
            double r0 = java.lang.Math.cos(r0)
            float r5 = (float) r0
            return r5
        L2e:
            float r5 = r5 * r2
            float r5 = r5 + r3
            float r5 = r5 % r2
            goto L23
        L33:
            float r5 = r5 * r2
            float r5 = r5 + r3
            float r5 = r5 % r2
            float r5 = r5 - r3
            return r5
        L39:
            float r5 = java.lang.Math.abs(r5)
            goto L23
        L3e:
            float r5 = r5 * r1
            float r5 = java.lang.Math.signum(r5)
            return r5
    }

    /* renamed from: b */
    public float m12904b(float r19, long r20, android.view.View r22, p083f.C1933t r23) {
            r18 = this;
            r0 = r18
            r1 = r20
            r3 = r22
            r4 = r23
            t.b r5 = r0.f24417a
            r6 = r19
            double r6 = (double) r6
            float[] r8 = r0.f24423g
            r5.mo12533d(r6, r8)
            float[] r5 = r0.f24423g
            r6 = 1
            r7 = r5[r6]
            r8 = 2
            r9 = 0
            r10 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L23
            r0.f24424h = r10
            r1 = r5[r8]
            return r1
        L23:
            float r5 = r0.f24426j
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 == 0) goto L3b
            java.lang.String r5 = r0.f24422f
            float r5 = r4.m4790v(r3, r5, r10)
            r0.f24426j = r5
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 == 0) goto L3b
            r0.f24426j = r9
        L3b:
            long r12 = r0.f24425i
            long r12 = r1 - r12
            float r5 = r0.f24426j
            double r14 = (double) r5
            double r12 = (double) r12
            r16 = 4472406533629990549(0x3e112e0be826d695, double:1.0E-9)
            double r12 = r12 * r16
            double r8 = (double) r7
            double r12 = r12 * r8
            double r12 = r12 + r14
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r12 = r12 % r7
            float r7 = (float) r12
            r0.f24426j = r7
            java.lang.String r8 = r0.f24422f
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r9 = r4.f8425Z
            java.util.HashMap r9 = (java.util.HashMap) r9
            boolean r9 = r9.containsKey(r3)
            if (r9 != 0) goto L6d
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            float[] r12 = new float[r6]
            r12[r10] = r7
            r9.put(r8, r12)
            goto L84
        L6d:
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r9 = r4.f8425Z
            java.util.HashMap r9 = (java.util.HashMap) r9
            java.lang.Object r9 = r9.get(r3)
            java.util.HashMap r9 = (java.util.HashMap) r9
            boolean r12 = r9.containsKey(r8)
            if (r12 != 0) goto L8c
            float[] r12 = new float[r6]
            r12[r10] = r7
            r9.put(r8, r12)
        L84:
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r4 = r4.f8425Z
            java.util.HashMap r4 = (java.util.HashMap) r4
            r4.put(r3, r9)
            goto L9e
        L8c:
            java.lang.Object r3 = r9.get(r8)
            float[] r3 = (float[]) r3
            int r4 = r3.length
            if (r4 > 0) goto L99
            float[] r3 = java.util.Arrays.copyOf(r3, r6)
        L99:
            r3[r10] = r7
            r9.put(r8, r3)
        L9e:
            r0.f24425i = r1
            float[] r1 = r0.f24423g
            r1 = r1[r10]
            float r2 = r0.f24426j
            float r2 = r0.m12903a(r2)
            float[] r3 = r0.f24423g
            r4 = 2
            r3 = r3[r4]
            float r2 = r2 * r1
            float r2 = r2 + r3
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto Lbb
            if (r11 == 0) goto Lba
            goto Lbb
        Lba:
            r6 = 0
        Lbb:
            r0.f24424h = r6
            return r2
    }

    /* renamed from: c */
    public void mo12905c(int r4, float r5, float r6, int r7, float r8) {
            r3 = this;
            int[] r0 = r3.f24419c
            int r1 = r3.f24421e
            r0[r1] = r4
            float[][] r4 = r3.f24420d
            r0 = r4[r1]
            r2 = 0
            r0[r2] = r5
            r5 = r4[r1]
            r0 = 1
            r5[r0] = r6
            r4 = r4[r1]
            r5 = 2
            r4[r5] = r8
            int r4 = r3.f24418b
            int r4 = java.lang.Math.max(r4, r7)
            r3.f24418b = r4
            int r4 = r3.f24421e
            int r4 = r4 + r0
            r3.f24421e = r4
            return
    }

    /* renamed from: d */
    public abstract boolean mo12906d(android.view.View r1, float r2, long r3, p083f.C1933t r5);

    /* renamed from: e */
    public void mo12907e(int r15) {
            r14 = this;
            int r0 = r14.f24421e
            if (r0 != 0) goto L19
            java.lang.String r15 = "Error no points added to "
            java.lang.StringBuilder r15 = android.support.v4.media.C0144c.m256a(r15)
            java.lang.String r0 = r14.f24422f
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            java.lang.String r0 = "SplineSet"
            android.util.Log.e(r0, r15)
            return
        L19:
            int[] r1 = r14.f24419c
            float[][] r2 = r14.f24420d
            r3 = 1
            int r0 = r0 - r3
            int r4 = r1.length
            int r4 = r4 + 10
            int[] r4 = new int[r4]
            r5 = 0
            r4[r5] = r0
            r4[r3] = r5
            r0 = 2
            r6 = 2
        L2b:
            if (r6 <= 0) goto L7b
            int r6 = r6 + (-1)
            r7 = r4[r6]
            int r6 = r6 + (-1)
            r8 = r4[r6]
            if (r7 >= r8) goto L2b
            r9 = r1[r8]
            r10 = r7
            r11 = r10
        L3b:
            if (r10 >= r8) goto L56
            r12 = r1[r10]
            if (r12 > r9) goto L53
            r12 = r1[r11]
            r13 = r1[r10]
            r1[r11] = r13
            r1[r10] = r12
            r12 = r2[r11]
            r13 = r2[r10]
            r2[r11] = r13
            r2[r10] = r12
            int r11 = r11 + 1
        L53:
            int r10 = r10 + 1
            goto L3b
        L56:
            r9 = r1[r11]
            r10 = r1[r8]
            r1[r11] = r10
            r1[r8] = r9
            r9 = r2[r11]
            r10 = r2[r8]
            r2[r11] = r10
            r2[r8] = r9
            int r9 = r6 + 1
            int r10 = r11 + (-1)
            r4[r6] = r10
            int r6 = r9 + 1
            r4[r9] = r7
            int r7 = r6 + 1
            r4[r6] = r8
            int r6 = r7 + 1
            int r11 = r11 + 1
            r4[r7] = r11
            goto L2b
        L7b:
            r1 = 1
            r2 = 0
        L7d:
            int[] r4 = r14.f24419c
            int r6 = r4.length
            if (r1 >= r6) goto L8f
            r6 = r4[r1]
            int r7 = r1 + (-1)
            r4 = r4[r7]
            if (r6 == r4) goto L8c
            int r2 = r2 + 1
        L8c:
            int r1 = r1 + 1
            goto L7d
        L8f:
            if (r2 != 0) goto L92
            r2 = 1
        L92:
            double[] r1 = new double[r2]
            r4 = 3
            int[] r6 = new int[r0]
            r6[r3] = r4
            r6[r5] = r2
            java.lang.Class<double> r2 = double.class
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r2, r6)
            double[][] r2 = (double[][]) r2
            r4 = 0
            r6 = 0
        La5:
            int r7 = r14.f24421e
            if (r4 >= r7) goto Le6
            if (r4 <= 0) goto Lb6
            int[] r7 = r14.f24419c
            r8 = r7[r4]
            int r9 = r4 + (-1)
            r7 = r7[r9]
            if (r8 != r7) goto Lb6
            goto Le3
        Lb6:
            int[] r7 = r14.f24419c
            r7 = r7[r4]
            double r7 = (double) r7
            r9 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r7 = r7 * r9
            r1[r6] = r7
            r7 = r2[r6]
            float[][] r8 = r14.f24420d
            r9 = r8[r4]
            r9 = r9[r5]
            double r9 = (double) r9
            r7[r5] = r9
            r7 = r2[r6]
            r9 = r8[r4]
            r9 = r9[r3]
            double r9 = (double) r9
            r7[r3] = r9
            r7 = r2[r6]
            r8 = r8[r4]
            r8 = r8[r0]
            double r8 = (double) r8
            r7[r0] = r8
            int r6 = r6 + 1
        Le3:
            int r4 = r4 + 1
            goto La5
        Le6:
            t.b r15 = p331t.AbstractC6087b.m12541a(r15, r1, r2)
            r14.f24417a = r15
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = r4.f24422f
            java.text.DecimalFormat r1 = new java.text.DecimalFormat
            java.lang.String r2 = "##.##"
            r1.<init>(r2)
            r2 = 0
        La:
            int r3 = r4.f24421e
            if (r2 >= r3) goto L37
            java.lang.String r3 = "["
            java.lang.StringBuilder r0 = android.support.v4.media.C0143b.m255a(r0, r3)
            int[] r3 = r4.f24419c
            r3 = r3[r2]
            r0.append(r3)
            java.lang.String r3 = " , "
            r0.append(r3)
            float[][] r3 = r4.f24420d
            r3 = r3[r2]
            java.lang.String r3 = r1.format(r3)
            r0.append(r3)
            java.lang.String r3 = "] "
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            int r2 = r2 + 1
            goto La
        L37:
            return r0
    }
}
