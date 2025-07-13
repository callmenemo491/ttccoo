package com.google.android.material.transformation;

@java.lang.Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends com.google.android.material.transformation.ExpandableTransformationBehavior {

    /* renamed from: c */
    public final android.graphics.Rect f6557c;

    /* renamed from: d */
    public final android.graphics.RectF f6558d;

    /* renamed from: e */
    public final android.graphics.RectF f6559e;

    /* renamed from: f */
    public final int[] f6560f;

    /* renamed from: g */
    public float f6561g;

    /* renamed from: h */
    public float f6562h;

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    public class C1234a extends android.animation.AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f6563a;

        /* renamed from: b */
        public final /* synthetic */ android.view.View f6564b;

        /* renamed from: c */
        public final /* synthetic */ android.view.View f6565c;

        public C1234a(com.google.android.material.transformation.FabTransformationBehavior r1, boolean r2, android.view.View r3, android.view.View r4) {
                r0 = this;
                r0.f6563a = r2
                r0.f6564b = r3
                r0.f6565c = r4
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                boolean r2 = r1.f6563a
                if (r2 != 0) goto L17
                android.view.View r2 = r1.f6564b
                r0 = 4
                r2.setVisibility(r0)
                android.view.View r2 = r1.f6565c
                r0 = 1065353216(0x3f800000, float:1.0)
                r2.setAlpha(r0)
                android.view.View r2 = r1.f6565c
                r0 = 0
                r2.setVisibility(r0)
            L17:
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r2) {
                r1 = this;
                boolean r2 = r1.f6563a
                if (r2 == 0) goto L16
                android.view.View r2 = r1.f6564b
                r0 = 0
                r2.setVisibility(r0)
                android.view.View r2 = r1.f6565c
                r0 = 0
                r2.setAlpha(r0)
                android.view.View r2 = r1.f6565c
                r0 = 4
                r2.setVisibility(r0)
            L16:
                return
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    public static class C1235b {

        /* renamed from: a */
        public p354u7.C6356g f6566a;

        /* renamed from: b */
        public p354u7.C6358i f6567b;

        public C1235b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public FabTransformationBehavior() {
            r1 = this;
            r1.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.f6557c = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r1.f6558d = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r1.f6559e = r0
            r0 = 2
            int[] r0 = new int[r0]
            r1.f6560f = r0
            return
    }

    public FabTransformationBehavior(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f6557c = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f6558d = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f6559e = r1
            r1 = 2
            int[] r1 = new int[r1]
            r0.f6560f = r1
            return
    }

    /* renamed from: A */
    public abstract com.google.android.material.transformation.FabTransformationBehavior.C1235b mo3618A(android.content.Context r1, boolean r2);

    /* renamed from: B */
    public final android.view.ViewGroup m3619B(android.view.View r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L7
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            return r2
        L7:
            r2 = 0
            return r2
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
    /* renamed from: b */
    public boolean mo986b(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4) {
            r1 = this;
            int r2 = r3.getVisibility()
            r0 = 8
            if (r2 == r0) goto L1d
            boolean r2 = r4 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            r0 = 0
            if (r2 == 0) goto L1c
            com.google.android.material.floatingactionbutton.FloatingActionButton r4 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r4
            int r2 = r4.getExpandedComponentIdHint()
            if (r2 == 0) goto L1b
            int r3 = r3.getId()
            if (r2 != r3) goto L1c
        L1b:
            r0 = 1
        L1c:
            return r0
        L1d:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead."
            r2.<init>(r3)
            throw r2
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
    /* renamed from: c */
    public void mo987c(androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f r2) {
            r1 = this;
            int r0 = r2.f1937h
            if (r0 != 0) goto L8
            r0 = 80
            r2.f1937h = r0
        L8:
            return
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: u */
    public android.animation.AnimatorSet mo3617u(android.view.View r27, android.view.View r28, boolean r29, boolean r30) {
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r29
            android.content.Context r4 = r28.getContext()
            com.google.android.material.transformation.FabTransformationBehavior$b r4 = r0.mo3618A(r4, r3)
            if (r3 == 0) goto L1e
            float r5 = r27.getTranslationX()
            r0.f6561g = r5
            float r5 = r27.getTranslationY()
            r0.f6562h = r5
        L1e:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.WeakHashMap<android.view.View, n0.w> r7 = p227n0.C4661t.f18570a
            float r7 = p227n0.C4661t.h.m10604i(r28)
            float r8 = p227n0.C4661t.h.m10604i(r27)
            float r7 = r7 - r8
            r8 = 0
            r9 = 1
            r10 = 0
            if (r3 == 0) goto L49
            if (r30 != 0) goto L3e
            float r7 = -r7
            r2.setTranslationZ(r7)
        L3e:
            android.util.Property r7 = android.view.View.TRANSLATION_Z
            float[] r11 = new float[r9]
            r11[r10] = r8
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r2, r7, r11)
            goto L54
        L49:
            android.util.Property r11 = android.view.View.TRANSLATION_Z
            float[] r12 = new float[r9]
            float r7 = -r7
            r12[r10] = r7
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r2, r11, r12)
        L54:
            u7.g r11 = r4.f6566a
            java.lang.String r12 = "elevation"
            u7.h r11 = r11.m13009d(r12)
            r11.m13010a(r7)
            r5.add(r7)
            android.graphics.RectF r7 = r0.f6558d
            u7.i r11 = r4.f6567b
            float r11 = r0.m3621w(r1, r2, r11)
            u7.i r12 = r4.f6567b
            float r12 = r0.m3622x(r1, r2, r12)
            android.util.Pair r13 = r0.m3620v(r11, r12, r3, r4)
            java.lang.Object r14 = r13.first
            u7.h r14 = (p354u7.C6357h) r14
            java.lang.Object r13 = r13.second
            u7.h r13 = (p354u7.C6357h) r13
            if (r3 == 0) goto Lc6
            if (r30 != 0) goto L88
            float r15 = -r11
            r2.setTranslationX(r15)
            float r15 = -r12
            r2.setTranslationY(r15)
        L88:
            android.util.Property r15 = android.view.View.TRANSLATION_X
            r16 = r6
            float[] r6 = new float[r9]
            r6[r10] = r8
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r2, r15, r6)
            android.util.Property r15 = android.view.View.TRANSLATION_Y
            r17 = r6
            float[] r6 = new float[r9]
            r6[r10] = r8
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r2, r15, r6)
            float r11 = -r11
            float r12 = -r12
            float r11 = r0.m3623y(r4, r14, r11, r8)
            float r12 = r0.m3623y(r4, r13, r12, r8)
            android.graphics.Rect r15 = r0.f6557c
            r2.getWindowVisibleDisplayFrame(r15)
            android.graphics.RectF r8 = r0.f6558d
            r8.set(r15)
            android.graphics.RectF r15 = r0.f6559e
            r0.m3624z(r2, r15)
            r15.offset(r11, r12)
            r15.intersect(r8)
            r7.set(r15)
            r8 = r6
            r6 = r17
            goto Lde
        Lc6:
            r16 = r6
            android.util.Property r6 = android.view.View.TRANSLATION_X
            float[] r8 = new float[r9]
            float r11 = -r11
            r8[r10] = r11
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r2, r6, r8)
            android.util.Property r8 = android.view.View.TRANSLATION_Y
            float[] r11 = new float[r9]
            float r12 = -r12
            r11[r10] = r12
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r2, r8, r11)
        Lde:
            r14.m13010a(r6)
            r13.m13010a(r8)
            r5.add(r6)
            r5.add(r8)
            float r6 = r7.width()
            float r7 = r7.height()
            u7.i r8 = r4.f6567b
            float r8 = r0.m3621w(r1, r2, r8)
            u7.i r11 = r4.f6567b
            float r11 = r0.m3622x(r1, r2, r11)
            android.util.Pair r12 = r0.m3620v(r8, r11, r3, r4)
            java.lang.Object r13 = r12.first
            u7.h r13 = (p354u7.C6357h) r13
            java.lang.Object r12 = r12.second
            u7.h r12 = (p354u7.C6357h) r12
            android.util.Property r14 = android.view.View.TRANSLATION_X
            float[] r15 = new float[r9]
            if (r3 == 0) goto L111
            goto L113
        L111:
            float r8 = r0.f6561g
        L113:
            r15[r10] = r8
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r1, r14, r15)
            android.util.Property r14 = android.view.View.TRANSLATION_Y
            float[] r15 = new float[r9]
            if (r3 == 0) goto L120
            goto L122
        L120:
            float r11 = r0.f6562h
        L122:
            r15[r10] = r11
            android.animation.ObjectAnimator r11 = android.animation.ObjectAnimator.ofFloat(r1, r14, r15)
            r13.m13010a(r8)
            r12.m13010a(r11)
            r5.add(r8)
            r5.add(r11)
            boolean r8 = r2 instanceof p092f8.InterfaceC2082d
            if (r8 == 0) goto L18c
            boolean r11 = r1 instanceof android.widget.ImageView
            if (r11 != 0) goto L13d
            goto L18c
        L13d:
            r11 = r2
            f8.d r11 = (p092f8.InterfaceC2082d) r11
            r12 = r1
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            android.graphics.drawable.Drawable r12 = r12.getDrawable()
            if (r12 != 0) goto L14a
            goto L18c
        L14a:
            r12.mutate()
            r13 = 255(0xff, float:3.57E-43)
            if (r3 == 0) goto L161
            if (r30 != 0) goto L156
            r12.setAlpha(r13)
        L156:
            android.util.Property<android.graphics.drawable.Drawable, java.lang.Integer> r13 = p354u7.C6353d.f24810a
            int[] r14 = new int[r9]
            r14[r10] = r10
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofInt(r12, r13, r14)
            goto L16b
        L161:
            android.util.Property<android.graphics.drawable.Drawable, java.lang.Integer> r14 = p354u7.C6353d.f24810a
            int[] r15 = new int[r9]
            r15[r10] = r13
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofInt(r12, r14, r15)
        L16b:
            com.google.android.material.transformation.a r14 = new com.google.android.material.transformation.a
            r14.<init>(r0, r2)
            r13.addUpdateListener(r14)
            u7.g r14 = r4.f6566a
            java.lang.String r15 = "iconFade"
            u7.h r14 = r14.m13009d(r15)
            r14.m13010a(r13)
            r5.add(r13)
            com.google.android.material.transformation.b r13 = new com.google.android.material.transformation.b
            r13.<init>(r0, r11, r12)
            r11 = r16
            r11.add(r13)
            goto L18e
        L18c:
            r11 = r16
        L18e:
            if (r8 != 0) goto L198
            r22 = r4
            r1 = r5
            r18 = r8
            r3 = r11
            goto L2fc
        L198:
            r12 = r2
            f8.d r12 = (p092f8.InterfaceC2082d) r12
            u7.i r13 = r4.f6567b
            android.graphics.RectF r14 = r0.f6558d
            android.graphics.RectF r15 = r0.f6559e
            r0.m3624z(r1, r14)
            float r10 = r0.f6561g
            float r9 = r0.f6562h
            r14.offset(r10, r9)
            r0.m3624z(r2, r15)
            float r9 = r0.m3621w(r1, r2, r13)
            float r9 = -r9
            r10 = 0
            r15.offset(r9, r10)
            float r9 = r14.centerX()
            float r10 = r15.left
            float r9 = r9 - r10
            u7.i r10 = r4.f6567b
            android.graphics.RectF r13 = r0.f6558d
            android.graphics.RectF r14 = r0.f6559e
            r0.m3624z(r1, r13)
            float r15 = r0.f6561g
            r18 = r8
            float r8 = r0.f6562h
            r13.offset(r15, r8)
            r0.m3624z(r2, r14)
            float r8 = r0.m3622x(r1, r2, r10)
            float r8 = -r8
            r10 = 0
            r14.offset(r10, r8)
            float r8 = r13.centerY()
            float r10 = r14.top
            float r8 = r8 - r10
            r10 = r1
            com.google.android.material.floatingactionbutton.FloatingActionButton r10 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r10
            android.graphics.Rect r13 = r0.f6557c
            r10.m3454g(r13)
            android.graphics.Rect r10 = r0.f6557c
            int r10 = r10.width()
            float r10 = (float) r10
            r13 = 1073741824(0x40000000, float:2.0)
            float r10 = r10 / r13
            u7.g r13 = r4.f6566a
            java.lang.String r14 = "expansion"
            u7.h r13 = r13.m13009d(r14)
            if (r3 == 0) goto L26e
            if (r30 != 0) goto L209
            f8.d$e r14 = new f8.d$e
            r14.<init>(r9, r8, r10)
            r12.setRevealInfo(r14)
        L209:
            if (r30 == 0) goto L211
            f8.d$e r10 = r12.getRevealInfo()
            float r10 = r10.f9502c
        L211:
            r14 = 0
            float r15 = p185k7.C3828h5.m8593h(r9, r8, r14, r14)
            float r21 = p185k7.C3828h5.m8593h(r9, r8, r6, r14)
            float r6 = p185k7.C3828h5.m8593h(r9, r8, r6, r7)
            float r7 = p185k7.C3828h5.m8593h(r9, r8, r14, r7)
            int r14 = (r15 > r21 ? 1 : (r15 == r21 ? 0 : -1))
            if (r14 <= 0) goto L22f
            int r14 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r14 <= 0) goto L22f
            int r14 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            if (r14 <= 0) goto L22f
            goto L241
        L22f:
            int r14 = (r21 > r6 ? 1 : (r21 == r6 ? 0 : -1))
            if (r14 <= 0) goto L23a
            int r14 = (r21 > r7 ? 1 : (r21 == r7 ? 0 : -1))
            if (r14 <= 0) goto L23a
            r15 = r21
            goto L241
        L23a:
            int r14 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r14 <= 0) goto L240
            r15 = r6
            goto L241
        L240:
            r15 = r7
        L241:
            android.animation.Animator r6 = p092f8.C2080b.m5503a(r12, r9, r8, r15)
            com.google.android.material.transformation.c r7 = new com.google.android.material.transformation.c
            r7.<init>(r0, r12)
            r6.addListener(r7)
            long r14 = r13.f24817a
            int r7 = (int) r9
            int r8 = (int) r8
            r0 = 0
            int r9 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r9 <= 0) goto L264
            android.animation.Animator r7 = android.view.ViewAnimationUtils.createCircularReveal(r2, r7, r8, r10, r10)
            r7.setStartDelay(r0)
            r7.setDuration(r14)
            r5.add(r7)
        L264:
            r22 = r4
            r1 = r5
            r19 = r11
            r23 = r12
            r0 = r13
            goto L2ea
        L26e:
            f8.d$e r0 = r12.getRevealInfo()
            float r0 = r0.f9502c
            android.animation.Animator r6 = p092f8.C2080b.m5503a(r12, r9, r8, r10)
            long r14 = r13.f24817a
            int r1 = (int) r9
            int r7 = (int) r8
            r8 = 0
            int r19 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r19 <= 0) goto L28f
            android.animation.Animator r0 = android.view.ViewAnimationUtils.createCircularReveal(r2, r1, r7, r0, r0)
            r0.setStartDelay(r8)
            r0.setDuration(r14)
            r5.add(r0)
        L28f:
            long r14 = r13.f24817a
            long r8 = r13.f24818b
            u7.g r0 = r4.f6566a
            r21 = r6
            s.h<java.lang.String, u7.h> r6 = r0.f24815a
            int r6 = r6.f22812a0
            r22 = r4
            r19 = r11
            r3 = 0
            r11 = 0
        L2a2:
            if (r11 >= r6) goto L2c8
            r20 = r6
            s.h<java.lang.String, u7.h> r6 = r0.f24815a
            java.lang.Object r6 = r6.m12344l(r11)
            u7.h r6 = (p354u7.C6357h) r6
            r23 = r12
            r24 = r13
            long r12 = r6.f24817a
            r25 = r5
            long r5 = r6.f24818b
            long r12 = r12 + r5
            long r3 = java.lang.Math.max(r3, r12)
            int r11 = r11 + 1
            r6 = r20
            r12 = r23
            r13 = r24
            r5 = r25
            goto L2a2
        L2c8:
            r25 = r5
            r23 = r12
            r24 = r13
            long r14 = r14 + r8
            int r0 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r0 >= 0) goto L2e4
            android.animation.Animator r0 = android.view.ViewAnimationUtils.createCircularReveal(r2, r1, r7, r10, r10)
            r0.setStartDelay(r14)
            long r3 = r3 - r14
            r0.setDuration(r3)
            r1 = r25
            r1.add(r0)
            goto L2e6
        L2e4:
            r1 = r25
        L2e6:
            r6 = r21
            r0 = r24
        L2ea:
            r0.m13010a(r6)
            r1.add(r6)
            f8.a r0 = new f8.a
            r3 = r23
            r0.<init>(r3)
            r3 = r19
            r3.add(r0)
        L2fc:
            if (r18 != 0) goto L303
            r6 = r29
            r4 = r22
            goto L357
        L303:
            r0 = r2
            f8.d r0 = (p092f8.InterfaceC2082d) r0
            java.util.WeakHashMap<android.view.View, n0.w> r4 = p227n0.C4661t.f18570a
            android.content.res.ColorStateList r4 = p227n0.C4661t.h.m10602g(r27)
            if (r4 == 0) goto L31b
            int[] r5 = r27.getDrawableState()
            int r6 = r4.getDefaultColor()
            int r4 = r4.getColorForState(r5, r6)
            goto L31c
        L31b:
            r4 = 0
        L31c:
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r5 & r4
            r6 = r29
            if (r6 == 0) goto L336
            if (r30 != 0) goto L329
            r0.setCircularRevealScrimColor(r4)
        L329:
            android.util.Property<f8.d, java.lang.Integer> r4 = p092f8.InterfaceC2082d.d.f9499a
            r7 = 1
            int[] r8 = new int[r7]
            r9 = 0
            r8[r9] = r5
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofInt(r0, r4, r8)
            goto L342
        L336:
            r7 = 1
            r9 = 0
            android.util.Property<f8.d, java.lang.Integer> r5 = p092f8.InterfaceC2082d.d.f9499a
            int[] r8 = new int[r7]
            r8[r9] = r4
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofInt(r0, r5, r8)
        L342:
            u7.b r4 = p354u7.C6351b.f24808a
            r0.setEvaluator(r4)
            r4 = r22
            u7.g r5 = r4.f6566a
            java.lang.String r7 = "color"
            u7.h r5 = r5.m13009d(r7)
            r5.m13010a(r0)
            r1.add(r0)
        L357:
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 != 0) goto L35f
            r5 = r26
        L35d:
            r10 = 0
            goto L3be
        L35f:
            r0 = 2131362424(0x7f0a0278, float:1.8344628E38)
            android.view.View r0 = r2.findViewById(r0)
            r5 = r26
            if (r0 == 0) goto L36f
        L36a:
            android.view.ViewGroup r0 = r5.m3619B(r0)
            goto L383
        L36f:
            boolean r0 = r2 instanceof p451z8.C7258b
            if (r0 != 0) goto L37a
            boolean r0 = r2 instanceof p451z8.C7257a
            if (r0 == 0) goto L378
            goto L37a
        L378:
            r0 = r2
            goto L36a
        L37a:
            r0 = r2
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r7 = 0
            android.view.View r0 = r0.getChildAt(r7)
            goto L36a
        L383:
            if (r0 != 0) goto L386
            goto L35d
        L386:
            if (r6 == 0) goto L3a3
            if (r30 != 0) goto L394
            android.util.Property<android.view.ViewGroup, java.lang.Float> r7 = p354u7.C6352c.f24809a
            r8 = 0
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            r7.set(r0, r8)
        L394:
            android.util.Property<android.view.ViewGroup, java.lang.Float> r7 = p354u7.C6352c.f24809a
            r8 = 1
            float[] r8 = new float[r8]
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
            r8[r10] = r9
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r7, r8)
            goto L3b0
        L3a3:
            r8 = 1
            r10 = 0
            android.util.Property<android.view.ViewGroup, java.lang.Float> r7 = p354u7.C6352c.f24809a
            float[] r8 = new float[r8]
            r9 = 0
            r8[r10] = r9
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r7, r8)
        L3b0:
            u7.g r4 = r4.f6566a
            java.lang.String r7 = "contentFade"
            u7.h r4 = r4.m13009d(r7)
            r4.m13010a(r0)
            r1.add(r0)
        L3be:
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            p185k7.C3836i.m8628m(r0, r1)
            com.google.android.material.transformation.FabTransformationBehavior$a r1 = new com.google.android.material.transformation.FabTransformationBehavior$a
            r4 = r27
            r1.<init>(r5, r6, r2, r4)
            r0.addListener(r1)
            int r1 = r3.size()
        L3d4:
            if (r10 >= r1) goto L3e2
            java.lang.Object r2 = r3.get(r10)
            android.animation.Animator$AnimatorListener r2 = (android.animation.Animator.AnimatorListener) r2
            r0.addListener(r2)
            int r10 = r10 + 1
            goto L3d4
        L3e2:
            return r0
    }

    /* renamed from: v */
    public final android.util.Pair<p354u7.C6357h, p354u7.C6357h> m3620v(float r2, float r3, boolean r4, com.google.android.material.transformation.FabTransformationBehavior.C1235b r5) {
            r1 = this;
            r0 = 0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto L2e
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L2e
        La:
            if (r4 == 0) goto L10
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 < 0) goto L14
        L10:
            if (r4 != 0) goto L21
            if (r2 <= 0) goto L21
        L14:
            u7.g r2 = r5.f6566a
            java.lang.String r3 = "translationXCurveUpwards"
            u7.h r2 = r2.m13009d(r3)
            u7.g r3 = r5.f6566a
            java.lang.String r4 = "translationYCurveUpwards"
            goto L3a
        L21:
            u7.g r2 = r5.f6566a
            java.lang.String r3 = "translationXCurveDownwards"
            u7.h r2 = r2.m13009d(r3)
            u7.g r3 = r5.f6566a
            java.lang.String r4 = "translationYCurveDownwards"
            goto L3a
        L2e:
            u7.g r2 = r5.f6566a
            java.lang.String r3 = "translationXLinear"
            u7.h r2 = r2.m13009d(r3)
            u7.g r3 = r5.f6566a
            java.lang.String r4 = "translationYLinear"
        L3a:
            u7.h r3 = r3.m13009d(r4)
            android.util.Pair r4 = new android.util.Pair
            r4.<init>(r2, r3)
            return r4
    }

    /* renamed from: w */
    public final float m3621w(android.view.View r4, android.view.View r5, p354u7.C6358i r6) {
            r3 = this;
            android.graphics.RectF r0 = r3.f6558d
            android.graphics.RectF r1 = r3.f6559e
            r3.m3624z(r4, r0)
            float r4 = r3.f6561g
            float r2 = r3.f6562h
            r0.offset(r4, r2)
            r3.m3624z(r5, r1)
            java.util.Objects.requireNonNull(r6)
            float r4 = r1.centerX()
            float r5 = r0.centerX()
            float r4 = r4 - r5
            r5 = 0
            float r4 = r4 + r5
            return r4
    }

    /* renamed from: x */
    public final float m3622x(android.view.View r4, android.view.View r5, p354u7.C6358i r6) {
            r3 = this;
            android.graphics.RectF r0 = r3.f6558d
            android.graphics.RectF r1 = r3.f6559e
            r3.m3624z(r4, r0)
            float r4 = r3.f6561g
            float r2 = r3.f6562h
            r0.offset(r4, r2)
            r3.m3624z(r5, r1)
            java.util.Objects.requireNonNull(r6)
            float r4 = r1.centerY()
            float r5 = r0.centerY()
            float r4 = r4 - r5
            r5 = 0
            float r4 = r4 + r5
            return r4
    }

    /* renamed from: y */
    public final float m3623y(com.google.android.material.transformation.FabTransformationBehavior.C1235b r9, p354u7.C6357h r10, float r11, float r12) {
            r8 = this;
            long r0 = r10.f24817a
            long r2 = r10.f24818b
            u7.g r9 = r9.f6566a
            java.lang.String r4 = "expansion"
            u7.h r9 = r9.m13009d(r4)
            long r4 = r9.f24817a
            long r6 = r9.f24818b
            long r4 = r4 + r6
            r6 = 17
            long r4 = r4 + r6
            long r4 = r4 - r0
            float r9 = (float) r4
            float r0 = (float) r2
            float r9 = r9 / r0
            android.animation.TimeInterpolator r10 = r10.m13011b()
            float r9 = r10.getInterpolation(r9)
            float r9 = p354u7.C6350a.m13003a(r11, r12, r9)
            return r9
    }

    /* renamed from: z */
    public final void m3624z(android.view.View r4, android.graphics.RectF r5) {
            r3 = this;
            int r0 = r4.getWidth()
            float r0 = (float) r0
            int r1 = r4.getHeight()
            float r1 = (float) r1
            r2 = 0
            r5.set(r2, r2, r0, r1)
            int[] r0 = r3.f6560f
            r4.getLocationInWindow(r0)
            r1 = 0
            r1 = r0[r1]
            float r1 = (float) r1
            r2 = 1
            r0 = r0[r2]
            float r0 = (float) r0
            r5.offsetTo(r1, r0)
            float r0 = r4.getTranslationX()
            float r0 = -r0
            int r0 = (int) r0
            float r0 = (float) r0
            float r4 = r4.getTranslationY()
            float r4 = -r4
            int r4 = (int) r4
            float r4 = (float) r4
            r5.offset(r0, r4)
            return
    }
}
