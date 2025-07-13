package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.q */
/* loaded from: classes.dex */
public class C0606q extends androidx.recyclerview.widget.RecyclerView.AbstractC0556l implements androidx.recyclerview.widget.RecyclerView.InterfaceC0561q {

    /* renamed from: D */
    public static final int[] f3515D = null;

    /* renamed from: E */
    public static final int[] f3516E = null;

    /* renamed from: A */
    public int f3517A;

    /* renamed from: B */
    public final java.lang.Runnable f3518B;

    /* renamed from: C */
    public final androidx.recyclerview.widget.RecyclerView.AbstractC0562r f3519C;

    /* renamed from: a */
    public final int f3520a;

    /* renamed from: b */
    public final int f3521b;

    /* renamed from: c */
    public final android.graphics.drawable.StateListDrawable f3522c;

    /* renamed from: d */
    public final android.graphics.drawable.Drawable f3523d;

    /* renamed from: e */
    public final int f3524e;

    /* renamed from: f */
    public final int f3525f;

    /* renamed from: g */
    public final android.graphics.drawable.StateListDrawable f3526g;

    /* renamed from: h */
    public final android.graphics.drawable.Drawable f3527h;

    /* renamed from: i */
    public final int f3528i;

    /* renamed from: j */
    public final int f3529j;

    /* renamed from: k */
    public int f3530k;

    /* renamed from: l */
    public int f3531l;

    /* renamed from: m */
    public float f3532m;

    /* renamed from: n */
    public int f3533n;

    /* renamed from: o */
    public int f3534o;

    /* renamed from: p */
    public float f3535p;

    /* renamed from: q */
    public int f3536q;

    /* renamed from: r */
    public int f3537r;

    /* renamed from: s */
    public androidx.recyclerview.widget.RecyclerView f3538s;

    /* renamed from: t */
    public boolean f3539t;

    /* renamed from: u */
    public boolean f3540u;

    /* renamed from: v */
    public int f3541v;

    /* renamed from: w */
    public int f3542w;

    /* renamed from: x */
    public final int[] f3543x;

    /* renamed from: y */
    public final int[] f3544y;

    /* renamed from: z */
    public final android.animation.ValueAnimator f3545z;

    /* renamed from: androidx.recyclerview.widget.q$a */
    public class a implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ androidx.recyclerview.widget.C0606q f3546Y;

