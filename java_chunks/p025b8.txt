package p025b8;

/* renamed from: b8.a */
/* loaded from: classes.dex */
public class C0687a {

    /* renamed from: a */
    public final com.google.android.material.button.MaterialButton f3874a;

    /* renamed from: b */
    public p340t8.C6192i f3875b;

    /* renamed from: c */
    public int f3876c;

    /* renamed from: d */
    public int f3877d;

    /* renamed from: e */
    public int f3878e;

    /* renamed from: f */
    public int f3879f;

    /* renamed from: g */
    public int f3880g;

    /* renamed from: h */
    public int f3881h;

    /* renamed from: i */
    public android.graphics.PorterDuff.Mode f3882i;

    /* renamed from: j */
    public android.content.res.ColorStateList f3883j;

    /* renamed from: k */
    public android.content.res.ColorStateList f3884k;

    /* renamed from: l */
    public android.content.res.ColorStateList f3885l;

    /* renamed from: m */
    public android.graphics.drawable.Drawable f3886m;

    /* renamed from: n */
    public boolean f3887n;

    /* renamed from: o */
    public boolean f3888o;

    /* renamed from: p */
    public boolean f3889p;

    /* renamed from: q */
    public boolean f3890q;

    /* renamed from: r */
    public android.graphics.drawable.LayerDrawable f3891r;

    /* renamed from: s */
    public int f3892s;

    public C0687a(com.google.android.material.button.MaterialButton r2, p340t8.C6192i r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f3887n = r0
            r1.f3888o = r0
            r1.f3889p = r0
            r1.f3874a = r2
            r1.f3875b = r3
            return
    }

