package p410x8;

/* renamed from: x8.l */
/* loaded from: classes.dex */
public final class C6971l {

    /* renamed from: a */
    public final android.content.Context f27219a;

    /* renamed from: b */
    public final com.google.android.material.textfield.TextInputLayout f27220b;

    /* renamed from: c */
    public android.widget.LinearLayout f27221c;

    /* renamed from: d */
    public int f27222d;

    /* renamed from: e */
    public android.widget.FrameLayout f27223e;

    /* renamed from: f */
    public android.animation.Animator f27224f;

    /* renamed from: g */
    public final float f27225g;

    /* renamed from: h */
    public int f27226h;

    /* renamed from: i */
    public int f27227i;

    /* renamed from: j */
    public java.lang.CharSequence f27228j;

    /* renamed from: k */
    public boolean f27229k;

    /* renamed from: l */
    public android.widget.TextView f27230l;

    /* renamed from: m */
    public java.lang.CharSequence f27231m;

    /* renamed from: n */
    public int f27232n;

    /* renamed from: o */
    public android.content.res.ColorStateList f27233o;

    /* renamed from: p */
    public java.lang.CharSequence f27234p;

    /* renamed from: q */
    public boolean f27235q;

    /* renamed from: r */
    public android.widget.TextView f27236r;

    /* renamed from: s */
    public int f27237s;

    /* renamed from: t */
    public android.content.res.ColorStateList f27238t;

    /* renamed from: u */
    public android.graphics.Typeface f27239u;

    /* renamed from: x8.l$a */
    public class a extends android.animation.AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ int f27240a;

        /* renamed from: b */
        public final /* synthetic */ android.widget.TextView f27241b;

        /* renamed from: c */
        public final /* synthetic */ int f27242c;

        /* renamed from: d */
        public final /* synthetic */ android.widget.TextView f27243d;

        /* renamed from: e */
        public final /* synthetic */ p410x8.C6971l f27244e;

