package p346u;

/* renamed from: u.r */
/* loaded from: classes.dex */
public abstract class AbstractC6273r {

    /* renamed from: a */
    public p331t.AbstractC6087b f24409a;

    /* renamed from: b */
    public int[] f24410b;

    /* renamed from: c */
    public float[] f24411c;

    /* renamed from: d */
    public int f24412d;

    /* renamed from: e */
    public java.lang.String f24413e;

    /* renamed from: u.r$a */
    public static class a extends p346u.AbstractC6273r {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p346u.AbstractC6273r
        /* renamed from: c */
        public void mo12901c(android.view.View r4, float r5) {
                r3 = this;
                t.b r0 = r3.f24409a
                double r1 = (double) r5
                r5 = 0
                double r0 = r0.mo12531b(r1, r5)
                float r5 = (float) r0
                r4.setAlpha(r5)
                return
        }
    }

    /* renamed from: u.r$b */
    public static class b extends p346u.AbstractC6273r {

        /* renamed from: f */
        public android.util.SparseArray<p422y.C7091a> f24414f;

        /* renamed from: g */
        public float[] f24415g;

        public b(java.lang.String r2, android.util.SparseArray<p422y.C7091a> r3) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = ","
                java.lang.String[] r2 = r2.split(r0)
                r0 = 1
                r2 = r2[r0]
                r1.f24414f = r3
                return
        }

        @Override // p346u.AbstractC6273r
        /* renamed from: b */
        public void mo12900b(int r1, float r2) {
                r0 = this;
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "don't call for custom attribute call setPoint(pos, ConstraintAttribute)"
                r1.<init>(r2)
                throw r1
        }

        @Override // p346u.AbstractC6273r
        /* renamed from: c */
        public void mo12901c(android.view.View r4, float r5) {
                r3 = this;
                t.b r0 = r3.f24409a
                double r1 = (double) r5
                float[] r5 = r3.f24415g
                r0.mo12533d(r1, r5)
                android.util.SparseArray<y.a> r5 = r3.f24414f
                r0 = 0
                java.lang.Object r5 = r5.valueAt(r0)
                y.a r5 = (p422y.C7091a) r5
                float[] r0 = r3.f24415g
                r5.m14204g(r4, r0)
                return
        }

