package androidx.fragment.app;

/* renamed from: androidx.fragment.app.w */
/* loaded from: classes.dex */
public class C0413w {

    /* renamed from: androidx.fragment.app.w$a */
    public static class a {

        /* renamed from: a */
        public final android.view.animation.Animation f2409a;

        /* renamed from: b */
        public final android.animation.Animator f2410b;

        public a(android.animation.Animator r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f2409a = r0
                r1.f2410b = r2
                return
        }

        public a(android.view.animation.Animation r1) {
                r0 = this;
                r0.<init>()
                r0.f2409a = r1
                r1 = 0
                r0.f2410b = r1
                return
        }
    }

    /* renamed from: androidx.fragment.app.w$b */
    public static class b extends android.view.animation.AnimationSet implements java.lang.Runnable {

        /* renamed from: Y */
        public final android.view.ViewGroup f2411Y;

        /* renamed from: Z */
        public final android.view.View f2412Z;

        /* renamed from: a0 */
        public boolean f2413a0;

        /* renamed from: b0 */
        public boolean f2414b0;

        /* renamed from: c0 */
        public boolean f2415c0;

        public b(android.view.animation.Animation r2, android.view.ViewGroup r3, android.view.View r4) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r0 = 1
                r1.f2415c0 = r0
                r1.f2411Y = r3
                r1.f2412Z = r4
                r1.addAnimation(r2)
                r3.post(r1)
                return
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long r3, android.view.animation.Transformation r5) {
                r2 = this;
                r0 = 1
                r2.f2415c0 = r0
                boolean r1 = r2.f2413a0
                if (r1 == 0) goto Lb
                boolean r3 = r2.f2414b0
                r3 = r3 ^ r0
                return r3
            Lb:
                boolean r3 = super.getTransformation(r3, r5)
                if (r3 != 0) goto L18
                r2.f2413a0 = r0
                android.view.ViewGroup r3 = r2.f2411Y
                p227n0.ViewTreeObserverOnPreDrawListenerC4656o.m10519a(r3, r2)
            L18:
                return r0
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long r3, android.view.animation.Transformation r5, float r6) {
                r2 = this;
                r0 = 1
                r2.f2415c0 = r0
                boolean r1 = r2.f2413a0
                if (r1 == 0) goto Lb
                boolean r3 = r2.f2414b0
                r3 = r3 ^ r0
                return r3
            Lb:
                boolean r3 = super.getTransformation(r3, r5, r6)
                if (r3 != 0) goto L18
                r2.f2413a0 = r0
                android.view.ViewGroup r3 = r2.f2411Y
                p227n0.ViewTreeObserverOnPreDrawListenerC4656o.m10519a(r3, r2)
            L18:
                return r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                boolean r0 = r2.f2413a0
                if (r0 != 0) goto L11
                boolean r0 = r2.f2415c0
                if (r0 == 0) goto L11
                r0 = 0
                r2.f2415c0 = r0
                android.view.ViewGroup r0 = r2.f2411Y
                r0.post(r2)
                goto L1b
            L11:
                android.view.ViewGroup r0 = r2.f2411Y
                android.view.View r1 = r2.f2412Z
                r0.endViewTransition(r1)
                r0 = 1
                r2.f2414b0 = r0
            L1b:
                return
        }
    }

    /* renamed from: a */
    public static androidx.fragment.app.C0413w.a m1398a(android.content.Context r5, androidx.fragment.app.ComponentCallbacksC0395n r6, boolean r7, boolean r8) {
            androidx.fragment.app.n$d r0 = r6.f2263F0
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto L9
        L7:
            int r0 = r0.f2314h
        L9:
            if (r8 == 0) goto L17
            if (r7 == 0) goto L12
            int r8 = r6.m1302F()
            goto L22
        L12:
            int r8 = r6.m1303G()
            goto L22
        L17:
            if (r7 == 0) goto L1e
            int r8 = r6.m1341w()
            goto L22
        L1e:
            int r8 = r6.m1347z()
        L22:
            r6.m1340v0(r1, r1, r1, r1)
            android.view.ViewGroup r2 = r6.f2259B0
            r3 = 0
            if (r2 == 0) goto L38
            r4 = 2131362759(0x7f0a03c7, float:1.8345308E38)
            java.lang.Object r2 = r2.getTag(r4)
            if (r2 == 0) goto L38
            android.view.ViewGroup r2 = r6.f2259B0
            r2.setTag(r4, r3)
        L38:
            android.view.ViewGroup r6 = r6.f2259B0
            if (r6 == 0) goto L43
            android.animation.LayoutTransition r6 = r6.getLayoutTransition()
            if (r6 == 0) goto L43
            return r3
        L43:
            if (r8 != 0) goto L72
            if (r0 == 0) goto L72
            r6 = 4097(0x1001, float:5.741E-42)
            if (r0 == r6) goto L69
            r6 = 4099(0x1003, float:5.744E-42)
            if (r0 == r6) goto L5f
            r6 = 8194(0x2002, float:1.1482E-41)
            if (r0 == r6) goto L55
            r8 = -1
            goto L72
        L55:
            if (r7 == 0) goto L5b
            r8 = 2130837507(0x7f020003, float:1.727997E38)
            goto L72
        L5b:
            r8 = 2130837508(0x7f020004, float:1.7279972E38)
            goto L72
        L5f:
            if (r7 == 0) goto L65
            r8 = 2130837509(0x7f020005, float:1.7279974E38)
            goto L72
        L65:
            r8 = 2130837510(0x7f020006, float:1.7279976E38)
            goto L72
        L69:
            if (r7 == 0) goto L6f
            r8 = 2130837511(0x7f020007, float:1.7279978E38)
            goto L72
        L6f:
            r8 = 2130837512(0x7f020008, float:1.727998E38)
        L72:
            if (r8 == 0) goto Lb4
            android.content.res.Resources r6 = r5.getResources()
            java.lang.String r6 = r6.getResourceTypeName(r8)
            java.lang.String r7 = "anim"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L96
            android.view.animation.Animation r7 = android.view.animation.AnimationUtils.loadAnimation(r5, r8)     // Catch: java.lang.RuntimeException -> L92 android.content.res.Resources.NotFoundException -> L94
            if (r7 == 0) goto L90
            androidx.fragment.app.w$a r0 = new androidx.fragment.app.w$a     // Catch: java.lang.RuntimeException -> L92 android.content.res.Resources.NotFoundException -> L94
            r0.<init>(r7)     // Catch: java.lang.RuntimeException -> L92 android.content.res.Resources.NotFoundException -> L94
            return r0
        L90:
            r1 = 1
            goto L96
        L92:
            goto L96
        L94:
            r5 = move-exception
            throw r5
        L96:
            if (r1 != 0) goto Lb4
            android.animation.Animator r7 = android.animation.AnimatorInflater.loadAnimator(r5, r8)     // Catch: java.lang.RuntimeException -> La4
            if (r7 == 0) goto Lb4
            androidx.fragment.app.w$a r0 = new androidx.fragment.app.w$a     // Catch: java.lang.RuntimeException -> La4
            r0.<init>(r7)     // Catch: java.lang.RuntimeException -> La4
            return r0
        La4:
            r7 = move-exception
            if (r6 != 0) goto Lb3
            android.view.animation.Animation r5 = android.view.animation.AnimationUtils.loadAnimation(r5, r8)
            if (r5 == 0) goto Lb4
            androidx.fragment.app.w$a r6 = new androidx.fragment.app.w$a
            r6.<init>(r5)
            return r6
        Lb3:
            throw r7
        Lb4:
            return r3
    }
}
