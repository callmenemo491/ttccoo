package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.h0 */
/* loaded from: classes.dex */
public class C0592h0 extends p227n0.C4641a {

    /* renamed from: d */
    public final androidx.recyclerview.widget.RecyclerView f3415d;

    /* renamed from: e */
    public final androidx.recyclerview.widget.C0592h0.a f3416e;

    /* renamed from: androidx.recyclerview.widget.h0$a */
    public static class a extends p227n0.C4641a {

        /* renamed from: d */
        public final androidx.recyclerview.widget.C0592h0 f3417d;

        /* renamed from: e */
        public java.util.Map<android.view.View, p227n0.C4641a> f3418e;

        public a(androidx.recyclerview.widget.C0592h0 r2) {
                r1 = this;
                r1.<init>()
                java.util.WeakHashMap r0 = new java.util.WeakHashMap
                r0.<init>()
                r1.f3418e = r0
                r1.f3417d = r2
                return
        }

        @Override // p227n0.C4641a
        /* renamed from: a */
        public boolean mo2063a(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                java.util.Map<android.view.View, n0.a> r0 = r1.f3418e
                java.lang.Object r0 = r0.get(r2)
                n0.a r0 = (p227n0.C4641a) r0
                if (r0 == 0) goto Lf
                boolean r2 = r0.mo2063a(r2, r3)
                return r2
            Lf:
                android.view.View$AccessibilityDelegate r0 = r1.f18502a
                boolean r2 = r0.dispatchPopulateAccessibilityEvent(r2, r3)
                return r2
        }

        @Override // p227n0.C4641a
        /* renamed from: b */
        public p242o0.C4869c mo2064b(android.view.View r2) {
                r1 = this;
                java.util.Map<android.view.View, n0.a> r0 = r1.f3418e
                java.lang.Object r0 = r0.get(r2)
                n0.a r0 = (p227n0.C4641a) r0
                if (r0 == 0) goto Lf
                o0.c r2 = r0.mo2064b(r2)
                return r2
            Lf:
                o0.c r2 = super.mo2064b(r2)
                return r2
        }

        @Override // p227n0.C4641a
        /* renamed from: c */
        public void mo1039c(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                java.util.Map<android.view.View, n0.a> r0 = r1.f3418e
                java.lang.Object r0 = r0.get(r2)
                n0.a r0 = (p227n0.C4641a) r0
                if (r0 == 0) goto Le
                r0.mo1039c(r2, r3)
                goto L13
            Le:
                android.view.View$AccessibilityDelegate r0 = r1.f18502a
                r0.onInitializeAccessibilityEvent(r2, r3)
            L13:
                return
        }

        @Override // p227n0.C4641a
        /* renamed from: d */
        public void mo1040d(android.view.View r2, p242o0.C4868b r3) {
                r1 = this;
                androidx.recyclerview.widget.h0 r0 = r1.f3417d
                boolean r0 = r0.m2062j()
                if (r0 != 0) goto L2b
                androidx.recyclerview.widget.h0 r0 = r1.f3417d
                androidx.recyclerview.widget.RecyclerView r0 = r0.f3415d
                androidx.recyclerview.widget.RecyclerView$m r0 = r0.getLayoutManager()
                if (r0 == 0) goto L2b
                androidx.recyclerview.widget.h0 r0 = r1.f3417d
                androidx.recyclerview.widget.RecyclerView r0 = r0.f3415d
                androidx.recyclerview.widget.RecyclerView$m r0 = r0.getLayoutManager()
                r0.m1878f0(r2, r3)
                java.util.Map<android.view.View, n0.a> r0 = r1.f3418e
                java.lang.Object r0 = r0.get(r2)
                n0.a r0 = (p227n0.C4641a) r0
                if (r0 == 0) goto L2b
                r0.mo1040d(r2, r3)
                goto L32
            L2b:
                android.view.View$AccessibilityDelegate r0 = r1.f18502a
                android.view.accessibility.AccessibilityNodeInfo r3 = r3.f19337a
                r0.onInitializeAccessibilityNodeInfo(r2, r3)
            L32:
                return
        }

