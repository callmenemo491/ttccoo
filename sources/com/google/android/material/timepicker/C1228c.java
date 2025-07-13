package com.google.android.material.timepicker;

/* renamed from: com.google.android.material.timepicker.c */
/* loaded from: classes.dex */
public class C1228c extends androidx.constraintlayout.widget.ConstraintLayout {

    /* renamed from: r0 */
    public final java.lang.Runnable f6543r0;

    /* renamed from: s0 */
    public int f6544s0;

    /* renamed from: t0 */
    public p340t8.C6189f f6545t0;

    /* renamed from: com.google.android.material.timepicker.c$a */
    public class a implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ com.google.android.material.timepicker.C1228c f6546Y;

        public a(com.google.android.material.timepicker.C1228c r1) {
                r0 = this;
                r0.f6546Y = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                com.google.android.material.timepicker.c r0 = r1.f6546Y
                r0.m3614s()
                return
        }
    }

    public C1228c(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public C1228c(android.content.Context r5, android.util.AttributeSet r6, int r7) {
            r4 = this;
            r4.<init>(r5, r6, r7)
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r5)
            r1 = 2131558499(0x7f0d0063, float:1.8742316E38)
            r0.inflate(r1, r4)
            t8.f r0 = new t8.f
            r0.<init>()
            r4.f6545t0 = r0
            t8.g r1 = new t8.g
            r2 = 1056964608(0x3f000000, float:0.5)
            r1.<init>(r2)
            t8.f$b r2 = r0.f24036Y
            t8.i r2 = r2.f24059a
            java.util.Objects.requireNonNull(r2)
            t8.i$b r3 = new t8.i$b
            r3.<init>(r2)
            r3.f24098e = r1
            r3.f24099f = r1
            r3.f24100g = r1
            r3.f24101h = r1
            t8.i r1 = r3.m12788a()
            t8.f$b r2 = r0.f24036Y
            r2.f24059a = r1
            r0.invalidateSelf()
            t8.f r0 = r4.f6545t0
            r1 = -1
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.m12773q(r1)
            t8.f r0 = r4.f6545t0
            java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
            p227n0.C4661t.c.m10569q(r4, r0)
            int[] r0 = p339t7.C6183a.f23993F
            r1 = 0
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r0, r7, r1)
            int r6 = r5.getDimensionPixelSize(r1, r1)
            r4.f6544s0 = r6
            com.google.android.material.timepicker.c$a r6 = new com.google.android.material.timepicker.c$a
            r6.<init>(r4)
            r4.f6543r0 = r6
            r5.recycle()
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void addView(android.view.View r1, int r2, android.view.ViewGroup.LayoutParams r3) {
            r0 = this;
            super.addView(r1, r2, r3)
            int r2 = r1.getId()
            r3 = -1
            if (r2 != r3) goto L13
            java.util.WeakHashMap<android.view.View, n0.w> r2 = p227n0.C4661t.f18570a
            int r2 = p227n0.C4661t.d.m10572a()
            r1.setId(r2)
        L13:
            android.os.Handler r1 = r0.getHandler()
            if (r1 == 0) goto L23
            java.lang.Runnable r2 = r0.f6543r0
            r1.removeCallbacks(r2)
            java.lang.Runnable r2 = r0.f6543r0
            r1.post(r2)
        L23:
            return
    }

    @Override // android.view.View
    public void onFinishInflate() {
            r0 = this;
            super.onFinishInflate()
            r0.m3614s()
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(android.view.View r2) {
            r1 = this;
            super.onViewRemoved(r2)
            android.os.Handler r2 = r1.getHandler()
            if (r2 == 0) goto L13
            java.lang.Runnable r0 = r1.f6543r0
            r2.removeCallbacks(r0)
            java.lang.Runnable r0 = r1.f6543r0
            r2.post(r0)
        L13:
            return
    }

    /* renamed from: s */
    public void m3614s() {
            r10 = this;
            int r0 = r10.getChildCount()
            r1 = 0
            r2 = 1
            r3 = 0
            r4 = 1
        L8:
            java.lang.String r5 = "skip"
            if (r3 >= r0) goto L1f
            android.view.View r6 = r10.getChildAt(r3)
            java.lang.Object r6 = r6.getTag()
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L1c
            int r4 = r4 + 1
        L1c:
            int r3 = r3 + 1
            goto L8
        L1f:
            androidx.constraintlayout.widget.b r3 = new androidx.constraintlayout.widget.b
            r3.<init>()
            r3.m946e(r10)
            r6 = 0
        L28:
            if (r1 >= r0) goto L5f
            android.view.View r7 = r10.getChildAt(r1)
            int r8 = r7.getId()
            r9 = 2131362031(0x7f0a00ef, float:1.8343831E38)
            if (r8 == r9) goto L5c
            java.lang.Object r8 = r7.getTag()
            boolean r8 = r5.equals(r8)
            if (r8 == 0) goto L42
            goto L5c
        L42:
            int r7 = r7.getId()
            int r8 = r10.f6544s0
            androidx.constraintlayout.widget.b$a r7 = r3.m950i(r7)
            androidx.constraintlayout.widget.b$b r7 = r7.f1794d
            r7.f1857x = r9
            r7.f1858y = r8
            r7.f1859z = r6
            r7 = 1135869952(0x43b40000, float:360.0)
            int r8 = r0 - r4
            float r8 = (float) r8
            float r7 = r7 / r8
            float r7 = r7 + r6
            r6 = r7
        L5c:
            int r1 = r1 + 1
            goto L28
        L5f:
            r3.m944c(r10, r2)
            r0 = 0
            r10.setConstraintSet(r0)
            r10.requestLayout()
            return
    }

    @Override // android.view.View
    public void setBackgroundColor(int r2) {
            r1 = this;
            t8.f r0 = r1.f6545t0
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r0.m12773q(r2)
            return
    }
}
