package p333t1;

/* renamed from: t1.y */
/* loaded from: classes.dex */
public abstract class AbstractC6121y extends p333t1.AbstractC6104h {

    /* renamed from: w0 */
    public static final java.lang.String[] f23640w0 = null;

    /* renamed from: v0 */
    public int f23641v0;

    /* renamed from: t1.y$a */
    public static class a extends android.animation.AnimatorListenerAdapter implements p333t1.AbstractC6104h.d {

        /* renamed from: a */
        public final android.view.View f23642a;

        /* renamed from: b */
        public final int f23643b;

        /* renamed from: c */
        public final android.view.ViewGroup f23644c;

        /* renamed from: d */
        public final boolean f23645d;

        /* renamed from: e */
        public boolean f23646e;

        /* renamed from: f */
        public boolean f23647f;

        public a(android.view.View r2, int r3, boolean r4) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f23647f = r0
                r1.f23642a = r2
                r1.f23643b = r3
                android.view.ViewParent r2 = r2.getParent()
                android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                r1.f23644c = r2
                r1.f23645d = r4
                r2 = 1
                r1.m12652g(r2)
                return
        }

        @Override // p333t1.AbstractC6104h.d
        /* renamed from: a */
        public void mo12591a(p333t1.AbstractC6104h r1) {
                r0 = this;
                r0.m12651f()
                r1.mo12630z(r0)
                return
        }

        @Override // p333t1.AbstractC6104h.d
        /* renamed from: b */
        public void mo12598b(p333t1.AbstractC6104h r1) {
                r0 = this;
                return
        }

        @Override // p333t1.AbstractC6104h.d
        /* renamed from: c */
        public void mo12592c(p333t1.AbstractC6104h r1) {
                r0 = this;
                return
        }

        @Override // p333t1.AbstractC6104h.d
        /* renamed from: d */
        public void mo12593d(p333t1.AbstractC6104h r1) {
                r0 = this;
                r1 = 0
                r0.m12652g(r1)
                return
        }

        @Override // p333t1.AbstractC6104h.d
        /* renamed from: e */
        public void mo12594e(p333t1.AbstractC6104h r1) {
                r0 = this;
                r1 = 1
                r0.m12652g(r1)
                return
        }

        /* renamed from: f */
        public final void m12651f() {
                r3 = this;
                boolean r0 = r3.f23647f
                if (r0 != 0) goto L14
                android.view.View r0 = r3.f23642a
                int r1 = r3.f23643b
                t1.w r2 = p333t1.C6113q.f23625a
                r2.mo12648f(r0, r1)
                android.view.ViewGroup r0 = r3.f23644c
                if (r0 == 0) goto L14
                r0.invalidate()
            L14:
                r0 = 0
                r3.m12652g(r0)
                return
        }

