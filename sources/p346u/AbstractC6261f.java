package p346u;

/* renamed from: u.f */
/* loaded from: classes.dex */
public abstract class AbstractC6261f {

    /* renamed from: a */
    public p346u.AbstractC6261f.d f24283a;

    /* renamed from: b */
    public p422y.C7091a f24284b;

    /* renamed from: c */
    public java.lang.String f24285c;

    /* renamed from: d */
    public int f24286d;

    /* renamed from: e */
    public int f24287e;

    /* renamed from: f */
    public java.util.ArrayList<p346u.AbstractC6261f.p> f24288f;

    /* renamed from: u.f$a */
    public class a implements java.util.Comparator<p346u.AbstractC6261f.p> {
        public a(p346u.AbstractC6261f r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public int compare(p346u.AbstractC6261f.p r1, p346u.AbstractC6261f.p r2) {
                r0 = this;
                u.f$p r1 = (p346u.AbstractC6261f.p) r1
                u.f$p r2 = (p346u.AbstractC6261f.p) r2
                int r1 = r1.f24298a
                int r2 = r2.f24298a
                int r1 = java.lang.Integer.compare(r1, r2)
                return r1
        }
    }

    /* renamed from: u.f$b */
    public static class b extends p346u.AbstractC6261f {
        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p346u.AbstractC6261f
        /* renamed from: b */
        public void mo12879b(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.m12878a(r2)
                r1.setAlpha(r2)
                return
        }
    }

    /* renamed from: u.f$c */
    public static class c extends p346u.AbstractC6261f {

        /* renamed from: g */
        public float[] f24289g;

        public c() {
                r1 = this;
                r1.<init>()
                r0 = 1
                float[] r0 = new float[r0]
                r1.f24289g = r0
                return
        }

        @Override // p346u.AbstractC6261f
        /* renamed from: b */
        public void mo12879b(android.view.View r3, float r4) {
                r2 = this;
                float[] r0 = r2.f24289g
                float r4 = r2.m12878a(r4)
                r1 = 0
                r0[r1] = r4
                y.a r4 = r2.f24284b
                float[] r0 = r2.f24289g
                r4.m14204g(r3, r0)
                return
        }
    }

    /* renamed from: u.f$d */
    public static class d {

        /* renamed from: a */
        public p331t.C6091f f24290a;

        /* renamed from: b */
        public float[] f24291b;

        /* renamed from: c */
        public double[] f24292c;

        /* renamed from: d */
        public float[] f24293d;

        /* renamed from: e */
        public float[] f24294e;

        /* renamed from: f */
        public p331t.AbstractC6087b f24295f;

        /* renamed from: g */
        public double[] f24296g;

        public d(int r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                t.f r2 = new t.f
                r2.<init>()
                r0.f24290a = r2
                java.util.HashMap r2 = new java.util.HashMap
                r2.<init>()
                t.f r2 = r0.f24290a
                r2.f23488d = r1
                float[] r1 = new float[r3]
                r0.f24291b = r1
                double[] r1 = new double[r3]
                r0.f24292c = r1
                float[] r1 = new float[r3]
                r0.f24293d = r1
                float[] r1 = new float[r3]
                r0.f24294e = r1
                float[] r1 = new float[r3]
                return
        }
    }

    /* renamed from: u.f$e */
    public static class e extends p346u.AbstractC6261f {
        public e() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p346u.AbstractC6261f
        /* renamed from: b */
        public void mo12879b(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.m12878a(r2)
                r1.setElevation(r2)
                return
        }
    }

    /* renamed from: u.f$f */
    public static class f extends p346u.AbstractC6261f {
        public f() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p346u.AbstractC6261f
        /* renamed from: b */
        public void mo12879b(android.view.View r1, float r2) {
                r0 = this;
                return
        }
    }

    /* renamed from: u.f$g */
    public static class g extends p346u.AbstractC6261f {

        /* renamed from: g */
        public boolean f24297g;

        public g() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f24297g = r0
                return
        }