        @Override // p227n0.C4641a
        /* renamed from: e */
        public void mo2065e(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                java.util.Map<android.view.View, n0.a> r0 = r1.f3418e
                java.lang.Object r0 = r0.get(r2)
                n0.a r0 = (p227n0.C4641a) r0
                if (r0 == 0) goto Le
                r0.mo2065e(r2, r3)
                goto L13
            Le:
                android.view.View$AccessibilityDelegate r0 = r1.f18502a
                r0.onPopulateAccessibilityEvent(r2, r3)
            L13:
                return
        }

        @Override // p227n0.C4641a
        /* renamed from: f */
        public boolean mo2066f(android.view.ViewGroup r2, android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
                r1 = this;
                java.util.Map<android.view.View, n0.a> r0 = r1.f3418e
                java.lang.Object r0 = r0.get(r2)
                n0.a r0 = (p227n0.C4641a) r0
                if (r0 == 0) goto Lf
                boolean r2 = r0.mo2066f(r2, r3, r4)
                return r2
            Lf:
                android.view.View$AccessibilityDelegate r0 = r1.f18502a
                boolean r2 = r0.onRequestSendAccessibilityEvent(r2, r3, r4)
                return r2
        }

        @Override // p227n0.C4641a
        /* renamed from: g */
        public boolean mo1041g(android.view.View r3, int r4, android.os.Bundle r5) {
                r2 = this;
                androidx.recyclerview.widget.h0 r0 = r2.f3417d
                boolean r0 = r0.m2062j()
                if (r0 != 0) goto L39
                androidx.recyclerview.widget.h0 r0 = r2.f3417d
                androidx.recyclerview.widget.RecyclerView r0 = r0.f3415d
                androidx.recyclerview.widget.RecyclerView$m r0 = r0.getLayoutManager()
                if (r0 == 0) goto L39
                java.util.Map<android.view.View, n0.a> r0 = r2.f3418e
                java.lang.Object r0 = r0.get(r3)
                n0.a r0 = (p227n0.C4641a) r0
                r1 = 1
                if (r0 == 0) goto L24
                boolean r3 = r0.mo1041g(r3, r4, r5)
                if (r3 == 0) goto L2b
                return r1
            L24:
                boolean r3 = super.mo1041g(r3, r4, r5)
                if (r3 == 0) goto L2b
                return r1
            L2b:
                androidx.recyclerview.widget.h0 r3 = r2.f3417d
                androidx.recyclerview.widget.RecyclerView r3 = r3.f3415d
                androidx.recyclerview.widget.RecyclerView$m r3 = r3.getLayoutManager()
                androidx.recyclerview.widget.RecyclerView r3 = r3.f3241b
                androidx.recyclerview.widget.RecyclerView$t r3 = r3.f3150b0
                r3 = 0
                return r3
            L39:
                boolean r3 = super.mo1041g(r3, r4, r5)
                return r3
        }

        @Override // p227n0.C4641a
        /* renamed from: h */
        public void mo2067h(android.view.View r2, int r3) {
                r1 = this;
                java.util.Map<android.view.View, n0.a> r0 = r1.f3418e
                java.lang.Object r0 = r0.get(r2)
                n0.a r0 = (p227n0.C4641a) r0
                if (r0 == 0) goto Le
                r0.mo2067h(r2, r3)
                goto L13
            Le:
                android.view.View$AccessibilityDelegate r0 = r1.f18502a
                r0.sendAccessibilityEvent(r2, r3)
            L13:
                return
        }

