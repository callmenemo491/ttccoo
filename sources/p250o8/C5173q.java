package p250o8;

/* renamed from: o8.q */
/* loaded from: classes.dex */
public final class C5173q extends p194l.AbstractC4151b {

    /* renamed from: j */
    public static final android.util.Property<p250o8.C5173q, java.lang.Float> f20284j = null;

    /* renamed from: d */
    public android.animation.ObjectAnimator f20285d;

    /* renamed from: e */
    public p423y0.C7100b f20286e;

    /* renamed from: f */
    public final p250o8.AbstractC5159c f20287f;

    /* renamed from: g */
    public int f20288g;

    /* renamed from: h */
    public boolean f20289h;

    /* renamed from: i */
    public float f20290i;

    /* renamed from: o8.q$a */
    public static class a extends android.util.Property<p250o8.C5173q, java.lang.Float> {
        public a(java.lang.Class r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // android.util.Property
        public java.lang.Float get(p250o8.C5173q r1) {
                r0 = this;
                o8.q r1 = (p250o8.C5173q) r1
                float r1 = r1.f20290i
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                return r1
        }

        @Override // android.util.Property
        public void set(p250o8.C5173q r7, java.lang.Float r8) {
                r6 = this;
                o8.q r7 = (p250o8.C5173q) r7
                java.lang.Float r8 = (java.lang.Float) r8
                float r8 = r8.floatValue()
                r7.f20290i = r8
                r0 = 1134985216(0x43a68000, float:333.0)
                float r8 = r8 * r0
                int r8 = (int) r8
                s.h<i0.b, android.view.MenuItem> r0 = r7.f17201b
                float[] r0 = (float[]) r0
                r1 = 0
                r2 = 0
                r0[r2] = r1
                r0 = 667(0x29b, float:9.35E-43)
                float r8 = r7.m9198d(r8, r2, r0)
                s.h<i0.b, android.view.MenuItem> r0 = r7.f17201b
                float[] r0 = (float[]) r0
                y0.b r1 = r7.f20286e
                float r1 = r1.getInterpolation(r8)
                r3 = 2
                r0[r3] = r1
                r4 = 1
                r0[r4] = r1
                r0 = 1056939455(0x3eff9dbf, float:0.49925038)
                float r8 = r8 + r0
                s.h<i0.b, android.view.MenuItem> r0 = r7.f17201b
                float[] r0 = (float[]) r0
                y0.b r1 = r7.f20286e
                float r8 = r1.getInterpolation(r8)
                r1 = 4
                r0[r1] = r8
                r1 = 3
                r0[r1] = r8
                s.h<i0.b, android.view.MenuItem> r8 = r7.f17201b
                float[] r8 = (float[]) r8
                r0 = 5
                r5 = 1065353216(0x3f800000, float:1.0)
                r8[r0] = r5
                boolean r0 = r7.f20289h
                if (r0 == 0) goto L77
                r8 = r8[r1]
                int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
                if (r8 >= 0) goto L77
                s.h<i0.c, android.view.SubMenu> r8 = r7.f17202c
                int[] r8 = (int[]) r8
                r0 = r8[r4]
                r8[r3] = r0
                r0 = r8[r2]
                r8[r4] = r0
                o8.c r0 = r7.f20287f
                int[] r0 = r0.f20231c
                int r1 = r7.f20288g
                r0 = r0[r1]
                java.lang.Object r1 = r7.f17200a
                o8.n r1 = (p250o8.C5170n) r1
                int r1 = r1.f20275h0
                int r0 = p124h7.C2939x3.m7284j(r0, r1)
                r8[r2] = r0
                r7.f20289h = r2
            L77:
                java.lang.Object r7 = r7.f17200a
                o8.n r7 = (p250o8.C5170n) r7
                r7.invalidateSelf()
                return
        }
    }

    static {
            o8.q$a r0 = new o8.q$a
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r2 = "animationFraction"
            r0.<init>(r1, r2)
            p250o8.C5173q.f20284j = r0
            return
    }

    public C5173q(p250o8.C5176t r2) {
            r1 = this;
            r0 = 3
            r1.<init>(r0)
            r0 = 1
            r1.f20288g = r0
            r1.f20287f = r2
            y0.b r2 = new y0.b
            r2.<init>()
            r1.f20286e = r2
            return
    }

    @Override // p194l.AbstractC4151b
    /* renamed from: c */
    public void mo9197c() {
            r1 = this;
            android.animation.ObjectAnimator r0 = r1.f20285d
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            return
    }

    @Override // p194l.AbstractC4151b
    /* renamed from: g */
    public void mo9201g() {
            r0 = this;
            r0.m11491l()
            return
    }

    @Override // p194l.AbstractC4151b
    /* renamed from: h */
    public void mo9202h(p348u1.AbstractC6284b r1) {
            r0 = this;
            return
    }

    @Override // p194l.AbstractC4151b
    /* renamed from: i */
    public void mo9203i() {
            r0 = this;
            return
    }

    @Override // p194l.AbstractC4151b
    /* renamed from: j */
    public void mo9204j() {
            r3 = this;
            android.animation.ObjectAnimator r0 = r3.f20285d
            if (r0 != 0) goto L2d
            android.util.Property<o8.q, java.lang.Float> r0 = p250o8.C5173q.f20284j
            r1 = 2
            float[] r1 = new float[r1]
            r1 = {x0036: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r3, r0, r1)
            r3.f20285d = r0
            r1 = 333(0x14d, double:1.645E-321)
            r0.setDuration(r1)
            android.animation.ObjectAnimator r0 = r3.f20285d
            r1 = 0
            r0.setInterpolator(r1)
            android.animation.ObjectAnimator r0 = r3.f20285d
            r1 = -1
            r0.setRepeatCount(r1)
            android.animation.ObjectAnimator r0 = r3.f20285d
            o8.p r1 = new o8.p
            r1.<init>(r3)
            r0.addListener(r1)
        L2d:
            r3.m11491l()
            android.animation.ObjectAnimator r0 = r3.f20285d
            r0.start()
            return
    }

    @Override // p194l.AbstractC4151b
    /* renamed from: k */
    public void mo9205k() {
            r0 = this;
            return
    }

    /* renamed from: l */
    public void m11491l() {
            r3 = this;
            r0 = 1
            r3.f20289h = r0
            r3.f20288g = r0
            s.h<i0.c, android.view.SubMenu> r0 = r3.f17202c
            int[] r0 = (int[]) r0
            o8.c r1 = r3.f20287f
            int[] r1 = r1.f20231c
            r2 = 0
            r1 = r1[r2]
            java.lang.Object r2 = r3.f17200a
            o8.n r2 = (p250o8.C5170n) r2
            int r2 = r2.f20275h0
            int r1 = p124h7.C2939x3.m7284j(r1, r2)
            java.util.Arrays.fill(r0, r1)
            return
    }
}