        @Override // p346u.AbstractC6261f
        /* renamed from: b */
        public void mo12879b(android.view.View r10, float r11) {
                r9 = this;
                java.lang.String r0 = "unable to setProgress"
                java.lang.String r1 = "KeyCycleOscillator"
                boolean r2 = r10 instanceof androidx.constraintlayout.motion.widget.MotionLayout
                if (r2 == 0) goto L12
                androidx.constraintlayout.motion.widget.MotionLayout r10 = (androidx.constraintlayout.motion.widget.MotionLayout) r10
                float r11 = r9.m12878a(r11)
                r10.setProgress(r11)
                goto L45
            L12:
                boolean r2 = r9.f24297g
                if (r2 == 0) goto L17
                return
            L17:
                r2 = 0
                r3 = 0
                r4 = 1
                java.lang.Class r5 = r10.getClass()     // Catch: java.lang.NoSuchMethodException -> L2b
                java.lang.String r6 = "setProgress"
                java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch: java.lang.NoSuchMethodException -> L2b
                java.lang.Class r8 = java.lang.Float.TYPE     // Catch: java.lang.NoSuchMethodException -> L2b
                r7[r3] = r8     // Catch: java.lang.NoSuchMethodException -> L2b
                java.lang.reflect.Method r2 = r5.getMethod(r6, r7)     // Catch: java.lang.NoSuchMethodException -> L2b
                goto L2d
            L2b:
                r9.f24297g = r4
            L2d:
                if (r2 == 0) goto L45
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L3f java.lang.IllegalAccessException -> L41
                float r11 = r9.m12878a(r11)     // Catch: java.lang.reflect.InvocationTargetException -> L3f java.lang.IllegalAccessException -> L41
                java.lang.Float r11 = java.lang.Float.valueOf(r11)     // Catch: java.lang.reflect.InvocationTargetException -> L3f java.lang.IllegalAccessException -> L41
                r4[r3] = r11     // Catch: java.lang.reflect.InvocationTargetException -> L3f java.lang.IllegalAccessException -> L41
                r2.invoke(r10, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L3f java.lang.IllegalAccessException -> L41
                goto L45
            L3f:
                r10 = move-exception
                goto L42
            L41:
                r10 = move-exception
            L42:
                android.util.Log.e(r1, r0, r10)
            L45:
                return
        }
    }

    /* renamed from: u.f$h */
    public static class h extends p346u.AbstractC6261f {
        public h() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p346u.AbstractC6261f
        /* renamed from: b */
        public void mo12879b(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.m12878a(r2)
                r1.setRotation(r2)
                return
        }
    }

    /* renamed from: u.f$i */
    public static class i extends p346u.AbstractC6261f {
        public i() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p346u.AbstractC6261f
        /* renamed from: b */
        public void mo12879b(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.m12878a(r2)
                r1.setRotationX(r2)
                return
        }
    }

    /* renamed from: u.f$j */
    public static class j extends p346u.AbstractC6261f {
        public j() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p346u.AbstractC6261f
        /* renamed from: b */
        public void mo12879b(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.m12878a(r2)
                r1.setRotationY(r2)
                return
        }
    }

    /* renamed from: u.f$k */
    public static class k extends p346u.AbstractC6261f {
        public k() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p346u.AbstractC6261f
        /* renamed from: b */
        public void mo12879b(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.m12878a(r2)
                r1.setScaleX(r2)
                return
        }
    }

    /* renamed from: u.f$l */
    public static class l extends p346u.AbstractC6261f {
        public l() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p346u.AbstractC6261f
        /* renamed from: b */
        public void mo12879b(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.m12878a(r2)
                r1.setScaleY(r2)
                return
        }
    }

    /* renamed from: u.f$m */
    public static class m extends p346u.AbstractC6261f {
        public m() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p346u.AbstractC6261f
        /* renamed from: b */
        public void mo12879b(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.m12878a(r2)
                r1.setTranslationX(r2)
                return
        }
    }