        public a(p410x8.C6971l r1, int r2, android.widget.TextView r3, int r4, android.widget.TextView r5) {
                r0 = this;
                r0.f27244e = r1
                r0.f27240a = r2
                r0.f27241b = r3
                r0.f27242c = r4
                r0.f27243d = r5
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r3) {
                r2 = this;
                x8.l r3 = r2.f27244e
                int r0 = r2.f27240a
                r3.f27226h = r0
                r0 = 0
                r3.f27224f = r0
                android.widget.TextView r3 = r2.f27241b
                if (r3 == 0) goto L1f
                r1 = 4
                r3.setVisibility(r1)
                int r3 = r2.f27242c
                r1 = 1
                if (r3 != r1) goto L1f
                x8.l r3 = r2.f27244e
                android.widget.TextView r3 = r3.f27230l
                if (r3 == 0) goto L1f
                r3.setText(r0)
            L1f:
                android.widget.TextView r3 = r2.f27243d
                if (r3 == 0) goto L2e
                r0 = 0
                r3.setTranslationY(r0)
                android.widget.TextView r3 = r2.f27243d
                r0 = 1065353216(0x3f800000, float:1.0)
                r3.setAlpha(r0)
            L2e:
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r2) {
                r1 = this;
                android.widget.TextView r2 = r1.f27243d
                if (r2 == 0) goto L8
                r0 = 0
                r2.setVisibility(r0)
            L8:
                return
        }
    }

    public C6971l(com.google.android.material.textfield.TextInputLayout r2) {
            r1 = this;
            r1.<init>()
            android.content.Context r0 = r2.getContext()
            r1.f27219a = r0
            r1.f27220b = r2
            android.content.res.Resources r2 = r0.getResources()
            r0 = 2131165365(0x7f0700b5, float:1.7944945E38)
            int r2 = r2.getDimensionPixelSize(r0)
            float r2 = (float) r2
            r1.f27225g = r2
            return
    }

    /* renamed from: a */
    public void m14126a(android.widget.TextView r6, int r7) {
            r5 = this;
            android.widget.LinearLayout r0 = r5.f27221c
            r1 = 0
            r2 = -2
            if (r0 != 0) goto L40
            android.widget.FrameLayout r0 = r5.f27223e
            if (r0 != 0) goto L40
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            android.content.Context r3 = r5.f27219a
            r0.<init>(r3)
            r5.f27221c = r0
            r0.setOrientation(r1)
            com.google.android.material.textfield.TextInputLayout r0 = r5.f27220b
            android.widget.LinearLayout r3 = r5.f27221c
            r4 = -1
            r0.addView(r3, r4, r2)
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            android.content.Context r3 = r5.f27219a
            r0.<init>(r3)
            r5.f27223e = r0
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r2, r3)
            android.widget.LinearLayout r3 = r5.f27221c
            android.widget.FrameLayout r4 = r5.f27223e
            r3.addView(r4, r0)
            com.google.android.material.textfield.TextInputLayout r0 = r5.f27220b
            android.widget.EditText r0 = r0.getEditText()
            if (r0 == 0) goto L40
            r5.m14127b()
        L40:
            r0 = 1
            if (r7 == 0) goto L48
            if (r7 != r0) goto L46
            goto L48
        L46:
            r7 = 0
            goto L49
        L48:
            r7 = 1
        L49:
            if (r7 == 0) goto L56
            android.widget.FrameLayout r7 = r5.f27223e
            r7.setVisibility(r1)
            android.widget.FrameLayout r7 = r5.f27223e
            r7.addView(r6)
            goto L60
        L56:
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r7.<init>(r2, r2)
            android.widget.LinearLayout r2 = r5.f27221c
            r2.addView(r6, r7)
        L60:
            android.widget.LinearLayout r6 = r5.f27221c
            r6.setVisibility(r1)
            int r6 = r5.f27222d
            int r6 = r6 + r0
            r5.f27222d = r6
            return
    }

    /* renamed from: b */
    public void m14127b() {
            r9 = this;
            android.widget.LinearLayout r0 = r9.f27221c
            r1 = 0
            if (r0 == 0) goto Lf
            com.google.android.material.textfield.TextInputLayout r0 = r9.f27220b
            android.widget.EditText r0 = r0.getEditText()
            if (r0 == 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto L4c
            com.google.android.material.textfield.TextInputLayout r0 = r9.f27220b
            android.widget.EditText r0 = r0.getEditText()
            android.content.Context r2 = r9.f27219a
            boolean r2 = p288q8.C5599c.m11879e(r2)
            android.widget.LinearLayout r3 = r9.f27221c
            java.util.WeakHashMap<android.view.View, n0.w> r4 = p227n0.C4661t.f18570a
            int r4 = p227n0.C4661t.d.m10577f(r0)
            r5 = 2131165440(0x7f070100, float:1.7945097E38)
            int r4 = r9.m14133h(r2, r5, r4)
            r6 = 2131165441(0x7f070101, float:1.79451E38)
            android.content.Context r7 = r9.f27219a
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131165439(0x7f0700ff, float:1.7945095E38)
            int r7 = r7.getDimensionPixelSize(r8)
            int r6 = r9.m14133h(r2, r6, r7)
            int r0 = p227n0.C4661t.d.m10576e(r0)
            int r0 = r9.m14133h(r2, r5, r0)
            p227n0.C4661t.d.m10582k(r3, r4, r6, r0, r1)
        L4c:
            return
    }

    /* renamed from: c */
    public void m14128c() {
            r1 = this;
            android.animation.Animator r0 = r1.f27224f
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            return
    }

    /* renamed from: d */
    public final void m14129d(java.util.List<android.animation.Animator> r5, boolean r6, android.widget.TextView r7, int r8, int r9, int r10) {
            r4 = this;
            if (r7 == 0) goto L4d
            if (r6 != 0) goto L5
            goto L4d
        L5:
            if (r8 == r10) goto L9
            if (r8 != r9) goto L4d
        L9:
            r6 = 0
            r9 = 1
            if (r10 != r8) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            r1 = 0
            if (r0 == 0) goto L16
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L17
        L16:
            r0 = 0
        L17:
            android.util.Property r2 = android.view.View.ALPHA
            float[] r3 = new float[r9]
            r3[r6] = r0
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r7, r2, r3)
            r2 = 167(0xa7, double:8.25E-322)
            r0.setDuration(r2)
            android.animation.TimeInterpolator r2 = p354u7.C6350a.f24803a
            r0.setInterpolator(r2)
            r5.add(r0)
            if (r10 != r8) goto L4d
            android.util.Property r8 = android.view.View.TRANSLATION_Y
            r10 = 2
            float[] r10 = new float[r10]
            float r0 = r4.f27225g
            float r0 = -r0
            r10[r6] = r0
            r10[r9] = r1
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r7, r8, r10)
            r7 = 217(0xd9, double:1.07E-321)
            r6.setDuration(r7)
            android.animation.TimeInterpolator r7 = p354u7.C6350a.f24806d
            r6.setInterpolator(r7)
            r5.add(r6)
        L4d:
            return
    }

    /* renamed from: e */
    public boolean m14130e() {
            r2 = this;
            int r0 = r2.f27227i
            r1 = 1
            if (r0 != r1) goto L12
            android.widget.TextView r0 = r2.f27230l
            if (r0 == 0) goto L12
            java.lang.CharSequence r0 = r2.f27228j
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L12
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    /* renamed from: f */
    public final android.widget.TextView m14131f(int r2) {
            r1 = this;
            r0 = 1
            if (r2 == r0) goto Lb
            r0 = 2
            if (r2 == r0) goto L8
            r2 = 0
            return r2
        L8:
            android.widget.TextView r2 = r1.f27236r
            return r2
        Lb:
            android.widget.TextView r2 = r1.f27230l
            return r2
    }

    /* renamed from: g */
    public int m14132g() {
            r1 = this;
            android.widget.TextView r0 = r1.f27230l
            if (r0 == 0) goto L9
            int r0 = r0.getCurrentTextColor()
            goto La
        L9:
            r0 = -1
        La:
            return r0
    }

    /* renamed from: h */
    public final int m14133h(boolean r1, int r2, int r3) {
            r0 = this;
            if (r1 == 0) goto Lc
            android.content.Context r1 = r0.f27219a
            android.content.res.Resources r1 = r1.getResources()
            int r3 = r1.getDimensionPixelSize(r2)
        Lc:
            return r3
    }

    /* renamed from: i */
    public void m14134i() {
            r4 = this;
            r0 = 0
            r4.f27228j = r0
            r4.m14128c()
            int r1 = r4.f27226h
            r2 = 1
            if (r1 != r2) goto L1c
            boolean r1 = r4.f27235q
            if (r1 == 0) goto L19
            java.lang.CharSequence r1 = r4.f27234p
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L19
            r1 = 2
            goto L1a
        L19:
            r1 = 0
        L1a:
            r4.f27227i = r1
        L1c:
            int r1 = r4.f27226h
            int r2 = r4.f27227i
            android.widget.TextView r3 = r4.f27230l
            boolean r0 = r4.m14136k(r3, r0)
            r4.m14137l(r1, r2, r0)
            return
    }

    /* renamed from: j */
    public void m14135j(android.widget.TextView r3, int r4) {
            r2 = this;
            android.widget.LinearLayout r0 = r2.f27221c
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 1
            if (r4 == 0) goto Ld
            if (r4 != r1) goto Lb
            goto Ld
        Lb:
            r4 = 0
            goto Le
        Ld:
            r4 = 1
        Le:
            if (r4 == 0) goto L18
            android.widget.FrameLayout r4 = r2.f27223e
            if (r4 == 0) goto L18
            r4.removeView(r3)
            goto L1b
        L18:
            r0.removeView(r3)
        L1b:
            int r3 = r2.f27222d
            int r3 = r3 - r1
            r2.f27222d = r3
            android.widget.LinearLayout r4 = r2.f27221c
            if (r3 != 0) goto L29
            r3 = 8
            r4.setVisibility(r3)
        L29:
            return
    }

    /* renamed from: k */
    public final boolean m14136k(android.widget.TextView r3, java.lang.CharSequence r4) {
            r2 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r2.f27220b
            java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
            boolean r0 = p227n0.C4661t.f.m10588c(r0)
            if (r0 == 0) goto L26
            com.google.android.material.textfield.TextInputLayout r0 = r2.f27220b
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L26
            int r0 = r2.f27227i
            int r1 = r2.f27226h
            if (r0 != r1) goto L24
            if (r3 == 0) goto L24
            java.lang.CharSequence r3 = r3.getText()
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 != 0) goto L26
        L24:
            r3 = 1
            goto L27
        L26:
            r3 = 0
        L27:
            return r3
    }

    /* renamed from: l */
    public final void m14137l(int r15, int r16, boolean r17) {
            r14 = this;
            r7 = r14
            r8 = r15
            r9 = r16
            r10 = r17
            if (r8 != r9) goto L9
            return
        L9:
            r11 = 0
            if (r10 == 0) goto L49
            android.animation.AnimatorSet r12 = new android.animation.AnimatorSet
            r12.<init>()
            r7.f27224f = r12
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            boolean r2 = r7.f27235q
            android.widget.TextView r3 = r7.f27236r
            r4 = 2
            r0 = r14
            r1 = r13
            r5 = r15
            r6 = r16
            r0.m14129d(r1, r2, r3, r4, r5, r6)
            boolean r2 = r7.f27229k
            android.widget.TextView r3 = r7.f27230l
            r4 = 1
            r0.m14129d(r1, r2, r3, r4, r5, r6)
            p185k7.C3836i.m8628m(r12, r13)
            android.widget.TextView r3 = r14.m14131f(r15)
            android.widget.TextView r5 = r14.m14131f(r9)
            x8.l$a r6 = new x8.l$a
            r0 = r6
            r1 = r14
            r2 = r16
            r4 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            r12.addListener(r6)
            r12.start()
            goto L71
        L49:
            if (r8 != r9) goto L4c
            goto L71
        L4c:
            if (r9 == 0) goto L5c
            android.widget.TextView r0 = r14.m14131f(r9)
            if (r0 == 0) goto L5c
            r0.setVisibility(r11)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
        L5c:
            if (r8 == 0) goto L6f
            android.widget.TextView r0 = r14.m14131f(r15)
            if (r0 == 0) goto L6f
            r1 = 4
            r0.setVisibility(r1)
            r1 = 1
            if (r8 != r1) goto L6f
            r1 = 0
            r0.setText(r1)
        L6f:
            r7.f27226h = r9
        L71:
            com.google.android.material.textfield.TextInputLayout r0 = r7.f27220b
            r0.m3582w()
            com.google.android.material.textfield.TextInputLayout r0 = r7.f27220b
            r0.m3584y(r10, r11)
            com.google.android.material.textfield.TextInputLayout r0 = r7.f27220b
            r0.m3551F()
            return
    }
}
