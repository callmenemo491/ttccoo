package com.google.android.material.behavior;

import android.view.View;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends android.view.View> extends androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c<V> {

    /* renamed from: a */
    public p332t0.C6095c f5788a;

    /* renamed from: b */
    public boolean f5789b;

    /* renamed from: c */
    public int f5790c;

    /* renamed from: d */
    public float f5791d;

    /* renamed from: e */
    public float f5792e;

    /* renamed from: f */
    public float f5793f;

    /* renamed from: g */
    public final p332t0.C6095c.c f5794g;

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    public class C1122a extends p332t0.C6095c.c {

        /* renamed from: a */
        public int f5795a;

        /* renamed from: b */
        public int f5796b;

        /* renamed from: c */
        public final /* synthetic */ com.google.android.material.behavior.SwipeDismissBehavior f5797c;

        public C1122a(com.google.android.material.behavior.SwipeDismissBehavior r1) {
                r0 = this;
                r0.f5797c = r1
                r0.<init>()
                r1 = -1
                r0.f5796b = r1
                return
        }

        @Override // p332t0.C6095c.c
        /* renamed from: a */
        public int mo3262a(android.view.View r3, int r4, int r5) {
                r2 = this;
                java.util.WeakHashMap<android.view.View, n0.w> r5 = p227n0.C4661t.f18570a
                int r5 = p227n0.C4661t.d.m10575d(r3)
                r0 = 1
                if (r5 != r0) goto Lb
                r5 = 1
                goto Lc
            Lb:
                r5 = 0
            Lc:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = r2.f5797c
                int r1 = r1.f5790c
                if (r1 != 0) goto L26
                if (r5 == 0) goto L1e
            L14:
                int r5 = r2.f5795a
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.f5795a
                goto L39
            L1e:
                int r5 = r2.f5795a
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L39
            L26:
                if (r1 != r0) goto L2b
                if (r5 == 0) goto L14
                goto L1e
            L2b:
                int r5 = r2.f5795a
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.f5795a
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L39:
                int r4 = java.lang.Math.max(r5, r4)
                int r3 = java.lang.Math.min(r4, r3)
                return r3
        }

        @Override // p332t0.C6095c.c
        /* renamed from: b */
        public int mo3263b(android.view.View r1, int r2, int r3) {
                r0 = this;
                int r1 = r1.getTop()
                return r1
        }

        @Override // p332t0.C6095c.c
        /* renamed from: c */
        public int mo3264c(android.view.View r1) {
                r0 = this;
                int r1 = r1.getWidth()
                return r1
        }

        @Override // p332t0.C6095c.c
        /* renamed from: e */
        public void mo3265e(android.view.View r1, int r2) {
                r0 = this;
                r0.f5796b = r2
                int r2 = r1.getLeft()
                r0.f5795a = r2
                android.view.ViewParent r1 = r1.getParent()
                if (r1 == 0) goto L12
                r2 = 1
                r1.requestDisallowInterceptTouchEvent(r2)
            L12:
                return
        }

        @Override // p332t0.C6095c.c
        /* renamed from: f */
        public void mo3266f(int r1) {
                r0 = this;
                com.google.android.material.behavior.SwipeDismissBehavior r1 = r0.f5797c
                java.util.Objects.requireNonNull(r1)
                return
        }

        @Override // p332t0.C6095c.c
        /* renamed from: g */
        public void mo3267g(android.view.View r3, int r4, int r5, int r6, int r7) {
                r2 = this;
                int r5 = r2.f5795a
                float r5 = (float) r5
                int r6 = r3.getWidth()
                float r6 = (float) r6
                com.google.android.material.behavior.SwipeDismissBehavior r7 = r2.f5797c
                float r7 = r7.f5792e
                float r6 = r6 * r7
                float r6 = r6 + r5
                int r5 = r2.f5795a
                float r5 = (float) r5
                int r7 = r3.getWidth()
                float r7 = (float) r7
                com.google.android.material.behavior.SwipeDismissBehavior r0 = r2.f5797c
                float r0 = r0.f5793f
                float r7 = r7 * r0
                float r7 = r7 + r5
                float r4 = (float) r4
                r5 = 1065353216(0x3f800000, float:1.0)
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 > 0) goto L29
                r3.setAlpha(r5)
                goto L3e
            L29:
                r0 = 0
                int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                if (r1 < 0) goto L32
                r3.setAlpha(r0)
                goto L3e
            L32:
                float r4 = r4 - r6
                float r7 = r7 - r6
                float r4 = r4 / r7
                float r4 = r5 - r4
                float r4 = com.google.android.material.behavior.SwipeDismissBehavior.m3260t(r0, r4, r5)
                r3.setAlpha(r4)
            L3e:
                return
        }

        @Override // p332t0.C6095c.c
        /* renamed from: h */
        public void mo3268h(android.view.View r8, float r9, float r10) {
                r7 = this;
                r10 = -1
                r7.f5796b = r10
                int r10 = r8.getWidth()
                r0 = 0
                r1 = 0
                r2 = 1
                int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r3 == 0) goto L3c
                java.util.WeakHashMap<android.view.View, n0.w> r4 = p227n0.C4661t.f18570a
                int r4 = p227n0.C4661t.d.m10575d(r8)
                if (r4 != r2) goto L18
                r4 = 1
                goto L19
            L18:
                r4 = 0
            L19:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = r7.f5797c
                int r5 = r5.f5790c
                r6 = 2
                if (r5 != r6) goto L21
                goto L2c
            L21:
                if (r5 != 0) goto L30
                if (r4 == 0) goto L2a
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L2e
                goto L2c
            L2a:
                if (r3 <= 0) goto L2e
            L2c:
                r9 = 1
                goto L59
            L2e:
                r9 = 0
                goto L59
            L30:
                if (r5 != r2) goto L2e
                if (r4 == 0) goto L37
                if (r3 <= 0) goto L2e
                goto L3b
            L37:
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L2e
            L3b:
                goto L2c
            L3c:
                int r9 = r8.getLeft()
                int r0 = r7.f5795a
                int r9 = r9 - r0
                int r0 = r8.getWidth()
                float r0 = (float) r0
                com.google.android.material.behavior.SwipeDismissBehavior r3 = r7.f5797c
                float r3 = r3.f5791d
                float r0 = r0 * r3
                int r0 = java.lang.Math.round(r0)
                int r9 = java.lang.Math.abs(r9)
                if (r9 < r0) goto L2e
                goto L2c
            L59:
                if (r9 == 0) goto L68
                int r9 = r8.getLeft()
                int r0 = r7.f5795a
                if (r9 >= r0) goto L65
                int r0 = r0 - r10
                goto L66
            L65:
                int r0 = r0 + r10
            L66:
                r1 = 1
                goto L6a
            L68:
                int r0 = r7.f5795a
            L6a:
                com.google.android.material.behavior.SwipeDismissBehavior r9 = r7.f5797c
                t0.c r9 = r9.f5788a
                int r10 = r8.getTop()
                boolean r9 = r9.m12586t(r0, r10)
                if (r9 == 0) goto L85
                com.google.android.material.behavior.SwipeDismissBehavior$b r9 = new com.google.android.material.behavior.SwipeDismissBehavior$b
                com.google.android.material.behavior.SwipeDismissBehavior r10 = r7.f5797c
                r9.<init>(r10, r8, r1)
                java.util.WeakHashMap<android.view.View, n0.w> r10 = p227n0.C4661t.f18570a
                p227n0.C4661t.c.m10565m(r8, r9)
                goto L8c
            L85:
                if (r1 == 0) goto L8c
                com.google.android.material.behavior.SwipeDismissBehavior r8 = r7.f5797c
                java.util.Objects.requireNonNull(r8)
            L8c:
                return
        }

        @Override // p332t0.C6095c.c
        /* renamed from: i */
        public boolean mo3269i(android.view.View r3, int r4) {
                r2 = this;
                int r0 = r2.f5796b
                r1 = -1
                if (r0 == r1) goto L7
                if (r0 != r4) goto L11
            L7:
                com.google.android.material.behavior.SwipeDismissBehavior r4 = r2.f5797c
                boolean r3 = r4.mo3261s(r3)
                if (r3 == 0) goto L11
                r3 = 1
                goto L12
            L11:
                r3 = 0
            L12:
                return r3
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    public class RunnableC1123b implements java.lang.Runnable {

        /* renamed from: Y */
        public final android.view.View f5798Y;

        /* renamed from: Z */
        public final boolean f5799Z;

        /* renamed from: a0 */
        public final /* synthetic */ com.google.android.material.behavior.SwipeDismissBehavior f5800a0;

        public RunnableC1123b(com.google.android.material.behavior.SwipeDismissBehavior r1, android.view.View r2, boolean r3) {
                r0 = this;
                r0.f5800a0 = r1
                r0.<init>()
                r0.f5798Y = r2
                r0.f5799Z = r3
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                com.google.android.material.behavior.SwipeDismissBehavior r0 = r2.f5800a0
                t0.c r0 = r0.f5788a
                if (r0 == 0) goto L15
                r1 = 1
                boolean r0 = r0.m12575i(r1)
                if (r0 == 0) goto L15
                android.view.View r0 = r2.f5798Y
                java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
                p227n0.C4661t.c.m10565m(r0, r2)
                goto L1e
            L15:
                boolean r0 = r2.f5799Z
                if (r0 == 0) goto L1e
                com.google.android.material.behavior.SwipeDismissBehavior r0 = r2.f5800a0
                java.util.Objects.requireNonNull(r0)
            L1e:
                return
        }
    }

    public SwipeDismissBehavior() {
            r2 = this;
            r2.<init>()
            r0 = 2
            r2.f5790c = r0
            r0 = 1056964608(0x3f000000, float:0.5)
            r2.f5791d = r0
            r1 = 0
            r2.f5792e = r1
            r2.f5793f = r0
            com.google.android.material.behavior.SwipeDismissBehavior$a r0 = new com.google.android.material.behavior.SwipeDismissBehavior$a
            r0.<init>(r2)
            r2.f5794g = r0
            return
    }

    /* renamed from: t */
    public static float m3260t(float r0, float r1, float r2) {
            float r0 = java.lang.Math.max(r0, r1)
            float r0 = java.lang.Math.min(r0, r2)
            return r0
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
    /* renamed from: g */
    public boolean mo991g(androidx.coordinatorlayout.widget.CoordinatorLayout r4, V r5, android.view.MotionEvent r6) {
            r3 = this;
            boolean r0 = r3.f5789b
            int r1 = r6.getActionMasked()
            r2 = 0
            if (r1 == 0) goto L13
            r5 = 1
            if (r1 == r5) goto L10
            r5 = 3
            if (r1 == r5) goto L10
            goto L23
        L10:
            r3.f5789b = r2
            goto L23
        L13:
            float r0 = r6.getX()
            int r0 = (int) r0
            float r1 = r6.getY()
            int r1 = (int) r1
            boolean r0 = r4.m974p(r5, r0, r1)
            r3.f5789b = r0
        L23:
            if (r0 == 0) goto L3d
            t0.c r5 = r3.f5788a
            if (r5 != 0) goto L36
            t0.c$c r5 = r3.f5794g
            t0.c r0 = new t0.c
            android.content.Context r1 = r4.getContext()
            r0.<init>(r1, r4, r5)
            r3.f5788a = r0
        L36:
            t0.c r4 = r3.f5788a
            boolean r4 = r4.m12587u(r6)
            return r4
        L3d:
            return r2
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
    /* renamed from: h */
    public boolean mo992h(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, int r5) {
            r2 = this;
            java.util.WeakHashMap<android.view.View, n0.w> r3 = p227n0.C4661t.f18570a
            int r3 = p227n0.C4661t.c.m10555c(r4)
            r5 = 0
            if (r3 != 0) goto L26
            r3 = 1
            p227n0.C4661t.c.m10571s(r4, r3)
            r3 = 1048576(0x100000, float:1.469368E-39)
            p227n0.C4661t.m10543s(r3, r4)
            p227n0.C4661t.m10537m(r4, r5)
            boolean r3 = r2.mo3261s(r4)
            if (r3 == 0) goto L26
            o0.b$a r3 = p242o0.C4868b.a.f19345j
            r0 = 0
            x7.a r1 = new x7.a
            r1.<init>(r2)
            p227n0.C4661t.m10544t(r4, r3, r0, r1)
        L26:
            return r5
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
    /* renamed from: r */
    public boolean mo1002r(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.MotionEvent r3) {
            r0 = this;
            t0.c r1 = r0.f5788a
            if (r1 == 0) goto L9
            r1.m12580n(r3)
            r1 = 1
            return r1
        L9:
            r1 = 0
            return r1
    }

    /* renamed from: s */
    public boolean mo3261s(android.view.View r1) {
            r0 = this;
            r1 = 1
            return r1
    }
}