    /* renamed from: a */
    public p340t8.InterfaceC6196m m2248a() {
            r3 = this;
            android.graphics.drawable.LayerDrawable r0 = r3.f3891r
            if (r0 == 0) goto L24
            int r0 = r0.getNumberOfLayers()
            r1 = 1
            if (r0 <= r1) goto L24
            android.graphics.drawable.LayerDrawable r0 = r3.f3891r
            int r0 = r0.getNumberOfLayers()
            r2 = 2
            if (r0 <= r2) goto L1d
            android.graphics.drawable.LayerDrawable r0 = r3.f3891r
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r2)
        L1a:
            t8.m r0 = (p340t8.InterfaceC6196m) r0
            return r0
        L1d:
            android.graphics.drawable.LayerDrawable r0 = r3.f3891r
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
            goto L1a
        L24:
            r0 = 0
            return r0
    }

    /* renamed from: b */
    public p340t8.C6189f m2249b() {
            r1 = this;
            r0 = 0
            t8.f r0 = r1.m2250c(r0)
            return r0
    }

    /* renamed from: c */
    public final p340t8.C6189f m2250c(boolean r3) {
            r2 = this;
            android.graphics.drawable.LayerDrawable r0 = r2.f3891r
            if (r0 == 0) goto L22
            int r0 = r0.getNumberOfLayers()
            if (r0 <= 0) goto L22
            android.graphics.drawable.LayerDrawable r0 = r2.f3891r
            r1 = 0
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
            android.graphics.drawable.InsetDrawable r0 = (android.graphics.drawable.InsetDrawable) r0
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            android.graphics.drawable.LayerDrawable r0 = (android.graphics.drawable.LayerDrawable) r0
            r3 = r3 ^ 1
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r3)
            t8.f r3 = (p340t8.C6189f) r3
            return r3
        L22:
            r3 = 0
            return r3
    }

    /* renamed from: d */
    public final p340t8.C6189f m2251d() {
            r1 = this;
            r0 = 1
            t8.f r0 = r1.m2250c(r0)
            return r0
    }

    /* renamed from: e */
    public void m2252e(p340t8.C6192i r3) {
            r2 = this;
            r2.f3875b = r3
            t8.f r0 = r2.m2249b()
            if (r0 == 0) goto L13
            t8.f r0 = r2.m2249b()
            t8.f$b r1 = r0.f24036Y
            r1.f24059a = r3
            r0.invalidateSelf()
        L13:
            t8.f r0 = r2.m2251d()
            if (r0 == 0) goto L24
            t8.f r0 = r2.m2251d()
            t8.f$b r1 = r0.f24036Y
            r1.f24059a = r3
            r0.invalidateSelf()
        L24:
            t8.m r0 = r2.m2248a()
            if (r0 == 0) goto L31
            t8.m r0 = r2.m2248a()
            r0.setShapeAppearanceModel(r3)
        L31:
            return
    }

    /* renamed from: f */
    public final void m2253f(int r8, int r9) {
            r7 = this;
            com.google.android.material.button.MaterialButton r0 = r7.f3874a
            java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
            int r0 = p227n0.C4661t.d.m10577f(r0)
            com.google.android.material.button.MaterialButton r1 = r7.f3874a
            int r1 = r1.getPaddingTop()
            com.google.android.material.button.MaterialButton r2 = r7.f3874a
            int r2 = p227n0.C4661t.d.m10576e(r2)
            com.google.android.material.button.MaterialButton r3 = r7.f3874a
            int r3 = r3.getPaddingBottom()
            int r4 = r7.f3878e
            int r5 = r7.f3879f
            r7.f3879f = r9
            r7.f3878e = r8
            boolean r6 = r7.f3888o
            if (r6 != 0) goto L29
            r7.m2254g()
        L29:
            com.google.android.material.button.MaterialButton r6 = r7.f3874a
            int r1 = r1 + r8
            int r1 = r1 - r4
            int r3 = r3 + r9
            int r3 = r3 - r5
            p227n0.C4661t.d.m10582k(r6, r0, r1, r2, r3)
            return
    }

    /* renamed from: g */
    public final void m2254g() {
            r12 = this;
            com.google.android.material.button.MaterialButton r0 = r12.f3874a
            t8.f r1 = new t8.f
            t8.i r2 = r12.f3875b
            r1.<init>(r2)
            com.google.android.material.button.MaterialButton r2 = r12.f3874a
            android.content.Context r2 = r2.getContext()
            r1.m12770n(r2)
            android.content.res.ColorStateList r2 = r12.f3883j
            r1.setTintList(r2)
            android.graphics.PorterDuff$Mode r2 = r12.f3882i
            if (r2 == 0) goto L1e
            r1.setTintMode(r2)
        L1e:
            int r2 = r12.f3881h
            float r2 = (float) r2
            android.content.res.ColorStateList r3 = r12.f3884k
            r1.m12777u(r2, r3)
            t8.f r2 = new t8.f
            t8.i r3 = r12.f3875b
            r2.<init>(r3)
            r3 = 0
            r2.setTint(r3)
            int r4 = r12.f3881h
            float r4 = (float) r4
            boolean r5 = r12.f3887n
            if (r5 == 0) goto L42
            com.google.android.material.button.MaterialButton r5 = r12.f3874a
            r6 = 2130968838(0x7f040106, float:1.754634E38)
            int r5 = p124h7.C2939x3.m7286l(r5, r6)
            goto L43
        L42:
            r5 = 0
        L43:
            r2.m12776t(r4, r5)
            t8.f r4 = new t8.f
            t8.i r5 = r12.f3875b
            r4.<init>(r5)
            r12.f3886m = r4
            r5 = -1
            r4.setTint(r5)
            android.graphics.drawable.RippleDrawable r4 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r5 = r12.f3885l
            android.content.res.ColorStateList r5 = p308r8.C5799a.m12171c(r5)
            android.graphics.drawable.LayerDrawable r7 = new android.graphics.drawable.LayerDrawable
            r6 = 2
            android.graphics.drawable.Drawable[] r6 = new android.graphics.drawable.Drawable[r6]
            r6[r3] = r2
            r2 = 1
            r6[r2] = r1
            r7.<init>(r6)
            android.graphics.drawable.InsetDrawable r1 = new android.graphics.drawable.InsetDrawable
            int r8 = r12.f3876c
            int r9 = r12.f3878e
            int r10 = r12.f3877d
            int r11 = r12.f3879f
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)
            android.graphics.drawable.Drawable r2 = r12.f3886m
            r4.<init>(r5, r1, r2)
            r12.f3891r = r4
            r0.setInternalBackground(r4)
            t8.f r0 = r12.m2249b()
            if (r0 == 0) goto L8c
            int r1 = r12.f3892s
            float r1 = (float) r1
            r0.m12772p(r1)
        L8c:
            return
    }

    /* renamed from: h */
    public final void m2255h() {
            r4 = this;
            t8.f r0 = r4.m2249b()
            t8.f r1 = r4.m2251d()
            if (r0 == 0) goto L29
            int r2 = r4.f3881h
            float r2 = (float) r2
            android.content.res.ColorStateList r3 = r4.f3884k
            r0.m12777u(r2, r3)
            if (r1 == 0) goto L29
            int r0 = r4.f3881h
            float r0 = (float) r0
            boolean r2 = r4.f3887n
            if (r2 == 0) goto L25
            com.google.android.material.button.MaterialButton r2 = r4.f3874a
            r3 = 2130968838(0x7f040106, float:1.754634E38)
            int r2 = p124h7.C2939x3.m7286l(r2, r3)
            goto L26
        L25:
            r2 = 0
        L26:
            r1.m12776t(r0, r2)
        L29:
            return
    }
}