        @Override // p346u.AbstractC6273r
        /* renamed from: d */
        public void mo12902d(int r12) {
                r11 = this;
                android.util.SparseArray<y.a> r0 = r11.f24414f
                int r0 = r0.size()
                android.util.SparseArray<y.a> r1 = r11.f24414f
                r2 = 0
                java.lang.Object r1 = r1.valueAt(r2)
                y.a r1 = (p422y.C7091a) r1
                int r1 = r1.m14203d()
                double[] r3 = new double[r0]
                float[] r4 = new float[r1]
                r11.f24415g = r4
                r4 = 2
                int[] r4 = new int[r4]
                r5 = 1
                r4[r5] = r1
                r4[r2] = r0
                java.lang.Class<double> r1 = double.class
                java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r4)
                double[][] r1 = (double[][]) r1
                r4 = 0
            L2a:
                if (r4 >= r0) goto L5c
                android.util.SparseArray<y.a> r5 = r11.f24414f
                int r5 = r5.keyAt(r4)
                android.util.SparseArray<y.a> r6 = r11.f24414f
                java.lang.Object r6 = r6.valueAt(r4)
                y.a r6 = (p422y.C7091a) r6
                double r7 = (double) r5
                r9 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
                double r7 = r7 * r9
                r3[r4] = r7
                float[] r5 = r11.f24415g
                r6.m14202c(r5)
                r5 = 0
            L4a:
                float[] r6 = r11.f24415g
                int r7 = r6.length
                if (r5 >= r7) goto L59
                r7 = r1[r4]
                r6 = r6[r5]
                double r8 = (double) r6
                r7[r5] = r8
                int r5 = r5 + 1
                goto L4a
            L59:
                int r4 = r4 + 1
                goto L2a
            L5c:
                t.b r12 = p331t.AbstractC6087b.m12541a(r12, r3, r1)
                r11.f24409a = r12
                return
        }
    }

    /* renamed from: u.r$c */
    public static class c extends p346u.AbstractC6273r {
        public c() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p346u.AbstractC6273r
        /* renamed from: c */
        public void mo12901c(android.view.View r4, float r5) {
                r3 = this;
                t.b r0 = r3.f24409a
                double r1 = (double) r5
                r5 = 0
                double r0 = r0.mo12531b(r1, r5)
                float r5 = (float) r0
                r4.setElevation(r5)
                return
        }
    }

    /* renamed from: u.r$d */
    public static class d extends p346u.AbstractC6273r {
        public d() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p346u.AbstractC6273r
        /* renamed from: c */
        public void mo12901c(android.view.View r1, float r2) {
                r0 = this;
                return
        }
    }

    /* renamed from: u.r$e */
    public static class e extends p346u.AbstractC6273r {
        public e() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p346u.AbstractC6273r
        /* renamed from: c */
        public void mo12901c(android.view.View r4, float r5) {
                r3 = this;
                t.b r0 = r3.f24409a
                double r1 = (double) r5
                r5 = 0
                double r0 = r0.mo12531b(r1, r5)
                float r5 = (float) r0
                r4.setPivotX(r5)
                return
        }
    }

    /* renamed from: u.r$f */
    public static class f extends p346u.AbstractC6273r {
        public f() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p346u.AbstractC6273r
        /* renamed from: c */
        public void mo12901c(android.view.View r4, float r5) {
                r3 = this;
                t.b r0 = r3.f24409a
                double r1 = (double) r5
                r5 = 0
                double r0 = r0.mo12531b(r1, r5)
                float r5 = (float) r0
                r4.setPivotY(r5)
                return
        }
    }

    /* renamed from: u.r$g */
    public static class g extends p346u.AbstractC6273r {

        /* renamed from: f */
        public boolean f24416f;

        public g() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f24416f = r0
                return
        }

        @Override // p346u.AbstractC6273r
        /* renamed from: c */
        public void mo12901c(android.view.View r10, float r11) {
                r9 = this;
                java.lang.String r0 = "unable to setProgress"
                java.lang.String r1 = "SplineSet"
                boolean r2 = r10 instanceof androidx.constraintlayout.motion.widget.MotionLayout
                r3 = 0
                if (r2 == 0) goto L17
                androidx.constraintlayout.motion.widget.MotionLayout r10 = (androidx.constraintlayout.motion.widget.MotionLayout) r10
                t.b r0 = r9.f24409a
                double r1 = (double) r11
                double r0 = r0.mo12531b(r1, r3)
                float r11 = (float) r0
                r10.setProgress(r11)
                goto L4d
            L17:
                boolean r2 = r9.f24416f
                if (r2 == 0) goto L1c
                return
            L1c:
                r2 = 0
                r4 = 1
                java.lang.Class r5 = r10.getClass()     // Catch: java.lang.NoSuchMethodException -> L2f
                java.lang.String r6 = "setProgress"
                java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch: java.lang.NoSuchMethodException -> L2f
                java.lang.Class r8 = java.lang.Float.TYPE     // Catch: java.lang.NoSuchMethodException -> L2f
                r7[r3] = r8     // Catch: java.lang.NoSuchMethodException -> L2f
                java.lang.reflect.Method r2 = r5.getMethod(r6, r7)     // Catch: java.lang.NoSuchMethodException -> L2f
                goto L31
            L2f:
                r9.f24416f = r4
            L31:
                if (r2 == 0) goto L4d
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L47 java.lang.IllegalAccessException -> L49
                t.b r5 = r9.f24409a     // Catch: java.lang.reflect.InvocationTargetException -> L47 java.lang.IllegalAccessException -> L49
                double r6 = (double) r11     // Catch: java.lang.reflect.InvocationTargetException -> L47 java.lang.IllegalAccessException -> L49
                double r5 = r5.mo12531b(r6, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L47 java.lang.IllegalAccessException -> L49
                float r11 = (float) r5     // Catch: java.lang.reflect.InvocationTargetException -> L47 java.lang.IllegalAccessException -> L49
                java.lang.Float r11 = java.lang.Float.valueOf(r11)     // Catch: java.lang.reflect.InvocationTargetException -> L47 java.lang.IllegalAccessException -> L49
                r4[r3] = r11     // Catch: java.lang.reflect.InvocationTargetException -> L47 java.lang.IllegalAccessException -> L49
                r2.invoke(r10, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L47 java.lang.IllegalAccessException -> L49
                goto L4d
            L47:
                r10 = move-exception
                goto L4a
            L49:
                r10 = move-exception
            L4a:
                android.util.Log.e(r1, r0, r10)
            L4d:
                return
        }
    }

    /* renamed from: u.r$h */
    public static class h extends p346u.AbstractC6273r {
        public h() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p346u.AbstractC6273r
        /* renamed from: c */
        public void mo12901c(android.view.View r4, float r5) {
                r3 = this;
                t.b r0 = r3.f24409a
                double r1 = (double) r5
                r5 = 0
                double r0 = r0.mo12531b(r1, r5)
                float r5 = (float) r0
                r4.setRotation(r5)
                return
        }
    }

    /* renamed from: u.r$i */
    public static class i extends p346u.AbstractC6273r {
        public i() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p346u.AbstractC6273r
        /* renamed from: c */
        public void mo12901c(android.view.View r4, float r5) {
                r3 = this;
                t.b r0 = r3.f24409a
                double r1 = (double) r5
                r5 = 0
                double r0 = r0.mo12531b(r1, r5)
                float r5 = (float) r0
                r4.setRotationX(r5)
                return
        }
    }

    /* renamed from: u.r$j */
    public static class j extends p346u.AbstractC6273r {
        public j() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p346u.AbstractC6273r
        /* renamed from: c */
        public void mo12901c(android.view.View r4, float r5) {
                r3 = this;
                t.b r0 = r3.f24409a
                double r1 = (double) r5
                r5 = 0
                double r0 = r0.mo12531b(r1, r5)
                float r5 = (float) r0
                r4.setRotationY(r5)
                return
        }
    }

    /* renamed from: u.r$k */
    public static class k extends p346u.AbstractC6273r {
        public k() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p346u.AbstractC6273r
        /* renamed from: c */
        public void mo12901c(android.view.View r4, float r5) {
                r3 = this;
                t.b r0 = r3.f24409a
                double r1 = (double) r5
                r5 = 0
                double r0 = r0.mo12531b(r1, r5)
                float r5 = (float) r0
                r4.setScaleX(r5)
                return
        }
    }

    /* renamed from: u.r$l */
    public static class l extends p346u.AbstractC6273r {
        public l() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p346u.AbstractC6273r
        /* renamed from: c */
        public void mo12901c(android.view.View r4, float r5) {
                r3 = this;
                t.b r0 = r3.f24409a
                double r1 = (double) r5
                r5 = 0
                double r0 = r0.mo12531b(r1, r5)
                float r5 = (float) r0
                r4.setScaleY(r5)
                return
        }
    }

    /* renamed from: u.r$m */
    public static class m extends p346u.AbstractC6273r {
        public m() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p346u.AbstractC6273r
        /* renamed from: c */
        public void mo12901c(android.view.View r4, float r5) {
                r3 = this;
                t.b r0 = r3.f24409a
                double r1 = (double) r5
                r5 = 0
                double r0 = r0.mo12531b(r1, r5)
                float r5 = (float) r0
                r4.setTranslationX(r5)
                return
        }
    }

    /* renamed from: u.r$n */
    public static class n extends p346u.AbstractC6273r {
        public n() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p346u.AbstractC6273r
        /* renamed from: c */
        public void mo12901c(android.view.View r4, float r5) {
                r3 = this;
                t.b r0 = r3.f24409a
                double r1 = (double) r5
                r5 = 0
                double r0 = r0.mo12531b(r1, r5)
                float r5 = (float) r0
                r4.setTranslationY(r5)
                return
        }
    }

    /* renamed from: u.r$o */
    public static class o extends p346u.AbstractC6273r {
        public o() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p346u.AbstractC6273r
        /* renamed from: c */
        public void mo12901c(android.view.View r4, float r5) {
                r3 = this;
                t.b r0 = r3.f24409a
                double r1 = (double) r5
                r5 = 0
                double r0 = r0.mo12531b(r1, r5)
                float r5 = (float) r0
                r4.setTranslationZ(r5)
                return
        }
    }

    public AbstractC6273r() {
            r2 = this;
            r2.<init>()
            r0 = 10
            int[] r1 = new int[r0]
            r2.f24410b = r1
            float[] r0 = new float[r0]
            r2.f24411c = r0
            return
    }

    /* renamed from: a */
    public float m12899a(float r4) {
            r3 = this;
            t.b r0 = r3.f24409a
            double r1 = (double) r4
            r4 = 0
            double r0 = r0.mo12531b(r1, r4)
            float r4 = (float) r0
            return r4
    }

    /* renamed from: b */
    public void mo12900b(int r4, float r5) {
            r3 = this;
            int[] r0 = r3.f24410b
            int r1 = r0.length
            int r2 = r3.f24412d
            int r2 = r2 + 1
            if (r1 >= r2) goto L1d
            int r1 = r0.length
            int r1 = r1 * 2
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            r3.f24410b = r0
            float[] r0 = r3.f24411c
            int r1 = r0.length
            int r1 = r1 * 2
            float[] r0 = java.util.Arrays.copyOf(r0, r1)
            r3.f24411c = r0
        L1d:
            int[] r0 = r3.f24410b
            int r1 = r3.f24412d
            r0[r1] = r4
            float[] r4 = r3.f24411c
            r4[r1] = r5
            int r1 = r1 + 1
            r3.f24412d = r1
            return
    }

    /* renamed from: c */
    public abstract void mo12901c(android.view.View r1, float r2);

    /* renamed from: d */
    public void mo12902d(int r15) {
            r14 = this;
            int r0 = r14.f24412d
            if (r0 != 0) goto L5
            return
        L5:
            int[] r1 = r14.f24410b
            float[] r2 = r14.f24411c
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
        L17:
            if (r6 <= 0) goto L67
            int r6 = r6 + (-1)
            r7 = r4[r6]
            int r6 = r6 + (-1)
            r8 = r4[r6]
            if (r7 >= r8) goto L17
            r9 = r1[r8]
            r10 = r7
            r11 = r10
        L27:
            if (r10 >= r8) goto L42
            r12 = r1[r10]
            if (r12 > r9) goto L3f
            r12 = r1[r11]
            r13 = r1[r10]
            r1[r11] = r13
            r1[r10] = r12
            r12 = r2[r11]
            r13 = r2[r10]
            r2[r11] = r13
            r2[r10] = r12
            int r11 = r11 + 1
        L3f:
            int r10 = r10 + 1
            goto L27
        L42:
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
            goto L17
        L67:
            r1 = 1
            r2 = 1
        L69:
            int r4 = r14.f24412d
            if (r1 >= r4) goto L7c
            int[] r4 = r14.f24410b
            int r6 = r1 + (-1)
            r6 = r4[r6]
            r4 = r4[r1]
            if (r6 == r4) goto L79
            int r2 = r2 + 1
        L79:
            int r1 = r1 + 1
            goto L69
        L7c:
            double[] r1 = new double[r2]
            int[] r0 = new int[r0]
            r0[r3] = r3
            r0[r5] = r2
            java.lang.Class<double> r2 = double.class
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r2, r0)
            double[][] r0 = (double[][]) r0
            r2 = 0
            r3 = 0
        L8e:
            int r4 = r14.f24412d
            if (r2 >= r4) goto Lbb
            if (r2 <= 0) goto L9f
            int[] r4 = r14.f24410b
            r6 = r4[r2]
            int r7 = r2 + (-1)
            r4 = r4[r7]
            if (r6 != r4) goto L9f
            goto Lb8
        L9f:
            int[] r4 = r14.f24410b
            r4 = r4[r2]
            double r6 = (double) r4
            r8 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r6 = r6 * r8
            r1[r3] = r6
            r4 = r0[r3]
            float[] r6 = r14.f24411c
            r6 = r6[r2]
            double r6 = (double) r6
            r4[r5] = r6
            int r3 = r3 + 1
        Lb8:
            int r2 = r2 + 1
            goto L8e
        Lbb:
            t.b r15 = p331t.AbstractC6087b.m12541a(r15, r1, r0)
            r14.f24409a = r15
            return
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = r5.f24413e
            java.text.DecimalFormat r1 = new java.text.DecimalFormat
            java.lang.String r2 = "##.##"
            r1.<init>(r2)
            r2 = 0
        La:
            int r3 = r5.f24412d
            if (r2 >= r3) goto L38
            java.lang.String r3 = "["
            java.lang.StringBuilder r0 = android.support.v4.media.C0143b.m255a(r0, r3)
            int[] r3 = r5.f24410b
            r3 = r3[r2]
            r0.append(r3)
            java.lang.String r3 = " , "
            r0.append(r3)
            float[] r3 = r5.f24411c
            r3 = r3[r2]
            double r3 = (double) r3
            java.lang.String r3 = r1.format(r3)
            r0.append(r3)
            java.lang.String r3 = "] "
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            int r2 = r2 + 1
            goto La
        L38:
            return r0
    }
}
