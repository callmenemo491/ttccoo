package androidx.fragment.app;

/* renamed from: androidx.fragment.app.u0 */
/* loaded from: classes.dex */
public class C0410u0 extends androidx.fragment.app.AbstractC0412v0 {

    /* renamed from: androidx.fragment.app.u0$a */
    public class a extends android.transition.Transition.EpicenterCallback {

        /* renamed from: a */
        public final /* synthetic */ android.graphics.Rect f2387a;

        public a(androidx.fragment.app.C0410u0 r1, android.graphics.Rect r2) {
                r0 = this;
                r0.f2387a = r2
                r0.<init>()
                return
        }

        @Override // android.transition.Transition.EpicenterCallback
        public android.graphics.Rect onGetEpicenter(android.transition.Transition r1) {
                r0 = this;
                android.graphics.Rect r1 = r0.f2387a
                return r1
        }
    }

    /* renamed from: androidx.fragment.app.u0$b */
    public class b implements android.transition.Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ android.view.View f2388a;

        /* renamed from: b */
        public final /* synthetic */ java.util.ArrayList f2389b;

        public b(androidx.fragment.app.C0410u0 r1, android.view.View r2, java.util.ArrayList r3) {
                r0 = this;
                r0.f2388a = r2
                r0.f2389b = r3
                r0.<init>()
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(android.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(android.transition.Transition r4) {
                r3 = this;
                r4.removeListener(r3)
                android.view.View r4 = r3.f2388a
                r0 = 8
                r4.setVisibility(r0)
                java.util.ArrayList r4 = r3.f2389b
                int r4 = r4.size()
                r0 = 0
                r1 = 0
            L12:
                if (r1 >= r4) goto L22
                java.util.ArrayList r2 = r3.f2389b
                java.lang.Object r2 = r2.get(r1)
                android.view.View r2 = (android.view.View) r2
                r2.setVisibility(r0)
                int r1 = r1 + 1
                goto L12
            L22:
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(android.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(android.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(android.transition.Transition r1) {
                r0 = this;
                r1.removeListener(r0)
                r1.addListener(r0)
                return
        }
    }

    /* renamed from: androidx.fragment.app.u0$c */
    public class c implements android.transition.Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ java.lang.Object f2390a;

        /* renamed from: b */
        public final /* synthetic */ java.util.ArrayList f2391b;

        /* renamed from: c */
        public final /* synthetic */ java.lang.Object f2392c;

        /* renamed from: d */
        public final /* synthetic */ java.util.ArrayList f2393d;

        /* renamed from: e */
        public final /* synthetic */ java.lang.Object f2394e;

        /* renamed from: f */
        public final /* synthetic */ java.util.ArrayList f2395f;

        /* renamed from: g */
        public final /* synthetic */ androidx.fragment.app.C0410u0 f2396g;

        public c(androidx.fragment.app.C0410u0 r1, java.lang.Object r2, java.util.ArrayList r3, java.lang.Object r4, java.util.ArrayList r5, java.lang.Object r6, java.util.ArrayList r7) {
                r0 = this;
                r0.f2396g = r1
                r0.f2390a = r2
                r0.f2391b = r3
                r0.f2392c = r4
                r0.f2393d = r5
                r0.f2394e = r6
                r0.f2395f = r7
                r0.<init>()
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(android.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(android.transition.Transition r1) {
                r0 = this;
                r1.removeListener(r0)
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(android.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(android.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(android.transition.Transition r4) {
                r3 = this;
                java.lang.Object r4 = r3.f2390a
                r0 = 0
                if (r4 == 0) goto Lc
                androidx.fragment.app.u0 r1 = r3.f2396g
                java.util.ArrayList r2 = r3.f2391b
                r1.mo1381p(r4, r2, r0)
            Lc:
                java.lang.Object r4 = r3.f2392c
                if (r4 == 0) goto L17
                androidx.fragment.app.u0 r1 = r3.f2396g
                java.util.ArrayList r2 = r3.f2393d
                r1.mo1381p(r4, r2, r0)
            L17:
                java.lang.Object r4 = r3.f2394e
                if (r4 == 0) goto L22
                androidx.fragment.app.u0 r1 = r3.f2396g
                java.util.ArrayList r2 = r3.f2395f
                r1.mo1381p(r4, r2, r0)
            L22:
                return
        }
    }

    /* renamed from: androidx.fragment.app.u0$d */
    public class d implements android.transition.Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ java.lang.Runnable f2397a;

        public d(androidx.fragment.app.C0410u0 r1, java.lang.Runnable r2) {
                r0 = this;
                r0.f2397a = r2
                r0.<init>()
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(android.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(android.transition.Transition r1) {
                r0 = this;
                java.lang.Runnable r1 = r0.f2397a
                r1.run()
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(android.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(android.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(android.transition.Transition r1) {
                r0 = this;
                return
        }
    }

    /* renamed from: androidx.fragment.app.u0$e */
    public class e extends android.transition.Transition.EpicenterCallback {

        /* renamed from: a */
        public final /* synthetic */ android.graphics.Rect f2398a;

        public e(androidx.fragment.app.C0410u0 r1, android.graphics.Rect r2) {
                r0 = this;
                r0.f2398a = r2
                r0.<init>()
                return
        }

        @Override // android.transition.Transition.EpicenterCallback
        public android.graphics.Rect onGetEpicenter(android.transition.Transition r1) {
                r0 = this;
                android.graphics.Rect r1 = r0.f2398a
                if (r1 == 0) goto Le
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto Lb
                goto Le
            Lb:
                android.graphics.Rect r1 = r0.f2398a
                return r1
            Le:
                r1 = 0
                return r1
        }
    }

    public C0410u0() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: z */
    public static boolean m1372z(android.transition.Transition r1) {
            java.util.List r0 = r1.getTargetIds()
            boolean r0 = androidx.fragment.app.AbstractC0412v0.m1392k(r0)
            if (r0 == 0) goto L21
            java.util.List r0 = r1.getTargetNames()
            boolean r0 = androidx.fragment.app.AbstractC0412v0.m1392k(r0)
            if (r0 == 0) goto L21
            java.util.List r1 = r1.getTargetTypes()
            boolean r1 = androidx.fragment.app.AbstractC0412v0.m1392k(r1)
            if (r1 != 0) goto L1f
            goto L21
        L1f:
            r1 = 0
            goto L22
        L21:
            r1 = 1
        L22:
            return r1
    }

    @Override // androidx.fragment.app.AbstractC0412v0
    /* renamed from: a */
    public void mo1373a(java.lang.Object r1, android.view.View r2) {
            r0 = this;
            if (r1 == 0) goto L7
            android.transition.Transition r1 = (android.transition.Transition) r1
            r1.addTarget(r2)
        L7:
            return
    }

    @Override // androidx.fragment.app.AbstractC0412v0
    /* renamed from: b */
    public void mo1374b(java.lang.Object r4, java.util.ArrayList<android.view.View> r5) {
            r3 = this;
            android.transition.Transition r4 = (android.transition.Transition) r4
            if (r4 != 0) goto L5
            return
        L5:
            boolean r0 = r4 instanceof android.transition.TransitionSet
            r1 = 0
            if (r0 == 0) goto L1c
            android.transition.TransitionSet r4 = (android.transition.TransitionSet) r4
            int r0 = r4.getTransitionCount()
        L10:
            if (r1 >= r0) goto L3e
            android.transition.Transition r2 = r4.getTransitionAt(r1)
            r3.mo1374b(r2, r5)
            int r1 = r1 + 1
            goto L10
        L1c:
            boolean r0 = m1372z(r4)
            if (r0 != 0) goto L3e
            java.util.List r0 = r4.getTargets()
            boolean r0 = androidx.fragment.app.AbstractC0412v0.m1392k(r0)
            if (r0 == 0) goto L3e
            int r0 = r5.size()
        L30:
            if (r1 >= r0) goto L3e
            java.lang.Object r2 = r5.get(r1)
            android.view.View r2 = (android.view.View) r2
            r4.addTarget(r2)
            int r1 = r1 + 1
            goto L30
        L3e:
            return
    }

    @Override // androidx.fragment.app.AbstractC0412v0
    /* renamed from: c */
    public void mo1375c(android.view.ViewGroup r1, java.lang.Object r2) {
            r0 = this;
            android.transition.Transition r2 = (android.transition.Transition) r2
            android.transition.TransitionManager.beginDelayedTransition(r1, r2)
            return
    }

    @Override // androidx.fragment.app.AbstractC0412v0
    /* renamed from: e */
    public boolean mo1376e(java.lang.Object r1) {
            r0 = this;
            boolean r1 = r1 instanceof android.transition.Transition
            return r1
    }

    @Override // androidx.fragment.app.AbstractC0412v0
    /* renamed from: g */
    public java.lang.Object mo1377g(java.lang.Object r1) {
            r0 = this;
            if (r1 == 0) goto L9
            android.transition.Transition r1 = (android.transition.Transition) r1
            android.transition.Transition r1 = r1.clone()
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    @Override // androidx.fragment.app.AbstractC0412v0
    /* renamed from: l */
    public java.lang.Object mo1378l(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            android.transition.Transition r2 = (android.transition.Transition) r2
            android.transition.Transition r3 = (android.transition.Transition) r3
            android.transition.Transition r4 = (android.transition.Transition) r4
            if (r2 == 0) goto L1d
            if (r3 == 0) goto L1d
            android.transition.TransitionSet r0 = new android.transition.TransitionSet
            r0.<init>()
            android.transition.TransitionSet r2 = r0.addTransition(r2)
            android.transition.TransitionSet r2 = r2.addTransition(r3)
            r3 = 1
            android.transition.TransitionSet r2 = r2.setOrdering(r3)
            goto L25
        L1d:
            if (r2 == 0) goto L20
            goto L25
        L20:
            if (r3 == 0) goto L24
            r2 = r3
            goto L25
        L24:
            r2 = 0
        L25:
            if (r4 == 0) goto L35
            android.transition.TransitionSet r3 = new android.transition.TransitionSet
            r3.<init>()
            if (r2 == 0) goto L31
            r3.addTransition(r2)
        L31:
            r3.addTransition(r4)
            return r3
        L35:
            return r2
    }

    @Override // androidx.fragment.app.AbstractC0412v0
    /* renamed from: m */
    public java.lang.Object mo1379m(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            android.transition.TransitionSet r0 = new android.transition.TransitionSet
            r0.<init>()
            if (r2 == 0) goto Lc
            android.transition.Transition r2 = (android.transition.Transition) r2
            r0.addTransition(r2)
        Lc:
            if (r3 == 0) goto L13
            android.transition.Transition r3 = (android.transition.Transition) r3
            r0.addTransition(r3)
        L13:
            if (r4 == 0) goto L1a
            android.transition.Transition r4 = (android.transition.Transition) r4
            r0.addTransition(r4)
        L1a:
            return r0
    }

    @Override // androidx.fragment.app.AbstractC0412v0
    /* renamed from: o */
    public void mo1380o(java.lang.Object r1, android.view.View r2) {
            r0 = this;
            if (r1 == 0) goto L7
            android.transition.Transition r1 = (android.transition.Transition) r1
            r1.removeTarget(r2)
        L7:
            return
    }

    @Override // androidx.fragment.app.AbstractC0412v0
    /* renamed from: p */
    public void mo1381p(java.lang.Object r5, java.util.ArrayList<android.view.View> r6, java.util.ArrayList<android.view.View> r7) {
            r4 = this;
            android.transition.Transition r5 = (android.transition.Transition) r5
            boolean r0 = r5 instanceof android.transition.TransitionSet
            r1 = 0
            if (r0 == 0) goto L19
            android.transition.TransitionSet r5 = (android.transition.TransitionSet) r5
            int r0 = r5.getTransitionCount()
        Ld:
            if (r1 >= r0) goto L5f
            android.transition.Transition r2 = r5.getTransitionAt(r1)
            r4.mo1381p(r2, r6, r7)
            int r1 = r1 + 1
            goto Ld
        L19:
            boolean r0 = m1372z(r5)
            if (r0 != 0) goto L5f
            java.util.List r0 = r5.getTargets()
            if (r0 == 0) goto L5f
            int r2 = r0.size()
            int r3 = r6.size()
            if (r2 != r3) goto L5f
            boolean r0 = r0.containsAll(r6)
            if (r0 == 0) goto L5f
            if (r7 != 0) goto L39
            r0 = 0
            goto L3d
        L39:
            int r0 = r7.size()
        L3d:
            if (r1 >= r0) goto L4b
            java.lang.Object r2 = r7.get(r1)
            android.view.View r2 = (android.view.View) r2
            r5.addTarget(r2)
            int r1 = r1 + 1
            goto L3d
        L4b:
            int r7 = r6.size()
            int r7 = r7 + (-1)
        L51:
            if (r7 < 0) goto L5f
            java.lang.Object r0 = r6.get(r7)
            android.view.View r0 = (android.view.View) r0
            r5.removeTarget(r0)
            int r7 = r7 + (-1)
            goto L51
        L5f:
            return
    }

    @Override // androidx.fragment.app.AbstractC0412v0
    /* renamed from: q */
    public void mo1382q(java.lang.Object r2, android.view.View r3, java.util.ArrayList<android.view.View> r4) {
            r1 = this;
            android.transition.Transition r2 = (android.transition.Transition) r2
            androidx.fragment.app.u0$b r0 = new androidx.fragment.app.u0$b
            r0.<init>(r1, r3, r4)
            r2.addListener(r0)
            return
    }

    @Override // androidx.fragment.app.AbstractC0412v0
    /* renamed from: r */
    public void mo1383r(java.lang.Object r11, java.lang.Object r12, java.util.ArrayList<android.view.View> r13, java.lang.Object r14, java.util.ArrayList<android.view.View> r15, java.lang.Object r16, java.util.ArrayList<android.view.View> r17) {
            r10 = this;
            r0 = r11
            android.transition.Transition r0 = (android.transition.Transition) r0
            androidx.fragment.app.u0$c r9 = new androidx.fragment.app.u0$c
            r1 = r9
            r2 = r10
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0.addListener(r9)
            return
    }

    @Override // androidx.fragment.app.AbstractC0412v0
    /* renamed from: s */
    public void mo1384s(java.lang.Object r2, android.graphics.Rect r3) {
            r1 = this;
            if (r2 == 0) goto Lc
            android.transition.Transition r2 = (android.transition.Transition) r2
            androidx.fragment.app.u0$e r0 = new androidx.fragment.app.u0$e
            r0.<init>(r1, r3)
            r2.setEpicenterCallback(r0)
        Lc:
            return
    }

    @Override // androidx.fragment.app.AbstractC0412v0
    /* renamed from: t */
    public void mo1385t(java.lang.Object r2, android.view.View r3) {
            r1 = this;
            if (r3 == 0) goto L14
            android.transition.Transition r2 = (android.transition.Transition) r2
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.m1395j(r3, r0)
            androidx.fragment.app.u0$a r3 = new androidx.fragment.app.u0$a
            r3.<init>(r1, r0)
            r2.setEpicenterCallback(r3)
        L14:
            return
    }

    @Override // androidx.fragment.app.AbstractC0412v0
    /* renamed from: u */
    public void mo1386u(androidx.fragment.app.ComponentCallbacksC0395n r1, java.lang.Object r2, p158j0.C3380b r3, java.lang.Runnable r4) {
            r0 = this;
            android.transition.Transition r2 = (android.transition.Transition) r2
            androidx.fragment.app.u0$d r1 = new androidx.fragment.app.u0$d
            r1.<init>(r0, r4)
            r2.addListener(r1)
            return
    }

    @Override // androidx.fragment.app.AbstractC0412v0
    /* renamed from: w */
    public void mo1387w(java.lang.Object r5, android.view.View r6, java.util.ArrayList<android.view.View> r7) {
            r4 = this;
            android.transition.TransitionSet r5 = (android.transition.TransitionSet) r5
            java.util.List r0 = r5.getTargets()
            r0.clear()
            int r1 = r7.size()
            r2 = 0
        Le:
            if (r2 >= r1) goto L1c
            java.lang.Object r3 = r7.get(r2)
            android.view.View r3 = (android.view.View) r3
            androidx.fragment.app.AbstractC0412v0.m1390d(r0, r3)
            int r2 = r2 + 1
            goto Le
        L1c:
            r0.add(r6)
            r7.add(r6)
            r4.mo1374b(r5, r7)
            return
    }

    @Override // androidx.fragment.app.AbstractC0412v0
    /* renamed from: x */
    public void mo1388x(java.lang.Object r2, java.util.ArrayList<android.view.View> r3, java.util.ArrayList<android.view.View> r4) {
            r1 = this;
            android.transition.TransitionSet r2 = (android.transition.TransitionSet) r2
            if (r2 == 0) goto L15
            java.util.List r0 = r2.getTargets()
            r0.clear()
            java.util.List r0 = r2.getTargets()
            r0.addAll(r4)
            r1.mo1381p(r2, r3, r4)
        L15:
            return
    }

    @Override // androidx.fragment.app.AbstractC0412v0
    /* renamed from: y */
    public java.lang.Object mo1389y(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            android.transition.TransitionSet r0 = new android.transition.TransitionSet
            r0.<init>()
            android.transition.Transition r2 = (android.transition.Transition) r2
            r0.addTransition(r2)
            return r0
    }
}
