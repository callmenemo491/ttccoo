package p250o8;

/* renamed from: o8.s */
/* loaded from: classes.dex */
public final class C5175s extends p194l.AbstractC4151b {

    /* renamed from: l */
    public static final int[] f20292l = null;

    /* renamed from: m */
    public static final int[] f20293m = null;

    /* renamed from: n */
    public static final android.util.Property<p250o8.C5175s, java.lang.Float> f20294n = null;

    /* renamed from: d */
    public android.animation.ObjectAnimator f20295d;

    /* renamed from: e */
    public final android.view.animation.Interpolator[] f20296e;

    /* renamed from: f */
    public final p250o8.AbstractC5159c f20297f;

    /* renamed from: g */
    public int f20298g;

    /* renamed from: h */
    public boolean f20299h;

    /* renamed from: i */
    public float f20300i;

    /* renamed from: j */
    public boolean f20301j;

    /* renamed from: k */
    public p348u1.AbstractC6284b f20302k;

    /* renamed from: o8.s$a */
    public static class a extends android.util.Property<p250o8.C5175s, java.lang.Float> {
        public a(java.lang.Class r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // android.util.Property
        public java.lang.Float get(p250o8.C5175s r1) {
                r0 = this;
                o8.s r1 = (p250o8.C5175s) r1
                float r1 = r1.f20300i
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                return r1
        }

        @Override // android.util.Property
        public void set(p250o8.C5175s r7, java.lang.Float r8) {
                r6 = this;
                o8.s r7 = (p250o8.C5175s) r7
                java.lang.Float r8 = (java.lang.Float) r8
                float r8 = r8.floatValue()
                r7.f20300i = r8
                r0 = 1155596288(0x44e10000, float:1800.0)
                float r8 = r8 * r0
                int r8 = (int) r8
                r0 = 0
                r1 = 0
            L11:
                r2 = 4
                if (r1 >= r2) goto L3c
                int[] r2 = p250o8.C5175s.f20293m
                r2 = r2[r1]
                int[] r3 = p250o8.C5175s.f20292l
                r3 = r3[r1]
                float r2 = r7.m9198d(r8, r2, r3)
                android.view.animation.Interpolator[] r3 = r7.f20296e
                r3 = r3[r1]
                float r2 = r3.getInterpolation(r2)
                s.h<i0.b, android.view.MenuItem> r3 = r7.f17201b
                float[] r3 = (float[]) r3
                r4 = 0
                r5 = 1065353216(0x3f800000, float:1.0)
                float r2 = java.lang.Math.min(r5, r2)
                float r2 = java.lang.Math.max(r4, r2)
                r3[r1] = r2
                int r1 = r1 + 1
                goto L11
            L3c:
                boolean r8 = r7.f20299h
                if (r8 == 0) goto L5b
                s.h<i0.c, android.view.SubMenu> r8 = r7.f17202c
                int[] r8 = (int[]) r8
                o8.c r1 = r7.f20297f
                int[] r1 = r1.f20231c
                int r2 = r7.f20298g
                r1 = r1[r2]
                java.lang.Object r2 = r7.f17200a
                o8.n r2 = (p250o8.C5170n) r2
                int r2 = r2.f20275h0
                int r1 = p124h7.C2939x3.m7284j(r1, r2)
                java.util.Arrays.fill(r8, r1)
                r7.f20299h = r0
            L5b:
                java.lang.Object r7 = r7.f17200a
                o8.n r7 = (p250o8.C5170n) r7
                r7.invalidateSelf()
                return
        }
    }