    /* renamed from: u.f$n */
    public static class n extends p346u.AbstractC6261f {
        public n() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p346u.AbstractC6261f
        /* renamed from: b */
        public void mo12879b(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.m12878a(r2)
                r1.setTranslationY(r2)
                return
        }
    }

    /* renamed from: u.f$o */
    public static class o extends p346u.AbstractC6261f {
        public o() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p346u.AbstractC6261f
        /* renamed from: b */
        public void mo12879b(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.m12878a(r2)
                r1.setTranslationZ(r2)
                return
        }
    }

    /* renamed from: u.f$p */
    public static class p {

        /* renamed from: a */
        public int f24298a;

        /* renamed from: b */
        public float f24299b;

        /* renamed from: c */
        public float f24300c;

        /* renamed from: d */
        public float f24301d;

        public p(int r1, float r2, float r3, float r4) {
                r0 = this;
                r0.<init>()
                r0.f24298a = r1
                r0.f24299b = r4
                r0.f24300c = r3
                r0.f24301d = r2
                return
        }
    }

    public AbstractC6261f() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f24286d = r0
            r1.f24287e = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f24288f = r0
            return
    }

    /* renamed from: a */
    public float m12878a(float r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            u.f$d r2 = r0.f24283a
            t.b r3 = r2.f24295f
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L13
            double r6 = (double) r1
            double[] r8 = r2.f24296g
            r3.mo12532c(r6, r8)
            goto L23
        L13:
            double[] r3 = r2.f24296g
            float[] r6 = r2.f24294e
            r6 = r6[r5]
            double r6 = (double) r6
            r3[r5] = r6
            float[] r6 = r2.f24291b
            r6 = r6[r5]
            double r6 = (double) r6
            r3[r4] = r6
        L23:
            double[] r3 = r2.f24296g
            r5 = r3[r5]
            t.f r3 = r2.f24290a
            double r7 = (double) r1
            int r1 = r3.f23488d
            r9 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            r11 = 4616189618054758400(0x4010000000000000, double:4.0)
            r13 = 4611686018427387904(0x4000000000000000, double:2.0)
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            switch(r1) {
                case 1: goto L84;
                case 2: goto L74;
                case 3: goto L6a;
                case 4: goto L61;
                case 5: goto L56;
                case 6: goto L45;
                default: goto L3a;
            }
        L3a:
            double r7 = r3.m12549b(r7)
            double r7 = r7 * r9
            double r7 = java.lang.Math.sin(r7)
            goto L90
        L45:
            double r7 = r3.m12549b(r7)
            double r7 = r7 * r11
            double r7 = r7 % r11
            double r7 = r7 - r13
            double r7 = java.lang.Math.abs(r7)
            double r7 = r15 - r7
            double r7 = r7 * r7
            goto L81
        L56:
            double r7 = r3.m12549b(r7)
            double r7 = r7 * r9
            double r7 = java.lang.Math.cos(r7)
            goto L90
        L61:
            double r7 = r3.m12549b(r7)
            double r7 = r7 * r13
            double r7 = r7 + r15
            double r7 = r7 % r13
            goto L81
        L6a:
            double r7 = r3.m12549b(r7)
            double r7 = r7 * r13
            double r7 = r7 + r15
            double r7 = r7 % r13
            double r7 = r7 - r15
            goto L90
        L74:
            double r7 = r3.m12549b(r7)
            double r7 = r7 * r11
            double r7 = r7 + r15
            double r7 = r7 % r11
            double r7 = r7 - r13
            double r7 = java.lang.Math.abs(r7)
        L81:
            double r7 = r15 - r7
            goto L90
        L84:
            r9 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r7 = r3.m12549b(r7)
            double r7 = r7 % r15
            double r9 = r9 - r7
            double r7 = java.lang.Math.signum(r9)
        L90:
            double[] r1 = r2.f24296g
            r2 = r1[r4]
            double r7 = r7 * r2
            double r7 = r7 + r5
            float r1 = (float) r7
            return r1
    }

    /* renamed from: b */
    public abstract void mo12879b(android.view.View r1, float r2);

