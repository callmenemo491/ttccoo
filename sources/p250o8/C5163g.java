package p250o8;

/* renamed from: o8.g */
/* loaded from: classes.dex */
public final class C5163g extends p194l.AbstractC4151b {

    /* renamed from: l */
    public static final int[] f20241l = null;

    /* renamed from: m */
    public static final int[] f20242m = null;

    /* renamed from: n */
    public static final int[] f20243n = null;

    /* renamed from: o */
    public static final android.util.Property<p250o8.C5163g, java.lang.Float> f20244o = null;

    /* renamed from: p */
    public static final android.util.Property<p250o8.C5163g, java.lang.Float> f20245p = null;

    /* renamed from: d */
    public android.animation.ObjectAnimator f20246d;

    /* renamed from: e */
    public android.animation.ObjectAnimator f20247e;

    /* renamed from: f */
    public final p423y0.C7100b f20248f;

    /* renamed from: g */
    public final p250o8.AbstractC5159c f20249g;

    /* renamed from: h */
    public int f20250h;

    /* renamed from: i */
    public float f20251i;

    /* renamed from: j */
    public float f20252j;

    /* renamed from: k */
    public p348u1.AbstractC6284b f20253k;

    /* renamed from: o8.g$a */
    public static class a extends android.util.Property<p250o8.C5163g, java.lang.Float> {
        public a(java.lang.Class r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // android.util.Property
        public java.lang.Float get(p250o8.C5163g r1) {
                r0 = this;
                o8.g r1 = (p250o8.C5163g) r1
                float r1 = r1.f20251i
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                return r1
        }

        @Override // android.util.Property
        public void set(p250o8.C5163g r9, java.lang.Float r10) {
                r8 = this;
                o8.g r9 = (p250o8.C5163g) r9
                java.lang.Float r10 = (java.lang.Float) r10
                float r10 = r10.floatValue()
                r9.f20251i = r10
                r0 = 1168687104(0x45a8c000, float:5400.0)
                float r0 = r0 * r10
                int r0 = (int) r0
                s.h<i0.b, android.view.MenuItem> r1 = r9.f17201b
                float[] r1 = (float[]) r1
                r2 = 1153302528(0x44be0000, float:1520.0)
                float r10 = r10 * r2
                r2 = -1046478848(0xffffffffc1a00000, float:-20.0)
                float r2 = r2 + r10
                r3 = 0
                r1[r3] = r2
                r2 = 1
                r1[r2] = r10
                r10 = 0
            L22:
                r1 = 4
                if (r10 >= r1) goto L5e
                int[] r1 = p250o8.C5163g.f20241l
                r1 = r1[r10]
                r4 = 667(0x29b, float:9.35E-43)
                float r1 = r9.m9198d(r0, r1, r4)
                s.h<i0.b, android.view.MenuItem> r5 = r9.f17201b
                float[] r5 = (float[]) r5
                r6 = r5[r2]
                y0.b r7 = r9.f20248f
                float r1 = r7.getInterpolation(r1)
                r7 = 1132068864(0x437a0000, float:250.0)
                float r1 = r1 * r7
                float r1 = r1 + r6
                r5[r2] = r1
                int[] r1 = p250o8.C5163g.f20242m
                r1 = r1[r10]
                float r1 = r9.m9198d(r0, r1, r4)
                s.h<i0.b, android.view.MenuItem> r4 = r9.f17201b
                float[] r4 = (float[]) r4
                r5 = r4[r3]
                y0.b r6 = r9.f20248f
                float r1 = r6.getInterpolation(r1)
                float r1 = r1 * r7
                float r1 = r1 + r5
                r4[r3] = r1
                int r10 = r10 + 1
                goto L22
            L5e:
                s.h<i0.b, android.view.MenuItem> r10 = r9.f17201b
                float[] r10 = (float[]) r10
                r4 = r10[r3]
                r5 = r10[r2]
                r6 = r10[r3]
                float r5 = r5 - r6
                float r6 = r9.f20252j
                float r5 = r5 * r6
                float r5 = r5 + r4
                r10[r3] = r5
                r4 = r10[r3]
                r5 = 1135869952(0x43b40000, float:360.0)
                float r4 = r4 / r5
                r10[r3] = r4
                r4 = r10[r2]
                float r4 = r4 / r5
                r10[r2] = r4
                r10 = 0
            L7d:
                if (r10 >= r1) goto Ldf
                int[] r2 = p250o8.C5163g.f20243n
                r2 = r2[r10]
                r4 = 333(0x14d, float:4.67E-43)
                float r2 = r9.m9198d(r0, r2, r4)
                r4 = 0
                int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r4 < 0) goto Ldc
                r4 = 1065353216(0x3f800000, float:1.0)
                int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r4 > 0) goto Ldc
                int r0 = r9.f20250h
                int r10 = r10 + r0
                o8.c r0 = r9.f20249g
                int[] r0 = r0.f20231c
                int r1 = r0.length
                int r10 = r10 % r1
                int r1 = r10 + 1
                int r4 = r0.length
                int r1 = r1 % r4
                r10 = r0[r10]
                java.lang.Object r0 = r9.f17200a
                o8.n r0 = (p250o8.C5170n) r0
                int r0 = r0.f20275h0
                int r10 = p124h7.C2939x3.m7284j(r10, r0)
                o8.c r0 = r9.f20249g
                int[] r0 = r0.f20231c
                r0 = r0[r1]
                java.lang.Object r1 = r9.f17200a
                o8.n r1 = (p250o8.C5170n) r1
                int r1 = r1.f20275h0
                int r0 = p124h7.C2939x3.m7284j(r0, r1)
                y0.b r1 = r9.f20248f
                float r1 = r1.getInterpolation(r2)
                s.h<i0.c, android.view.SubMenu> r2 = r9.f17202c
                int[] r2 = (int[]) r2
                u7.b r4 = p354u7.C6351b.f24808a
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.Integer r10 = r4.m13005a(r1, r10, r0)
                int r10 = r10.intValue()
                r2[r3] = r10
                goto Ldf
            Ldc:
                int r10 = r10 + 1
                goto L7d
            Ldf:
                java.lang.Object r9 = r9.f17200a
                o8.n r9 = (p250o8.C5170n) r9
                r9.invalidateSelf()
                return
        }
    }

    /* renamed from: o8.g$b */
    public static class b extends android.util.Property<p250o8.C5163g, java.lang.Float> {
        public b(java.lang.Class r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // android.util.Property
        public java.lang.Float get(p250o8.C5163g r1) {
                r0 = this;
                o8.g r1 = (p250o8.C5163g) r1
                float r1 = r1.f20252j
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                return r1
        }

        @Override // android.util.Property
        public void set(p250o8.C5163g r1, java.lang.Float r2) {
                r0 = this;
                o8.g r1 = (p250o8.C5163g) r1
                java.lang.Float r2 = (java.lang.Float) r2
                float r2 = r2.floatValue()
                r1.f20252j = r2
                return
        }
    }

    static {
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            r1 = 4
            int[] r2 = new int[r1]
            r2 = {x002c: FILL_ARRAY_DATA , data: [0, 1350, 2700, 4050} // fill-array
            p250o8.C5163g.f20241l = r2
            int[] r2 = new int[r1]
            r2 = {x0038: FILL_ARRAY_DATA , data: [667, 2017, 3367, 4717} // fill-array
            p250o8.C5163g.f20242m = r2
            int[] r1 = new int[r1]
            r1 = {x0044: FILL_ARRAY_DATA , data: [1000, 2350, 3700, 5050} // fill-array
            p250o8.C5163g.f20243n = r1
            o8.g$a r1 = new o8.g$a
            java.lang.String r2 = "animationFraction"
            r1.<init>(r0, r2)
            p250o8.C5163g.f20244o = r1
            o8.g$b r1 = new o8.g$b
            java.lang.String r2 = "completeEndFraction"
            r1.<init>(r0, r2)
            p250o8.C5163g.f20245p = r1
            return
    }

    public C5163g(p250o8.C5164h r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            r0 = 0
            r1.f20250h = r0
            r0 = 0
            r1.f20253k = r0
            r1.f20249g = r2
            y0.b r2 = new y0.b
            r2.<init>()
            r1.f20248f = r2
            return
    }

    @Override // p194l.AbstractC4151b
    /* renamed from: c */
    public void mo9197c() {
            r1 = this;
            android.animation.ObjectAnimator r0 = r1.f20246d
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            return
    }

    @Override // p194l.AbstractC4151b
    /* renamed from: g */
    public void mo9201g() {
            r0 = this;
            r0.m11477l()
            return
    }

    @Override // p194l.AbstractC4151b
    /* renamed from: h */
    public void mo9202h(p348u1.AbstractC6284b r1) {
            r0 = this;
            r0.f20253k = r1
            return
    }

    @Override // p194l.AbstractC4151b
    /* renamed from: i */
    public void mo9203i() {
            r1 = this;
            android.animation.ObjectAnimator r0 = r1.f20247e
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L9
            return
        L9:
            java.lang.Object r0 = r1.f17200a
            o8.n r0 = (p250o8.C5170n) r0
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L19
            android.animation.ObjectAnimator r0 = r1.f20247e
            r0.start()
            goto L1c
        L19:
            r1.mo9197c()
        L1c:
            return
    }

    @Override // p194l.AbstractC4151b
    /* renamed from: j */
    public void mo9204j() {
            r4 = this;
            android.animation.ObjectAnimator r0 = r4.f20246d
            r1 = 2
            if (r0 != 0) goto L2d
            android.util.Property<o8.g, java.lang.Float> r0 = p250o8.C5163g.f20244o
            float[] r2 = new float[r1]
            r2 = {x005e: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r4, r0, r2)
            r4.f20246d = r0
            r2 = 5400(0x1518, double:2.668E-320)
            r0.setDuration(r2)
            android.animation.ObjectAnimator r0 = r4.f20246d
            r2 = 0
            r0.setInterpolator(r2)
            android.animation.ObjectAnimator r0 = r4.f20246d
            r2 = -1
            r0.setRepeatCount(r2)
            android.animation.ObjectAnimator r0 = r4.f20246d
            o8.e r2 = new o8.e
            r2.<init>(r4)
            r0.addListener(r2)
        L2d:
            android.animation.ObjectAnimator r0 = r4.f20247e
            if (r0 != 0) goto L54
            android.util.Property<o8.g, java.lang.Float> r0 = p250o8.C5163g.f20245p
            float[] r1 = new float[r1]
            r1 = {x0066: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r4, r0, r1)
            r4.f20247e = r0
            r1 = 333(0x14d, double:1.645E-321)
            r0.setDuration(r1)
            android.animation.ObjectAnimator r0 = r4.f20247e
            y0.b r1 = r4.f20248f
            r0.setInterpolator(r1)
            android.animation.ObjectAnimator r0 = r4.f20247e
            o8.f r1 = new o8.f
            r1.<init>(r4)
            r0.addListener(r1)
        L54:
            r4.m11477l()
            android.animation.ObjectAnimator r0 = r4.f20246d
            r0.start()
            return
    }

    @Override // p194l.AbstractC4151b
    /* renamed from: k */
    public void mo9205k() {
            r1 = this;
            r0 = 0
            r1.f20253k = r0
            return
    }

    /* renamed from: l */
    public void m11477l() {
            r4 = this;
            r0 = 0
            r4.f20250h = r0
            s.h<i0.c, android.view.SubMenu> r1 = r4.f17202c
            int[] r1 = (int[]) r1
            o8.c r2 = r4.f20249g
            int[] r2 = r2.f20231c
            r2 = r2[r0]
            java.lang.Object r3 = r4.f17200a
            o8.n r3 = (p250o8.C5170n) r3
            int r3 = r3.f20275h0
            int r2 = p124h7.C2939x3.m7284j(r2, r3)
            r1[r0] = r2
            r0 = 0
            r4.f20252j = r0
            return
    }
}