    static {
            r0 = 4
            int[] r1 = new int[r0]
            r1 = {x001c: FILL_ARRAY_DATA , data: [533, 567, 850, 750} // fill-array
            p250o8.C5175s.f20292l = r1
            int[] r0 = new int[r0]
            r0 = {x0028: FILL_ARRAY_DATA , data: [1267, 1000, 333, 0} // fill-array
            p250o8.C5175s.f20293m = r0
            o8.s$a r0 = new o8.s$a
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r2 = "animationFraction"
            r0.<init>(r1, r2)
            p250o8.C5175s.f20294n = r0
            return
    }

    public C5175s(android.content.Context r4, p250o8.C5176t r5) {
            r3 = this;
            r0 = 2
            r3.<init>(r0)
            r1 = 0
            r3.f20298g = r1
            r2 = 0
            r3.f20302k = r2
            r3.f20297f = r5
            r5 = 4
            android.view.animation.Interpolator[] r5 = new android.view.animation.Interpolator[r5]
            r2 = 2130837513(0x7f020009, float:1.7279982E38)
            android.view.animation.Interpolator r2 = android.view.animation.AnimationUtils.loadInterpolator(r4, r2)
            r5[r1] = r2
            r1 = 1
            r2 = 2130837514(0x7f02000a, float:1.7279984E38)
            android.view.animation.Interpolator r2 = android.view.animation.AnimationUtils.loadInterpolator(r4, r2)
            r5[r1] = r2
            r1 = 2130837515(0x7f02000b, float:1.7279986E38)
            android.view.animation.Interpolator r1 = android.view.animation.AnimationUtils.loadInterpolator(r4, r1)
            r5[r0] = r1
            r0 = 3
            r1 = 2130837516(0x7f02000c, float:1.7279988E38)
            android.view.animation.Interpolator r4 = android.view.animation.AnimationUtils.loadInterpolator(r4, r1)
            r5[r0] = r4
            r3.f20296e = r5
            return
    }

    @Override // p194l.AbstractC4151b
    /* renamed from: c */
    public void mo9197c() {
            r1 = this;
            android.animation.ObjectAnimator r0 = r1.f20295d
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            return
    }

    @Override // p194l.AbstractC4151b
    /* renamed from: g */
    public void mo9201g() {
            r0 = this;
            r0.m11492l()
            return
    }

    @Override // p194l.AbstractC4151b
    /* renamed from: h */
    public void mo9202h(p348u1.AbstractC6284b r1) {
            r0 = this;
            r0.f20302k = r1
            return
    }

    @Override // p194l.AbstractC4151b
    /* renamed from: i */
    public void mo9203i() {
            r2 = this;
            java.lang.Object r0 = r2.f17200a
            o8.n r0 = (p250o8.C5170n) r0
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L14
            r0 = 1
            r2.f20301j = r0
            android.animation.ObjectAnimator r0 = r2.f20295d
            r1 = 0
            r0.setRepeatCount(r1)
            goto L1b
        L14:
            android.animation.ObjectAnimator r0 = r2.f20295d
            if (r0 == 0) goto L1b
            r0.cancel()
        L1b:
            return
    }

    @Override // p194l.AbstractC4151b
    /* renamed from: j */
    public void mo9204j() {
            r3 = this;
            android.animation.ObjectAnimator r0 = r3.f20295d
            if (r0 != 0) goto L2d
            android.util.Property<o8.s, java.lang.Float> r0 = p250o8.C5175s.f20294n
            r1 = 2
            float[] r1 = new float[r1]
            r1 = {x0036: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r3, r0, r1)
            r3.f20295d = r0
            r1 = 1800(0x708, double:8.893E-321)
            r0.setDuration(r1)
            android.animation.ObjectAnimator r0 = r3.f20295d
            r1 = 0
            r0.setInterpolator(r1)
            android.animation.ObjectAnimator r0 = r3.f20295d
            r1 = -1
            r0.setRepeatCount(r1)
            android.animation.ObjectAnimator r0 = r3.f20295d
            o8.r r1 = new o8.r
            r1.<init>(r3)
            r0.addListener(r1)
        L2d:
            r3.m11492l()
            android.animation.ObjectAnimator r0 = r3.f20295d
            r0.start()
            return
    }

    @Override // p194l.AbstractC4151b
    /* renamed from: k */
    public void mo9205k() {
            r1 = this;
            r0 = 0
            r1.f20302k = r0
            return
    }

    /* renamed from: l */
    public void m11492l() {
            r4 = this;
            r0 = 0
            r4.f20298g = r0
            o8.c r1 = r4.f20297f
            int[] r1 = r1.f20231c
            r1 = r1[r0]
            java.lang.Object r2 = r4.f17200a
            o8.n r2 = (p250o8.C5170n) r2
            int r2 = r2.f20275h0
            int r1 = p124h7.C2939x3.m7284j(r1, r2)
            s.h<i0.c, android.view.SubMenu> r2 = r4.f17202c
            r3 = r2
            int[] r3 = (int[]) r3
            r3[r0] = r1
            int[] r2 = (int[]) r2
            r0 = 1
            r2[r0] = r1
            return
    }
}