        /* renamed from: g */
        public final void m12652g(boolean r2) {
                r1 = this;
                boolean r0 = r1.f23645d
                if (r0 == 0) goto L11
                boolean r0 = r1.f23646e
                if (r0 == r2) goto L11
                android.view.ViewGroup r0 = r1.f23644c
                if (r0 == 0) goto L11
                r1.f23646e = r2
                p333t1.C6112p.m12638a(r0, r2)
            L11:
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator r1) {
                r0 = this;
                r1 = 1
                r0.f23647f = r1
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r1) {
                r0 = this;
                r0.m12651f()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(android.animation.Animator r3) {
                r2 = this;
                boolean r3 = r2.f23647f
                if (r3 != 0) goto Ld
                android.view.View r3 = r2.f23642a
                int r0 = r2.f23643b
                t1.w r1 = p333t1.C6113q.f23625a
                r1.mo12648f(r3, r0)
            Ld:
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator r1) {
                r0 = this;
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(android.animation.Animator r3) {
                r2 = this;
                boolean r3 = r2.f23647f
                if (r3 != 0) goto Lc
                android.view.View r3 = r2.f23642a
                r0 = 0
                t1.w r1 = p333t1.C6113q.f23625a
                r1.mo12648f(r3, r0)
            Lc:
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r1) {
                r0 = this;
                return
        }
    }

    /* renamed from: t1.y$b */
    public static class b {

        /* renamed from: a */
        public boolean f23648a;

        /* renamed from: b */
        public boolean f23649b;

        /* renamed from: c */
        public int f23650c;

        /* renamed from: d */
        public int f23651d;

        /* renamed from: e */
        public android.view.ViewGroup f23652e;

        /* renamed from: f */
        public android.view.ViewGroup f23653f;

        public b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            java.lang.String r0 = "android:visibility:visibility"
            java.lang.String r1 = "android:visibility:parent"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            p333t1.AbstractC6121y.f23640w0 = r0
            return
    }

    public AbstractC6121y() {
            r1 = this;
            r1.<init>()
            r0 = 3
            r1.f23641v0 = r0
            return
    }

    /* renamed from: M */
    public final void m12649M(p333t1.C6111o r4) {
            r3 = this;
            android.view.View r0 = r4.f23622b
            int r0 = r0.getVisibility()
            java.util.Map<java.lang.String, java.lang.Object> r1 = r4.f23621a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "android:visibility:visibility"
            r1.put(r2, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.f23621a
            android.view.View r1 = r4.f23622b
            android.view.ViewParent r1 = r1.getParent()
            java.lang.String r2 = "android:visibility:parent"
            r0.put(r2, r1)
            r0 = 2
            int[] r0 = new int[r0]
            android.view.View r1 = r4.f23622b
            r1.getLocationOnScreen(r0)
            java.util.Map<java.lang.String, java.lang.Object> r4 = r4.f23621a
            java.lang.String r1 = "android:visibility:screenLocation"
            r4.put(r1, r0)
            return
    }

    /* renamed from: N */
    public final p333t1.AbstractC6121y.b m12650N(p333t1.C6111o r8, p333t1.C6111o r9) {
            r7 = this;
            t1.y$b r0 = new t1.y$b
            r0.<init>()
            r1 = 0
            r0.f23648a = r1
            r0.f23649b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f23621a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f23621a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f23650c = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f23621a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f23652e = r6
            goto L37
        L33:
            r0.f23650c = r4
            r0.f23652e = r3
        L37:
            if (r9 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.f23621a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f23621a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f23651d = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f23621a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f23653f = r2
            goto L5e
        L5a:
            r0.f23651d = r4
            r0.f23653f = r3
        L5e:
            r2 = 1
            if (r8 == 0) goto L82
            if (r9 == 0) goto L82
            int r8 = r0.f23650c
            int r9 = r0.f23651d
            if (r8 != r9) goto L70
            android.view.ViewGroup r3 = r0.f23652e
            android.view.ViewGroup r4 = r0.f23653f
            if (r3 != r4) goto L70
            return r0
        L70:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L75
            goto L93
        L75:
            if (r9 != 0) goto L96
            goto L88
        L78:
            android.view.ViewGroup r8 = r0.f23653f
            if (r8 != 0) goto L7d
            goto L93
        L7d:
            android.view.ViewGroup r8 = r0.f23652e
            if (r8 != 0) goto L96
            goto L88
        L82:
            if (r8 != 0) goto L8d
            int r8 = r0.f23651d
            if (r8 != 0) goto L8d
        L88:
            r0.f23649b = r2
        L8a:
            r0.f23648a = r2
            goto L96
        L8d:
            if (r9 != 0) goto L96
            int r8 = r0.f23650c
            if (r8 != 0) goto L96
        L93:
            r0.f23649b = r1
            goto L8a
        L96:
            return r0
    }

    /* renamed from: O */
    public abstract android.animation.Animator mo12595O(android.view.ViewGroup r1, android.view.View r2, p333t1.C6111o r3, p333t1.C6111o r4);

    @Override // p333t1.AbstractC6104h
    /* renamed from: d */
    public void mo9875d(p333t1.C6111o r1) {
            r0 = this;
            r0.m12649M(r1)
            return
    }

    @Override // p333t1.AbstractC6104h
    /* renamed from: o */
    public android.animation.Animator mo9877o(android.view.ViewGroup r22, p333t1.C6111o r23, p333t1.C6111o r24) {
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            t1.y$b r4 = r0.m12650N(r2, r3)
            boolean r5 = r4.f23648a
            if (r5 == 0) goto L2aa
            android.view.ViewGroup r5 = r4.f23652e
            if (r5 != 0) goto L18
            android.view.ViewGroup r5 = r4.f23653f
            if (r5 == 0) goto L2aa
        L18:
            boolean r5 = r4.f23649b
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            r9 = 1
            r10 = 0
            if (r5 == 0) goto L6a
            int r1 = r0.f23641v0
            r1 = r1 & r9
            if (r1 != r9) goto L68
            if (r3 != 0) goto L29
            goto L68
        L29:
            if (r2 != 0) goto L44
            android.view.View r1 = r3.f23622b
            android.view.ViewParent r1 = r1.getParent()
            android.view.View r1 = (android.view.View) r1
            t1.o r4 = r0.m12625r(r1, r10)
            t1.o r1 = r0.m12626u(r1, r10)
            t1.y$b r1 = r0.m12650N(r4, r1)
            boolean r1 = r1.f23648a
            if (r1 == 0) goto L44
            goto L68
        L44:
            android.view.View r1 = r3.f23622b
            r3 = r0
            t1.c r3 = (p333t1.C6099c) r3
            if (r2 == 0) goto L5c
            java.util.Map<java.lang.String, java.lang.Object> r2 = r2.f23621a
            java.lang.String r4 = "android:fade:transitionAlpha"
            java.lang.Object r2 = r2.get(r4)
            java.lang.Float r2 = (java.lang.Float) r2
            if (r2 == 0) goto L5c
            float r2 = r2.floatValue()
            goto L5d
        L5c:
            r2 = 0
        L5d:
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 != 0) goto L62
            goto L63
        L62:
            r8 = r2
        L63:
            android.animation.Animator r6 = r3.m12596P(r1, r8, r7)
            goto L69
        L68:
            r6 = 0
        L69:
            return r6
        L6a:
            int r4 = r4.f23651d
            int r5 = r0.f23641v0
            r11 = 2
            r5 = r5 & r11
            if (r5 == r11) goto L76
        L72:
            r2 = r0
        L73:
            r6 = 0
            goto L2a9
        L76:
            if (r2 != 0) goto L79
            goto L72
        L79:
            android.view.View r5 = r2.f23622b
            if (r3 == 0) goto L80
            android.view.View r12 = r3.f23622b
            goto L81
        L80:
            r12 = 0
        L81:
            r13 = 2131362548(0x7f0a02f4, float:1.834488E38)
            java.lang.Object r14 = r5.getTag(r13)
            android.view.View r14 = (android.view.View) r14
            if (r14 == 0) goto L91
            r19 = r4
            r12 = 0
            goto L223
        L91:
            if (r12 == 0) goto La2
            android.view.ViewParent r14 = r12.getParent()
            if (r14 != 0) goto L9a
            goto La2
        L9a:
            r14 = 4
            if (r4 != r14) goto L9e
            goto La0
        L9e:
            if (r5 != r12) goto La8
        La0:
            r14 = 0
            goto La6
        La2:
            if (r12 == 0) goto La8
            r14 = r12
            r12 = 0
        La6:
            r15 = 0
            goto Lab
        La8:
            r12 = 0
            r14 = 0
            r15 = 1
        Lab:
            if (r15 == 0) goto L21b
            android.view.ViewParent r15 = r5.getParent()
            if (r15 != 0) goto Lb9
            r19 = r4
            r14 = r5
        Lb6:
            r9 = 0
            goto L223
        Lb9:
            android.view.ViewParent r15 = r5.getParent()
            boolean r15 = r15 instanceof android.view.View
            if (r15 == 0) goto L21b
            android.view.ViewParent r15 = r5.getParent()
            android.view.View r15 = (android.view.View) r15
            t1.o r6 = r0.m12626u(r15, r9)
            t1.o r13 = r0.m12625r(r15, r9)
            t1.y$b r6 = r0.m12650N(r6, r13)
            boolean r6 = r6.f23648a
            if (r6 != 0) goto L206
            boolean r6 = p333t1.C6110n.f23618a
            android.graphics.Matrix r6 = new android.graphics.Matrix
            r6.<init>()
            int r13 = r15.getScrollX()
            int r13 = -r13
            float r13 = (float) r13
            int r14 = r15.getScrollY()
            int r14 = -r14
            float r14 = (float) r14
            r6.setTranslate(r13, r14)
            t1.w r13 = p333t1.C6113q.f23625a
            r13.mo12645g(r5, r6)
            r13.mo12646h(r1, r6)
            android.graphics.RectF r13 = new android.graphics.RectF
            int r14 = r5.getWidth()
            float r14 = (float) r14
            int r15 = r5.getHeight()
            float r15 = (float) r15
            r13.<init>(r8, r8, r14, r15)
            r6.mapRect(r13)
            float r8 = r13.left
            int r8 = java.lang.Math.round(r8)
            float r14 = r13.top
            int r14 = java.lang.Math.round(r14)
            float r15 = r13.right
            int r15 = java.lang.Math.round(r15)
            float r11 = r13.bottom
            int r11 = java.lang.Math.round(r11)
            android.widget.ImageView r10 = new android.widget.ImageView
            android.content.Context r7 = r5.getContext()
            r10.<init>(r7)
            android.widget.ImageView$ScaleType r7 = android.widget.ImageView.ScaleType.CENTER_CROP
            r10.setScaleType(r7)
            boolean r7 = p333t1.C6110n.f23618a
            if (r7 == 0) goto L13e
            boolean r7 = r5.isAttachedToWindow()
            r7 = r7 ^ r9
            if (r1 != 0) goto L139
            goto L13f
        L139:
            boolean r16 = r22.isAttachedToWindow()
            goto L141
        L13e:
            r7 = 0
        L13f:
            r16 = 0
        L141:
            boolean r17 = p333t1.C6110n.f23619b
            if (r17 == 0) goto L16e
            if (r7 == 0) goto L16e
            if (r16 != 0) goto L150
            r19 = r4
            r16 = r12
            r0 = 0
            goto L1eb
        L150:
            android.view.ViewParent r16 = r5.getParent()
            r9 = r16
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            int r16 = r9.indexOfChild(r5)
            r18 = r9
            android.view.ViewGroupOverlay r9 = r22.getOverlay()
            r9.add(r5)
            r9 = r18
            r20 = r16
            r16 = r12
            r12 = r20
            goto L172
        L16e:
            r16 = r12
            r9 = 0
            r12 = 0
        L172:
            float r18 = r13.width()
            r19 = r4
            int r4 = java.lang.Math.round(r18)
            float r18 = r13.height()
            int r0 = java.lang.Math.round(r18)
            if (r4 <= 0) goto L1dc
            if (r0 <= 0) goto L1dc
            r18 = 1233125376(0x49800000, float:1048576.0)
            int r3 = r4 * r0
            float r3 = (float) r3
            float r3 = r18 / r3
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = java.lang.Math.min(r2, r3)
            float r3 = (float) r4
            float r3 = r3 * r2
            int r3 = java.lang.Math.round(r3)
            float r0 = (float) r0
            float r0 = r0 * r2
            int r0 = java.lang.Math.round(r0)
            float r4 = r13.left
            float r4 = -r4
            float r13 = r13.top
            float r13 = -r13
            r6.postTranslate(r4, r13)
            r6.postScale(r2, r2)
            boolean r2 = p333t1.C6110n.f23620c
            if (r2 == 0) goto L1ca
            android.graphics.Picture r2 = new android.graphics.Picture
            r2.<init>()
            android.graphics.Canvas r0 = r2.beginRecording(r3, r0)
            r0.concat(r6)
            r5.draw(r0)
            r2.endRecording()
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2)
            goto L1dd
        L1ca:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r3, r0, r2)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r0)
            r2.concat(r6)
            r5.draw(r2)
            goto L1dd
        L1dc:
            r0 = 0
        L1dd:
            if (r17 == 0) goto L1eb
            if (r7 == 0) goto L1eb
            android.view.ViewGroupOverlay r2 = r22.getOverlay()
            r2.remove(r5)
            r9.addView(r5, r12)
        L1eb:
            if (r0 == 0) goto L1f0
            r10.setImageBitmap(r0)
        L1f0:
            int r0 = r15 - r8
            r2 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            int r3 = r11 - r14
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            r10.measure(r0, r2)
            r10.layout(r8, r14, r15, r11)
            r14 = r10
            goto L21f
        L206:
            r19 = r4
            r16 = r12
            int r0 = r15.getId()
            android.view.ViewParent r2 = r15.getParent()
            if (r2 != 0) goto L21f
            r2 = -1
            if (r0 == r2) goto L21f
            r1.findViewById(r0)
            goto L21f
        L21b:
            r19 = r4
            r16 = r12
        L21f:
            r12 = r16
            goto Lb6
        L223:
            if (r14 == 0) goto L27f
            r0 = r23
            if (r9 != 0) goto L25c
            java.util.Map<java.lang.String, java.lang.Object> r2 = r0.f23621a
            java.lang.String r3 = "android:visibility:screenLocation"
            java.lang.Object r2 = r2.get(r3)
            int[] r2 = (int[]) r2
            r3 = 0
            r4 = r2[r3]
            r6 = 1
            r2 = r2[r6]
            r7 = 2
            int[] r7 = new int[r7]
            r1.getLocationOnScreen(r7)
            r3 = r7[r3]
            int r4 = r4 - r3
            int r3 = r14.getLeft()
            int r4 = r4 - r3
            r14.offsetLeftAndRight(r4)
            r3 = r7[r6]
            int r2 = r2 - r3
            int r3 = r14.getTop()
            int r2 = r2 - r3
            r14.offsetTopAndBottom(r2)
            android.view.ViewGroupOverlay r2 = r22.getOverlay()
            r2.add(r14)
        L25c:
            r2 = r21
            r3 = r24
            android.animation.Animator r6 = r2.mo12595O(r1, r14, r0, r3)
            if (r9 != 0) goto L2a9
            if (r6 != 0) goto L270
            android.view.ViewGroupOverlay r0 = r22.getOverlay()
            r0.remove(r14)
            goto L2a9
        L270:
            r0 = 2131362548(0x7f0a02f4, float:1.834488E38)
            r5.setTag(r0, r14)
            t1.x r0 = new t1.x
            r0.<init>(r2, r1, r14, r5)
        L27b:
            r2.mo12616a(r0)
            goto L2a9
        L27f:
            r2 = r21
            r0 = r23
            r3 = r24
            if (r12 == 0) goto L73
            int r4 = r12.getVisibility()
            t1.w r5 = p333t1.C6113q.f23625a
            r6 = 0
            r5.mo12648f(r12, r6)
            android.animation.Animator r6 = r2.mo12595O(r1, r12, r0, r3)
            if (r6 == 0) goto L2a6
            t1.y$a r0 = new t1.y$a
            r1 = r19
            r3 = 1
            r0.<init>(r12, r1, r3)
            r6.addListener(r0)
            r6.addPauseListener(r0)
            goto L27b
        L2a6:
            r5.mo12648f(r12, r4)
        L2a9:
            return r6
        L2aa:
            r2 = r0
            r0 = 0
            return r0
    }

    @Override // p333t1.AbstractC6104h
    /* renamed from: t */
    public java.lang.String[] mo12590t() {
            r1 = this;
            java.lang.String[] r0 = p333t1.AbstractC6121y.f23640w0
            return r0
    }

    @Override // p333t1.AbstractC6104h
    /* renamed from: v */
    public boolean mo12627v(p333t1.C6111o r5, p333t1.C6111o r6) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L6
            if (r6 != 0) goto L6
            return r0
        L6:
            if (r5 == 0) goto L1b
            if (r6 == 0) goto L1b
            java.util.Map<java.lang.String, java.lang.Object> r1 = r6.f23621a
            java.lang.String r2 = "android:visibility:visibility"
            boolean r1 = r1.containsKey(r2)
            java.util.Map<java.lang.String, java.lang.Object> r3 = r5.f23621a
            boolean r2 = r3.containsKey(r2)
            if (r1 == r2) goto L1b
            return r0
        L1b:
            t1.y$b r5 = r4.m12650N(r5, r6)
            boolean r6 = r5.f23648a
            if (r6 == 0) goto L2c
            int r6 = r5.f23650c
            if (r6 == 0) goto L2b
            int r5 = r5.f23651d
            if (r5 != 0) goto L2c
        L2b:
            r0 = 1
        L2c:
            return r0
    }
}
