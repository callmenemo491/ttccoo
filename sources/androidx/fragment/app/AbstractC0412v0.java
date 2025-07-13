package androidx.fragment.app;

@android.annotation.SuppressLint({"UnknownNullness"})
/* renamed from: androidx.fragment.app.v0 */
/* loaded from: classes.dex */
public abstract class AbstractC0412v0 {

    /* renamed from: androidx.fragment.app.v0$a */
    public class a implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ int f2404Y;

        /* renamed from: Z */
        public final /* synthetic */ java.util.ArrayList f2405Z;

        /* renamed from: a0 */
        public final /* synthetic */ java.util.ArrayList f2406a0;

        /* renamed from: b0 */
        public final /* synthetic */ java.util.ArrayList f2407b0;

        /* renamed from: c0 */
        public final /* synthetic */ java.util.ArrayList f2408c0;

        public a(androidx.fragment.app.AbstractC0412v0 r1, int r2, java.util.ArrayList r3, java.util.ArrayList r4, java.util.ArrayList r5, java.util.ArrayList r6) {
                r0 = this;
                r0.f2404Y = r2
                r0.f2405Z = r3
                r0.f2406a0 = r4
                r0.f2407b0 = r5
                r0.f2408c0 = r6
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                r0 = 0
            L1:
                int r1 = r4.f2404Y
                if (r0 >= r1) goto L30
                java.util.ArrayList r1 = r4.f2405Z
                java.lang.Object r1 = r1.get(r0)
                android.view.View r1 = (android.view.View) r1
                java.util.ArrayList r2 = r4.f2406a0
                java.lang.Object r2 = r2.get(r0)
                java.lang.String r2 = (java.lang.String) r2
                java.util.WeakHashMap<android.view.View, n0.w> r3 = p227n0.C4661t.f18570a
                p227n0.C4661t.h.m10617v(r1, r2)
                java.util.ArrayList r1 = r4.f2407b0
                java.lang.Object r1 = r1.get(r0)
                android.view.View r1 = (android.view.View) r1
                java.util.ArrayList r2 = r4.f2408c0
                java.lang.Object r2 = r2.get(r0)
                java.lang.String r2 = (java.lang.String) r2
                p227n0.C4661t.h.m10617v(r1, r2)
                int r0 = r0 + 1
                goto L1
            L30:
                return
        }
    }

    public AbstractC0412v0() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: d */
    public static void m1390d(java.util.List<android.view.View> r6, android.view.View r7) {
            int r0 = r6.size()
            boolean r1 = m1391h(r6, r7, r0)
            if (r1 == 0) goto Lb
            return
        Lb:
            java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
            java.lang.String r1 = p227n0.C4661t.h.m10606k(r7)
            if (r1 == 0) goto L16
            r6.add(r7)
        L16:
            r7 = r0
        L17:
            int r1 = r6.size()
            if (r7 >= r1) goto L49
            java.lang.Object r1 = r6.get(r7)
            android.view.View r1 = (android.view.View) r1
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L46
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r2 = r1.getChildCount()
            r3 = 0
        L2e:
            if (r3 >= r2) goto L46
            android.view.View r4 = r1.getChildAt(r3)
            boolean r5 = m1391h(r6, r4, r0)
            if (r5 != 0) goto L43
            java.lang.String r5 = p227n0.C4661t.h.m10606k(r4)
            if (r5 == 0) goto L43
            r6.add(r4)
        L43:
            int r3 = r3 + 1
            goto L2e
        L46:
            int r7 = r7 + 1
            goto L17
        L49:
            return
    }

    /* renamed from: h */
    public static boolean m1391h(java.util.List<android.view.View> r3, android.view.View r4, int r5) {
            r0 = 0
            r1 = 0
        L2:
            if (r1 >= r5) goto Lf
            java.lang.Object r2 = r3.get(r1)
            if (r2 != r4) goto Lc
            r3 = 1
            return r3
        Lc:
            int r1 = r1 + 1
            goto L2
        Lf:
            return r0
    }

    /* renamed from: k */
    public static boolean m1392k(java.util.List r0) {
            if (r0 == 0) goto Lb
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    /* renamed from: a */
    public abstract void mo1373a(java.lang.Object r1, android.view.View r2);

    /* renamed from: b */
    public abstract void mo1374b(java.lang.Object r1, java.util.ArrayList<android.view.View> r2);

    /* renamed from: c */
    public abstract void mo1375c(android.view.ViewGroup r1, java.lang.Object r2);

    /* renamed from: e */
    public abstract boolean mo1376e(java.lang.Object r1);

    /* renamed from: f */
    public void m1393f(java.util.ArrayList<android.view.View> r4, android.view.View r5) {
            r3 = this;
            int r0 = r5.getVisibility()
            if (r0 != 0) goto L27
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L24
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            boolean r0 = r5.isTransitionGroup()
            if (r0 == 0) goto L13
            goto L24
        L13:
            int r0 = r5.getChildCount()
            r1 = 0
        L18:
            if (r1 >= r0) goto L27
            android.view.View r2 = r5.getChildAt(r1)
            r3.m1393f(r4, r2)
            int r1 = r1 + 1
            goto L18
        L24:
            r4.add(r5)
        L27:
            return
    }

    /* renamed from: g */
    public abstract java.lang.Object mo1377g(java.lang.Object r1);

    /* renamed from: i */
    public void m1394i(java.util.Map<java.lang.String, android.view.View> r4, android.view.View r5) {
            r3 = this;
            int r0 = r5.getVisibility()
            if (r0 != 0) goto L28
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            java.lang.String r0 = p227n0.C4661t.h.m10606k(r5)
            if (r0 == 0) goto L11
            r4.put(r0, r5)
        L11:
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L28
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r0 = r5.getChildCount()
            r1 = 0
        L1c:
            if (r1 >= r0) goto L28
            android.view.View r2 = r5.getChildAt(r1)
            r3.m1394i(r4, r2)
            int r1 = r1 + 1
            goto L1c
        L28:
            return
    }

    /* renamed from: j */
    public void m1395j(android.view.View r5, android.graphics.Rect r6) {
            r4 = this;
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            boolean r0 = p227n0.C4661t.f.m10587b(r5)
            if (r0 != 0) goto L9
            return
        L9:
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            int r1 = r5.getWidth()
            float r1 = (float) r1
            int r2 = r5.getHeight()
            float r2 = (float) r2
            r3 = 0
            r0.set(r3, r3, r1, r2)
            android.graphics.Matrix r1 = r5.getMatrix()
            r1.mapRect(r0)
            int r1 = r5.getLeft()
            float r1 = (float) r1
            int r2 = r5.getTop()
            float r2 = (float) r2
            r0.offset(r1, r2)
            android.view.ViewParent r1 = r5.getParent()
        L34:
            boolean r2 = r1 instanceof android.view.View
            if (r2 == 0) goto L62
            android.view.View r1 = (android.view.View) r1
            int r2 = r1.getScrollX()
            int r2 = -r2
            float r2 = (float) r2
            int r3 = r1.getScrollY()
            int r3 = -r3
            float r3 = (float) r3
            r0.offset(r2, r3)
            android.graphics.Matrix r2 = r1.getMatrix()
            r2.mapRect(r0)
            int r2 = r1.getLeft()
            float r2 = (float) r2
            int r3 = r1.getTop()
            float r3 = (float) r3
            r0.offset(r2, r3)
            android.view.ViewParent r1 = r1.getParent()
            goto L34
        L62:
            r1 = 2
            int[] r1 = new int[r1]
            android.view.View r5 = r5.getRootView()
            r5.getLocationOnScreen(r1)
            r5 = 0
            r5 = r1[r5]
            float r5 = (float) r5
            r2 = 1
            r1 = r1[r2]
            float r1 = (float) r1
            r0.offset(r5, r1)
            float r5 = r0.left
            int r5 = java.lang.Math.round(r5)
            float r1 = r0.top
            int r1 = java.lang.Math.round(r1)
            float r2 = r0.right
            int r2 = java.lang.Math.round(r2)
            float r0 = r0.bottom
            int r0 = java.lang.Math.round(r0)
            r6.set(r5, r1, r2, r0)
            return
    }

    /* renamed from: l */
    public abstract java.lang.Object mo1378l(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3);

    /* renamed from: m */
    public abstract java.lang.Object mo1379m(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3);

    /* renamed from: n */
    public java.util.ArrayList<java.lang.String> m1396n(java.util.ArrayList<android.view.View> r6) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r6.size()
            r2 = 0
        La:
            if (r2 >= r1) goto L22
            java.lang.Object r3 = r6.get(r2)
            android.view.View r3 = (android.view.View) r3
            java.util.WeakHashMap<android.view.View, n0.w> r4 = p227n0.C4661t.f18570a
            java.lang.String r4 = p227n0.C4661t.h.m10606k(r3)
            r0.add(r4)
            r4 = 0
            p227n0.C4661t.h.m10617v(r3, r4)
            int r2 = r2 + 1
            goto La
        L22:
            return r0
    }

    /* renamed from: o */
    public abstract void mo1380o(java.lang.Object r1, android.view.View r2);

    /* renamed from: p */
    public abstract void mo1381p(java.lang.Object r1, java.util.ArrayList<android.view.View> r2, java.util.ArrayList<android.view.View> r3);

    /* renamed from: q */
    public abstract void mo1382q(java.lang.Object r1, android.view.View r2, java.util.ArrayList<android.view.View> r3);

    /* renamed from: r */
    public abstract void mo1383r(java.lang.Object r1, java.lang.Object r2, java.util.ArrayList<android.view.View> r3, java.lang.Object r4, java.util.ArrayList<android.view.View> r5, java.lang.Object r6, java.util.ArrayList<android.view.View> r7);

    /* renamed from: s */
    public abstract void mo1384s(java.lang.Object r1, android.graphics.Rect r2);

    /* renamed from: t */
    public abstract void mo1385t(java.lang.Object r1, android.view.View r2);

    /* renamed from: u */
    public void mo1386u(androidx.fragment.app.ComponentCallbacksC0395n r1, java.lang.Object r2, p158j0.C3380b r3, java.lang.Runnable r4) {
            r0 = this;
            r4.run()
            return
    }

    /* renamed from: v */
    public void m1397v(android.view.View r9, java.util.ArrayList<android.view.View> r10, java.util.ArrayList<android.view.View> r11, java.util.ArrayList<java.lang.String> r12, java.util.Map<java.lang.String, java.lang.String> r13) {
            r8 = this;
            int r2 = r11.size()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r0 = 0
            r1 = 0
        Lb:
            if (r1 >= r2) goto L49
            java.lang.Object r3 = r10.get(r1)
            android.view.View r3 = (android.view.View) r3
            java.util.WeakHashMap<android.view.View, n0.w> r4 = p227n0.C4661t.f18570a
            java.lang.String r4 = p227n0.C4661t.h.m10606k(r3)
            r6.add(r4)
            if (r4 != 0) goto L1f
            goto L46
        L1f:
            r5 = 0
            p227n0.C4661t.h.m10617v(r3, r5)
            r3 = r13
            s.h r3 = (p319s.C5941h) r3
            java.lang.Object r3 = r3.getOrDefault(r4, r5)
            java.lang.String r3 = (java.lang.String) r3
            r5 = 0
        L2d:
            if (r5 >= r2) goto L46
            java.lang.Object r7 = r12.get(r5)
            boolean r7 = r3.equals(r7)
            if (r7 == 0) goto L43
            java.lang.Object r3 = r11.get(r5)
            android.view.View r3 = (android.view.View) r3
            p227n0.C4661t.h.m10617v(r3, r4)
            goto L46
        L43:
            int r5 = r5 + 1
            goto L2d
        L46:
            int r1 = r1 + 1
            goto Lb
        L49:
            androidx.fragment.app.v0$a r13 = new androidx.fragment.app.v0$a
            r0 = r13
            r1 = r8
            r3 = r11
            r4 = r12
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            p227n0.ViewTreeObserverOnPreDrawListenerC4656o.m10519a(r9, r13)
            return
    }

    /* renamed from: w */
    public abstract void mo1387w(java.lang.Object r1, android.view.View r2, java.util.ArrayList<android.view.View> r3);

    /* renamed from: x */
    public abstract void mo1388x(java.lang.Object r1, java.util.ArrayList<android.view.View> r2, java.util.ArrayList<android.view.View> r3);

    /* renamed from: y */
    public abstract java.lang.Object mo1389y(java.lang.Object r1);
}