        public a(androidx.recyclerview.widget.C0606q r1) {
                r0 = this;
                r0.f3546Y = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r6 = this;
                androidx.recyclerview.widget.q r0 = r6.f3546Y
                int r1 = r0.f3517A
                r2 = 2
                r3 = 1
                if (r1 == r3) goto Lb
                if (r1 == r2) goto L10
                goto L37
            Lb:
                android.animation.ValueAnimator r1 = r0.f3545z
                r1.cancel()
            L10:
                r1 = 3
                r0.f3517A = r1
                android.animation.ValueAnimator r1 = r0.f3545z
                float[] r2 = new float[r2]
                r4 = 0
                java.lang.Object r5 = r1.getAnimatedValue()
                java.lang.Float r5 = (java.lang.Float) r5
                float r5 = r5.floatValue()
                r2[r4] = r5
                r4 = 0
                r2[r3] = r4
                r1.setFloatValues(r2)
                android.animation.ValueAnimator r1 = r0.f3545z
                r2 = 500(0x1f4, float:7.0E-43)
                long r2 = (long) r2
                r1.setDuration(r2)
                android.animation.ValueAnimator r0 = r0.f3545z
                r0.start()
            L37:
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.q$b */
    public class b extends androidx.recyclerview.widget.RecyclerView.AbstractC0562r {

        /* renamed from: a */
        public final /* synthetic */ androidx.recyclerview.widget.C0606q f3547a;

        public b(androidx.recyclerview.widget.C0606q r1) {
                r0 = this;
                r0.f3547a = r1
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0562r
        /* renamed from: b */
        public void mo1906b(androidx.recyclerview.widget.RecyclerView r9, int r10, int r11) {
                r8 = this;
                androidx.recyclerview.widget.q r10 = r8.f3547a
                int r11 = r9.computeHorizontalScrollOffset()
                int r9 = r9.computeVerticalScrollOffset()
                androidx.recyclerview.widget.RecyclerView r0 = r10.f3538s
                int r0 = r0.computeVerticalScrollRange()
                int r1 = r10.f3537r
                int r2 = r0 - r1
                r3 = 0
                r4 = 1
                if (r2 <= 0) goto L1e
                int r2 = r10.f3520a
                if (r1 < r2) goto L1e
                r2 = 1
                goto L1f
            L1e:
                r2 = 0
            L1f:
                r10.f3539t = r2
                androidx.recyclerview.widget.RecyclerView r2 = r10.f3538s
                int r2 = r2.computeHorizontalScrollRange()
                int r5 = r10.f3536q
                int r6 = r2 - r5
                if (r6 <= 0) goto L33
                int r6 = r10.f3520a
                if (r5 < r6) goto L33
                r6 = 1
                goto L34
            L33:
                r6 = 0
            L34:
                r10.f3540u = r6
                boolean r7 = r10.f3539t
                if (r7 != 0) goto L44
                if (r6 != 0) goto L44
                int r9 = r10.f3541v
                if (r9 == 0) goto L7f
                r10.m2109m(r3)
                goto L7f
            L44:
                r3 = 1073741824(0x40000000, float:2.0)
                if (r7 == 0) goto L5d
                float r9 = (float) r9
                float r6 = (float) r1
                float r7 = r6 / r3
                float r7 = r7 + r9
                float r7 = r7 * r6
                float r9 = (float) r0
                float r7 = r7 / r9
                int r9 = (int) r7
                r10.f3531l = r9
                int r9 = r1 * r1
                int r9 = r9 / r0
                int r9 = java.lang.Math.min(r1, r9)
                r10.f3530k = r9
            L5d:
                boolean r9 = r10.f3540u
                if (r9 == 0) goto L76
                float r9 = (float) r11
                float r11 = (float) r5
                float r0 = r11 / r3
                float r0 = r0 + r9
                float r0 = r0 * r11
                float r9 = (float) r2
                float r0 = r0 / r9
                int r9 = (int) r0
                r10.f3534o = r9
                int r9 = r5 * r5
                int r9 = r9 / r2
                int r9 = java.lang.Math.min(r5, r9)
                r10.f3533n = r9
            L76:
                int r9 = r10.f3541v
                if (r9 == 0) goto L7c
                if (r9 != r4) goto L7f
            L7c:
                r10.m2109m(r4)
            L7f:
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.q$c */
    public class c extends android.animation.AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f3548a;

        /* renamed from: b */
        public final /* synthetic */ androidx.recyclerview.widget.C0606q f3549b;

        public c(androidx.recyclerview.widget.C0606q r1) {
                r0 = this;
                r0.f3549b = r1
                r0.<init>()
                r1 = 0
                r0.f3548a = r1
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator r1) {
                r0 = this;
                r1 = 1
                r0.f3548a = r1
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r3) {
                r2 = this;
                boolean r3 = r2.f3548a
                r0 = 0
                if (r3 == 0) goto L8
                r2.f3548a = r0
                return
            L8:
                androidx.recyclerview.widget.q r3 = r2.f3549b
                android.animation.ValueAnimator r3 = r3.f3545z
                java.lang.Object r3 = r3.getAnimatedValue()
                java.lang.Float r3 = (java.lang.Float) r3
                float r3 = r3.floatValue()
                r1 = 0
                int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r3 != 0) goto L23
                androidx.recyclerview.widget.q r3 = r2.f3549b
                r3.f3517A = r0
                r3.m2109m(r0)
                goto L2d
            L23:
                androidx.recyclerview.widget.q r3 = r2.f3549b
                r0 = 2
                r3.f3517A = r0
                androidx.recyclerview.widget.RecyclerView r3 = r3.f3538s
                r3.invalidate()
            L2d:
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.q$d */
    public class d implements android.animation.ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ androidx.recyclerview.widget.C0606q f3550a;

        public d(androidx.recyclerview.widget.C0606q r1) {
                r0 = this;
                r0.f3550a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r2) {
                r1 = this;
                java.lang.Object r2 = r2.getAnimatedValue()
                java.lang.Float r2 = (java.lang.Float) r2
                float r2 = r2.floatValue()
                r0 = 1132396544(0x437f0000, float:255.0)
                float r2 = r2 * r0
                int r2 = (int) r2
                androidx.recyclerview.widget.q r0 = r1.f3550a
                android.graphics.drawable.StateListDrawable r0 = r0.f3522c
                r0.setAlpha(r2)
                androidx.recyclerview.widget.q r0 = r1.f3550a
                android.graphics.drawable.Drawable r0 = r0.f3523d
                r0.setAlpha(r2)
                androidx.recyclerview.widget.q r2 = r1.f3550a
                androidx.recyclerview.widget.RecyclerView r2 = r2.f3538s
                r2.invalidate()
                return
        }
    }

    static {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 16842919(0x10100a7, float:2.3694026E-38)
            r2 = 0
            r0[r2] = r1
            androidx.recyclerview.widget.C0606q.f3515D = r0
            int[] r0 = new int[r2]
            androidx.recyclerview.widget.C0606q.f3516E = r0
            return
    }

    public C0606q(androidx.recyclerview.widget.RecyclerView r4, android.graphics.drawable.StateListDrawable r5, android.graphics.drawable.Drawable r6, android.graphics.drawable.StateListDrawable r7, android.graphics.drawable.Drawable r8, int r9, int r10, int r11) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f3536q = r0
            r3.f3537r = r0
            r3.f3539t = r0
            r3.f3540u = r0
            r3.f3541v = r0
            r3.f3542w = r0
            r1 = 2
            int[] r2 = new int[r1]
            r3.f3543x = r2
            int[] r2 = new int[r1]
            r3.f3544y = r2
            float[] r1 = new float[r1]
            r1 = {x00b6: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            r3.f3545z = r1
            r3.f3517A = r0
            androidx.recyclerview.widget.q$a r0 = new androidx.recyclerview.widget.q$a
            r0.<init>(r3)
            r3.f3518B = r0
            androidx.recyclerview.widget.q$b r0 = new androidx.recyclerview.widget.q$b
            r0.<init>(r3)
            r3.f3519C = r0
            r3.f3522c = r5
            r3.f3523d = r6
            r3.f3526g = r7
            r3.f3527h = r8
            int r2 = r5.getIntrinsicWidth()
            int r2 = java.lang.Math.max(r9, r2)
            r3.f3524e = r2
            int r2 = r6.getIntrinsicWidth()
            int r2 = java.lang.Math.max(r9, r2)
            r3.f3525f = r2
            int r7 = r7.getIntrinsicWidth()
            int r7 = java.lang.Math.max(r9, r7)
            r3.f3528i = r7
            int r7 = r8.getIntrinsicWidth()
            int r7 = java.lang.Math.max(r9, r7)
            r3.f3529j = r7
            r3.f3520a = r10
            r3.f3521b = r11
            r7 = 255(0xff, float:3.57E-43)
            r5.setAlpha(r7)
            r6.setAlpha(r7)
            androidx.recyclerview.widget.q$c r5 = new androidx.recyclerview.widget.q$c
            r5.<init>(r3)
            r1.addListener(r5)
            androidx.recyclerview.widget.q$d r5 = new androidx.recyclerview.widget.q$d
            r5.<init>(r3)
            r1.addUpdateListener(r5)
            androidx.recyclerview.widget.RecyclerView r5 = r3.f3538s
            if (r5 != r4) goto L85
            goto Lb5
        L85:
            if (r5 == 0) goto La4
            r5.m1749b0(r3)
            androidx.recyclerview.widget.RecyclerView r5 = r3.f3538s
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$q> r6 = r5.f3180q0
            r6.remove(r3)
            androidx.recyclerview.widget.RecyclerView$q r6 = r5.f3182r0
            if (r6 != r3) goto L98
            r6 = 0
            r5.f3182r0 = r6
        L98:
            androidx.recyclerview.widget.RecyclerView r5 = r3.f3538s
            java.util.List<androidx.recyclerview.widget.RecyclerView$r> r5 = r5.f3161g1
            if (r5 == 0) goto La1
            r5.remove(r0)
        La1:
            r3.m2105i()
        La4:
            r3.f3538s = r4
            r4.m1754g(r3)
            androidx.recyclerview.widget.RecyclerView r4 = r3.f3538s
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$q> r4 = r4.f3180q0
            r4.add(r3)
            androidx.recyclerview.widget.RecyclerView r4 = r3.f3538s
            r4.m1756h(r0)
        Lb5:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0561q
    /* renamed from: a */
    public boolean mo1902a(androidx.recyclerview.widget.RecyclerView r5, android.view.MotionEvent r6) {
            r4 = this;
            int r5 = r4.f3541v
            r0 = 1
            r1 = 2
            if (r5 != r0) goto L45
            float r5 = r6.getX()
            float r2 = r6.getY()
            boolean r5 = r4.m2107k(r5, r2)
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r2 = r4.m2106j(r2, r3)
            int r3 = r6.getAction()
            if (r3 != 0) goto L48
            if (r5 != 0) goto L28
            if (r2 == 0) goto L48
        L28:
            if (r2 == 0) goto L35
            r4.f3542w = r0
            float r5 = r6.getX()
            int r5 = (int) r5
            float r5 = (float) r5
            r4.f3535p = r5
            goto L41
        L35:
            if (r5 == 0) goto L41
            r4.f3542w = r1
            float r5 = r6.getY()
            int r5 = (int) r5
            float r5 = (float) r5
            r4.f3532m = r5
        L41:
            r4.m2109m(r1)
            goto L49
        L45:
            if (r5 != r1) goto L48
            goto L49
        L48:
            r0 = 0
        L49:
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0561q
    /* renamed from: c */
    public void mo1903c(androidx.recyclerview.widget.RecyclerView r12, android.view.MotionEvent r13) {
            r11 = this;
            int r12 = r11.f3541v
            if (r12 != 0) goto L5
            return
        L5:
            int r12 = r13.getAction()
            r0 = 2
            r1 = 1
            if (r12 != 0) goto L47
            float r12 = r13.getX()
            float r2 = r13.getY()
            boolean r12 = r11.m2107k(r12, r2)
            float r2 = r13.getX()
            float r3 = r13.getY()
            boolean r2 = r11.m2106j(r2, r3)
            if (r12 != 0) goto L29
            if (r2 == 0) goto L107
        L29:
            if (r2 == 0) goto L36
            r11.f3542w = r1
            float r12 = r13.getX()
            int r12 = (int) r12
            float r12 = (float) r12
            r11.f3535p = r12
            goto L42
        L36:
            if (r12 == 0) goto L42
            r11.f3542w = r0
            float r12 = r13.getY()
            int r12 = (int) r12
            float r12 = (float) r12
            r11.f3532m = r12
        L42:
            r11.m2109m(r0)
            goto L107
        L47:
            int r12 = r13.getAction()
            r2 = 0
            if (r12 != r1) goto L5e
            int r12 = r11.f3541v
            if (r12 != r0) goto L5e
            r12 = 0
            r11.f3532m = r12
            r11.f3535p = r12
            r11.m2109m(r1)
            r11.f3542w = r2
            goto L107
        L5e:
            int r12 = r13.getAction()
            if (r12 != r0) goto L107
            int r12 = r11.f3541v
            if (r12 != r0) goto L107
            r11.m2110n()
            int r12 = r11.f3542w
            r3 = 1073741824(0x40000000, float:2.0)
            if (r12 != r1) goto Lba
            float r12 = r13.getX()
            int[] r7 = r11.f3544y
            int r4 = r11.f3521b
            r7[r2] = r4
            int r5 = r11.f3536q
            int r5 = r5 - r4
            r7[r1] = r5
            r4 = r7[r2]
            float r4 = (float) r4
            r5 = r7[r1]
            float r5 = (float) r5
            float r12 = java.lang.Math.min(r5, r12)
            float r12 = java.lang.Math.max(r4, r12)
            int r4 = r11.f3534o
            float r4 = (float) r4
            float r4 = r4 - r12
            float r4 = java.lang.Math.abs(r4)
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 >= 0) goto L9b
            goto Lba
        L9b:
            float r5 = r11.f3535p
            androidx.recyclerview.widget.RecyclerView r4 = r11.f3538s
            int r8 = r4.computeHorizontalScrollRange()
            androidx.recyclerview.widget.RecyclerView r4 = r11.f3538s
            int r9 = r4.computeHorizontalScrollOffset()
            int r10 = r11.f3536q
            r4 = r11
            r6 = r12
            int r4 = r4.m2108l(r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto Lb8
            androidx.recyclerview.widget.RecyclerView r5 = r11.f3538s
            r5.scrollBy(r4, r2)
        Lb8:
            r11.f3535p = r12
        Lba:
            int r12 = r11.f3542w
            if (r12 != r0) goto L107
            float r12 = r13.getY()
            int[] r7 = r11.f3543x
            int r13 = r11.f3521b
            r7[r2] = r13
            int r0 = r11.f3537r
            int r0 = r0 - r13
            r7[r1] = r0
            r13 = r7[r2]
            float r13 = (float) r13
            r0 = r7[r1]
            float r0 = (float) r0
            float r12 = java.lang.Math.min(r0, r12)
            float r12 = java.lang.Math.max(r13, r12)
            int r13 = r11.f3531l
            float r13 = (float) r13
            float r13 = r13 - r12
            float r13 = java.lang.Math.abs(r13)
            int r13 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r13 >= 0) goto Le8
            goto L107
        Le8:
            float r5 = r11.f3532m
            androidx.recyclerview.widget.RecyclerView r13 = r11.f3538s
            int r8 = r13.computeVerticalScrollRange()
            androidx.recyclerview.widget.RecyclerView r13 = r11.f3538s
            int r9 = r13.computeVerticalScrollOffset()
            int r10 = r11.f3537r
            r4 = r11
            r6 = r12
            int r13 = r4.m2108l(r5, r6, r7, r8, r9, r10)
            if (r13 == 0) goto L105
            androidx.recyclerview.widget.RecyclerView r0 = r11.f3538s
            r0.scrollBy(r2, r13)
        L105:
            r11.f3532m = r12
        L107:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0561q
    /* renamed from: e */
    public void mo1904e(boolean r1) {
            r0 = this;
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0556l
    /* renamed from: h */
    public void mo1841h(android.graphics.Canvas r6, androidx.recyclerview.widget.RecyclerView r7, androidx.recyclerview.widget.RecyclerView.C0569y r8) {
            r5 = this;
            int r7 = r5.f3536q
            androidx.recyclerview.widget.RecyclerView r8 = r5.f3538s
            int r8 = r8.getWidth()
            r0 = 0
            if (r7 != r8) goto Lb8
            int r7 = r5.f3537r
            androidx.recyclerview.widget.RecyclerView r8 = r5.f3538s
            int r8 = r8.getHeight()
            if (r7 == r8) goto L17
            goto Lb8
        L17:
            int r7 = r5.f3517A
            if (r7 == 0) goto Lb7
            boolean r7 = r5.f3539t
            r8 = 0
            if (r7 == 0) goto L80
            int r7 = r5.f3536q
            int r1 = r5.f3524e
            int r7 = r7 - r1
            int r2 = r5.f3531l
            int r3 = r5.f3530k
            int r4 = r3 / 2
            int r2 = r2 - r4
            android.graphics.drawable.StateListDrawable r4 = r5.f3522c
            r4.setBounds(r0, r0, r1, r3)
            android.graphics.drawable.Drawable r1 = r5.f3523d
            int r3 = r5.f3525f
            int r4 = r5.f3537r
            r1.setBounds(r0, r0, r3, r4)
            androidx.recyclerview.widget.RecyclerView r1 = r5.f3538s
            java.util.WeakHashMap<android.view.View, n0.w> r3 = p227n0.C4661t.f18570a
            int r1 = p227n0.C4661t.d.m10575d(r1)
            r3 = 1
            if (r1 != r3) goto L46
            goto L47
        L46:
            r3 = 0
        L47:
            if (r3 == 0) goto L67
            android.graphics.drawable.Drawable r7 = r5.f3523d
            r7.draw(r6)
            int r7 = r5.f3524e
            float r7 = (float) r7
            float r1 = (float) r2
            r6.translate(r7, r1)
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = 1065353216(0x3f800000, float:1.0)
            r6.scale(r7, r1)
            android.graphics.drawable.StateListDrawable r3 = r5.f3522c
            r3.draw(r6)
            r6.scale(r7, r1)
            int r7 = r5.f3524e
            goto L79
        L67:
            float r1 = (float) r7
            r6.translate(r1, r8)
            android.graphics.drawable.Drawable r1 = r5.f3523d
            r1.draw(r6)
            float r1 = (float) r2
            r6.translate(r8, r1)
            android.graphics.drawable.StateListDrawable r1 = r5.f3522c
            r1.draw(r6)
        L79:
            int r7 = -r7
            float r7 = (float) r7
            int r1 = -r2
            float r1 = (float) r1
            r6.translate(r7, r1)
        L80:
            boolean r7 = r5.f3540u
            if (r7 == 0) goto Lb7
            int r7 = r5.f3537r
            int r1 = r5.f3528i
            int r7 = r7 - r1
            int r2 = r5.f3534o
            int r3 = r5.f3533n
            int r4 = r3 / 2
            int r2 = r2 - r4
            android.graphics.drawable.StateListDrawable r4 = r5.f3526g
            r4.setBounds(r0, r0, r3, r1)
            android.graphics.drawable.Drawable r1 = r5.f3527h
            int r3 = r5.f3536q
            int r4 = r5.f3529j
            r1.setBounds(r0, r0, r3, r4)
            float r0 = (float) r7
            r6.translate(r8, r0)
            android.graphics.drawable.Drawable r0 = r5.f3527h
            r0.draw(r6)
            float r0 = (float) r2
            r6.translate(r0, r8)
            android.graphics.drawable.StateListDrawable r8 = r5.f3526g
            r8.draw(r6)
            int r8 = -r2
            float r8 = (float) r8
            int r7 = -r7
            float r7 = (float) r7
            r6.translate(r8, r7)
        Lb7:
            return
        Lb8:
            androidx.recyclerview.widget.RecyclerView r6 = r5.f3538s
            int r6 = r6.getWidth()
            r5.f3536q = r6
            androidx.recyclerview.widget.RecyclerView r6 = r5.f3538s
            int r6 = r6.getHeight()
            r5.f3537r = r6
            r5.m2109m(r0)
            return
    }

    /* renamed from: i */
    public final void m2105i() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r2.f3538s
            java.lang.Runnable r1 = r2.f3518B
            r0.removeCallbacks(r1)
            return
    }

    /* renamed from: j */
    public boolean m2106j(float r3, float r4) {
            r2 = this;
            int r0 = r2.f3537r
            int r1 = r2.f3528i
            int r0 = r0 - r1
            float r0 = (float) r0
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 < 0) goto L21
            int r4 = r2.f3534o
            int r0 = r2.f3533n
            int r1 = r0 / 2
            int r1 = r4 - r1
            float r1 = (float) r1
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 < 0) goto L21
            int r0 = r0 / 2
            int r0 = r0 + r4
            float r4 = (float) r0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 > 0) goto L21
            r3 = 1
            goto L22
        L21:
            r3 = 0
        L22:
            return r3
    }

    /* renamed from: k */
    public boolean m2107k(float r5, float r6) {
            r4 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r4.f3538s
            java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
            int r0 = p227n0.C4661t.d.m10575d(r0)
            r1 = 0
            r2 = 1
            if (r0 != r2) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L19
            int r0 = r4.f3524e
            float r0 = (float) r0
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 > 0) goto L37
            goto L23
        L19:
            int r0 = r4.f3536q
            int r3 = r4.f3524e
            int r0 = r0 - r3
            float r0 = (float) r0
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 < 0) goto L37
        L23:
            int r5 = r4.f3531l
            int r0 = r4.f3530k
            int r0 = r0 / 2
            int r3 = r5 - r0
            float r3 = (float) r3
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 < 0) goto L37
            int r0 = r0 + r5
            float r5 = (float) r0
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 > 0) goto L37
            r1 = 1
        L37:
            return r1
    }

    /* renamed from: l */
    public final int m2108l(float r3, float r4, int[] r5, int r6, int r7, int r8) {
            r2 = this;
            r0 = 1
            r0 = r5[r0]
            r1 = 0
            r5 = r5[r1]
            int r0 = r0 - r5
            if (r0 != 0) goto La
            return r1
        La:
            float r4 = r4 - r3
            float r3 = (float) r0
            float r4 = r4 / r3
            int r6 = r6 - r8
            float r3 = (float) r6
            float r4 = r4 * r3
            int r3 = (int) r4
            int r7 = r7 + r3
            if (r7 >= r6) goto L18
            if (r7 < 0) goto L18
            return r3
        L18:
            return r1
    }

    /* renamed from: m */
    public void m2109m(int r6) {
            r5 = this;
            r0 = 2
            if (r6 != r0) goto L11
            int r1 = r5.f3541v
            if (r1 == r0) goto L11
            android.graphics.drawable.StateListDrawable r1 = r5.f3522c
            int[] r2 = androidx.recyclerview.widget.C0606q.f3515D
            r1.setState(r2)
            r5.m2105i()
        L11:
            if (r6 != 0) goto L19
            androidx.recyclerview.widget.RecyclerView r1 = r5.f3538s
            r1.invalidate()
            goto L1c
        L19:
            r5.m2110n()
        L1c:
            int r1 = r5.f3541v
            if (r1 != r0) goto L2c
            if (r6 == r0) goto L2c
            android.graphics.drawable.StateListDrawable r0 = r5.f3522c
            int[] r1 = androidx.recyclerview.widget.C0606q.f3516E
            r0.setState(r1)
            r0 = 1200(0x4b0, float:1.682E-42)
            goto L31
        L2c:
            r0 = 1
            if (r6 != r0) goto L3c
            r0 = 1500(0x5dc, float:2.102E-42)
        L31:
            r5.m2105i()
            androidx.recyclerview.widget.RecyclerView r1 = r5.f3538s
            java.lang.Runnable r2 = r5.f3518B
            long r3 = (long) r0
            r1.postDelayed(r2, r3)
        L3c:
            r5.f3541v = r6
            return
    }

    /* renamed from: n */
    public void m2110n() {
            r5 = this;
            int r0 = r5.f3517A
            if (r0 == 0) goto Ld
            r1 = 3
            if (r0 == r1) goto L8
            goto L3c
        L8:
            android.animation.ValueAnimator r0 = r5.f3545z
            r0.cancel()
        Ld:
            r0 = 1
            r5.f3517A = r0
            android.animation.ValueAnimator r1 = r5.f3545z
            r2 = 2
            float[] r2 = new float[r2]
            r3 = 0
            java.lang.Object r4 = r1.getAnimatedValue()
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r2[r3] = r4
            r3 = 1065353216(0x3f800000, float:1.0)
            r2[r0] = r3
            r1.setFloatValues(r2)
            android.animation.ValueAnimator r0 = r5.f3545z
            r1 = 500(0x1f4, double:2.47E-321)
            r0.setDuration(r1)
            android.animation.ValueAnimator r0 = r5.f3545z
            r1 = 0
            r0.setStartDelay(r1)
            android.animation.ValueAnimator r0 = r5.f3545z
            r0.start()
        L3c:
            return
    }
}