        @Override // p227n0.C4641a
        /* renamed from: i */
        public void mo2068i(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                java.util.Map<android.view.View, n0.a> r0 = r1.f3418e
                java.lang.Object r0 = r0.get(r2)
                n0.a r0 = (p227n0.C4641a) r0
                if (r0 == 0) goto Le
                r0.mo2068i(r2, r3)
                goto L13
            Le:
                android.view.View$AccessibilityDelegate r0 = r1.f18502a
                r0.sendAccessibilityEventUnchecked(r2, r3)
            L13:
                return
        }
    }

    public C0592h0(androidx.recyclerview.widget.RecyclerView r1) {
            r0 = this;
            r0.<init>()
            r0.f3415d = r1
            androidx.recyclerview.widget.h0$a r1 = r0.f3416e
            if (r1 == 0) goto La
            goto Lf
        La:
            androidx.recyclerview.widget.h0$a r1 = new androidx.recyclerview.widget.h0$a
            r1.<init>(r0)
        Lf:
            r0.f3416e = r1
            return
    }

    @Override // p227n0.C4641a
    /* renamed from: c */
    public void mo1039c(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.f18502a
            r0.onInitializeAccessibilityEvent(r2, r3)
            boolean r0 = r2 instanceof androidx.recyclerview.widget.RecyclerView
            if (r0 == 0) goto L1e
            boolean r0 = r1.m2062j()
            if (r0 != 0) goto L1e
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            androidx.recyclerview.widget.RecyclerView$m r0 = r2.getLayoutManager()
            if (r0 == 0) goto L1e
            androidx.recyclerview.widget.RecyclerView$m r2 = r2.getLayoutManager()
            r2.mo1682d0(r3)
        L1e:
            return
    }

    @Override // p227n0.C4641a
    /* renamed from: d */
    public void mo1040d(android.view.View r3, p242o0.C4868b r4) {
            r2 = this;
            android.view.View$AccessibilityDelegate r0 = r2.f18502a
            android.view.accessibility.AccessibilityNodeInfo r1 = r4.f19337a
            r0.onInitializeAccessibilityNodeInfo(r3, r1)
            boolean r3 = r2.m2062j()
            if (r3 != 0) goto L24
            androidx.recyclerview.widget.RecyclerView r3 = r2.f3415d
            androidx.recyclerview.widget.RecyclerView$m r3 = r3.getLayoutManager()
            if (r3 == 0) goto L24
            androidx.recyclerview.widget.RecyclerView r3 = r2.f3415d
            androidx.recyclerview.widget.RecyclerView$m r3 = r3.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r0 = r3.f3241b
            androidx.recyclerview.widget.RecyclerView$t r1 = r0.f3150b0
            androidx.recyclerview.widget.RecyclerView$y r0 = r0.f3157e1
            r3.mo1876e0(r1, r0, r4)
        L24:
            return
    }

    @Override // p227n0.C4641a
    /* renamed from: g */
    public boolean mo1041g(android.view.View r3, int r4, android.os.Bundle r5) {
            r2 = this;
            boolean r3 = super.mo1041g(r3, r4, r5)
            if (r3 == 0) goto L8
            r3 = 1
            return r3
        L8:
            boolean r3 = r2.m2062j()
            if (r3 != 0) goto L27
            androidx.recyclerview.widget.RecyclerView r3 = r2.f3415d
            androidx.recyclerview.widget.RecyclerView$m r3 = r3.getLayoutManager()
            if (r3 == 0) goto L27
            androidx.recyclerview.widget.RecyclerView r3 = r2.f3415d
            androidx.recyclerview.widget.RecyclerView$m r3 = r3.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r0 = r3.f3241b
            androidx.recyclerview.widget.RecyclerView$t r1 = r0.f3150b0
            androidx.recyclerview.widget.RecyclerView$y r0 = r0.f3157e1
            boolean r3 = r3.mo1880r0(r1, r0, r4, r5)
            return r3
        L27:
            r3 = 0
            return r3
    }

    /* renamed from: j */
    public boolean m2062j() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.f3415d
            boolean r0 = r0.m1735N()
            return r0
    }
}