    @android.annotation.TargetApi(19)
    /* renamed from: c */
    public void m12880c(float r21) {
            r20 = this;
            r0 = r20
            java.lang.Class<double> r1 = double.class
            java.util.ArrayList<u.f$p> r2 = r0.f24288f
            int r2 = r2.size()
            if (r2 != 0) goto Ld
            return
        Ld:
            java.util.ArrayList<u.f$p> r3 = r0.f24288f
            u.f$a r4 = new u.f$a
            r4.<init>(r0)
            java.util.Collections.sort(r3, r4)
            double[] r3 = new double[r2]
            r4 = 2
            int[] r5 = new int[r4]
            r6 = 1
            r5[r6] = r4
            r7 = 0
            r5[r7] = r2
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r1, r5)
            double[][] r5 = (double[][]) r5
            u.f$d r8 = new u.f$d
            int r9 = r0.f24286d
            int r10 = r0.f24287e
            r8.<init>(r9, r10, r2)
            r0.f24283a = r8
            java.util.ArrayList<u.f$p> r2 = r0.f24288f
            java.util.Iterator r2 = r2.iterator()
            r8 = 0
        L3a:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L7e
            java.lang.Object r9 = r2.next()
            u.f$p r9 = (p346u.AbstractC6261f.p) r9
            float r10 = r9.f24301d
            double r11 = (double) r10
            r13 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r11 = r11 * r13
            r3[r8] = r11
            r11 = r5[r8]
            float r12 = r9.f24299b
            double r13 = (double) r12
            r11[r7] = r13
            r11 = r5[r8]
            float r13 = r9.f24300c
            double r14 = (double) r13
            r11[r6] = r14
            u.f$d r11 = r0.f24283a
            int r9 = r9.f24298a
            double[] r14 = r11.f24292c
            double r6 = (double) r9
            r16 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r6 = r6 / r16
            r14[r8] = r6
            float[] r6 = r11.f24293d
            r6[r8] = r10
            float[] r6 = r11.f24294e
            r6[r8] = r13
            float[] r6 = r11.f24291b
            r6[r8] = r12
            int r8 = r8 + 1
            r6 = 1
            r7 = 0
            goto L3a
        L7e:
            u.f$d r2 = r0.f24283a
            double[] r6 = r2.f24292c
            int r6 = r6.length
            int[] r7 = new int[r4]
            r8 = 1
            r7[r8] = r4
            r4 = 0
            r7[r4] = r6
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r7)
            double[][] r1 = (double[][]) r1
            float[] r4 = r2.f24291b
            int r6 = r4.length
            int r6 = r6 + r8
            double[] r6 = new double[r6]
            r2.f24296g = r6
            int r4 = r4.length
            int r4 = r4 + r8
            double[] r4 = new double[r4]
            double[] r4 = r2.f24292c
            r6 = 0
            r7 = r4[r6]
            r9 = 0
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 <= 0) goto Lb1
            t.f r4 = r2.f24290a
            float[] r7 = r2.f24293d
            r7 = r7[r6]
            r4.m12548a(r9, r7)
        Lb1:
            double[] r4 = r2.f24292c
            int r6 = r4.length
            r7 = 1
            int r6 = r6 - r7
            r7 = r4[r6]
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r4 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r4 >= 0) goto Lc7
            t.f r4 = r2.f24290a
            float[] r7 = r2.f24293d
            r6 = r7[r6]
            r4.m12548a(r11, r6)
        Lc7:
            r4 = 0
        Lc8:
            int r6 = r1.length
            if (r4 >= r6) goto Lf6
            r6 = r1[r4]
            float[] r7 = r2.f24294e
            r7 = r7[r4]
            double r7 = (double) r7
            r11 = 0
            r6[r11] = r7
            r6 = 0
        Ld6:
            float[] r7 = r2.f24291b
            int r8 = r7.length
            if (r6 >= r8) goto Le6
            r8 = r1[r6]
            r7 = r7[r6]
            double r11 = (double) r7
            r7 = 1
            r8[r7] = r11
            int r6 = r6 + 1
            goto Ld6
        Le6:
            t.f r6 = r2.f24290a
            double[] r7 = r2.f24292c
            r11 = r7[r4]
            float[] r7 = r2.f24293d
            r7 = r7[r4]
            r6.m12548a(r11, r7)
            int r4 = r4 + 1
            goto Lc8
        Lf6:
            t.f r4 = r2.f24290a
            r7 = r9
            r6 = 0
        Lfa:
            float[] r11 = r4.f23485a
            int r12 = r11.length
            if (r6 >= r12) goto L106
            r11 = r11[r6]
            double r11 = (double) r11
            double r7 = r7 + r11
            int r6 = r6 + 1
            goto Lfa
        L106:
            r11 = r9
            r6 = 1
        L108:
            float[] r13 = r4.f23485a
            int r14 = r13.length
            r16 = 1073741824(0x40000000, float:2.0)
            if (r6 >= r14) goto L129
            int r14 = r6 + (-1)
            r17 = r13[r14]
            r13 = r13[r6]
            float r17 = r17 + r13
            float r13 = r17 / r16
            double[] r15 = r4.f23486b
            r18 = r15[r6]
            r14 = r15[r14]
            double r18 = r18 - r14
            double r13 = (double) r13
            double r18 = r18 * r13
            double r11 = r18 + r11
            int r6 = r6 + 1
            goto L108
        L129:
            r15 = 0
        L12a:
            float[] r6 = r4.f23485a
            int r13 = r6.length
            if (r15 >= r13) goto L13c
            r13 = r6[r15]
            double r13 = (double) r13
            double r18 = r7 / r11
            double r13 = r13 * r18
            float r13 = (float) r13
            r6[r15] = r13
            int r15 = r15 + 1
            goto L12a
        L13c:
            double[] r6 = r4.f23487c
            r7 = 0
            r6[r7] = r9
            r8 = 1
        L142:
            float[] r6 = r4.f23485a
            int r7 = r6.length
            if (r8 >= r7) goto L164
            int r7 = r8 + (-1)
            r9 = r6[r7]
            r6 = r6[r8]
            float r9 = r9 + r6
            float r9 = r9 / r16
            double[] r6 = r4.f23486b
            r10 = r6[r8]
            r12 = r6[r7]
            double r10 = r10 - r12
            double[] r6 = r4.f23487c
            r12 = r6[r7]
            double r14 = (double) r9
            double r10 = r10 * r14
            double r10 = r10 + r12
            r6[r8] = r10
            int r8 = r8 + 1
            goto L142
        L164:
            double[] r4 = r2.f24292c
            int r6 = r4.length
            r8 = 1
            if (r6 <= r8) goto L170
            r6 = 0
            t.b r1 = p331t.AbstractC6087b.m12541a(r6, r4, r1)
            goto L172
        L170:
            r6 = 0
            r1 = 0
        L172:
            r2.f24295f = r1
            p331t.AbstractC6087b.m12541a(r6, r3, r5)
            return
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = r5.f24285c
            java.text.DecimalFormat r1 = new java.text.DecimalFormat
            java.lang.String r2 = "##.##"
            r1.<init>(r2)
            java.util.ArrayList<u.f$p> r2 = r5.f24288f
            java.util.Iterator r2 = r2.iterator()
        Lf:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3f
            java.lang.Object r3 = r2.next()
            u.f$p r3 = (p346u.AbstractC6261f.p) r3
            java.lang.String r4 = "["
            java.lang.StringBuilder r0 = android.support.v4.media.C0143b.m255a(r0, r4)
            int r4 = r3.f24298a
            r0.append(r4)
            java.lang.String r4 = " , "
            r0.append(r4)
            float r3 = r3.f24299b
            double r3 = (double) r3
            java.lang.String r3 = r1.format(r3)
            r0.append(r3)
            java.lang.String r3 = "] "
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            goto Lf
        L3f:
            return r0
    }
}
